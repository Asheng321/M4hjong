package com.example.M4hjong;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Heather on 3/1/14.
 */

//on start, deal hand
//user goes first

public class Game extends Activity {
    /**public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
    }**/

    ImageView anyTile;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

        // ImageViews must be under LinearLayout in the xml or the code crashes into scaleImage(). Tune scaleImage() into your needs.
        ImageView view1 = (ImageView) findViewById(R.id.b11);
        ImageView view2 = (ImageView) findViewById(R.id.b12);
        ImageView view3 = (ImageView) findViewById(R.id.b13);
        ImageView view4 = (ImageView) findViewById(R.id.b14);
        ImageView view5 = (ImageView) findViewById(R.id.b21);
        ImageView view6 = (ImageView) findViewById(R.id.b22);
        ImageView view7 = (ImageView) findViewById(R.id.b23);
        ImageView view8 = (ImageView) findViewById(R.id.b24);
        ImageView view9 = (ImageView) findViewById(R.id.b31);
        ImageView view10 = (ImageView) findViewById(R.id.b32);
        ImageView view11 = (ImageView) findViewById(R.id.b33);
        ImageView view12 = (ImageView) findViewById(R.id.b34);
        ImageView view13 = (ImageView) findViewById(R.id.b41);
        ImageView view14 = (ImageView) findViewById(R.id.b42);
        scaleImage(view1, 90);
        scaleImage(view2, 90);
        scaleImage(view3, 90);
        scaleImage(view4, 90);
        scaleImage(view5, 90);
        scaleImage(view6, 90);
        scaleImage(view7, 90);
        scaleImage(view8, 90);
        scaleImage(view9, 90);
        scaleImage(view10, 90);
        scaleImage(view11, 90);
        scaleImage(view12, 90);
        scaleImage(view13, 90);
        scaleImage(view14, 90);

        addListenerOnClick();

    }

    private void addListenerOnClick()
    {
        anyTile = (ImageView) findViewById(R.id.b11);

        anyTile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // Intent browserIntent =
                //new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                //startActivity(browserIntent);
                //System.out.println("Hi");
            }
        });
    }

    private void scaleImage(ImageView view, int boundBoxInDp)
    {
        // Get the ImageView and its bitmap
        Drawable drawing = view.getDrawable();
        Bitmap bitmap = ((BitmapDrawable)drawing).getBitmap();

        // Get current dimensions
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();

        // Determine how much to scale: the dimension requiring less scaling is
        // closer to the its side. This way the image always stays inside your
        // bounding box AND either x/y axis touches it.
        float xScale = ((float) boundBoxInDp) / width;
        float yScale = ((float) boundBoxInDp) / height;
        float scale = (xScale <= yScale) ? xScale : yScale;

        // Create a matrix for the scaling and add the scaling data
        Matrix matrix = new Matrix();
        matrix.postScale(scale, scale);

        // Create a new bitmap and convert it to a format understood by the ImageView
        Bitmap scaledBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        BitmapDrawable result = new BitmapDrawable(scaledBitmap);
        width = scaledBitmap.getWidth();
        height = scaledBitmap.getHeight();

        // Apply the scaled bitmap
        view.setImageDrawable(result);

        // Now change ImageView's dimensions to match the scaled image
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) view.getLayoutParams();
        params.width = width;
        params.height = height;
        view.setLayoutParams(params);
    }

    private int dpToPx(int dp)
    {
        float density = getApplicationContext().getResources().getDisplayMetrics().density;
        return Math.round((float)dp * density);
    }

}
