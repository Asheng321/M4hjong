package com.example.M4hjong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.OnClickListener;

public class MyActivity extends Activity {

    //add more buttons refactor needed
    Button anyButton ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // Font path
        //String fontPath = "assets/fonts/Eadui.ttf";

        // text view label
        //TextView mainLogo = (TextView) findViewById(R.id.Eadui);

        // Loading Font Face
        //Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        // Applying font
        //mainLogo.setTypeface(tf);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        anyButton = (Button) findViewById(R.id.playButton);

        anyButton.setOnClickListener(new OnClickListener() {

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

        anyButton = (Button) findViewById(R.id.ruleButton);

        anyButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ruleIntent =
                        new Intent(MyActivity.this, Rules.class);
                startActivity(ruleIntent);
            }
        });

        anyButton = (Button) findViewById(R.id.loginButton);

        anyButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent =
                        new Intent(MyActivity.this, Login.class);
                startActivity(loginIntent);
            }
        });

        anyButton = (Button) findViewById(R.id.aboutButton);

        anyButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent =
                        new Intent(MyActivity.this, About.class);
                startActivity(aboutIntent);
            }
        });
    }

}