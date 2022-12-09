package `in`.hahow.android_recruit_project.model.json

import android.content.Context
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class JsonHelper {

    suspend fun <T: Any> get(context: Context, fileName: String, type: Class<T>): Any? {
        val jsonStr = getJsonString(context, fileName)

        return convertToType(jsonStr, type)
    }

    private suspend fun getJsonString(context: Context, fileName: String): String? {

        var json: String?

        withContext(Dispatchers.IO) {
            val inputStream = context.assets.open(fileName)
            val sizeOfFile = inputStream.available()
            val bufferData = ByteArray(sizeOfFile)
            inputStream.read(bufferData)
            inputStream.close()
            json = String(bufferData, charset("UTF-8"))
        }

        return json

    }

    private fun <T : Any> convertToType(json: String?, type: Class<T>): Any? {

        return Gson().fromJson(json, type)

    }
}