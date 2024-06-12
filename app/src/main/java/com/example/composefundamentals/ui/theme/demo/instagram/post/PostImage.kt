package com.example.composefundamentals.ui.theme.demo.instagram.post

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefundamentals.ui.theme.demo.util.DemoItem


@Composable
fun PostImage(
     @DrawableRes imageId:Int,
    contentDescription:String?,
    modifier:Modifier = Modifier
){
    Image(
        painter = painterResource(id =imageId),
        contentDescription = contentDescription,
        modifier = modifier
            .fillMaxWidth()
            .height(450.dp),
        contentScale = ContentScale.Crop
    )

}


@Preview
@Composable
fun PreviewPostImage(){
    PostImage(
        imageId = DemoItem.tweetList.first { it.tweetImageId != 0 }.tweetImageId,
        null
    )
}