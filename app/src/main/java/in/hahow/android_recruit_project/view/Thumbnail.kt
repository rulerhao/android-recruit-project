package `in`.hahow.android_recruit_project.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.glide.GlideImage
import com.skydoves.landscapist.glide.GlideImageState

@Composable
fun Thumbnail(
    url: String,
    cornerSize: Dp
) {
    GlideImage(
        modifier = Modifier,
        imageModel = { url },
        success = {
            SuccessImage(
                it,
                cornerSize = cornerSize
            )
        },
        loading = {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        }
    )
}

@Composable
private fun SuccessImage(
    imageState: GlideImageState.Success,
    cornerSize: Dp
) {
    Image(
        modifier = Modifier
            .width(141.dp)
            .height(88.dp)
            .clip(RoundedCornerShape(cornerSize)),
        bitmap = imageState.imageBitmap!!,
        contentScale = ContentScale.Crop,
        contentDescription = null,
    )
}