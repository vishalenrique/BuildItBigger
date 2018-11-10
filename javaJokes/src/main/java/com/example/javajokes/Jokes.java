package com.example.javajokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes {

    static String[] jokes = {"A","B","C","D"};

    public static String getAJoke(){
        Random random = new Random();
        int i = random.nextInt(4);
        return jokes[i];
    }
}
