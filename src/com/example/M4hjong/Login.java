package com.example.M4hjong;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Michael on 3/1/14.
 */
public class Login extends Activity {
    //add more buttons... refactor needed
    Button button1, button2, button3;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        button1 = (Button) findViewById(R.id.logInFinalButton);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent loginIntent =
                        new Intent(Login.this, LoggedInMain.class);
                startActivity(loginIntent);
            }

        });

        button2 = (Button) findViewById(R.id.forgotButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotIntent =
                        new Intent(Login.this, Forgot.class);
                startActivity(forgotIntent);
            }
        });
        button3 = (Button) findViewById(R.id.newButton);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newAccountIntent =
                        new Intent(Login.this, NewAccount.class);
                startActivity(newAccountIntent);
            }
        });
    }
}