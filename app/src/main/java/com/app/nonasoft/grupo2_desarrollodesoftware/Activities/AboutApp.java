package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

/**
 * Created by Adara on 10/29/2016.
 */
public class AboutApp extends Activity{

    private ImageView imageView;
    private Drawable originalDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_app);

        originalDrawable = getResources().getDrawable(R.drawable.user);

        imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setImageDrawable(originalDrawable);
    }
}
