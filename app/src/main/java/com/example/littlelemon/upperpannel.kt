package com.example.littlelemon

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
 fun UpperPannel()
{

    val context= LocalContext.current

    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color(0XFF495E57)), verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
    ) {

//
        Text(text = "Little lemon", fontSize = 32.sp,color= Color(0xFFF4CE14), modifier = Modifier.padding(start = 20.dp,top=20.dp))

        Text(text = "California", fontSize = 24.sp,color= Color.White, modifier = Modifier.padding(start =20.dp))

        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp),horizontalArrangement = Arrangement.Start) {

            Text(text = stringResource(id = R.string.tedd),
                Modifier.width(200.dp),color= Color.White, fontSize = 21.sp)


            Image(painter = painterResource(id = R.drawable.cuteb), contentDescription ="" ,
                modifier= Modifier
                    .height(200.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
        }

        Button(onClick = {
                         Toast.makeText(context,"delivery succesful",Toast.LENGTH_SHORT).show()
        },
            border= BorderStroke(1.dp, Color.Red),
            shape= RoundedCornerShape(10.dp),
            colors= ButtonDefaults.buttonColors(Color(0XFFF4CE14))
        ) {
            Text(text= "Button me")
        }
    }

}
@Preview(showBackground = true)
@Composable
fun showme()
{

    UpperPannel()
}