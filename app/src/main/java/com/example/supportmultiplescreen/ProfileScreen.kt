package com.example.supportmultiplescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {

    val windowSize = rememberWindowSize()

    when(windowSize.width) {
        WindowType.Compact -> CompactProfileScreen()
        WindowType.Medium -> MediumToExpandedProfileScreen()
        WindowType.Expanded -> MediumToExpandedProfileScreen()
    }
}


@Composable
fun CompactProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Spacer(modifier = Modifier.height(32.dp))


        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .size(180.dp)
                .background(MaterialTheme.colorScheme.primary)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "A",
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = 80.sp,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.height(64.dp))

        Text(
            text = "Name",
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.alpha(0.7f)
        )
        Text(
            text = "Abram Ibrahim",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(18.dp))


        Text(
            text = "Email",
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.alpha(0.7f)
        )
        Text(
            text = "abramibrahem22@gmail.com",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(18.dp))


        Text(
            text = "Gender",
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.alpha(0.7f)
        )
        Text(
            text = "Male",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )


    }
}


@Composable
fun MediumToExpandedProfileScreen() {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Spacer(modifier = Modifier.width(16.dp))

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .size(180.dp)
                .background(MaterialTheme.colorScheme.primary)
                .align(Alignment.CenterVertically)
        ) {
            Text(
                text = "A",
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = 80.sp,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.width(32.dp))

        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Name",
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.alpha(0.7f)
            )
            Text(
                text = "Abram Ibrahim",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(18.dp))


            Text(
                text = "Email",
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.alpha(0.7f)
            )
            Text(
                text = "abramibrahem22@gmail.com",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(18.dp))


            Text(
                text = "Gender",
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.alpha(0.7f)
            )
            Text(
                text = "Male",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }

    }
}












