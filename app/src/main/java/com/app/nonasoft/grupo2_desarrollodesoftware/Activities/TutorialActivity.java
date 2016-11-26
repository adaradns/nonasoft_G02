package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

public class TutorialActivity extends AppCompatActivity {
    private String election;
    private Toolbar toolbar;
    //private pl.droidsonroids.gif.GifImageView gif;
    private ImageView btns;

    private boolean isButtonClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        //asociando gif
        // gif = (pl.droidsonroids.gif.GifImageView) findViewById(R.id.anim);
        btns = (ImageView) findViewById(R.id.btns);


        //creando toolbar
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        //para poner boton atras
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Capturando la opcion elegida
        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        if(extra != null) {
            election = extra.getString("ELECCION");
            Log.d("Eleccion:", election);
            //NIVEL INICIAL
            //categoria 1
            if (election.equals("inicial_categoria1_tut1")) {
                btns.setImageResource(R.drawable.btn1);
                //gif.setImageResource(R.drawable.gifprueba);
            } else if (election.equals("inicial_categoria1_tut2")) {
                btns.setImageResource(R.drawable.btn2);
            } else if (election.equals("inicial_categoria1_tut3")) {
                btns.setImageResource(R.drawable.btn3);
            }
            //categoria 2
            else if (election.equals("inicial_categoria2_tut1")) {
                btns.setImageResource(R.drawable.btn4);
            } else if (election.equals("inicial_categoria2_tut2")) {
                btns.setImageResource(R.drawable.btn5);
            } else if (election.equals("inicial_categoria2_tut3")) {
                btns.setImageResource(R.drawable.btn6);
            }
            //categoria 3
            else if (election.equals("inicial_categoria3_tut1")) {
                btns.setImageResource(R.drawable.btn7);
            } else if (election.equals("inicial_categoria3_tut2")) {
                btns.setImageResource(R.drawable.btn8);
            } else if (election.equals("inicial_categoria3_tut3")) {
                btns.setImageResource(R.drawable.btn9);
            } else if (election.equals("inicial_categoria3_tut4")) {
                btns.setImageResource(R.drawable.btn10);
            }
            //NIVEL INTERMEDIO
            //categoria 1
            else if (election.equals("intermedio_categoria1_tut1")) {
                btns.setImageResource(R.drawable.btn14);
            } else if (election.equals("intermedio_categoria1_tut2")) {
                btns.setImageResource(R.drawable.btn15);
            } else if (election.equals("intermedio_categoria1_tut3")) {
                btns.setImageResource(R.drawable.btn16);
            }
            //categoria 2
            else if (election.equals("intermedio_categoria2_tut1")) {
                btns.setImageResource(R.drawable.btn11);
            } else if (election.equals("intermedio_categoria2_tut2")) {
                btns.setImageResource(R.drawable.btn12);

            }else if (election.equals("intermedio_categoria2_tut3")) {
                btns.setImageResource(R.drawable.btn13);
            }
            //categoria 3
            else if (election.equals("intermedio_categoria3_tut1")) {
                btns.setImageResource(R.drawable.btn17);
            } else if (election.equals("intermedio_categoria3_tut2")) {
                btns.setImageResource(R.drawable.btn18);
            } else if (election.equals("intermedio_categoria3_tut3")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            }
            //NIVEL AVANzADO
            //categoria 1
            else if (election.equals("avanzado_categoria1_tut1")) {
                btns.setImageResource(R.drawable.btn22);
            } else if (election.equals("avanzado_categoria1_tut2")) {
                btns.setImageResource(R.drawable.btn23);
            } else if (election.equals("avanzado_categoria1_tut3")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            }
            //categoria 2
            else if (election.equals("avanzado_categoria2_tut1")) {
                btns.setImageResource(R.drawable.btn24);
            } else if (election.equals("avanzado_categoria2_tut2")) {
                btns.setImageResource(R.drawable.btn26);
            } else if (election.equals("avanzado_categoria2_tut3")) {
                btns.setImageResource(R.drawable.btn25);
            }
            //categoria 3
            else if (election.equals("avanzado_categoria3_tut1")) {
                btns.setImageResource(R.drawable.btn20);
            } else if (election.equals("avanzado_categoria3_tut2")) {
                btns.setImageResource(R.drawable.btn19);
            } else if (election.equals("avanzado_categoria3_tut3")) {
                btns.setImageResource(R.drawable.btn21);
            }

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
