package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.example.jokedisplay.JokeActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view) {
        new EndpointsAsyncTask(new EndpointsAsyncTask.OnTaskComplete() {
            @Override
            public void taskCompleted(String result) {
                if(!TextUtils.isEmpty(result)) {
                    Intent intent = new Intent(MainActivity.this, JokeActivity.class);
                    intent.putExtra(JokeActivity.JOKE_EXTRA, result);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, R.string.joke_not_available, Toast.LENGTH_SHORT).show();
                }
            }
        }).execute();
    }


}
