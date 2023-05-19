package com.jd.network.di

import com.jd.network.BuildConfig
import com.jd.network.NetworkModule
import com.jd.network.OkHttpFactory
import com.jd.network.RetrofitFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModuleDi {

    @Provides
    @Singleton
    fun providesOkHttpClient(): OkHttpFactory = OkHttpFactory()

    @Provides
    @Singleton
    fun providesRetrofitClient(okHttpFactory: OkHttpFactory): RetrofitFactory {
        return RetrofitFactory(BuildConfig.BASE_URL, okHttpFactory)
    }

    @Provides
    @Singleton
    fun providesRetrofitModule(retrofitFactory: RetrofitFactory): NetworkModule {
        return NetworkModule(retrofitFactory)
    }


}