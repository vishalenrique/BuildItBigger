package com.udacity.gradle.builditbigger.backend;

import com.example.javajokes.Jokes;

/** The object model for the data we are sending through endpoints */
public class MyJoke {

    private String joke;

    public String getJoke() {
        joke = Jokes.getAJoke();
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}