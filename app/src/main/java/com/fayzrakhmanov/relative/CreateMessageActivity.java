package com.fayzrakhmanov.relative;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMesage(View view) {
        Intent intent = new Intent(this,ReceiveMessageActivity.class);
        EditText editTextMessage = (EditText) findViewById(R.id.editTextMessage);
        String message = String.valueOf(editTextMessage.getText());
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,message);
        startActivity(intent);
    }

}
