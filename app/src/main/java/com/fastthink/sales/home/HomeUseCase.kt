package com.fastthink.sales.home

import com.fastthink.sales.provider.StringProvider
import javax.inject.Inject

class HomeUseCase @Inject constructor(
    private val stringProvider: StringProvider
    ) {
    suspend operator fun invoke(email: String, password: String): SignInResult {
        return try {
            SignInResult.Success
        } catch (exception: Exception) {
            SignInResult.Error(exception.message.orEmpty())
        }
    }

    sealed class SignInResult {
        object Success: SignInResult()
        data class Error(val message: String): SignInResult()
    }
}