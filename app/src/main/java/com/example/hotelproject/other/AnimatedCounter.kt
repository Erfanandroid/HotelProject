@file:OptIn(ExperimentalAnimationApi::class)
@file:Suppress("OPT_IN_IS_NOT_ENABLED", "NAME_SHADOWING")

package com.example.creatinganimatedcountertext

import androidx.compose.animation.*
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle

@Composable

fun AnimatedCounter(
    count:Int,
    modifier: Modifier=Modifier,
    style:TextStyle=MaterialTheme.typography.body1
){
    var oldCount by remember {
        mutableStateOf(count)
    }

    SideEffect {
        oldCount=count
    }
    
    Row(modifier = modifier) {
        val countString=count.toString()
        val oldCountString=oldCount.toString()
        for (i in countString.indices){
          val oldChar=oldCountString.getOrNull(i)
          val newChar=countString[i]

          val char=if (
              oldChar==newChar
          )  {
              oldCountString[i]
          }else{
              countString[i]
          }
            AnimatedContent(
                targetState = char,
                transitionSpec = {
                   slideInVertically { it } with slideOutVertically{-it}
                }
            ) {char->
                Text(
                    text = char.toString(),
                    style = style,
                    softWrap = false
                )
            }
        }
    }
}