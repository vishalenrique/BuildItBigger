package com.example.javajokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes {

    static String[] jokes = {
            "A computer once beat me at chess, but it was no match for me at kick boxing.",
            "As long as there are tests, there will be prayer in schools.",
            "What did one ocean say to the other ocean? Nothing, they just waved.",
            "A day without sunshine is like, night.",
            "For Sale: Parachute. Only used once, never opened.",
            "A bank is a place that will lend you money, if you can prove that you don’t need it.",
            "What is faster Hot or cold? Hot, because you can catch a cold.",
            "Love may be blind, but marriage is a real eye-opener.",
            "Why did the scientist install a knocker on his door? He wanted to win the No-bell prize!",
            "If you can’t convince them, confuse them.",
            "Why did the bee get married? Because he found his honey.",
            "What do you call a boomerang that doesn’t come back? A stick.",
    };

    public static String getAJoke(){
        Random random = new Random();
        int i = random.nextInt(jokes.length);
        return jokes[i];
    }
}
