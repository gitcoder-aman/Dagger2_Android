package com.tech.dagger2_android.inJava.network;

import javax.inject.Inject;

public class NetworkClient {

    public NetworkConnection mConnection;

    @Inject
    public NetworkClient(NetworkConnection networkConnection){
        mConnection = networkConnection;
    }
    public String fetchData(){
        return mConnection.doReq();
    }
}
