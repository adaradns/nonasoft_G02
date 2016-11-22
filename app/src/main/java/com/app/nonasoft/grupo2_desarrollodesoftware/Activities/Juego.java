package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
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

    private TextView txtPuntaje;

    private String election;

    private Toolbar toolbar;

    private boolean isButtonClicked = false;
    private ImageView imgCorrecto;
    private ImageView imgIncorrecto;

    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_juego_opciones);

        //creando toolbar
        toolbar = (Toolbar) findViewById(R.id.tool_bar1);
        setSupportActionBar(toolbar);
        //para poner boton atras
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pregunta = (TextView) findViewById(R.id.txtPregunta);

        btnOpcion_1 = (Button) findViewById(R.id.btnOpcion1);
        btnOpcion_2 = (Button) findViewById(R.id.btnOpcion2);
        btnOpcion_3 = (Button) findViewById(R.id.btnOpcion3);
        btnOpcion_4 = (Button) findViewById(R.id.btnOpcion4);
        imgCorrecto = (ImageView) findViewById(R.id.imgCorrecto);
        imgIncorrecto = (ImageView) findViewById(R.id.imgIncorrecto);


        //----TIPOGRAFIA----
        //cargando ruta
        final String fontPach = "fonts/century-gothic.ttf";
        //cargando fuente
        final Typeface tf = Typeface.createFromAsset(getAssets(), fontPach);
        //----TIPOGRAFIA----
        pregunta.setTypeface(tf);
        btnOpcion_1.setTypeface(tf);
        btnOpcion_2.setTypeface(tf);
        btnOpcion_3.setTypeface(tf);
        btnOpcion_4.setTypeface(tf);

        //capturando eleccion
        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        if(extra != null){
            election = extra.getString("ELECCION");
        }

        //NIVEL INICIAL
        //coloco el contenido de los minijuegos
        if(election.equals("btnInicial1")){
            pregunta.setText("¿Que necesito para mandar un mensaje de texto?");

            btnOpcion_1.setText("internet");
            btnOpcion_2.setText("nada, es gratis");
            btnOpcion_3.setText("facebook");
            btnOpcion_4.setText("credito");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#E77817"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#D9D207"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#E72517"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        imgCorrecto.setVisibility(View.VISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#E77817"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#D9D207"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });


        }



        //coloco el contenido de los minijuegos
        if(election.equals("btnInicial2")){
            pregunta.setText("¿Como haces para llamar a un contacto desde tu propio telefono?");

            btnOpcion_1.setText("desde las llamadas de whatsapp");
            btnOpcion_2.setText("ingresando a facebook");
            btnOpcion_3.setText("ingresando a la seccion de contactos");
            btnOpcion_4.setText("todas son correctas");


            btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#E77817"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#D9D207"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#E72517"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#E77817"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#E72517"));
                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

        }

        //coloco el contenido de los minijuegos
        if(election.equals("btnInicial3")){
            pregunta.setText("¿Como llamar a un contacto ya agendado?");

            btnOpcion_1.setText("Desde whatsapp");
            btnOpcion_2.setText("Deslizando el dedo sobre su nombre");
            btnOpcion_3.setText("Tocando dos veces sobre el contacto");
            btnOpcion_4.setText("Desde la galeria de imagenes");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#E77817"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#D9D207"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#E72517"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#D9D207"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#E72517"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });
        }

         //NIVEL INTERMEDIO
        //coloco el contenido de los minijuegos
        if(election.equals("btnIntermedio1")) {
            pregunta.setText("¿Que nos hace falta para añadir una cuenta de Google?");

            btnOpcion_1.setText("Cuenta de Gmail");
            btnOpcion_2.setText("Cuenta de Hotmail");
            btnOpcion_3.setText("Cuenta de Facebook");
            btnOpcion_4.setText("Cuenta de Twitter ");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#007CC3"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#75C5F0"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#4DB4BB"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));

            //OPCION CORRECTA
            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#75C5F0"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DB4BB"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

        }

        //coloco el contenido de los minijuegos
        if(election.equals("btnIntermedio2")) {
            pregunta.setText("¿Que red social sirve solamente para publicar" +
                    " fotos y videos?");

            btnOpcion_1.setText("Twitter");
            btnOpcion_2.setText("Facebook");
            btnOpcion_3.setText("Instagram");
            btnOpcion_4.setText("Google maps");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#007CC3"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#75C5F0"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#4DB4BB"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));


            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });
            //OPCION CORRECTA
            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#007CC3"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#75C5F0"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));
                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

        }

        //coloco el contenido de los minijuegos
        if(election.equals("btnIntermedio3")) {
            pregunta.setText("¿Que boton debes presionar para publicar un estado en " +
                    "Facebook?");

            btnOpcion_1.setText("Enviar");
            btnOpcion_2.setText("Publicar");
            btnOpcion_3.setText("Seguir");
            btnOpcion_4.setText("Agregar");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#007CC3"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#75C5F0"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#4DB4BB"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));


            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });
            //OPCION CORRECTA
            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#007CC3"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DB4BB"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

        }


        //NIVEL AVANZADO
        //coloco el contenido de los minijuegos
        if(election.equals("btnAvanzado1")) {
            pregunta.setText("¿Que cosas podemos enviar a travez de un correo electronico?");

            btnOpcion_1.setText("texto");
            btnOpcion_2.setText("imagenes");
            btnOpcion_3.setText("archivos");
            btnOpcion_4.setText("todas son correctas");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#DD137B"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#C985A3"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#974578"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#DD137B"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });


        }

        //coloco el contenido de los minijuegos
        if(election.equals("btnAvanzado2")) {
            pregunta.setText("¿Con cual de estas opciones borras el texto pero podes pegarlo en " +
                    "otro lado?");

            btnOpcion_1.setText("Copiar");
            btnOpcion_2.setText("Enviar");
            btnOpcion_3.setText("Cortar");
            btnOpcion_4.setText("Seleccionar");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#DD137B"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#C985A3"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#974578"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#DD137B"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));

                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });


        }

        //coloco el contenido de los minijuegos
        if(election.equals("btnAvanzado3")) {
            pregunta.setText("¿Cual buscador mas utilizado de internet?");

            btnOpcion_1.setText("Yahoo");
            btnOpcion_2.setText("Bing");
            btnOpcion_3.setText("Ask");
            btnOpcion_4.setText("Google");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#DD137B"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#C985A3"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#974578"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#DD137B"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#DD137B"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#C985A3"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#974578"));

                    }
                }
            });


        }


    }
    @Override public boolean onCreateOptionsMenu(android.view.Menu mimenu){
        getMenuInflater().inflate(R.menu.menu_tutorial, mimenu);

        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem opcion_menu){
        int id = opcion_menu.getItemId();

        switch (id){
            case R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }

        return super.onOptionsItemSelected(opcion_menu);
    }
}
