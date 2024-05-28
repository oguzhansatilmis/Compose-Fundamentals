package com.example.composefundamentals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefundamentals.ui.theme.ComposeFundamentalsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                ArrangementExample()
            }
        }
    }
}

@Composable
fun ArrangementExample() {


    Column(modifier = Modifier.fillMaxWidth()) {

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Top,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                Modifier
                    .size(50.dp)
                    .background(Color.Red)
            )
            Box(
                Modifier
                    .size(50.dp)
                    .background(Color.Black)
            )
            Box(
                Modifier
                    .size(50.dp)
                    .background(Color.LightGray)
            )
        }

        Spacer(modifier = Modifier.size(120.dp))
        Column(
            modifier = Modifier
                .background(Color.Black)
                .size(20.dp)
        ) {

        }

    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArrangementExample()

}