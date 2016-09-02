package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import java.util.concurrent.ExecutionException;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void tellJoke(View view) throws ExecutionException, InterruptedException {
                new EndpointsAsyncTask().execute(this);

    }
}
