package com.tech.dagger2_android.inJava.di;

import com.tech.dagger2_android.inJava.JavaMainActivity;
import com.tech.dagger2_android.inJava.basic.MainViewModel;

import dagger.Component;

@Component
public interface MainViewModelInjector {
    MainViewModel getMainViewModel();

    void inject(JavaMainActivity javaMainActivity);  //injector factory
}
