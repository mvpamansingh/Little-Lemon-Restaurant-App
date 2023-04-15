package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun UpBar(scaffoldState:ScaffoldState?=null,scope:CoroutineScope?=null)
{
    Row {
        IconButton(onClick = {
            scope?.launch{scaffoldState?.drawerState?.open()}
        }) {

            Image(painter = painterResource(id = R.drawable.burger), contentDescription ="burger"
            ,modifier= Modifier.size(24.dp))
        }
       // Image(painter = painterResource(id = R.drawable.easterbunny), contentDescription ="cute" )
        Text(text = "Mysterious island of Akhand Bharat", fontSize = 18.sp)
        IconButton(onClick = { }) {

            Image(painter = painterResource(id = R.drawable.bag), contentDescription ="List" ,
            modifier=Modifier.size(24.dp))
        }
    }

}