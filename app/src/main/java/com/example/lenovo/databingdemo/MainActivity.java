package com.example.lenovo.databingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.databingdemo.databinding.ActivityMainBinding;
import com.example.lenovo.databingdemo.mode.User;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Test", "123456");
        activityMainBinding.setUserInfo(user);
    }
}
