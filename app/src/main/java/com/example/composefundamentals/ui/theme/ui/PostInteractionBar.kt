package com.example.composefundamentals.ui.theme.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun PostInteractionBar(
    isLiked: Boolean,
    onLikeClicked: () -> Unit,
    onCommentsClicked: () -> Unit,
    onSendClicked: () -> Unit,
    modifier: Modifier = Modifier
) {

    Row(modifier = modifier) {

        IconToggleButton(
            checked = isLiked,
            onCheckedChange = {onLikeClicked.invoke()}) {




        }

    }

}


@Preview
@Composable
fun PreviewPostInteraction() {
    PostInteractionBar(
        true, {}, {}, {}
    )
}