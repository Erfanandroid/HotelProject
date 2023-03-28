package com.example.hotelproject.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hotelproject.R


val PersianFont2 = FontFamily(
    Font(R.font.bita, FontWeight.Normal),
    Font(R.font.bita, FontWeight.Light),
    Font(R.font.bita, FontWeight.SemiBold),
    Font(R.font.bita, FontWeight.ExtraBold)
)

@Composable
fun RoomSection(){


        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            CompositionLocalProvider( LocalLayoutDirection provides LayoutDirection.Rtl) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)
                    .height(60.dp)
                , verticalAlignment = Alignment.CenterVertically
            ){

                Text(
                    text = "نوع اتاق",
                    style = TextStyle(
                        color = Color.White,
                        fontFamily = PersianFont2,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                    , textAlign = TextAlign.Right
                , modifier = Modifier
                        .padding(start = 20.dp)

                )

                Text(text = "صبحانه"
                , style = TextStyle(
                        color = Color.White,
                        fontFamily = PersianFont2,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                        // textAlign = TextAlign.Right
                    )
                    , textAlign = TextAlign.Right
                    , modifier = Modifier
                        //.fillMaxWidth()
                        .padding(start = 30.dp)
                )
                Text(text = "ناهار"
                    , style = TextStyle(
                        color = Color.White,
                        fontFamily = PersianFont2,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    , textAlign = TextAlign.Right
                    , modifier = Modifier
                        //.fillMaxWidth()
                        .padding(start = 8.dp)
                )
                Text(text = "شام"
                    , style = TextStyle(
                        color = Color.White,
                        fontFamily = PersianFont2,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    , textAlign = TextAlign.Right
                    , modifier = Modifier
                        //.fillMaxWidth()
                        .padding(start = 8.dp)
                )

                Text(text = "تاریخ اقامت شما"
                    , style = TextStyle(
                        color = Color.White,
                        fontFamily = PersianFont2,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    , textAlign = TextAlign.Right
                    , modifier = Modifier
                        //.fillMaxWidth()
                        .padding(start = 18.dp)
                )

                Text(text = "قیمت"
                    , style = TextStyle(
                        color = Color.White,
                        fontFamily = PersianFont2,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    , textAlign = TextAlign.Right
                    , modifier = Modifier
                        .padding(start = 30.dp)
                )

            }
           LazyColumn(content = {
               items(count = 20,
               ){i->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "$i",
                        style = TextStyle(
                            color = Color.White,
                            fontFamily = PersianFont2,
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp
                        )
                        , textAlign = TextAlign.Right
                        , modifier = Modifier
                            .padding(start = 20.dp)

                    )




                }


               }

           })




        }
    }





}