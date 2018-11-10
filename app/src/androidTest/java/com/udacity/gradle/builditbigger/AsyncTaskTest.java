package com.udacity.gradle.builditbigger;


import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
@LargeTest

public class AsyncTaskTest extends AndroidTestCase{

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule(MainActivity.class);


    @Test
    public void testJokeIsNotNull() throws Exception {

        EndpointsAsyncTask testHelper =  new EndpointsAsyncTask(new EndpointsAsyncTask.OnTaskComplete() {
            @Override
            public void taskCompleted(String result) {
            }
        });
        try {
            testHelper.execute();
            String joke = testHelper.get();
            assertNotNull(joke);
            assertTrue(!joke.isEmpty());
        } catch (InterruptedException ie) {
            fail("Error");
        }
    }

    @Test
    public void testTheResponse() {
        onView(withId(R.id.tell_joke_button)).perform(click());
    }

}