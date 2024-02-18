package com.bhavansvivekananda.onboardingcompose.viewmodel


import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bhavansvivekananda.onboardingcompose.data.DataStoreRepository
import com.bhavansvivekananda.onboardingcompose.navigation.Screen
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    private val repository: DataStoreRepository
) : ViewModel() {

    // variable to store boolean value of is registration is done by the user
    var registrationCheck: MutableState<Boolean> = mutableStateOf(false)

    private val _isLoading: MutableState<Boolean> = mutableStateOf(true)
    val isLoading: State<Boolean> = _isLoading

    private val _startDestination: MutableState<String> = mutableStateOf(Screen.Welcome.route)
    val startDestination: State<String> = _startDestination

    init {
        viewModelScope.launch {
            repository.readOnBoardingState().collect { completed ->
                if (completed) {
                   // _startDestination.value = Screen.HomeScreen.route
                    _startDestination.value = Screen.MySignIn.route
                } else {
                    _startDestination.value = Screen.Welcome.route
                }
            }
            _isLoading.value = false
        }
    }

}