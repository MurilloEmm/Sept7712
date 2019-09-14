package com.example.sept77;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.content.intent;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Sept7-4itb", "onCreate() has executed...");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Sept7-4itb", "onStop() hs been executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Sept7-4itb", "onStop() hs been executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Sept7-4itb", "onStop() hs been executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Sept7-4itb", "onStop() hs been executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Sept7-4itb", "onStop() hs been executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Sept7-4itb", "onStop() hs been executed...");
    }

    public void dispMsg(View v) {
        //Toast toast = Toast.makeText(this, "Button is dicked...", Toast.LENGTH_LONG);
        //toast.show();
        //Snackbar sbar = Snackbar.make(v, "Button was dicked", Snackbar.LENGTH_LONG);
        //sbar.Show();
        //Snackbar sbar = Snackbar.make(v, "Button was clicked", Snackbar.LENGTH_LONG);
       // sbar.show();
        Intent i = new Intent(this, Main2Activity.Class);
        startActivity();
    }

    }