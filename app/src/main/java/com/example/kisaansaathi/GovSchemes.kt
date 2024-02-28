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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.kisaansaathi.ui.theme.GreenJC


val schemelist = listOf(
    GovSchemesData(
        FarmerImageid = R.drawable.farmer1,
        ArticleName = "Pradhan Mantri Kisan Samman Nidhi Yojana",
        Content = "The scheme aims at promoting soil test based and balanced use of fertilisers to enable farmers to realise higher yields at lower cost.[3] also the main objective is to aware growers about the appropriate amount of nutrients for the concerned crop depending on the quality of soil. It covers 12 Parameters.",
        date = "February 24, 2019"
    ),
    GovSchemesData(
        FarmerImageid = R.drawable.farmer2,
        ArticleName = "National Agriculture Market Scheme",
        Content = "The Pradhan Mantri Kisan Samman Nidhi (PM-Kisan) Yojana is a financial assistance scheme for farmers in India launched by the Government of India. The primary objective of the scheme is to provide income support to small and marginal farmers to help them meet their financial needs for agricultural inputs and other expenses. Under PM-Kisan, eligible farmers receive direct income support of INR 6,000 per year in three equal installments of INR 2,000 each. The scheme targets the most vulnerable and economically challenged farmers, aiming to ensure a minimum level of income security for them. The funds are directly credited to the bank accounts of the eligible farmers, and the scheme helps in addressing rural distress and improving the economic condition of farmers across the country.",
        date = "April 14, 2016"
    ),
    GovSchemesData(
        FarmerImageid = R.drawable.farmer3,
        ArticleName = "Pradhan Mantri Fasal Bima Yojana",
        Content = "As of my last knowledge update in January 2022, the National Agriculture Market (NAM) scheme in India aims to create a unified national market for agricultural commodities by integrating existing agricultural produce market committees (APMCs) across the country. Launched to enhance transparency and efficiency in agricultural trade, the scheme provides a platform for farmers to sell their produce online. The NAM seeks to eliminate intermediaries, reduce transaction costs, and ensure fair prices for farmers. Through the use of technology, the scheme connects various agricultural markets, fostering a seamless and competitive marketplace. However, for the latest developments or changes, it is recommended to check with official sources or updates from the concerned authorities.",
        date = "January 13, 2016"
    ),
    GovSchemesData(
        FarmerImageid = R.drawable.farmer4,
        ArticleName = "Pradhan Mantri Krishi Sinchayee Yojana ",
        Content = "The Pradhan Mantri Fasal Bima Yojana (PMFBY) is an Indian government-sponsored crop insurance scheme that provides financial protection to farmers against losses incurred due to unforeseen events such as natural disasters, pests, or diseases. Launched to ensure the well-being of farmers, PMFBY offers coverage for the entire crop cycle, including pre-sowing to post-harvest stages. Farmers pay a nominal premium, and in case of crop damage, they receive compensation for the losses suffered. The scheme aims to minimize the economic vulnerabilities of farmers, encourage risk management in agriculture, and promote overall agricultural stability in India.",
        date = "July 1, 2015"
    ),
    GovSchemesData(
        FarmerImageid = R.drawable.farmer5,
        ArticleName = "Pradhan Mantri Kisan Mandhan Scheme",
        Content = "The Pradhan Mantri Krishi Sinchayee Yojana (PMKSY) is an Indian government initiative launched to improve water use efficiency in agriculture. The scheme aims to provide holistic water management solutions, ensuring the optimal utilization of water resources. PMKSY focuses on enhancing on-farm water storage, promoting efficient water distribution, and encouraging precision irrigation techniques. It encompasses various components, including watershed development, micro-irrigation, rainwater harvesting, and the renovation of traditional water bodies. By promoting sustainable water practices, PMKSY aims to boost agricultural productivity, reduce water wastage, and improve the livelihoods of farmers across the country.",
        date = "August 9, 2019"
    ),
    GovSchemesData(
        FarmerImageid = R.drawable.farmer6,
        ArticleName = "Soil Health Card",
        Content = "The scheme aims at promoting soil test based and balanced use of fertilisers to enable farmers to realise higher yields at lower cost.[3] also the main objective is to aware growers about the appropriate amount of nutrients for the concerned crop depending on the quality of soil. It covers 12 Parameters.",
        date = "19 February 2015"
    ),
    GovSchemesData(
        FarmerImageid = R.drawable.farmer7,
        ArticleName = "Rashtriya Krishi Vikas Yojana",
        Content = "The Rashtriya Krishi Vikas Yojana (RKVY) is an agricultural development scheme in India that aims to enhance the overall productivity and sustainability of agriculture. Launched by the Government of India, RKVY provides financial assistance to states for various activities such as infrastructure development, capacity building, research and development, and promoting innovative agricultural practices. The scheme prioritizes inclusive growth in the agricultural sector, emphasizing the welfare of farmers and rural communities while fostering technological advancements and sustainable farming practices.",
        date = "2007-08"
    ),
    GovSchemesData(
        FarmerImageid = R.drawable.farmer8,
        ArticleName = "Organic Farming Incentive Scheme",
        Content = "The Organic Farming Incentive Scheme in the United Kingdom encourages farmers to adopt and maintain organic practices by offering financial support for activities such as maintaining organic land, enhancing biodiversity, and using green manures. The scheme aims to promote sustainable agriculture and improve environmental outcomes within the farming sector.",
        date = "2015-16"
    )
)

@Composable
fun GovSchemes(modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = "Latest Government \nSchemes",
            fontWeight = FontWeight.Bold,
            lineHeight = 40.sp,
            fontSize = 40.sp,
            color = GreenJC,
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 15.dp)
        )
        LazyColumn() {
            items(schemelist.size) {
                schemeCard(it)
            }
        }
    }
}

@Composable
fun schemeCard(index: Int) {
    val financetwo = schemelist[index]
    var lastPaddingEnd = 0.dp
    if (index == schemelist.size - 1) {
        lastPaddingEnd = 46.dp
    }
    Card(
        modifier = Modifier
            .padding(10.dp)
            .wrapContentSize(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Image(
                painter = painterResource(id = financetwo.FarmerImageid),
                contentDescription = financetwo.ArticleName,
                modifier = Modifier
                    .padding(10.dp)
                    .height(120.dp)
                    .size(140.dp)
                    .clip(
                        RoundedCornerShape(10.dp)
                    )
            )
            Column(modifier = Modifier.padding(12.dp)) {
                Text(
                    text = financetwo.ArticleName,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = financetwo.Content,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp, maxLines = 2, overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = financetwo.date,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    textAlign= TextAlign.End
                )
            }
        }
    }
    Spacer(modifier = Modifier.padding(lastPaddingEnd))
}
