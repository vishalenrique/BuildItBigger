package com.example.jokedisplay;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeActivityFragment extends Fragment {

    public JokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_joke, container, false);

        Intent intent = getActivity().getIntent();
        TextView jokeTextView = rootView.findViewById(R.id.tv_joke);

        if(intent.hasExtra(JokeActivity.JOKE_EXTRA)) {
            String joke = intent.getStringExtra(JokeActivity.JOKE_EXTRA);
            jokeTextView.setText(joke);
        }

        return rootView;

    }
}
