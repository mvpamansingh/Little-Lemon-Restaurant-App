package com.example.littlelemon

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope


@Composable
fun DrawerPannel(scaffoldState: ScaffoldState,scope:CoroutineScope)
{
    List(10)
    {
        Text(text = "item $it", modifier = Modifier.padding(vertical = 10.dp, horizontal = 16.dp))

        IconButton(onClick = {  }) {
            Icon(imageVector = Icons.Default.ExitToApp, contentDescription ="come out" )

        }
    }
}