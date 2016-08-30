package app.com.example.android.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        jokeTextView = (TextView) findViewById(R.id.joke_text_view);
        Intent intent = getIntent();
        jokeTextView.setText(intent.getStringExtra("Joke"));

    }
}
