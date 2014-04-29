package com.example.M4hjong;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class Login extends Activity {

    private EditText username = null;
    private EditText password = null;
    private TextView attempts;
    private Button login, button2, button3;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        username = (EditText) findViewById(R.id.editText1);
        password = (EditText) findViewById(R.id.editText2);
        attempts = (TextView) findViewById(R.id.textView5);
        attempts.setText(Integer.toString(counter));
        login = (Button) findViewById(R.id.button1);
        addListenerOnButton();
    }

    public void login(View view) {
        if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("admin")) {
            Toast.makeText(getApplicationContext(), "Redirecting...",
                    Toast.LENGTH_SHORT).show();
            newOnClick(view);
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials",
                    Toast.LENGTH_SHORT).show();
            attempts.setBackgroundColor(Color.RED);
            counter--;
            attempts.setText(Integer.toString(counter));
            if (counter == 0) {
                login.setEnabled(false);
            }

        }

    }
    public void newOnClick(View view) {
        Intent loginFinalIntent =
                new Intent(Login.this, LoggedInMain.class);
        startActivity(loginFinalIntent);
    }

    public void addListenerOnButton() {

        button2 = (Button) findViewById(R.id.forgotButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotIntent =
                        new Intent(Login.this, Forgot.class);
                startActivity(forgotIntent);
            }
        });
        button3 = (Button) findViewById(R.id.button3);

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