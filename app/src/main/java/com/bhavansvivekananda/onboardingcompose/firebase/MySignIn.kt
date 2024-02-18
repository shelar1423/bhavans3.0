package com.bhavansvivekananda.onboardingcompose.firebase

import android.content.Context
import android.content.Intent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.core.content.ContextCompat.startActivity
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.MainActivity
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.ExperimentalPagerApi


@Composable
fun MySignIn(
    context: Context, navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    val intent = Intent(context, SignInActivity::class.java)
    context.startActivity(intent)
}


