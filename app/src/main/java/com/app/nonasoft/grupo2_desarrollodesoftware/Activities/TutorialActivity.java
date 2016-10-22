package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.widget.TextView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

public class TutorialActivity extends AppCompatActivity {
    private String election;

    TextView titulo;
    TextView paso1;
    TextView paso2;
    TextView paso3;

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        //creando toolbar
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        //para poner boton atras
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        titulo = (TextView) findViewById(R.id.textViewTitulo);
        paso1 = (TextView) findViewById(R.id.textViewPaso1);
        paso2 = (TextView) findViewById(R.id.textViewPaso2);
        paso3 = (TextView) findViewById(R.id.textViewPaso3);

        //Capturando la opcion elegida
        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        if(extra != null){
            election = extra.getString("ELECCION");
        }
        //coloco el contenido de los tutoriales
        if(election.equals("Agregar contacto")){
            paso1.setText("1- Debe dirigirse al menu del celular");
            paso2.setText("2- Buscar el icono de contactos");
            paso3.setText("3- Se abrira la agenda de contactos, ahora precione el boton para agregar un nuevo contacto");
        }
        else{
            paso1.setText("1- Hace tal cosa para el paso");
            paso2.setText("2- Hacer N cosa para seguir");
            paso3.setText("3- Hacer tal cosa ... ¡Y todo eso!");
        }
        //Coloco el contenido de los tutoriales
        titulo.setText(election);
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
