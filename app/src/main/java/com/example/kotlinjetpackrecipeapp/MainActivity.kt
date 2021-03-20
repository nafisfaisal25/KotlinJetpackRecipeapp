package com.example.kotlinjetpackrecipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(color = Color(0xFFF2F2F2))
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
            ){
                Image(
                    painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = "Happy Meal Image",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .padding(10.dp)

                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween


                    ) {
                        Text(
                            text = "Happy Meal",
                            modifier = Modifier.align(Alignment.CenterVertically)

                        )
                        Text(
                            text = "300 taka",
                            style = TextStyle(
                                color = Color.Green
                            ),
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(end = 20.dp)
                        )
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "800 Calories")
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "ORDER NOW!")
                    }

                }
            }


        }
    }
}