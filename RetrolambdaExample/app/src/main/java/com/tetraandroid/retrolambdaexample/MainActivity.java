package com.tetraandroid.retrolambdaexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = (EditText) findViewById(R.id.submit_edit_text);
        final Button submitButton = (Button) findViewById(R.id.submit_button);

        submitButton.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, String.format("Welcome to Lambdas, %s!", nameEditText.getText()
                                                                                                   .toString()), Toast.LENGTH_LONG).show();
            runnable(() -> System.out.println(String.format("Welcome to Lambdas, %s!", nameEditText.getText()
                                                                                                   .toString())));
        });
    }

    private void runnable(Runnable runnable) {
        runnable.run();
    }
}

