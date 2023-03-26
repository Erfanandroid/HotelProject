package com.example.hotelproject.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.hotelproject.R

val PersianFont = FontFamily(
    Font(R.font.lalezarregular, FontWeight.Normal),
    Font(R.font.lalezarregular, FontWeight.Light),
    Font(R.font.lalezarregular, FontWeight.SemiBold),
    Font(R.font.lalezarregular, FontWeight.ExtraBold)
)

@Composable
fun SignUp(
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
            Spacer(modifier = Modifier.height(10.dp))
    //------------------------------------------------------------------------------------------------------------------
            NameCard(){}
            Spacer(modifier = Modifier.height(30.dp))

    //---------------------------------------------------------------------------------------------------------------------------------
            Pass1Card(){}
            Spacer(modifier = Modifier.height(30.dp))

    //---------------------------------------------------------------------------------------------------------------------------
            Pass2Card(){}
            Spacer(modifier = Modifier.height(30.dp))

     //-------------------------------------------------------------------------------------------
            EmailCard(){}
            Spacer(modifier = Modifier.height(30.dp))
    //-------------------------------------------------------------------------------------------------------------------------
            PhoneNumberCard(){}
            Spacer(modifier = Modifier.height(30.dp))
    //--------------------------------------------------------------------------------------------
            Button(
                onClick = { /*TODO*/ }
            , modifier = Modifier.align(CenterHorizontally)
            , colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White
            )
            ) {
                Text(text = "ثبت نام "
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




@Composable
fun NameCard(
    nameRepeatCheck:(String)->Unit
){
    var nameState by remember {
        mutableStateOf("")
    }


    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        TextField(
            value = nameState, onValueChange ={
                nameState=it
                nameRepeatCheck(it)
            }
            , shape = RoundedCornerShape(10.dp)
            , modifier = Modifier
                .border(1.dp, Color.Blue, shape = RoundedCornerShape(10.dp))
                .background(Color.White, shape = RoundedCornerShape(10.dp))
                .height(55.dp)
                .width(250.dp)

            , placeholder = {
                Text(text = "نام کاربری"
                    , modifier = Modifier
                        .fillMaxWidth()
                    ,
                    textAlign = TextAlign.Right,
                    fontWeight = FontWeight.Bold,
                    fontFamily = PersianFont,
                    color = Color.DarkGray
                )
            }
            ,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
    }
}

//---------------------------------------------------------------------------------

@Composable
fun Pass1Card(
    modifier: Modifier=Modifier,
    pass1:(String)->Unit
){
    var passwordState by remember {
        mutableStateOf("")
    }

        Box(
            modifier = modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            TextField(
                value = passwordState, onValueChange ={
                    passwordState=it
                    pass1(it)
                }
                , shape = RoundedCornerShape(10.dp)
                , modifier = Modifier
                    .border(1.dp, Color.Blue, shape = RoundedCornerShape(10.dp))
                    .background(Color.White, shape = RoundedCornerShape(10.dp))
                    .height(55.dp)
                    .width(250.dp)
                , placeholder = {
                    Text(text = "رمز کاربری"
                        , modifier = Modifier
                            .fillMaxWidth()
                        ,
                        textAlign = TextAlign.Right,
                        fontWeight = FontWeight.Bold,
                        fontFamily = PersianFont,
                        color = Color.DarkGray
                    )
                }
                ,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
        }
}

//-----------------------------------------------------------------------------------------
@Composable
fun Pass2Card(
    modifier: Modifier=Modifier,
    pass2:(String)->Unit
){
    var passwordState2 by remember {
        mutableStateOf("")
    }
    Box(
        modifier = modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        TextField(
            value = passwordState2, onValueChange ={
                passwordState2=it
                pass2(it)
            }
            , shape = RoundedCornerShape(10.dp)
            , modifier = Modifier
                .border(1.dp, Color.Blue, shape = RoundedCornerShape(10.dp))
                .background(Color.White, shape = RoundedCornerShape(10.dp))
                .height(55.dp)
                .width(250.dp)
            , placeholder = {
                Text(text = "تکرار رمز کاربری"
                    , modifier = Modifier
                        .fillMaxWidth()
                    ,
                    textAlign = TextAlign.Right,
                    fontWeight = FontWeight.Bold,
                    fontFamily = PersianFont,
                    color = Color.DarkGray
                )
            }
            ,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
    }
}

//-----------------------------------------------------------------------------------------
@Composable
fun EmailCard(
    modifier: Modifier=Modifier,
    emailCheck:(String)->Unit
){
    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        var emailState by remember {
            mutableStateOf("")
        }

        TextField(
            value = emailState, onValueChange ={
                emailState=it
                emailCheck(it)
            }
            , shape = RoundedCornerShape(10.dp)
            , modifier = Modifier
                .border(1.dp, Color.Blue, shape = RoundedCornerShape(10.dp))
                .background(Color.White, shape = RoundedCornerShape(10.dp))
                .height(55.dp)
                .width(250.dp)
            , placeholder = {
                Text(text = "ایمیل"
                    , modifier = Modifier
                        .fillMaxWidth()
                    ,
                    textAlign = TextAlign.Right
                    , fontFamily = PersianFont
                    , fontWeight = FontWeight.Bold
                , color = Color.DarkGray
                )
            }
            ,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
    }
}

//---------------------------------------------------------------------------------------------------------------------
@Composable
fun PhoneNumberCard(
    modifier: Modifier=Modifier,
    phoneCheck:(String)->Unit
){
    Column(
        modifier = modifier.fillMaxWidth()
    ) {

        var numberState by remember {
            mutableStateOf("")
        }


        val charLimit=11
        var isError by  rememberSaveable{
            mutableStateOf(false)
        }
        val errorMessage = "مقدار وارد شده غیر مجاز است"
        fun validate(number: String) {
            isError = number.length>charLimit ||number.length<charLimit
        }
        TextField(
            value = numberState, onValueChange ={
                numberState=it
                validate(numberState)
                phoneCheck(it)
            }
            , shape = RoundedCornerShape(10.dp)
            , modifier = Modifier
                .border(1.dp, Color.Blue, shape = RoundedCornerShape(10.dp))
                .background(Color.White, shape = RoundedCornerShape(10.dp))
                .align(CenterHorizontally)
                .height(55.dp)
                .width(250.dp)
            , placeholder = {
                Text(text = "شماره موبایل"
                    , modifier = Modifier
                        .fillMaxWidth()
                    ,
                    textAlign = TextAlign.Right
                    , fontFamily = PersianFont
                    , fontWeight = FontWeight.Bold
                , color = Color.DarkGray
                )
            }
            ,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone), isError = isError

            , singleLine = true
            , keyboardActions = KeyboardActions { validate(numberState) }
        )
        Spacer(modifier = Modifier.height(2.dp))
        if (isError ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
                .padding(start = 70.dp)
                , horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                    ,
                    text = errorMessage,
                    color = MaterialTheme.colors.error
                    , fontFamily = PersianFont

                )
            }

        }
    }
}
