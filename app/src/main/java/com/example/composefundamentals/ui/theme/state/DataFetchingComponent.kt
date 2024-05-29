package com.example.composefundamentals.ui.theme.state

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LaunchedEffect(Unit) {
            val result = fetchDataFromApi()
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
                data?.let{
                    items(it.size) { index ->
                        Text(text = data!![index],
                            modifier = Modifier
                                .background(Color.Red)
                                .fillMaxSize()
                                .padding(10.dp)
                                .clickable {
                                           Toast.makeText(context, data!![index],Toast.LENGTH_SHORT).show()
                                },
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.size(10.dp))
                    }
                }

            }
        }
    }
}


suspend fun fetchDataFromApi(): List<String> {
    
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