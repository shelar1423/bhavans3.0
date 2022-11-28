package com.example.onboardingcompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingcompose.ui.theme.c1
import com.example.onboardingcompose.ui.theme.c2
import com.example.onboardingcompose.R
import com.example.onboardingcompose.ui.theme.OnBoardingComposeTheme
import com.example.onboardingcompose.viewmodel.WelcomeViewModel

@Composable
fun Main4(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    TopImg()
    Column {
        h1()
        Box(modifier = Modifier.padding(30.dp, bottom = 10.dp, top = 40.dp),
            contentAlignment = Alignment.Center,

            ) {
            Text(text = "Select Your Course",
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        body4()
    }

}

@Composable
fun body4() {

    Column(verticalArrangement = Arrangement.spacedBy(30.dp),
        modifier = Modifier
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())) {


        GradientButton(
            text = "Ph.D in Physics",
            textColor = Color.Black,
            gradient = Brush.horizontalGradient(
                colors = listOf(c2, c1)

            )
        ) { }

        GradientButton(
            text = "Ph.D in Microbiology",
            textColor = Color.Black,
            gradient = Brush.horizontalGradient(
                colors = listOf(c2, c1)
            )
        ) { }

        GradientButton(
            text = "Ph.D in Biochemistry",
            textColor = Color.Black,
            gradient = Brush.horizontalGradient(
                colors = listOf(c2, c1)
            )
        ) { }

        GradientButton(
            text = "Ph.D in Management",
            textColor = Color.Black,
            gradient = Brush.horizontalGradient(
                colors = listOf(c2, c1)
            )
        ) { }
    }



}

//prev1
/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    OnBoardingComposeTheme {
        Column(modifier = Modifier
            .fillMaxSize()) {
            Box {
                Main4()
            }
        }

    }
}

 */
