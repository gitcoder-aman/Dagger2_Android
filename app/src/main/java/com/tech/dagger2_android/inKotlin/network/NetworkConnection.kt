package com.tech.dagger2_android.inKotlin.network

import com.tech.dagger2_android.inKotlin.utils.Constants
import javax.inject.Inject

class NetworkConnection @Inject constructor(){
    private var mEndPoint: String? = null

    init {
        if (mEndPoint == null) {
            mEndPoint = Constants.DEBUG_ENDPOINT
        } else {
            mEndPoint = Constants.PROD_ENDPOINT
        }
    }

    fun doReq(): String? {
        return mEndPoint
    }
}