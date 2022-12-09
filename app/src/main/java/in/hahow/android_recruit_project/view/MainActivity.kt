package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.ui.theme.AppTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            // Set the basic theme.
            AppTheme {
                MainScreen()
            }
        }
    }

}