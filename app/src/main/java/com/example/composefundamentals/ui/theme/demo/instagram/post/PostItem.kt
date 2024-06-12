package com.example.composefundamentals.ui.theme.demo.instagram.post

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.ContentAlpha
import androidx.wear.compose.material.LocalContentAlpha
import com.example.composefundamentals.ui.theme.demo.instagram.profile.ProfileSection
import com.example.composefundamentals.ui.theme.demo.instagram.profile.ProfileSectionSizes
import com.example.composefundamentals.ui.theme.demo.util.DemoItem
import com.example.composefundamentals.ui.theme.demo.util.Tweet


@Composable
fun PostItem(
    post: Tweet,
    isLiked: Boolean,
    onLikeClicked: () -> Unit,
    onCommentsClicked: () -> Unit,
    onSendClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        ProfileSection(
            firstImageId = post.authorImageId,
            text = post.author,
            size = ProfileSectionSizes.medium(),
            iconRight = {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "See more options"
                )
            }
        )
        PostImage(
            imageId = post.tweetImageId,
            contentDescription = post.text,
            modifier = Modifier.padding(top = 8.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        PostInteractionBar(
            isLiked = isLiked,
            onLikeClicked = onLikeClicked,
            onCommentsClicked = onCommentsClicked,
            onSendClicked = onSendClicked
        )
        Spacer(modifier = Modifier.height(16.dp))
        ProfileSection(
            firstImageId = post.authorImageId,
            text = "Liked by ${DemoItem.tweet.author} and ${DemoItem.tweet.likesCount} others"
        )

        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = "View all ${post.commentsCount} comments",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(top = 4.dp),
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = LocalContentAlpha.current)
            )
            Text(
                text = "${post.time} ago",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(top = 4.dp),
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = LocalContentAlpha.current)
            )
        }
    }
}

@Preview
@Composable
fun PreviewPostItem(){
    PostItem(
        post = DemoItem.tweetList[0],
        isLiked = true,
        onLikeClicked = {},
        onCommentsClicked = {},
        onSendClicked = {}
    )
}

