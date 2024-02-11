package com.bhavansvivekananda.onboardingcompose.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.bhavansvivekananda.onboardingcompose.navigation.Screen
import com.bhavansvivekananda.onboardingcompose.viewmodel.SplashViewModel

@Composable
fun RegistrationScreen(navController: NavController, splashViewModel: SplashViewModel) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Registration Screen")
        Button(onClick = {
            splashViewModel.registrationCheck.value = true
            navController.navigate(Screen.SplashScreen.route) }
        ) {
            Text(text = "Continue")
        }

    }

}