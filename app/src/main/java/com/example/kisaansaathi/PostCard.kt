package com.example.kisaansaathi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kisaansaathi.ui.theme.GreenJC


val postslist= listOf(
PostsData(name = "Hybrid Wheat Seeds",postIcon=R.drawable.post1, price = "₹1200/kg", seller = "Krishi Upaj Kendra", location = "Punjab, India"),
PostsData(name = "Organic Fertilizer",postIcon=R.drawable.post2, price = "₹850/bag", seller = "Green Earth Solutions", location = "Karnataka, India"),
PostsData(name = "Mango Saplings",postIcon=R.drawable.post3, price = "₹50/sapling", seller = "National Horticulture Mission", location = "Maharashtra, India"),
PostsData(name = "Tractor (50 HP)",postIcon=R.drawable.post4, price = "₹8,50,000", seller = "Mahavir Agro Equipments", location = "Tamil Nadu, India"),
PostsData(name = "Drip Irrigation System",postIcon=R.drawable.post5, price = "₹25,000/acre", seller = "Jalmitra Technologies", location = "Gujarat, India"),
PostsData(name = "Rice Paddy Thresher",postIcon=R.drawable.post6, price = "₹1,20,000", seller = "Agro Star Machines", location = "Andhra Pradesh, India"),
PostsData(name = "Dairy Milking Machine",postIcon=R.drawable.post7, price = "₹45,000", seller = "Sudha Dairy Solutions", location = "Haryana, India"),
PostsData(name = "Pesticide Sprayer",postIcon=R.drawable.post8, price = "₹1,000", seller = "Eco-Green Products", location = "Kerala, India"),
PostsData(name = "High-Yield Seeds",postIcon=R.drawable.post9, price = "₹200/packet", seller = "Kisan Seeds Pvt. Ltd.", location = "Odisha, India"),
PostsData(name = "Cold Storage Unit",postIcon=R.drawable.post10, price = "₹80,000/month", seller = "Krishak Storage Solutions", location = "Uttar Pradesh, India")
)

@Composable
fun ujjaval(modifier: Modifier = Modifier)
{
    Column {
        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = "Browse Products",
            fontWeight = FontWeight.Bold,
            lineHeight = 40.sp,
            fontSize = 40.sp,
            color = GreenJC,
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 15.dp)
        )
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(bottom = 80.dp)
        ){
            items(postslist.size) {
                postsCard(it)
            }
        }
        Spacer(modifier = Modifier.height(90.dp))
    }
}

@Composable
fun postsCard(index: Int) {
    val financethree = postslist[index]
    var lastPaddingEnd = 0.dp
    if (index == postslist.size - 1) {
        lastPaddingEnd = 86.dp
    }
    Card(
        modifier = Modifier
            .padding(7.dp)
            .wrapContentSize(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = financethree.name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp, modifier = Modifier.padding(top = 10.dp)
            )
            Image(
                painter = painterResource(id = financethree.postIcon),
                contentDescription = financethree.name,
                modifier = Modifier
                    .size(height = 125.dp, width = 125.dp)
            )
                Text(
                    text = financethree.price,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Text(
                    text = financethree.seller,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp
                )
                Text(
                    text = financethree.location,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    textAlign= TextAlign.End
                )
            Row(verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .padding(horizontal = 4.dp, vertical = 4.dp)
                    .fillMaxWidth()) {
                var age by remember {
                    mutableStateOf(0)
                }
                ElevatedButton(onClick = { age++ }, modifier = Modifier.weight(3.7f)) {
                    Text("Add to Cart $age")
                }
                ElevatedButton(onClick = { if (age > 0) age -= 1 }, modifier = Modifier.weight(1.5f)) {
                    Text("-",textAlign = TextAlign.Start)
                }
            }


        }
    }
}

