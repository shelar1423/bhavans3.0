package com.example.onboardingcompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
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
import com.example.onboardingcompose.R
import com.example.onboardingcompose.ui.theme.OnBoardingComposeTheme
import com.example.onboardingcompose.ui.theme.TextWhite
import com.example.onboardingcompose.viewmodel.WelcomeViewModel

@Composable
fun antirag(navController: NavHostController,
            welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    val img = painterResource(id = R.drawable.ragw)
    Box() {
        Image(painter = img, contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .align(Alignment.BottomCenter),

            contentScale = ContentScale.FillHeight
        )

    }
    val im1= painterResource(id = R.drawable.raghead)
    Image(painter = im1,
        contentDescription =null,
        modifier = Modifier
            .padding(top = 0.dp, bottom = 1.dp)
            .background(color = Color.Transparent)
            .fillMaxWidth()

        , contentScale = ContentScale.FillWidth

    )

}
/*
@Composable
fun ragh(){
    val im2 = painterResource(id = R.drawable.bvcreal)

    Row() {
        Image(
            painter = im2, contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .width(150.dp)
                .weight(1f)

        )

        Text(
            text = "Anti Ragging",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .weight(2f)
                .padding(top = 25.dp, start = 10.dp)


        )
    }
}

 */
/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    OnBoardingComposeTheme {
        Column(modifier = Modifier
            .fillMaxSize()) {
            Box {
                rag()
            }
        }

    }
}

 */