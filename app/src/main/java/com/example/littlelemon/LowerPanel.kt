package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecial()
        MenuDish()
    }
}


@Composable
fun WeeklySpecial(){

    Card(modifier= Modifier
        .fillMaxWidth()
        .padding(8.dp)) {
        Text(text = "Weekely Special", fontSize = 26.sp, fontWeight = FontWeight.Bold)
    }
}


@Composable
fun MenuDish() {
    
    Card() {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            Column() {

                Text(text = "Greek Salad", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text(text = "The famous Greek salad of crispy lettuce, peppers, olives, our Chicago ..."
                , modifier = Modifier.padding(top=5.dp, bottom = 5.dp).fillMaxWidth(.75f),
                    color = Color.Gray
                )
                Text(text="$12.99", fontWeight = FontWeight.Bold,color= Color.Gray)
            }

            Image(painter = painterResource(id = R.drawable.greeksalad), contentDescription ="Greek Salad",
            Modifier.clip(RoundedCornerShape(20.dp)))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview(){
    LowerPanel()
}
