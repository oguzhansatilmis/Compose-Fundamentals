package com.example.composefundamentals.ui.theme.demo.instagram

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefundamentals.ui.theme.demo.instagram.post.PostItem
import com.example.composefundamentals.ui.theme.demo.util.DemoItem


@Composable
fun InstagramUi() {

    val posts = remember { DemoItem.tweetList }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {

        items(
            items = posts,
            itemContent = {
                PostItem(post = it,
                    false,
                    {},
                    {},
                    {})
            }
        )


    }
}


@Preview
@Composable
fun PreviewInstagramUi() {

    InstagramUi()

}



