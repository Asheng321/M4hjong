package com.example.M4hjong;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.OnClickListener;

public class LoggedInMain extends Activity {

    //add more buttons refactor needed
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loggedinmain);
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
                        new Intent(LoggedInMain.this, Game.class);
                startActivity(gameIntent);

            }

        });

        button = (Button) findViewById(R.id.ruleButton);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ruleIntent =
                        new Intent(LoggedInMain.this, Rules.class);
                startActivity(ruleIntent);
            }
        });

        button = (Button) findViewById(R.id.logoutButton);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logoutIntent =
                        new Intent(LoggedInMain.this, MyActivity.class);
                startActivity(logoutIntent);
            }
        });

        button = (Button) findViewById(R.id.aboutButton);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent =
                        new Intent(LoggedInMain.this, About.class);
                startActivity(aboutIntent);
            }
        });
    }

}