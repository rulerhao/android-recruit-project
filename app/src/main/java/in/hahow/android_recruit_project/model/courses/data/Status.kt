package `in`.hahow.android_recruit_project.model.courses.data

import com.google.gson.annotations.SerializedName

enum class Status {
    @SerializedName("INCUBATING")
    INCUBATING,
    @SerializedName("PUBLISHED")
    PUBLISHED,
    @SerializedName("SUCCESS")
    SUCCESS
}