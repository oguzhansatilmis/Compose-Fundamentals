package com.example.composefundamentals.ui.theme.tablayout

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefundamentals.ui.theme.util.DemoItem

private enum class DemoTabs(val value: String) {
    APPLE("Apple"),
    GOOGLE("Google"),
    AMAZON("Amazon")
}

@Composable
fun TabLayout() {
    val tabsName = remember { DemoTabs.entries.map { it.value } }
    val selectedIndex = remember { mutableIntStateOf(DemoTabs.APPLE.ordinal) }
    val icons = listOf(Icons.Default.Info, Icons.Default.Person, Icons.Default.ShoppingCart)

    val clickItemText = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .background(Color.White)
            .height(200.dp)
    ) {

        TabRow(selectedTabIndex = selectedIndex.value,) {
            tabsName.forEachIndexed { index, title ->

                Tab(selected = index == selectedIndex.value,
                    onClick = {

                        when (title) {
                            DemoTabs.APPLE.value -> {
                                selectedIndex.intValue = DemoTabs.APPLE.ordinal
                            }

                            DemoTabs.GOOGLE.value -> {
                                selectedIndex.intValue = DemoTabs.GOOGLE.ordinal
                            }

                            DemoTabs.AMAZON.value -> {
                                selectedIndex.intValue = DemoTabs.AMAZON.ordinal
                            }
                        }
                    },
                    text = { Text(text = title, color = Color.Magenta) })


            }

        }
       Surface(modifier = Modifier.weight(0.5f)) {

           ScrollableListOfTabs(clickItemText)

       }

        Text(text = clickItemText.value, color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
    }

}

@Composable
fun ScrollableListOfTabs(clickItemText: MutableState<String>) {
    val tweets = remember { DemoItem.tweetList.filter { it.tweetImageId > 0 } }
    val selectedIndex = remember { mutableStateOf(0) }
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

        ScrollableTabRow(
            selectedTabIndex = selectedIndex.value,
            edgePadding = 16.dp,
            containerColor = Color.Transparent,
            indicator={},
            divider = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            tweets.forEachIndexed { index, tweet ->

                Tab(selected = index == selectedIndex.value,
                    onClick = {
                        selectedIndex.value = index

                        clickItemText.value= tweet.author
                    }) {

                    CustomTabItem(
                        text = tweet.author,
                        imageId = tweet.authorImageId,
                        selected = index == selectedIndex.value,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 4.dp, vertical = 16.dp)
                    )
                }
            }

        }


    }
}
@Composable
private fun CustomTabItem(
    text: String,
    imageId: Int,
    selected: Boolean,
    modifier: Modifier = Modifier
) {
    Surface(
        color = when {
            selected -> MaterialTheme.colorScheme.primary
            else -> Color.Transparent
        },
        contentColor = when {
            selected -> MaterialTheme.colorScheme.onPrimary
            else -> Color.LightGray
        },
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(
            width = 1.dp,
            color = when {
                selected -> MaterialTheme.colorScheme.primary
                else -> Color.LightGray
            }
        ),
        modifier = Modifier
    ) {
        Row(modifier =Modifier) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = null,
                modifier = Modifier
                    .padding(8.dp)
                    .size(20.dp)
                    .clip(CircleShape)
            )
            Text(
                text = text,
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.padding(end = 8.dp, top = 8.dp, bottom = 8.dp)
            )
        }
    }
}


@Preview
@Composable
fun PreviewTabLayout() {

    TabLayout()
}