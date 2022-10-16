/*package com.example.onboardingcompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onboardingcompose.R
import android.service.autofill.OnClickAction as OnClickAction1*/


/*@Composable
@Preview
fun HomeScreen() {

    Image(painter = painterResource(id = R.drawable.bcak)
        , contentDescription = null, modifier = Modifier.padding(top = 100dp)
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight(), contentScale = ContentScale.FillHeight)
    contentColorFor(backgroundColor = Color.White)

    Box(
        modifier = Modifier.fillMaxSize(),
        //contentAlignment = Alignment.Top
    ) {
        Row (){
            Image(painter = painterResource(id = R.drawable.brand), contentDescription =null, alignment = Alignment.BottomStart, modifier = Modifier.padding(top = 30.dp, bottom = 50.dp).fillMaxWidth(), contentScale = ContentScale.FillWidth)


            Text(
                
                text = "HOME",
                fontSize = MaterialTheme.typography.h4.fontSize,
                color = Color.White
            
            )


        }


    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomStart
    ){
        Row {
            Text(text = "away",
                fontSize = MaterialTheme.typography.h4.fontSize
            )
    }


    }
}*/
package com.example.onboardingcompose.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.util.OnBoardingPage
import com.example.onboardingcompose.util.slider
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.*

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {

    Image(
        painter = painterResource(id = R.drawable.skin), contentDescription = null,
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight(),
        contentScale = ContentScale.FillWidth,
    )

    /*Image(
        painter = painterResource(id = R.drawable.bcak),
        contentDescription = null,
        modifier = Modifier
            .padding(
                top = 200.dp, bottom = 300.dp
            )
            .fillMaxSize()

            .fillMaxHeight(),
        contentScale = ContentScale.FillWidth
    )
    contentColorFor(backgroundColor = Color.White)*/
    Box(
        modifier = Modifier.fillMaxSize(),
        //contentAlignment = Alignment.Top
    ) {
        Row() {
            Image(
                painter = painterResource(id = R.drawable.brand),
                contentDescription = null,
                //alignment = Alignment.BottomStart,
                modifier = Modifier
                    .padding(top = 30.dp, bottom = 50.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )


        }


    }
    val pages = listOf(
        slider.First,
        slider.Second,
       // slider.Third
    )
    val pagerState = rememberPagerState()

        Column(
            modifier = Modifier.padding(top = 200.dp, bottom = 300.dp)
                .border( border = BorderStroke(2.dp,Color.LightGray),shape = RoundedCornerShape(16.dp))




            )
        {
            HorizontalPager(
                modifier = Modifier.weight(10f),
                count = 2,
                state = pagerState,
                verticalAlignment = Alignment.Top
            ) { position ->
                PagerScreen(slider = pages[position])
            }
            HorizontalPagerIndicator(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .weight(1f),
                pagerState = pagerState
            )

            /*FinishButton(
            modifier = Modifier.weight(1f),
            pagerState = pagerState
        ) {
            welcomeViewModel.saveOnBoardingState(completed = true)
            navController.popBackStack()
            navController.navigate(Screen.Home.route)
        }*/
        }
    }

@Composable
fun PagerScreen(slider: slider) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(

            painter = painterResource(id = slider.image), contentScale = ContentScale.FillHeight,
            contentDescription = "Pager Image",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight().fillMaxSize().clip(RoundedCornerShape(16.dp)
        ))
        /*Text(
            modifier = Modifier
                .fillMaxWidth(),
           // text = slider.title,
            fontSize = MaterialTheme.typography.h4.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
       Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .padding(top = 20.dp),
            //text = slider.description,
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )*/
    }
}

//@ExperimentalAnimationApi
//@ExperimentalPagerApi
/*@Composable
fun FinishButton1(
    modifier: Modifier,
    pagerState: PagerState,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .padding(horizontal = 40.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Center
    ) {
        AnimatedVisibility(
            modifier = Modifier.fillMaxWidth(),
            visible = pagerState.currentPage == 2
        ) {
            Button(
                onClick = onClick,
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White
                )
            ) {
                Text(text = "Finish")
            }
        }
    }
}*/

@Composable
@Preview(showBackground = true)
fun FirstOnBoardingScreenPreview1() {
    Column(modifier = Modifier.fillMaxSize()) {
        PagerScreen(slider = slider.First)
    }
}

@Composable
@Preview(showBackground = true)
fun SecondOnBoardingScreenPreview1() {
    Column(modifier = Modifier.fillMaxSize().fillMaxHeight()) {
        PagerScreen(slider = slider.Second)
    }
}

/*@Composable
@Preview(showBackground = true)
fun ThirdOnBoardingScreenPreview1() {
    Column(modifier = Modifier.fillMaxSize()) {
        PagerScreen(slider = slider.Third)
    }
}*/
