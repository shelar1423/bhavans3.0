package com.example.onboardingcompose.screen

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun exam(navController: NavHostController,
         welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {

    Image(
        painter = painterResource(id = R.drawable.questionpaperbg1), contentDescription = null,
        modifier = Modifier
            .padding(top = 0.dp)
            .fillMaxWidth()

            .fillMaxHeight(),
        /*.background(
            Color.White
        )*/
        contentScale = ContentScale.FillHeight,
    )


    val gradient =
        Brush.horizontalGradient(
            listOf(
                Color(0xFFA374AC),
                Color(0xFF0091D3)
            )
        )


    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()

    ) {
        Box(modifier = Modifier.fillMaxWidth()) {

            Image(
                painter = painterResource(id = R.drawable.prevpapers),
                contentDescription = null,
                //alignment = Alignment.TopCenter,
                modifier = Modifier
                    .padding(top = 0.dp, bottom = 1.dp)

                    .background(color = Color.Transparent)
                    .fillMaxWidth(),
                //.fillMaxHeight()
                //.fillMaxSize(),
                contentScale = ContentScale.FillWidth,
            )


        }
        Box(modifier = Modifier.height(30.dp)) {

        }
        Column(
            verticalArrangement = Arrangement.spacedBy(1.dp),
            modifier = Modifier.fillMaxHeight()

        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
            )
            {
                Text(text = "Under Graduate Papers", fontSize = 25.sp, color = Color.Black)
                Spacer(modifier = Modifier.height(50.dp))
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ) {

                GBqp(
                    gradient = gradient,
                    text = "B.com(Gen)",
                    onClick = {navController.navigate(Screen.bcomg.route)}

                )
                GBqp(
                    gradient = gradient,
                    text = "B.com(Hns)",
                    onClick = {navController.navigate(Screen.bcomh.route)}

                )
                GBqp(
                    gradient = gradient,
                    text = "B.com(C.S)",
                    onClick = {navController.navigate(Screen.bcomc.route)}

                )

                GBqp(
                    gradient = gradient,
                    text = "   BBA   ",
                    onClick = {navController.navigate(Screen.bba.route)}

                )


                GBqp(
                    gradient = gradient,
                    text = "   BCA   ",
                    onClick = {navController.navigate(Screen.bca.route)}

                )
                GBqp(
                    gradient = gradient,
                    text = "B.Sc(L.S)",
                    onClick = {navController.navigate(Screen.bscl.route)}

                )
                GBqp(
                    gradient = gradient,
                    text = "   B.A   ",
                    onClick = {navController.navigate(Screen.ba.route)}

                )
                GBqp(
                    gradient = gradient,
                    text = "B.Sc(P.S)",
                    onClick = {navController.navigate(Screen.bscp.route)}

                )


            }
            Box(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier.fillMaxWidth()) {

                Image(
                    painter = painterResource(id = R.drawable.line1),
                    contentDescription = null,
                    //alignment = Alignment.TopCenter,
                    modifier = Modifier
                        .padding(top = 0.dp, bottom = 1.dp)

                        .background(color = Color.Transparent)
                        .fillMaxWidth(),
                    //.fillMaxHeight()
                    //.fillMaxSize(),
                    contentScale = ContentScale.FillWidth,
                )



            }
            Box(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .fillMaxWidth()
            )
            {
                Text(text = "Post Graduate Papers", fontSize = 25.sp, color = Color.Black)
                Spacer(modifier = Modifier.height(50.dp))
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ) {

                GBqp(
                    gradient = gradient,
                    text = "M.Sc Comp Sci",
                    onClick = {navController.navigate(Screen.mscc.route)}

                )
                GBqp(
                    gradient = gradient,
                    text = "M.B.A",
                    onClick = {navController.navigate(Screen.mba1.route)}

                )
                GBqp(
                    gradient = gradient,
                    text = "M.Sc Microbiology",
                    onClick = {navController.navigate(Screen.mscm.route)}

                )

                GBqp(
                    gradient = gradient,
                    text = "M.Com",
                    onClick = {navController.navigate(Screen.mcom.route)}

                )
                GBqp(
                    gradient = gradient,
                    text = "M.Sc Biochem",
                    onClick = {navController.navigate(Screen.mscb.route)}

                )
            }

            Box(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier.fillMaxWidth()) {


                Image(
                    painter = painterResource(id = R.drawable.line1),
                    contentDescription = null,
                    //alignment = Alignment.TopCenter,
                    modifier = Modifier
                        .padding(top = 0.dp, bottom = 1.dp)

                        .background(color = Color.Transparent)
                        .fillMaxWidth(),
                    //.fillMaxHeight()
                    //.fillMaxSize(),
                    contentScale = ContentScale.FillWidth,
                )



            }
            Box(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .fillMaxWidth()
            )
            {
                Text(text = "Doctor of Philosophy Papers", fontSize = 25.sp, color = Color.Black)
                Spacer(modifier = Modifier.height(50.dp))
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ) {

                GBqp(
                    gradient = gradient,
                    text = "Physics",
                    onClick = {navController.navigate(Screen.phdp.route)}

                )
                GBqp(
                    gradient = gradient,
                    text = "Microbiology",
                    onClick = {navController.navigate(Screen.phdm.route)}

                )
                GBqp(
                    gradient = gradient,
                    text = "Biochemistry",
                    onClick = {navController.navigate(Screen.phdb.route)}

                )

                GBqp(
                    gradient = gradient,
                    text = "Management",
                    onClick = {navController.navigate(Screen.phdma.route)}

                )

                Box(modifier = Modifier.height(150.dp))
            }
            Box(modifier = Modifier.height(20.dp))


        }
    }





}


@Composable
fun GBqp(
    text :String,
    gradient : Brush,
    onClick: () -> Unit,
) {

    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor =  Color.Transparent
        ),
        contentPadding = PaddingValues(),
        shape = RoundedCornerShape(20.dp),
        onClick = onClick) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 30.dp, bottom = 30.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth()
                .height(50.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = Color.Black,
                fontSize = 25.sp, textAlign = TextAlign.Center
            )
        }
    }

}

/*
@ExperimentalPagerApi
@ExperimentalAnimationApi
@Preview(showBackground = true)
@Composable
fun DP() {
    OnBoardingComposeTheme {
        Column(modifier = Modifier
            .fillMaxSize()) {
            Box {
                newqp()
            }
        }

    }
}

 */