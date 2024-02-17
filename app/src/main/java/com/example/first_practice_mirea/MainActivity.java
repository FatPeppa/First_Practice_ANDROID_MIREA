package com.example.first_practice_mirea;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toast
        Context context = getApplicationContext();
        CharSequence text = "OnCreate Toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //logging
        Log.e(TAG, "onCreate Error");
        Log.w(TAG, "onCreate Warning");
        Log.i(TAG, "onCreate Info");
        Log.d(TAG, "onCreate Debug");
        Log.v(TAG, "onCreate Verbose");
    }

    @Override
    protected void onStart() {
        super.onStart();

        //toast
        Context context = getApplicationContext();
        CharSequence text = "OnStart Toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //logging
        Log.e(TAG, "onStart Error");
        Log.w(TAG, "onStart Warning");
        Log.i(TAG, "onStart Info");
        Log.d(TAG, "onStart Debug");
        Log.v(TAG, "onStart Verbose");
    }

    @Override
    protected void onStop() {
        super.onStop();

        //toast
        Context context = getApplicationContext();
        CharSequence text = "OnStop Toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //logging
        Log.e(TAG, "onStop Error");
        Log.w(TAG, "onStop Warning");
        Log.i(TAG, "onStop Info");
        Log.d(TAG, "onStop Debug");
        Log.v(TAG, "onStop Verbose");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        //toast
        Context context = getApplicationContext();
        CharSequence text = "OnDestroy Toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //logging
        Log.e(TAG, "onDestroy Error");
        Log.w(TAG, "onDestroy Warning");
        Log.i(TAG, "onDestroy Info");
        Log.d(TAG, "onDestroy Debug");
        Log.v(TAG, "onDestroy Verbose");
    }
    @Override
    protected void onPause() {
        super.onPause();

        //toast
        Context context = getApplicationContext();
        CharSequence text = "OnPause Toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //logging
        Log.e(TAG, "onDestroy Error");
        Log.w(TAG, "onDestroy Warning");
        Log.i(TAG, "onDestroy Info");
        Log.d(TAG, "onDestroy Debug");
        Log.v(TAG, "onDestroy Verbose");
    }

    @Override
    protected void onResume() {
        super.onResume();

        //toast
        Context context = getApplicationContext();
        CharSequence text = "OnResume Toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //logging
        Log.e(TAG, "onResume Error");
        Log.w(TAG, "onResume Warning");
        Log.i(TAG, "onResume Info");
        Log.d(TAG, "onResume Debug");
        Log.v(TAG, "onResume Verbose");
    }

    public void button_exit(View view) {
        //onStop();
        onDestroy();
        System.exit(0);
    }
}