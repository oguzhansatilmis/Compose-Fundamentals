package com.example.composefundamentals.ui.theme.demo.instagram.post

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefundamentals.R

@Composable
fun PostInteractionBar(
    isLiked: Boolean,
    onLikeClicked: () -> Unit,
    onCommentsClicked: () -> Unit,
    onSendClicked: () -> Unit,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.padding(8.dp))
        IconToggleButton(
            checked = isLiked,
            onCheckedChange = { onLikeClicked.invoke() },
            modifier = Modifier.size(20.dp)
        ) {
            Icon(painter = painterResource(id = R.drawable.icon), contentDescription = "")

        }
        Spacer(modifier = Modifier.padding(8.dp))

        IconToggleButton(
            checked = isLiked,
            onCheckedChange = { onLikeClicked.invoke() },
            modifier = Modifier.size(20.dp)
        ) {
            Icon(painter = painterResource(id = R.drawable.icon), contentDescription = "")


        }
        Spacer(modifier = Modifier.padding(8.dp))
        IconToggleButton(
            checked = isLiked,
            onCheckedChange = { onLikeClicked.invoke() },
            modifier = Modifier.size(20.dp)
        ) {
            Icon(painter = painterResource(id = R.drawable.icon), contentDescription = "")


        }
        Spacer(modifier = Modifier.padding(8.dp))
    }
}

@Preview
@Composable
fun PreviewPostInteraction() {
    PostInteractionBar(
        true, {}, {}, {}
    )
}