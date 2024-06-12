package com.example.composefundamentals.ui.theme.basic

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun TabScreen() {

    val tabTitles = listOf("Tab1", "Tab2", "Tab3")

    var selectedTabIndex by remember { mutableIntStateOf(0) }


    Column(modifier = Modifier.fillMaxSize()) {

        TabRow(selectedTabIndex = selectedTabIndex) {

            tabTitles.forEachIndexed { index, title ->

                Tab(selected = selectedTabIndex == index, onClick = { selectedTabIndex = index }) {
                    Text(text = title, modifier = Modifier.padding(16.dp))
                }
            }
        }

        when (selectedTabIndex) {
            0 -> Text(
                text = "Tab 1 Content", modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 20.dp)
            )

            1 -> Text(
                text = "Tab 2 Content", modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 20.dp)
            )

            2 -> Text(
                text = "Tab 3 Content", modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 20.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewTabScreen() {
    TabScreen()
}