package com.tech.dagger2_android.inJava.network;

import android.util.Log;

import com.tech.dagger2_android.inJava.utils.Constants;

import javax.inject.Inject;

public class NetworkTester {

    @Inject
    public NetworkTester() {
    }

    public void attachToNetwork(NetworkClient client){
        Log.d(Constants.TAG,"attachedToNetwork : attached to Network:");
    }
}
