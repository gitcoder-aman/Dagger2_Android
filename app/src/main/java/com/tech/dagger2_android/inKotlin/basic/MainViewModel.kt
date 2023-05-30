package com.tech.dagger2_android.inKotlin.basic

import com.tech.dagger2_android.inKotlin.network.NetworkClient
import javax.inject.Inject

class MainViewModel @Inject constructor(networkClient: NetworkClient?)  {
    private var mClient: NetworkClient? = null

    init {
        mClient = networkClient
    }

    fun fetchData(): String? {
        return mClient?.fetchData()
    }
}