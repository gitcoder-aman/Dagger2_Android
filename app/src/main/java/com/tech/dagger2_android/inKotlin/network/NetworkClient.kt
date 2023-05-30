package com.tech.dagger2_android.inKotlin.network

import javax.inject.Inject

class NetworkClient @Inject constructor(networkConnection : NetworkConnection?) {

    private var mConnection: NetworkConnection? = null

    init {
        mConnection = networkConnection
    }
    fun fetchData(): String? {
        return mConnection?.doReq()
    }
}