package `in`.hahow.android_recruit_project.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun Title(
    title: String
) {
    Text(
        text = title,
        color = Color.Black,
        fontWeight = FontWeight.Bold
    )
}