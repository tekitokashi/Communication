package com.example.dinar.communication;

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

    public void onSendMessage(View view) {
        EditText messageView =(EditText)findViewById((R.id.editText));
        String messageText = messageView.getText().toString();
//        Intent intent = new Intent(this,ReceiveMessageActivity.class);
//        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setType("text/plan");
        intent.putExtra(intent.EXTRA_TEXT,messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent choosenIntent = Intent.createChooser(intent,chooserTitle);
        startActivity(choosenIntent);
    }

}
