package com.example.onboardingcompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.onboardingcompose.R
import com.example.onboardingcompose.viewmodel.SplashViewModel
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController,
    splashViewModel: SplashViewModel
) {

    val screen by splashViewModel.startDestination

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
/*
        Image(
            modifier = Modifier.size(300.dp),
            painter = painterResource(id = R.drawable.logo_overlay__12__removebg_preview),
            contentDescription = "logo",
            contentScale = ContentScale.FillBounds
        )

 */
        Image(
            modifier = Modifier.fillMaxHeight().fillMaxWidth(),
            painter = painterResource(id = R.drawable.splashme),
            contentDescription = "logo",
            contentScale = ContentScale.FillBounds
        )

        LaunchedEffect(key1 = true) {
            delay(2000)
            navController.navigate(screen)
        }

    }

}