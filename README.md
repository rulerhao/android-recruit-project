
請使用 Kotlin 實作一個 app 首頁課程列表畫面，並寫文件或註解來解釋你的設計考量。除了指定需求外，你可以自由設計 model 和 UI 來提供更好的體驗。

## 技術規定
- Deployment Target 為 Android 12。
- 可使用第三方 library。
- 請寫文件或註解來解釋你的設計考量。

## 需求
請實作一個在 app 首頁看到的課程列表，需求如下：

#### 資料
- 請設計一個的 Data Loader 的抽象層來提供課程資料。
- 請用專案中提供的 json file 實作上述 Data Loader 的一個實例。

#### UI 設計
- 依照課程當前狀態，顯示不同的標籤
- 課程標題至多兩行
- 本題目不用在意卡片尺寸、顏色、間距等細節，請將重點放在如何排版。（你仍然可以盡量符合示意圖）
<img width="300" alt="CleanShot 2021-12-09 at 10 59 30@2x" src="https://user-images.githubusercontent.com/76472179/145350022-b4624fe0-2612-4fdb-950c-da6898ca4166.png">

## 提交

- 請下載或 fork Hahow Android Engineer 面試題目初始專案。
- 請將成果上傳至 GitHub 並直接提供 repo 連結。

# Jake

## 設計邏輯：
	1. 把超過 100% 的募資中項目調整為募資完成，看起來比較合邏輯。
	2. 募資門檻的數字為 0 的我是設為 100%，但是這邊感覺算是 API 的小 BUG (因為無法判斷"已達成%d%"的募資進度)，設為100%就當作例外處理。
	3. 募資門檻超過 100% 的會設置為已募資的百分比("已達成%d%")，也就是說會超過100%
	4. 倒數的時間除了已開課的以外，倒數時間都仍然會存在，目的是讓未截止募資的課程一樣可以獲得有意願的募資。但在 API 沒有提供到期日期的募資成功課程則是不會顯示倒數時間，原因是我把他們認定為募資直到達成。
	5. 因為超過時間而被移除的課程只有募資中且尚未完成募資的課程，Status 為募資中但實際上已完成募資的在顯示上被我設定為募資成功。
	6. 不論募資進度以及是否超出時間，只要 Status 設為 SUCCESS 我都會將它顯示為募資成功。
	7. 我沒有加上影片時間，因為範例圖也沒有出現所以我也選擇先不顯示他。

### 募資過期的課程：
	1. INCUBATING 且未滿足 Criteria)：移除
	2. 其他 Status：保留


### 狀態 Label：
	1. 如果 (INCUBATING 且滿足 Criteria) 或者 SUCCESS：募資成功
	2. INCUBATING：募資中
	3. PUBLISHED：已開課
  
### 進度：
	1. 進度顯示字(照順序往下)：
		a. 如果 Criteria 為 0：100%
		b. 如果 numSoldTickets < numCriteria(未完成募資)："$numSoldTickets / $numCriteria 人"
		c. 如果狀態為 PUBLISHED：100%
		d. 其他："已達成 $(numSoldTickets.toFloat > numCriteria * 100).toInt()%"
	2. 進度條：
		a. 如果 numCriteria == 0 或者 numSoldTickets > numCriteria：1
		b. 其他：numSoldTickets.toFloat() / numCriteria

### 倒數時間：
	1. 如果 proposalDueTime 為空：""
	2. 如果 proposalDueTime 在過去的時間：""(這邊其實只會顯示募資完成跟已開課的倒數時間，因為過期的募資中在前面已經被去除了)
	3. 如果已開課：""
	4. 其他：
		a. 時間大於1天："倒數 $numOfDay 天"
		b. 時間大於1小時："倒數 $numOfHour 小時"
		c. 時間大於1分鐘："倒數 $numOfMinute 分鐘"

### 架構：
	1. 用 Hilt 來幫助建立 MVVM，減少 Memory leak 發生和讓可讀性較高。
	2. 實作 Clean Architechture， 讓 ViewModel 跟 Model 之間以 Use case 連接。
	3. 因為有取得 res 內的 String，因此在測試的時候也使用 AndroidTest 來取得 Context。
