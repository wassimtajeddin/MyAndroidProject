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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
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
            val painter = painterResource(id = R.drawable.car)
            val description= "A car"
            val title = "A car"
            val painter1 = painterResource(id = R.drawable.cat)
            val description1= "A cat"
            val title1 = "A cat"
            val painter2 = painterResource(id = R.drawable.food)
            val description2= "Food"
            val title2 = "Food"
            val painter3 = painterResource(id = R.drawable.phone)
            val description3= "A phone"
            val title3 = "A phone"
            val painter4 = painterResource(id = R.drawable.snow)
            val description4= "Snow"
            val title4 = "Snow"
            Column {
                Box(modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(16.dp)){
                    ImageCard(painter = painter1,
                        contentDescription = description1,
                        title = title1
                    )
                }
                Box(modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(16.dp)){
                    ImageCard(painter = painter,
                        contentDescription = description,
                        title = title
                    )
                }
                Box(modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(16.dp)){
                    ImageCard(painter = painter2,
                        contentDescription = description2,
                        title = title2
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
                    title,style = TextStyle(color = Color.Black, fontSize = 16.sp))
            }
        }
    }
}