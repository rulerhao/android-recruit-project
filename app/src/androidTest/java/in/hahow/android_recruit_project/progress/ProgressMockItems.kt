package `in`.hahow.android_recruit_project.progress

import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.data.Status
import `in`.hahow.android_recruit_project.model.courses.data.SuccessCriteria

class ProgressMockItems {

    val testCriteriaZeroData = Data(
        successCriteria = SuccessCriteria(0),
        numSoldTickets = 88,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.INCUBATING,
        proposalDueTime = "2022-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testCriteriaZeroDataExpected = "100%"

    val testCriteriaPublishedData = Data(
        successCriteria = SuccessCriteria(30),
        numSoldTickets = 88,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.PUBLISHED,
        proposalDueTime = "2022-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testCriteriaPublishedDataExpected = "100%"

    val testNonCriteriaPublishedData = Data(
        successCriteria = SuccessCriteria(30),
        numSoldTickets = 24,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.PUBLISHED,
        proposalDueTime = "2022-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testNonCriteriaPublishedDataExpected = "24 / 30 人"

    val testNonCriteriaNonPublishedData = Data(
        successCriteria = SuccessCriteria(30),
        numSoldTickets = 24,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.SUCCESS,
        proposalDueTime = "2022-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testNonCriteriaNonPublishedDataExpected = "24 / 30 人"

    val testCriteriaNonPublishedData = Data(
        successCriteria = SuccessCriteria(30),
        numSoldTickets = 36,
        coverImageUrl = "https://images.api.hahow.in/images/619fcfd1072d3d0006c4f2f5",
        status = Status.SUCCESS,
        proposalDueTime = "2022-12-09T16:00:00.000Z",
        title = "米其林三星主廚教你做！時尚法式甜點的秘密",
        totalVideoLengthInSeconds = 0
    )

    val testCriteriaNonPublishedDataExpected = "已達標 120%"

}