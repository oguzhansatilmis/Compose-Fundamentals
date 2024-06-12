package com.example.composefundamentals.ui.theme.demo.twitter


import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import com.example.composefundamentals.ui.theme.util.twitterColor


@Composable
fun ProfileInfo(
    profileName: String,
    profilePing: String,
    time: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.caption1
) {


    Row(
        modifier = modifier.semantics {
            contentDescription = "$profilePing post a tweet $time ago"
        },
        verticalAlignment = Alignment.Bottom
    ) {

        Text(
            text = profileName,
            style = textStyle,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Icon(
            imageVector = Icons.Default.CheckCircle,
            contentDescription = null,
            tint = twitterColor,
            modifier = Modifier
                .size(textStyle.fontSize.value.dp)
                .padding(start = 2.dp)
                .align(Alignment.CenterVertically)

        )

        Text(
            text = "$profilePing · $time",
            color = Color.Black,
            modifier = Modifier.padding(start = 8.dp),
            style = textStyle
        )

    }


}

@Preview
@Composable
fun PreviewProfileInfo() {
    ProfileInfo("asd", "asd", "qasd")
}