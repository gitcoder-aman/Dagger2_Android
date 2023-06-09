package com.tech.dagger2_android.inJava;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.tech.dagger2_android.databinding.ActivityMainBinding;
import com.tech.dagger2_android.inJava.basic.MainViewModel;
import com.tech.dagger2_android.inJava.utils.Constants;
import com.tech.dagger2_android.inJava.di.DaggerMainViewModelInjector;

import javax.inject.Inject;

public class JavaMainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Inject   //this is field injection and also will be not private field.
    MainViewModel mMainViewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


//        mMainViewModel = DaggerMainViewModelInjector.create().getMainViewModel();

        DaggerMainViewModelInjector.create().inject(this);


        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(Constants.TAG,"On Created Data fetched:"+mMainViewModel.fetchData());
                binding.textView.setText(mMainViewModel.fetchData());
            }
        });
    }
}
