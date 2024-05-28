package com.example.composefundamentals.ui.theme.state

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay


@Composable
 fun DataFetchingComponent() {
    var data by remember { mutableStateOf<List<String>?>(null) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LaunchedEffect(Unit) {
            val result = fetchDataFromApi()
            delay(12)
            data = result
        }
        if (data == null) {

            CircularProgressIndicator(modifier = Modifier.size(50.dp))
        } else {
            LazyColumn(
                Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
                    .padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(data!!.size) { index ->
                    Text(text = data!![index],
                        modifier = Modifier
                            .background(Color.Red)
                            .fillMaxSize(),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}


suspend fun fetchDataFromApi(): List<String> {

    delay(3000)
    return generateItemList()
}


suspend fun generateItemList(): List<String> {
    val itemList = mutableListOf<String>()
    for (i in 1..50) {
        itemList.add("Item $i")
    }
    return itemList
}


@Preview(showBackground = true)
@Composable
fun DataFetchingComponentPreview() {

    DataFetchingComponent()

}