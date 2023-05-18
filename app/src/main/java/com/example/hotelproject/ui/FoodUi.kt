package com.example.hotelproject.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.hotelproject.HotelViewModel
import com.example.hotelproject.R
import com.example.hotelproject.db.Food
import com.example.hotelproject.other.FoodInTwoLang
import java.util.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FoodSection(
    viewModel: HotelViewModel = hiltViewModel()
) {




    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState, topBar = {
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                        .background(Color.Blue), verticalAlignment = Alignment.CenterVertically
                ) {

                }
                Text(
                    text = "لیست غذاهای آماده برای رزور",
                    fontSize = 25.sp,
                    fontFamily = PersianFont,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    textAlign = TextAlign.Right,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, top = 20.dp)

                )
            }


        }
    ) {


        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ){
            itemsIndexed(
                listOf(
                    FoodInTwoLang("breakfast","لیست غذاهای صبحانه موجود")
                    , FoodInTwoLang("lunch","لیست غذاهای ناهار موجود")
                    , FoodInTwoLang("dinner","لیست غذاهای شام موجود")
                    , FoodInTwoLang("drink","لیست نوشیدنی های موجود")
                    , FoodInTwoLang("cake","لیست کیک های موجود")
                )
            ){index , item ->
                CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl){

                    Text(text = item.PerName,
                        fontSize = 25.sp
                        , fontFamily = PersianFont
                        , textAlign = TextAlign.Right
                        , color = Color.Green
                        , modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 7.dp, top = 3.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    val foodGroup by viewModel.getFoodGroup(item.engName).observeAsState(initial =
                    listOf(
                        Food(
                            foodId = 20,
                            foodName = "خوراک مرغ",
                            price = 126000f,
                            picture = R.drawable.cake_ruz,
                            contentDescription = "خوراک مرغ",
                            foodGroup = "lunch"
                        )
                    )
                    )



                    LazyRow(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    ) {
                        itemsIndexed(
                            foodGroup
                        ){ _, item ->

                            Image( painterResource(id =item.picture)
                                , contentDescription =item.contentDescription
                                , contentScale = ContentScale.FillBounds
                                , modifier = Modifier
//                                    .fillMaxWidth()
//                                    .height(150.dp)
                            )



//                            Text(text = item.picture.toString()
//                                , modifier = Modifier
//                                    .height(50.dp)
//                                    .background(Color.Red)
//                            )

                        }

                    }


                }



            }
        }



    }

}


fun getCurrentDateTime(): Date {
    return Calendar.getInstance().time
}