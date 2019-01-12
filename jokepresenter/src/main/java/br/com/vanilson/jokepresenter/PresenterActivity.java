package br.com.vanilson.jokepresenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class PresenterActivity extends AppCompatActivity {

    public static String JOKE_EXTRA = "joke_extra";

    private TextView mJokeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presenter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent self = getIntent();

        if(self.hasExtra(JOKE_EXTRA)){
            mJokeTV = findViewById(R.id.joke_tv);
            mJokeTV.setText(self.getStringExtra(JOKE_EXTRA));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }
}
