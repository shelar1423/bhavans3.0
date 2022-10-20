package com.example.onboardingcompose.util

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.onboardingcompose.R
import com.example.onboardingcompose.ui.theme.ButtonBlue

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String,
    val color: Color
) {
    object First : OnBoardingPage(
        image = R.drawable.bvcreal,
        title = "Welcome",
        description = "to the official Bhavan's App",
        color = ButtonBlue
    )

    object Second : OnBoardingPage(
        image = R.drawable.cap_1,
        title = "T.B.D",
        description = "TO Be Decided",
        color = Color.Blue

    )

    object Third : OnBoardingPage(
        image = R.drawable.image_1,
        title = "T.B.D",
        description = "TO Be Decided",
        color = ButtonBlue
    )
}
