package com.fastthink.sales.provider

import android.content.Context
import androidx.annotation.StringRes
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

interface StringProvider {
    fun getString(@StringRes resource: Int): String
}

class StringProviderImpl @Inject constructor(
    @ApplicationContext private val context: Context,
): StringProvider {
    override fun getString(resource: Int): String = context.getString(resource)
}