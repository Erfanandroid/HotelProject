package com.example.hotelproject.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hotelproject.R

@Composable
fun EntryUi(){
    val PersianFont = FontFamily(
        Font(R.font.lalezarregular, FontWeight.Normal),
        Font(R.font.lalezarregular,FontWeight.Light),
        Font(R.font.lalezarregular, FontWeight.SemiBold),
        Font(R.font.lalezarregular, FontWeight.ExtraBold)
    )
    @Composable
    fun FontStyledText(text: String) {
        Text(
            text = text,
            fontFamily = PersianFont,
            fontWeight = FontWeight.SemiBold
        )
    }

    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.hotel_login),
            contentDescription = "Hotel login page",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )


        Text(text = "Welcome to \n"+
                "Group 6th\n"+
                "Grand Hotel"
            , fontSize = 30.sp
            , fontWeight = FontWeight.Bold
            , fontFamily = FontFamily.Cursive
            , color = Color.White
            , modifier = Modifier.padding(top = 250.dp, start = 35.dp)
        )

        
        Button(onClick = { /*TODO*/ }
        , shape = RoundedCornerShape(10.dp)
        , modifier = Modifier
                .padding(bottom = 70.dp)
                .align(Alignment.BottomCenter)
                .width(200.dp)
                , colors = ButtonDefaults.buttonColors(
                Color.Cyan

                )

        ) {
            Text(text = "ثبت نام"
                , fontFamily = PersianFont
            , modifier = Modifier
            )
        }
        
        Text(text = "ورود"
            , modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(bottom = 45.dp, start = 140.dp)
                .clickable {

                }
            , color = Color.Green
            , fontFamily = PersianFont

        )
        
        Text(text = "حساب کاربری دارید؟"
            , modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(bottom = 45.dp, start = 180.dp)
            , color = Color.White
            , fontFamily = PersianFont

        )


    }

    
}