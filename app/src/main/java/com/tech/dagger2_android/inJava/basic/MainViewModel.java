package com.tech.dagger2_android.inJava.basic;

import com.tech.dagger2_android.inJava.network.NetworkClient;

import javax.inject.Inject;

public class MainViewModel {

    private NetworkClient mClient ;

    @Inject
    public MainViewModel(NetworkClient networkClient){
       mClient = networkClient;
    }
    public String fetchData(){
        return mClient.fetchData();
    }
}
