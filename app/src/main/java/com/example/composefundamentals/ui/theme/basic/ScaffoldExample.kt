package com.example.composefundamentals.ui.theme.basic

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    Scaffold(topBar = {
        TopAppBar(
            colors = topAppBarColors(
                containerColor = Color.Magenta,
                titleContentColor = Color.White
            ),
            title = {
                Text(
                    text = "Top Bar Title",
                    Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            })
    },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Cyan,
                contentColor = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = screenWidth * 0.1f)
            ) {
                Text(
                    text = "Bottom Bar Text",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "Text1",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                )
                Text(text = "Text2")
                Text(text = "Text3")
                ImageScreen()
            }
        })
}

@Preview
@Composable
fun PreviewScaffoldExamples() {
    ScaffoldExample()
}