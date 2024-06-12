package com.example.composefundamentals.ui.theme.list

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefundamentals.ui.theme.demo.util.DemoItem


@Composable
fun VerticalListView(context: Context) {
    val list = remember { DemoItem.itemList }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        LazyColumn(
            modifier = Modifier
                .padding(16.dp)
        ) {

            items(
                items = list,
                itemContent = { item ->
                    VerticalListItem(item = item, context)
                }
            )
        }
        LazyRow(
            modifier = Modifier
                .padding(16.dp)
        ) {

            items(
                items = list,
                itemContent = { item ->
                    VerticalListItem(item = item, context)
                }
            )
        }

        LazyHorizontalGrid(rows = GridCells.FixedSize(128.dp)) {
            items(
                items = list,
                itemContent = { item ->
                    VerticalListItem(item = item, context)
                }
            )
        }
        LazyVerticalGrid(columns = GridCells.FixedSize(200.dp)) {
            items(
                items = list,
                itemContent = { item ->
                    VerticalListItem(item = item, context)
                }
            )


        }

    }
}
@Preview
@Composable
fun Preview(){
    val context = LocalContext.current

    VerticalListView(context)
}

