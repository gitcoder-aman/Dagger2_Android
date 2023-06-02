package com.tech.dagger2_android.inJava.network;

import android.util.Log;

import com.tech.dagger2_android.inJava.utils.Constants;

import javax.inject.Inject;

public class NetworkClient {
     @Inject
     NetworkConnection mConnection;

    @Inject
    public NetworkClient(NetworkConnection networkConnection){
        mConnection = networkConnection;
    }

    //Method Injection
    @Inject
    public void testMethod(){
        Log.d(Constants.TAG,"testMethod : This is a test Method");
    }
    @Inject   //Method Injection
    public void attachedToNetworkTester(NetworkTester tester){
        tester.attachToNetwork(this);
    }
    public String fetchData(){
        return mConnection.doReq();
    }
}
