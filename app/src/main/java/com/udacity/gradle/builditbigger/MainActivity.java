package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import java.util.concurrent.ExecutionException;

import app.com.example.android.mylibrary.JokeActivity;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void tellJoke(View view) throws ExecutionException, InterruptedException {
        String result =
                new EndpointsAsyncTask().execute().get();
        Intent intent = new Intent(MainActivity.this, JokeActivity.class);
        intent.putExtra("Joke", result);
        startActivity(intent);
    }
}
