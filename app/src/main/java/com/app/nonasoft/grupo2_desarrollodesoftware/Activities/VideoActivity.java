package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

/**
 * Created by Adara on 11/22/2016.
 */
public class VideoActivity extends AppCompatActivity {
    private String election;
    private Toolbar toolbar;
    private pl.droidsonroids.gif.GifImageView gif;
    private ImageView btns;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        gif = (pl.droidsonroids.gif.GifImageView) findViewById(R.id.anim);
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
                gif.setImageResource(R.drawable.presentacion);


            } else if (election.equals("inicial_categoria1_tut2")) {
                gif.setImageResource(R.drawable.presentacion);
            } else if (election.equals("inicial_categoria1_tut3")) {
                gif.setImageResource(R.drawable.presentacion);
            }
            //categoria 2
            else if (election.equals("inicial_categoria2_tut1")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("inicial_categoria2_tut2")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("inicial_categoria2_tut3")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            }
            //categoria 3
            else if (election.equals("inicial_categoria3_tut1")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("inicial_categoria3_tut2")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("inicial_categoria3_tut3")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("inicial_categoria3_tut4")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            }
            //NIVEL INTERMEDIO
            //categoria 1
            else if (election.equals("intermedio_categoria1_tut1")) {
                //gif.setImageResource(R.drawable.gifprueba);
            } else if (election.equals("intermedio_categoria1_tut2")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("intermedio_categoria1_tut3")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            }
            //categoria 2
            else if (election.equals("intermedio_categoria2_tut1")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("intermedio_categoria2_tut2")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("intermedio_categoria2_tut3")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            }
            //categoria 3
            else if (election.equals("intermedio_categoria3_tut1")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("intermedio_categoria3_tut2")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("intermedio_categoria3_tut3")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            }
            //NIVEL AVANzADO
            //categoria 1
            else if (election.equals("avanzado_categoria1_tut1")) {
                //gif.setImageResource(R.drawable.gifprueba);
            } else if (election.equals("avanzado_categoria1_tut2")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("avanzado_categoria1_tut3")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            }
            //categoria 2
            else if (election.equals("avanzado_categoria2_tut1")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("avanzado_categoria2_tut2")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("avanzado_categoria2_tut3")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            }
            //categoria 3
            else if (election.equals("avanzado_categoria3_tut1")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("avanzado_categoria3_tut2")) {
                //gif.setImageResource(R.drawable.gifprueba1);
            } else if (election.equals("avanzado_categoria3_tut3")) {
                //gif.setImageResource(R.drawable.gifprueba1);
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
