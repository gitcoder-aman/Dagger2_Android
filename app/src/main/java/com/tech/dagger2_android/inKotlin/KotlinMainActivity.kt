package com.tech.dagger2_android.inKotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tech.dagger2_android.inKotlin.basic.MainViewModel
import com.tech.dagger2_android.databinding.ActivityMainBinding
import com.tech.dagger2_android.inKotlin.di.DaggerMainViewModelInjector
import com.tech.dagger2_android.inKotlin.utils.Constants
import javax.inject.Inject

class KotlinMainActivity : AppCompatActivity() {

    @Inject
    lateinit var mMainViewModel: MainViewModel  //here is field injector
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        val connection  = NetworkConnection()
//        val client = NetworkClient(connection)
//
//        mMainViewModel = MainViewModel(client)

        //use dagger
//        mMainViewModel = DaggerMainViewModelInjector.create().getMainViewModel()!!

        DaggerMainViewModelInjector.create().injectFields(this)

        binding.button.setOnClickListener {
            Log.d(Constants.TAG, "On Create: Data fetched"+ mMainViewModel.fetchData())
            binding.textView.text = mMainViewModel.fetchData()
        }
    }
}