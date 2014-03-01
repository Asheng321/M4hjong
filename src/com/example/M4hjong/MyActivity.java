package com.example.M4hjong;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.OnClickListener;

public class MyActivity extends Activity {

    //add more buttons refactor needed
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        addListenerOnButton();

    }

    public void addListenerOnButton() {

        button = (Button) findViewById(R.id.playButton);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

               // Intent browserIntent =
                        //new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                //startActivity(browserIntent);
                Intent gameIntent =
                        new Intent(MyActivity.this, Game.class);
                startActivity(gameIntent);

            }

        });

        button = (Button) findViewById(R.id.ruleButton);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ruleIntent =
                        new Intent(MyActivity.this, Rules.class);
                startActivity(ruleIntent);
            }
        });

        button = (Button) findViewById(R.id.loginButton);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent =
                        new Intent(MyActivity.this, Login.class);
                startActivity(loginIntent);
            }
        });

        button = (Button) findViewById(R.id.aboutButton);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent =
                        new Intent(MyActivity.this, About.class);
                startActivity(aboutIntent);
            }
        });
    }

}