package com.example.onboardingcompose.screen


import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingcompose.ui.theme.c1
import com.example.onboardingcompose.ui.theme.c2
import com.example.onboardingcompose.ui.theme.OnBoardingComposeTheme
import com.example.onboardingcompose.viewmodel.WelcomeViewModel


@Composable
fun But2() {

    Column(verticalArrangement = Arrangement.spacedBy(30.dp),
        modifier = Modifier.fillMaxHeight())
    {
        Box(modifier = Modifier.padding(30.dp, bottom = 10.dp, top = 40.dp),
            contentAlignment = Alignment.Center,

            ) {
            Text(text = "Select Your Course",
                fontSize = 40.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        Column(verticalArrangement = Arrangement.spacedBy(40.dp),
            modifier = Modifier.fillMaxHeight()) {
            Row(horizontalArrangement = Arrangement.SpaceEvenly
                , verticalAlignment = Alignment.CenterVertically
                , modifier = Modifier.fillMaxWidth()) {
                GradientButton2(
                    text = "B.Com",
                    textColor = Color.Black,
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)
                    )
                ) { }
                GradientButton2(
                    text = "BBA",
                    textColor = Color.Black,
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)
                    )
                ) { }
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly
                , verticalAlignment = Alignment.CenterVertically
                , modifier = Modifier.fillMaxWidth()
            ) {
                GradientButton2(
                    text = "BCA",
                    textColor = Color.Black,
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)
                    )
                ) { }

                GradientButton2(
                    text = "B.Sc (L.S)",
                    textColor = Color.Black,
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)
                    )
                ) { }
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly
                , verticalAlignment = Alignment.CenterVertically
                , modifier = Modifier.fillMaxWidth()
            ) {
                GradientButton2(
                    text = "B.A",
                    textColor = Color.Black,
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)
                    )
                ) { }
                GradientButton2(
                    text = "B.Sc (P.S)",
                    textColor = Color.Black,
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)
                    )
                ) { }
            }
        }




    }


}

@Composable
fun Main2(navController: NavHostController,
          welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    TopImg()
    Column {
        h1()
        But2()
    }
}

//prev1
/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    OnBoardingComposeTheme {
        Column(modifier = Modifier
            .fillMaxSize()) {
            Box {
                Main2()
            }
        }

    }
}

 */