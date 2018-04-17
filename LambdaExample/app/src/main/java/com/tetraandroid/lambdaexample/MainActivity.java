package com.tetraandroid.lambdaexample;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button submitButton = findViewById(R.id.submit_button);
        
        submitButton.setOnClickListener(view -> {
            Snackbar.make(view, "Hello Lambda", Snackbar.LENGTH_LONG).show();
            Log.d("MainActivity", "Hello Again");
        });
    }

}

