package `in`.hahow.android_recruit_project.model.courses.data

data class Data(
    val coverImageUrl: String,
    val numSoldTickets: Int,
    val proposalDueTime: String,
    val status: String,
    val successCriteria: SuccessCriteria,
    val title: String,
    val totalVideoLengthInSeconds: Int
)