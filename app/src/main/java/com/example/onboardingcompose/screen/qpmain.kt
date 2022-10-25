package com.example.onboardingcompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onboardingcompose.ui.theme.c1
import com.example.onboardingcompose.ui.theme.c2
import com.example.onboardingcompose.R
import com.example.onboardingcompose.ui.theme.OnBoardingComposeTheme

@Composable
fun TopImg() {

    val img = painterResource(id = R.drawable.skin)
    Box() {
        Image(painter = img, contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.FillHeight
        )

    }
    val im1= painterResource(id = R.drawable.group)
    Image(painter = im1,
        contentDescription =null,
        modifier = Modifier
            .padding(top = 0.dp, bottom = 1.dp)
            .background(color = Color.Transparent)
            .fillMaxWidth()
        , contentScale = ContentScale.FillWidth

    )

}

@Composable
fun Main1() {
    TopImg()
    Column {
        h1()
        body1()
    }

}

@Composable
fun h1() {
    val im2= painterResource(id = R.drawable.bvcreal )

    Row() {
        Image(painter = im2, contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .width(150.dp)
                .weight(1f)

        )

        Text(text = "Past Year Papers",
            fontSize = 50.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.White,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .weight(2f)
                .padding(top = 25.dp, start = 10.dp)

        )
    }



}

@Composable
fun body1() {

    Column(verticalArrangement = Arrangement.spacedBy(30.dp),
        modifier = Modifier.fillMaxHeight()) {
        Box(modifier = Modifier.padding(30.dp, bottom = 10.dp, top = 40.dp),
            contentAlignment = Alignment.Center,

            ) {
            Text(text = "Which Degree are you searching for",
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

        GradientButton(
            text = "Under Graduation (U.G)",
            textColor = Color.Black,
            gradient = Brush.horizontalGradient(
                colors = listOf(c2, c1)

            )
        ) { }

        GradientButton(
            text = "Post Graduation (P.G)",
            textColor = Color.Black,
            gradient = Brush.horizontalGradient(
                colors = listOf(c2, c1)
            )
        ) { }

        GradientButton(
            text = "Doctor of Philosophy (Ph.D)",
            textColor = Color.Black,
            gradient = Brush.horizontalGradient(
                colors = listOf(c2, c1)
            )
        ) { }
    }



}

//prev1
@Preview(showBackground = true)
@Composable
fun DefaultPreview1() {
    OnBoardingComposeTheme {
        Column(modifier = Modifier
            .fillMaxSize()) {
            Box {
                Main1()
            }
        }

    }
}
