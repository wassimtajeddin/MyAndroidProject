package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var painters = ArrayList<Painter>(listOf(
                painterResource(id = R.drawable.car),
                painterResource(id = R.drawable.cat),
                painterResource(id = R.drawable.food),
                painterResource(id = R.drawable.phone),
                painterResource(id = R.drawable.snow),
                painterResource(id = R.drawable.lavender),
                painterResource(id = R.drawable.plant)
                ))
            var descriptions = ArrayList<String>(listOf("A car","A cat","Food","A Phone","Snow","Lavender","A plant"))
            var titles = ArrayList<String>(listOf("A car","A cat","Food","A Phone","Snow","Lavender","A plant"))

            val scrollState = rememberScrollState()

            Column (Modifier.verticalScroll(scrollState)){
                Row {
                    Box(modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)){
                        ImageCard(painter = painters[0],
                            contentDescription = descriptions[0],
                            title = titles[0]
                        )
                    }
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)){
                        ImageCard(painter = painters[1],
                            contentDescription = descriptions[1],
                            title = titles[1]
                        )
                    }

                }
                Row {
                    Box(modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)){
                        ImageCard(painter = painters[2],
                            contentDescription = descriptions[2],
                            title = titles[2]
                        )
                    }
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)){
                        ImageCard(painter = painters[3],
                            contentDescription = descriptions[3],
                            title = titles[3]
                        )
                    }
                }
                Row {

                    Box(modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)){
                        ImageCard(painter = painters[4],
                            contentDescription = descriptions[4],
                            title = titles[4]
                        )
                    }
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)){
                        ImageCard(painter = painters[5],
                            contentDescription = descriptions[5],
                            title = titles[5]
                        )
                    }
                }

                Box(modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(16.dp)){
                    ImageCard(painter = painters[6],
                        contentDescription = descriptions[6],
                        title = titles[6]
                    )
                }
            }

                }
        }
    }


@Composable
fun ImageCard(
          painter: Painter,
          contentDescription: String,
          title: String,
          modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
    ) {
        Box(modifier = Modifier.height(200.dp)){
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                )
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart){
                Text(
                    title,style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}