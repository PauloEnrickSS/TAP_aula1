package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                        app()
                }
            }
        }
    }
}

@Composable
fun app(){
    Column(
        Modifier
            .background(Color.Black)
    ) {
        Row(
            modifier = Modifier
                .padding(20.dp)
        ) {

        }

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(
                text = "app DataBase",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(

                onValueChange = { },
                label = { Text("nome:") }
            )
        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(

                onValueChange = { },
                label = { Text("Telefone:") }
            )
        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(onClick = {


            }) {
                Text("cadastrar")
            }
        }

        }
    }

    //Text(text = "app AMS", color = Color.Yellow)


@Preview
@Composable
fun appPreview(){
    MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background) {
            app()
        }
    }
}
