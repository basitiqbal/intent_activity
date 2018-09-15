package com.example.hussain.intent_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText message_text;

    public final static String MESSAGE_KEY ="hussain.intent_activity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendmessage (View view)
    {
        message_text = (EditText) findViewById(R.id.message_text);

        String message = message_text.getText().toString();

        Intent intent= new Intent(this ,SecondActivity.class);

        intent.putExtra(MESSAGE_KEY,message);

        startActivity(intent);
    }}