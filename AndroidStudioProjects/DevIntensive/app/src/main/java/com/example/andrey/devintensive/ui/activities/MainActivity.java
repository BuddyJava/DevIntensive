package com.example.andrey.devintensive.ui.activities;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.andrey.devintensive.R;
import com.example.andrey.devintensive.utils.ConstantsManagers;

public class MainActivity extends BaseActivity implements View.OnClickListener{
    private static final String TAG = ConstantsManagers.TAG_PREFIX + "MainACtivity";

    private ImageView mCallImageView;
    private CoordinatorLayout mCoordinatorLayout;
    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        mCallImageView = (ImageView) findViewById(R.id.call);
        mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.main_coordinator_container);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mCallImageView.setOnClickListener(this);
        setupToolbar();

        if(savedInstanceState == null){
            showSnackBar("активность запускается впервые");
            //если активность запускается впервые
        }
        else{
            showSnackBar("активность после переворота");
            //если повторно
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.call:
                showProgress();
                break;
        }
    }

    private void showSnackBar(String message){
        Snackbar.make(mCoordinatorLayout, message, Snackbar.LENGTH_LONG).show();
    }

    private void setupToolbar() {
        setSupportActionBar(mToolbar);
//        ActionBar actionBar = getSupportActionBar();
//        if(actionBar != null){
//
//        }
    }

}

