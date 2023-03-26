package com.example.hotelproject.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hotelproject.R



@Composable
fun SignIn(
    navController: NavController
){


    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFAAE5EC))
    ) {

        Column(modifier = Modifier.fillMaxSize()) {

            Image(painter = painterResource(id = R.drawable.signingpic) ,
                contentDescription ="sign up page",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                , contentScale = ContentScale.FillBounds
            )
            Spacer(modifier = Modifier.height(50.dp))
            //------------------------------------------------------------------------------------------------------------------
            NameCard(){}
            Spacer(modifier = Modifier.height(30.dp))

            //---------------------------------------------------------------------------------------------------------------------------------
            Pass1Card(){}
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "فراموشی رمز عبور"
            , color = Color.Blue
            , fontSize = 15.sp
            , fontFamily = PersianFont
            , fontWeight = FontWeight.Thin
            , modifier = Modifier
                    //.align(CenterHorizontally)
                    .padding(start = 220.dp)
                    .clickable {

                    }
            )
            Spacer(modifier = Modifier.height(30.dp))



            //--------------------------------------------------------------------------------------------
            Button(
                onClick = { /*TODO*/ }
                , modifier = Modifier.align(Alignment.CenterHorizontally)
                , colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White
                )
            ) {
                Text(text = "ورود "
                    , style = TextStyle(
                        fontFamily = PersianFont
                        , fontWeight =  FontWeight.SemiBold
                        , color = Color.Green
                    )
                )


            }

        }


    }

}

