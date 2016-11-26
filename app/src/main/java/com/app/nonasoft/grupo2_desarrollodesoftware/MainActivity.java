package com.app.nonasoft.grupo2_desarrollodesoftware;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.os.Handler;
=======
<<<<<<< HEAD
import android.os.Handler;
=======
>>>>>>> a750cbe73a94b14198f76895f838e894c7b222d6
>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.app.nonasoft.grupo2_desarrollodesoftware.Activities.SegundaActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(MainActivity.this, SegundaActivity.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, 5000);
=======

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(MainActivity.this, SegundaActivity.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, 5000);

        /*
        //le seteo a el boton comenzar el id
        btnComenzar = (Button) findViewById(R.id.iniciarBtn);

        btnComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnComenzar = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(btnComenzar);
                finish();
            }
        }); */
>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35

    }

}
