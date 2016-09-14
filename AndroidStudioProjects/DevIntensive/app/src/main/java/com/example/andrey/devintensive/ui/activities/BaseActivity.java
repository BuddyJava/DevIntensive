package com.example.andrey.devintensive.ui.activities;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.andrey.devintensive.R;
import com.example.andrey.devintensive.utils.ConstantsManagers;

public class BaseActivity extends AppCompatActivity {
    private static final String TAG = ConstantsManagers.TAG_PREFIX + "BaseActivity";
    private ProgressDialog mProgressDialog;

    public void showProgress(){
        if(mProgressDialog == null){
            mProgressDialog = new ProgressDialog(this, R.style.custom_dialog);
            mProgressDialog.setCancelable(false);
            //mProgressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mProgressDialog.show();
            mProgressDialog.setContentView(R.layout.dialog_progress);

        } else {
            mProgressDialog.show();
            mProgressDialog.setContentView(R.layout.dialog_progress);
        }
        Log.d(TAG, "showProgress");
    }

    public void hideProgress(){
        if(mProgressDialog != null){
            if (mProgressDialog.isShowing()){
                mProgressDialog.hide();
            }
        }
        Log.d(TAG, "hideProgress");
    }

    public void showEror(String message, Exception eror){
        showToast(message);
        Log.e(TAG, String.valueOf(eror));
    }

    public void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
