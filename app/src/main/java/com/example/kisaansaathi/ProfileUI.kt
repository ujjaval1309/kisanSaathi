package com.example.kisaansaathi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kisaansaathi.ui.theme.BlueStart
import com.example.kisaansaathi.ui.theme.GreenJC
import com.example.kisaansaathi.ui.theme.PurpleStart

val pofilelist = listOf(
    ProfileData(
        name = "Ujjaval Pandey",
        profileIcon = R.drawable.man,
        age = "20",
        Gender = "M",
        mail = "ujjaval0001@gmail.com",
        location = "Adani Angan"
    )
)

@Composable
fun ProfileUI() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.man),
            contentDescription = null,
            modifier = Modifier.size(160.dp)
        )
        Text(
            text = "Ujjaval Pandey",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp,
            color = BlueStart,
            modifier = Modifier.padding(top = 10.dp)
        )
        Row {
            Text(
                text = "  Age",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                color = Color.DarkGray,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)
            )
            Text(
                text = "Gender",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                color = Color.DarkGray,
                modifier = Modifier.padding(horizontal = 25.dp, vertical = 10.dp)
            )
        }
        Row {
            Text(
                text = "20",
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp,
                color = Color.LightGray,
                modifier = Modifier.padding(horizontal = 25.dp)
            )
            Text(
                text = "Male",
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp,
                color = Color.LightGray,
                modifier = Modifier.padding(horizontal = 25.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Mail : ",
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp,
                color = Color.DarkGray,
                modifier = Modifier.padding(5.dp)
            )
            Text(
                text = "ujjaval0001@gmail.com",
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp,
                color = Color.LightGray,
                modifier = Modifier.padding(5.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Location : ",
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp,
                color = Color.DarkGray,
                modifier = Modifier.padding(5.dp)
            )
            Text(
                text = "Adani Aangan",
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp,
                color = Color.LightGray,
                modifier = Modifier.padding(5.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        ElevatedButton(
            onClick = { },
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
        ) {
            Text("Order History")
        }
        Spacer(modifier = Modifier.height(10.dp))
        ElevatedButton(
            onClick = { },
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
        ) {
            Text("Contact us")
        }
        Spacer(modifier = Modifier.height(10.dp))
        ElevatedButton(
            onClick = { },
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
        ) {
            Text("Terms & Conditions")
        }


    }
}

