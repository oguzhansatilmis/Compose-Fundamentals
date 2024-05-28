package com.example.composefundamentals.ui.theme.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ArrangementExample() {


    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
    ) {
        Box(
            Modifier
                .size(50.dp)
                .background(Color.Red)
        )
        Box(
            Modifier
                .size(80.dp)
                .background(Color.Black)
        )
        Box(
            Modifier
                .size(100.dp)
                .background(Color.LightGray)
        )
    }

    /*
       horizontalArrangement-> Bulunduğu eksende hizalama
       verticalAlignment->Diğer eksende hizalama
     */
}
@Composable
fun AlignExample() {
    Box(
        modifier = Modifier
            .background(Color.Red)
    ) {
        Text(
            text = "Hello Compose",
            color = Color.Magenta,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 20.dp)
                .background(Color.White)


        )
    }
}