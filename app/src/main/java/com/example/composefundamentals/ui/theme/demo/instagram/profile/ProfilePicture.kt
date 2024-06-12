package com.example.composefundamentals.ui.theme.demo.instagram.profile

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composefundamentals.ui.theme.demo.util.DemoItem


@Composable
fun ProfilePicture(
    @DrawableRes imageId: Int,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    size: Dp = ProfileSizes.medium

) {

    Image(
        modifier = modifier
            .size(size)
            .clip(CircleShape),
        painter = painterResource(id = imageId),
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop)
}

@Preview
@Composable
fun PreviewProfilePicture(){
    ProfilePicture(
        imageId = DemoItem.tweetList.first().authorImageId,
        contentDescription = "Profile picture",
        size = ProfileSizes.small
    )
}


object ProfileSizes {
    val small = 20.dp
    val medium = 32.dp
    val large = 64.dp
}

