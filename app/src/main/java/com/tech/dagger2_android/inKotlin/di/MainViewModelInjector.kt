package com.tech.dagger2_android.inKotlin.di

import com.tech.dagger2_android.inKotlin.KotlinMainActivity
import com.tech.dagger2_android.inKotlin.basic.MainViewModel
import dagger.Component

@Component
interface MainViewModelInjector {
    //also called component
    fun getMainViewModel(): MainViewModel? //top level factory

    fun injectFields(mainActivity: KotlinMainActivity)
}