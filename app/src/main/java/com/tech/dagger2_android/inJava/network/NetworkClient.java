package com.tech.dagger2_android.inJava.network;

import javax.inject.Inject;

public class NetworkClient {

    @Inject
     NetworkConnection mConnection;

    @Inject
    public NetworkClient(){
//        mConnection = networkConnection;
    }
    public String fetchData(){
        return mConnection.doReq();
    }
}
