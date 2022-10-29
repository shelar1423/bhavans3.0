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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingcompose.ui.theme.c1
import com.example.onboardingcompose.ui.theme.c2
import com.example.onboardingcompose.R
import com.example.onboardingcompose.ui.theme.OnBoardingComposeTheme
import com.example.onboardingcompose.viewmodel.WelcomeViewModel

@Composable
fun Main3(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    TopImg()
    Column {
        h1()
        body3()
    }

}



@Composable
fun body3() {

    Column(verticalArrangement = Arrangement.spacedBy(5.dp),
        modifier = Modifier.fillMaxHeight()) {
        Box(modifier = Modifier.padding(30.dp, bottom = 5.dp, top = 5.dp),
            contentAlignment = Alignment.Center,

            ) {
            Text(text = "Select Your Course",
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

        GradientButton(
            text = "Master of Computer Science (M.Sc)",
            textColor = Color.Black,
            gradient = Brush.horizontalGradient(
                colors = listOf(c2, c1)

            )
        ) { }

        GradientButton(
            text = "M.Sc Microbiology",
            textColor = Color.Black,
            gradient = Brush.horizontalGradient(
                colors = listOf(c2, c1)
            )
        ) { }

        GradientButton(
            text = "M.Sc Biochemistry",
            textColor = Color.Black,
            gradient = Brush.horizontalGradient(
                colors = listOf(c2, c1)
            )
        ) { }

        GradientButton(
            text = "M.Com",
            textColor = Color.Black,
            gradient = Brush.horizontalGradient(
                colors = listOf(c2, c1)
            )
        ) { }

        GradientButton(
            text = "Master of Business Administration (M.B.A)",
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
fun DefaultPreview3() {
    OnBoardingComposeTheme {
        Column(modifier = Modifier
            .fillMaxSize()) {
            Box {
                Main3()
            }
        }

    }
}

 */
