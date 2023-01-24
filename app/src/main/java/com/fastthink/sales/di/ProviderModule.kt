package com.fastthink.sales.di

import com.fastthink.sales.provider.StringProvider
import com.fastthink.sales.provider.StringProviderImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ProviderModule {

    @Binds
    abstract fun bindStringProvider(stringProviderImpl: StringProviderImpl): StringProvider
}
