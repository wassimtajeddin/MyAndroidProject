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
            var painters = ArrayList<Painter>()
            var descriptions = ArrayList<String>()
            var titles = ArrayList<String>()
            painters.add(0,painterResource(id = R.drawable.car))
            painters.add(1,painterResource(id = R.drawable.cat))
            painters.add(2,painterResource(id = R.drawable.food))
            painters.add(3,painterResource(id = R.drawable.phone))
            painters.add(4,painterResource(id = R.drawable.snow))
            painters.add(5,painterResource(id = R.drawable.lavender))
            painters.add(6,painterResource(id = R.drawable.plant))
            titles.add(0,"A car")
            titles.add(1,"A cat")
            titles.add(2,"Food")
            titles.add(3,"A Phone")
            titles.add(4,"Snow")
            titles.add(5,"Lavender")
            titles.add(6,"A plant")
            descriptions.add(0,"A car")
            descriptions.add(1,"A cat")
            descriptions.add(2,"Food")
            descriptions.add(3,"A Phone")
            descriptions.add(4,"Snow")
            descriptions.add(5,"Lavender")
            descriptions.add(6,"A plant")

            val scrollState = rememberScrollState()

            Column (Modifier.verticalScroll(scrollState)){
                Row {
                    Box(modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)){
                        ImageCard(painter = painters.get(0),
                            contentDescription = descriptions.get(0),
                            title = titles.get(0)
                        )
                    }
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)){
                        ImageCard(painter = painters.get(1),
                            contentDescription = descriptions.get(1),
                            title = titles.get(1)
                        )
                    }

                }
                Row {
                    Box(modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)){
                        ImageCard(painter = painters.get(2),
                            contentDescription = descriptions.get(2),
                            title = titles.get(2)
                        )
                    }
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)){
                        ImageCard(painter = painters.get(3),
                            contentDescription = descriptions.get(3),
                            title = titles.get(3)
                        )
                    }
                }
                Row {

                    Box(modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)){
                        ImageCard(painter = painters.get(4),
                            contentDescription = descriptions.get(4),
                            title = titles.get(4)
                        )
                    }
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)){
                        ImageCard(painter = painters.get(5),
                            contentDescription = descriptions.get(5),
                            title = titles.get(5)
                        )
                    }
                }

                Box(modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(16.dp)){
                    ImageCard(painter = painters.get(6),
                        contentDescription = descriptions.get(6),
                        title = titles.get(6)
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