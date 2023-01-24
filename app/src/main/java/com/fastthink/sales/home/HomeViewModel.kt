package com.fastthink.sales.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel  @Inject constructor(
    private val homeUseCase: HomeUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow<SignInState>(SignInState.Initial)
    val uiState: StateFlow<SignInState> = _uiState

    fun onLoginRequested(username: String, password: String) {
        _uiState.value = SignInState.Loading
    }

    sealed class SignInState {
        object Initial : SignInState()
        object Loading : SignInState()
        object Success : SignInState()
        data class Error(val message: String) : SignInState()
    }
}