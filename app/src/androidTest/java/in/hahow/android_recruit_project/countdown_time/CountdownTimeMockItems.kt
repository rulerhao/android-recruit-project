package `in`.hahow.android_recruit_project.countdown_time

import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.data.Status
import `in`.hahow.android_recruit_project.model.courses.data.SuccessCriteria

class CountdownTimeMockItems {

    val testOutOfDateData = Data(
        successCriteria = SuccessCriteria(30),
        numSoldTickets = 88,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.INCUBATING,
        proposalDueTime = "2022-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testOutOfDateDataExpected = ""

    val testDayData = Data(
        successCriteria = SuccessCriteria(30),
        numSoldTickets = 88,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.INCUBATING,
        proposalDueTime = "2023-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testDayDataExpected = "倒數364天"

}