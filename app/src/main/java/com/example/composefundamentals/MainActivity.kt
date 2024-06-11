package com.example.composefundamentals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.composefundamentals.ui.theme.basic.VerticalListView
import com.example.composefundamentals.ui.theme.tablayout.TabLayout
import com.example.composefundamentals.ui.theme.ui.PostInteractionBar
import com.example.composefundamentals.ui.theme.ui.PostItem
import com.example.composefundamentals.ui.theme.util.DemoItem
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier
            ) {
                PostItem(
                    post = DemoItem.tweetList[1],
                    isLiked = Random.nextBoolean(),
                    onLikeClicked = {},
                    onCommentsClicked = {},
                    onSendClicked = {}
                )
            }
        }
    }
}





