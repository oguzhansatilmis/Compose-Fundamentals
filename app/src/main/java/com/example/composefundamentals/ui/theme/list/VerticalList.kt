package com.example.composefundamentals.ui.theme.list

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composefundamentals.ui.theme.demo.util.Item


@Composable
fun VerticalListItem(item: Item, context: Context) {


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .testTag("asdasdasd")
            .clickable {
                Toast.makeText(context,item.title,Toast.LENGTH_LONG).show()
            }
    ) {

        Image(
            painter = painterResource(id = item.imageId),
            contentDescription = "",
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )


        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = item.title,
            style = typography.titleLarge
        )
        Text(
            text = item.subtitle,
            style = typography.bodyMedium
        )
        Text(
            text = item.source,
            style = typography.titleSmall
        )

    }


}


