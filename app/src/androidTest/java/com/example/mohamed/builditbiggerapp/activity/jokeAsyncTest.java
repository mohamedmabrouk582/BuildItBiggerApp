package com.example.mohamed.builditbiggerapp.activity;

import android.content.Context;
import android.os.AsyncTask;
import android.test.AndroidTestCase;

import com.example.mohamed.builditbiggerapp.model.JokeAsyncTask;
import com.example.mohamed.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 * Created by mohamed on 23/10/2017.
 */

public class jokeAsyncTest extends AndroidTestCase {
    public void test() {

        String value = null;
        JokeAsyncTask jokeAsyncTask=new JokeAsyncTask();
        jokeAsyncTask.execute(getContext());
        try {
            value = jokeAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(value);
    }

}
