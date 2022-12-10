package `in`.hahow.android_recruit_project

import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.data.Status
import `in`.hahow.android_recruit_project.model.courses.data.SuccessCriteria

class CoursesApiMockItems {
    val items: List<Data> = listOf(
        // INCUBATING
        // Past time
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 88,
            coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
            status = Status.INCUBATING,
            proposalDueTime = "2022-12-09T16:00:00.000Z",
            title = "米其林三星主廚教你做！時尚法式甜點的秘密",
            totalVideoLengthInSeconds = 0
        ),
        // Future time
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 0,
            coverImageUrl = "https://images.api.hahow.in/images/614eca15a39712000619b672",
            status = Status.INCUBATING,
            proposalDueTime = "2023-12-11T16:00:00.000Z",
            title = "學習 AI 一把抓：點亮人工智慧技能樹",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 14,
            coverImageUrl = "https://images.api.hahow.in/images/61aa41c75c11460006886198",
            status = Status.INCUBATING,
            proposalDueTime = "2023-12-11T16:00:00.000Z",
            title = "療癒動物似顏繪：提升插畫魅力的風格提煉術！",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 88,
            coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
            status = Status.INCUBATING,
            proposalDueTime = "2023-12-11T16:00:00.000Z",
            title = "米其林三星主廚教你做！時尚法式甜點的秘密",
            totalVideoLengthInSeconds = 0
        ),
        // No time
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 0,
            coverImageUrl = "https://images.api.hahow.in/images/614eca15a39712000619b672",
            status = Status.INCUBATING,
            proposalDueTime = null,
            title = "學習 AI 一把抓：點亮人工智慧技能樹",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 14,
            coverImageUrl = "https://images.api.hahow.in/images/61aa41c75c11460006886198",
            status = Status.INCUBATING,
            proposalDueTime = null,
            title = "療癒動物似顏繪：提升插畫魅力的風格提煉術！",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 88,
            coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
            status = Status.INCUBATING,
            proposalDueTime = null,
            title = "米其林三星主廚教你做！時尚法式甜點的秘密",
            totalVideoLengthInSeconds = 0
        ),
        // PUBLISHED
        // Past time
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 0,
            coverImageUrl = "https://images.api.hahow.in/images/614eca15a39712000619b672",
            status = Status.PUBLISHED,
            proposalDueTime = "2022-12-09T16:00:00.000Z",
            title = "學習 AI 一把抓：點亮人工智慧技能樹",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 14,
            coverImageUrl = "https://images.api.hahow.in/images/61aa41c75c11460006886198",
            status = Status.PUBLISHED,
            proposalDueTime = "2022-12-09T16:00:00.000Z",
            title = "療癒動物似顏繪：提升插畫魅力的風格提煉術！",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 88,
            coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
            status = Status.PUBLISHED,
            proposalDueTime = "2022-12-09T16:00:00.000Z",
            title = "米其林三星主廚教你做！時尚法式甜點的秘密",
            totalVideoLengthInSeconds = 0
        ),
        // Future time
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 0,
            coverImageUrl = "https://images.api.hahow.in/images/614eca15a39712000619b672",
            status = Status.PUBLISHED,
            proposalDueTime = "2023-12-11T16:00:00.000Z",
            title = "學習 AI 一把抓：點亮人工智慧技能樹",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 14,
            coverImageUrl = "https://images.api.hahow.in/images/61aa41c75c11460006886198",
            status = Status.PUBLISHED,
            proposalDueTime = "2023-12-11T16:00:00.000Z",
            title = "療癒動物似顏繪：提升插畫魅力的風格提煉術！",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 88,
            coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
            status = Status.PUBLISHED,
            proposalDueTime = "2023-12-11T16:00:00.000Z",
            title = "米其林三星主廚教你做！時尚法式甜點的秘密",
            totalVideoLengthInSeconds = 0
        ),
        // No time
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 0,
            coverImageUrl = "https://images.api.hahow.in/images/614eca15a39712000619b672",
            status = Status.PUBLISHED,
            proposalDueTime = null,
            title = "學習 AI 一把抓：點亮人工智慧技能樹",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 14,
            coverImageUrl = "https://images.api.hahow.in/images/61aa41c75c11460006886198",
            status = Status.PUBLISHED,
            proposalDueTime = null,
            title = "療癒動物似顏繪：提升插畫魅力的風格提煉術！",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 88,
            coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
            status = Status.PUBLISHED,
            proposalDueTime = null,
            title = "米其林三星主廚教你做！時尚法式甜點的秘密",
            totalVideoLengthInSeconds = 0
        ),
        // SUCCESS
        // Past time
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 0,
            coverImageUrl = "https://images.api.hahow.in/images/614eca15a39712000619b672",
            status = Status.SUCCESS,
            proposalDueTime = "2022-12-09T16:00:00.000Z",
            title = "學習 AI 一把抓：點亮人工智慧技能樹",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 14,
            coverImageUrl = "https://images.api.hahow.in/images/61aa41c75c11460006886198",
            status = Status.SUCCESS,
            proposalDueTime = "2022-12-09T16:00:00.000Z",
            title = "療癒動物似顏繪：提升插畫魅力的風格提煉術！",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 88,
            coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
            status = Status.SUCCESS,
            proposalDueTime = "2022-12-09T16:00:00.000Z",
            title = "米其林三星主廚教你做！時尚法式甜點的秘密",
            totalVideoLengthInSeconds = 0
        ),
        // Future time
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 0,
            coverImageUrl = "https://images.api.hahow.in/images/614eca15a39712000619b672",
            status = Status.SUCCESS,
            proposalDueTime = "2023-12-11T16:00:00.000Z",
            title = "學習 AI 一把抓：點亮人工智慧技能樹",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 14,
            coverImageUrl = "https://images.api.hahow.in/images/61aa41c75c11460006886198",
            status = Status.SUCCESS,
            proposalDueTime = "2023-12-11T16:00:00.000Z",
            title = "療癒動物似顏繪：提升插畫魅力的風格提煉術！",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 88,
            coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
            status = Status.SUCCESS,
            proposalDueTime = "2023-12-11T16:00:00.000Z",
            title = "米其林三星主廚教你做！時尚法式甜點的秘密",
            totalVideoLengthInSeconds = 0
        ),
        // No time
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 0,
            coverImageUrl = "https://images.api.hahow.in/images/614eca15a39712000619b672",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "學習 AI 一把抓：點亮人工智慧技能樹",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 14,
            coverImageUrl = "https://images.api.hahow.in/images/61aa41c75c11460006886198",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "療癒動物似顏繪：提升插畫魅力的風格提煉術！",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 88,
            coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "米其林三星主廚教你做！時尚法式甜點的秘密",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(100),
            numSoldTickets = 9,
            coverImageUrl = "https://images.api.hahow.in/images/61a4624067cd3f00072b349b",
            status = Status.PUBLISHED,
            proposalDueTime = null,
            title = "10 單元 ETF 必修攻略，全球投資教戰守則！",
            totalVideoLengthInSeconds = 21449
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 6,
            coverImageUrl = "https://images.api.hahow.in/images/61839dcab399ff00072815f0",
            status = Status.INCUBATING,
            proposalDueTime = "2023-12-29T16:00:00.000Z",
            title = "進階造型師技法在家學 - 新娘秘書實戰班",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 90,
            coverImageUrl = "https://images.api.hahow.in/images/618b26d83a0b8d00073519e0",
            status = Status.INCUBATING,
            proposalDueTime = "2023-12-24T16:00:00.000Z",
            title = "加密貨幣新手攻略 | 從買賣入門到自動交易",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 73,
            coverImageUrl = "https://images.api.hahow.in/images/61820a687bcc4d000656a22d",
            status = Status.INCUBATING,
            proposalDueTime = "2023-12-23T16:00:00.000Z",
            title = "Steve 教練教你 | 14 週解鎖你的運動表現潛能",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 3,
            coverImageUrl = "https://images.api.hahow.in/images/61888fa7b259500007e2cb21",
            status = Status.INCUBATING,
            proposalDueTime = "2023-12-17T16:00:00.000Z",
            title = "少女人妻華麗變身：七大妝容七彩的夢幻樂園",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 487,
            coverImageUrl = "https://images.api.hahow.in/images/618a4702a84beb00063ccd16",
            status = Status.INCUBATING,
            proposalDueTime = "2023-12-16T16:00:00.000Z",
            title = "Procreate 插畫入門－從素描到風格",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 1119,
            coverImageUrl = "https://images.api.hahow.in/images/618de3382ff6b700068c5762",
            status = Status.PUBLISHED,
            proposalDueTime = null,
            title = "創作坊精華：入手專家心法，讓品牌創意變身",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 58,
            coverImageUrl = "https://images.api.hahow.in/images/6178b8615a90190006898a59",
            status = Status.INCUBATING,
            proposalDueTime = "2023-12-10T16:00:00.000Z",
            title = "風格型塑學 打造你的衣櫥系統",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 171,
            coverImageUrl = "https://images.api.hahow.in/images/618a5308a84beb00063ce63d",
            status = Status.INCUBATING,
            proposalDueTime = "2023-12-09T16:00:00.000Z",
            title =  "陪你回回憶：長者與失智者的陪伴指南",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 76,
            coverImageUrl = "https://images.api.hahow.in/images/61835b7a55935700077d4024",
            status = Status.INCUBATING,
            proposalDueTime = "2023-12-09T16:00:00.000Z",
            title = "Google Apps Script 入門 - GAS 跨平台生活應用",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 991,
            coverImageUrl = "https://images.api.hahow.in/images/617a0fad5a901900068baf95",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "銷售文案：寫出你的產品熱賣轉換率",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 124,
            coverImageUrl = "https://images.api.hahow.in/images/6166a3dc2ba42d0007e344ea",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "小資族圓夢計畫，第一次買房收租就上手",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 56,
            coverImageUrl = "https://images.api.hahow.in/images/614c237ddeb4b100078678a1",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "J Team 小學堂－英雄聯盟爬分 10 大重點",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 141,
            coverImageUrl = "https://images.api.hahow.in/images/6149d8fc57da0b0006347fb2",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "Knitting好好玩！自己織圍巾、披肩、羊毛帽",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 114,
            coverImageUrl = "https://images.api.hahow.in/images/617824e6b2db2c0006cdd548",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "放下酒譜！跟著 Mars 飛向浩瀚無垠調酒宇宙",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 204,
            coverImageUrl = "https://images.api.hahow.in/images/618a3de16dee9d0006bdbc25",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "小資入門籌碼課：提高短線操作勝率",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 226,
            coverImageUrl = "https://images.api.hahow.in/images/614a042f77d1760007e99c94",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "人物專訪怎麼寫？訪綱、採訪、寫作心法",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 58,
            coverImageUrl = "https://images.api.hahow.in/images/611f1af9eb00c70006f8be87",
            status = Status.PUBLISHED,
            proposalDueTime = null,
            title = "新手開店0到1！餐飲創業成功必讀攻略術！",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(50),
            numSoldTickets = 57,
            coverImageUrl = "https://images.api.hahow.in/images/615e6fb573e0700006d14e2b",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "植物水彩繪 - 石斛蘭的觀察紀錄",
            totalVideoLengthInSeconds = 0
        ),
        Data(
            successCriteria = SuccessCriteria(30),
            numSoldTickets = 5619,
            coverImageUrl = "https://images.api.hahow.in/images/61541433666b1b0006b32be3",
            status = Status.SUCCESS,
            proposalDueTime = null,
            title = "RyuuuTV看動漫看日劇，零到N4道地說日文",
            totalVideoLengthInSeconds = 0
        ),
    )
}