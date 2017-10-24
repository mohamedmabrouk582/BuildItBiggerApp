package com.example.mohamed.builditbiggerapp;

import android.test.AndroidTestCase;

import com.example.mohamed.builditbiggerapp.model.JokeAsyncTask;

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
