package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

/**
 * Created by Adara on 11/18/2016.
 */
public class Juego extends AppCompatActivity {

    private TextView pregunta;

    private Button btnOpcion_1;
    private Button btnOpcion_2;
    private Button btnOpcion_3;
    private Button btnOpcion_4;

    private String election;



    private boolean isButtonClicked = false;
    private ImageView imgCorrecto;

    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_juego_opciones);

        pregunta = (TextView) findViewById(R.id.txtPregunta);

        btnOpcion_1 = (Button) findViewById(R.id.btnFacebook);
        btnOpcion_2 = (Button) findViewById(R.id.btnTwitter);
        btnOpcion_3 = (Button) findViewById(R.id.btnWhatsapp);
        btnOpcion_4 = (Button) findViewById(R.id.btnInstagram);

        imgCorrecto = (ImageView) findViewById(R.id.imgCorrecto);

        btnOpcion_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btnInstagram) {
                    isButtonClicked = !isButtonClicked;
                    imgCorrecto.setVisibility(View.VISIBLE);
                }
            }
        });

        //capturando eleccion
        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        if(extra != null){
            election = extra.getString("ELECCION");
        }
        //coloco el contenido de los minijuegos
        if(election.equals("btnInicial1")){
            pregunta.setText("¿Cual red social se utiliza solo para subir " +
                    "imagenes y videos?");

            btnOpcion_1.setText("facebook");
            btnOpcion_2.setText("gmail");
            btnOpcion_3.setText("twitter");
            btnOpcion_4.setText("instagram");

            if(election.equals("instagram")){}
        }
        //coloco el contenido de los minijuegos
        if(election.equals("btnInicial2")){
            pregunta.setText("¿Cual red social se utiliza solo para subir " +
                    "imagenes y videos?");

            btnOpcion_1.setText("facebookasda");
            btnOpcion_2.setText("gmaiasdal");
            btnOpcion_3.setText("twittasdasder");
            btnOpcion_4.setText("instagasdasdram");
        }

    }
}
