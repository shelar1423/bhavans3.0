package com.example.onboardingcompose.util

import androidx.annotation.DrawableRes
import com.example.onboardingcompose.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.bvcreal,
        title = "Welcome",
        description = "to the official Bhavan's App"
    )

    object Second : OnBoardingPage(
        image = R.drawable.hat,
        title = "T.B.D",
        description = "TO Be Decided"
    )

    object Third : OnBoardingPage(
        image = R.drawable.supply,
        title = "T.B.D",
        description = "TO Be Decided"
    )
}
