package `in`.hahow.android_recruit_project.status_label

import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.data.Status
import `in`.hahow.android_recruit_project.model.courses.data.SuccessCriteria

class StatusLabelMockItems {

    val testCriteriaIncubatingData = Data(
        successCriteria = SuccessCriteria(30),
        numSoldTickets = 88,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.INCUBATING,
        proposalDueTime = "2022-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testCriteriaIncubatingDataExpected = "募資成功"

    val testCriteriaPublishedData = Data(
        successCriteria = SuccessCriteria(30),
        numSoldTickets = 36,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.PUBLISHED,
        proposalDueTime = "2022-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testCriteriaPublishedDataExpected = "已開課"

    val testNonCriteriaPublishedData = Data(
        successCriteria = SuccessCriteria(30),
        numSoldTickets = 24,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.PUBLISHED,
        proposalDueTime = "2022-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testNonCriteriaPublishedDataExpected = "已開課"

    val testCriteriaSuccessData = Data(
        successCriteria = SuccessCriteria(30),
        numSoldTickets = 36,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.SUCCESS,
        proposalDueTime = "2022-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testCriteriaSuccessDataExpected = "募資成功"

    val testNonCriteriaSuccessData = Data(
        successCriteria = SuccessCriteria(30),
        numSoldTickets = 24,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.SUCCESS,
        proposalDueTime = "2022-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testNonCriteriaSuccessDataExpected = "募資成功"

}