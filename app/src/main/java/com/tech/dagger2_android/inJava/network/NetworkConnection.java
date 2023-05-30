package com.tech.dagger2_android.inJava.network;

import com.tech.dagger2_android.BuildConfig;
import com.tech.dagger2_android.inJava.utils.Constants;

import javax.inject.Inject;

public class NetworkConnection {
    public String mEndPoint;

    @Inject
    public NetworkConnection(){
        if(BuildConfig.DEBUG){
            this.mEndPoint = Constants.DEBUG_ENDPOINT;
        }else{
            this.mEndPoint = Constants.PROD_ENDPOINT;
        }
    }
    public String doReq(){
        return this.mEndPoint;
    }
}
