package com.example.week5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Thread", Thread.currentThread().getName().toString());
        new LongActivity().execute();

    }

}

 class LongActivity extends AsyncTask<Void, Void, Void>{
    @Override
    protected Void doInBackground(Void... voids) {
        //long time process
        Log.d("Thread 2", Thread.currentThread().getName().toString());
        return null;
    }
}