package com.example.kisaansaathi


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.CurrencyRupee
import androidx.compose.material.icons.rounded.Groups
import androidx.compose.material.icons.rounded.Money
import androidx.compose.material.icons.rounded.Paid
import androidx.compose.material.icons.rounded.PointOfSale
import androidx.compose.material.icons.rounded.Sell
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kisaansaathi.ui.theme.BlueStart
import com.example.kisaansaathi.ui.theme.GreenJC
import com.example.kisaansaathi.ui.theme.GreenStart
import com.example.kisaansaathi.ui.theme.OrangeStart
import com.example.kisaansaathi.ui.theme.PurpleStart

val homelist= listOf(
    HomeCard(
        icon = Icons.Rounded.Groups,
        name = "FPO\nBenefits",
        background = PurpleStart
    ),
    HomeCard(
        icon = Icons.Rounded.StarHalf,
        name = "Latest\nSchemes",
        background = BlueStart
    ),
    HomeCard(
        icon = Icons.Rounded.Sell,
        name = "Sales\nAnalytics",
        background = OrangeStart
    ),
    HomeCard(
        icon = Icons.Rounded.ShoppingCart,
        name = "Purchase\nAnalytics",
        background = GreenStart
    )
)
@Preview
@Composable
fun HomeDataCard(){
    Column {
        Text(
            text = "Welcome User",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp,
            color = GreenJC,
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp)
        )
        LazyRow{
            items(homelist.size){
                HOmecardds(it)
            }
        }
    }
}

@Composable
fun HOmecardds(index:Int){
    val finance= homelist[index]
    var lastPaddingEnd=0.dp
    if(index== homelist.size-1){
        lastPaddingEnd=16.dp
    }
    Box(modifier = Modifier.padding(start=16.dp, end = lastPaddingEnd)){
        Column(modifier = Modifier.clip(RoundedCornerShape(25.dp)).
        background(MaterialTheme.colorScheme.secondaryContainer).size(120.dp).clickable {}.padding(13.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Box(modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(finance.background)
                .padding(6.dp)
            ){
                Icon(
                    imageVector = finance.icon,
                    contentDescription = finance.name,
                    tint = Color.White
                )
            }

            Text(
                text = finance.name,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontSize = 15.sp)
}}
}
