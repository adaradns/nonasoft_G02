package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

public class LogrosActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private TextView botonInicial;
    private TextView botonInicialcat1;
    private TextView botonInicialcat2;
    private TextView botonInicialcat3;

    private TextView botonIntermedio;
    private TextView botonIntermediocat1;
    private TextView botonIntermediocat2;
    private TextView botonIntermediocat3;

    private TextView botonAvanzado;
    private TextView botonAvanzadocat1;
    private TextView botonAvanzadocat2;
    private TextView botonAvanzadocat3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logros);

        botonInicial = (TextView) findViewById(R.id.nivelInicial);
        botonInicialcat1 = (TextView) findViewById(R.id.catInicial1);
        botonInicialcat2 = (TextView) findViewById(R.id.catInicial2);
        botonInicialcat3 = (TextView) findViewById(R.id.catInicial3);

        botonIntermedio = (TextView) findViewById(R.id.nivelIntermedio);
        botonIntermediocat1 = (TextView) findViewById(R.id.catIntermedio1);
        botonIntermediocat2 = (TextView) findViewById(R.id.catIntermedio2);
        botonIntermediocat3 = (TextView) findViewById(R.id.catIntermedio3);

        botonAvanzado = (TextView) findViewById(R.id.nivelAvanzado);
        botonAvanzadocat1 = (TextView) findViewById(R.id.catAvanzado1);
        botonAvanzadocat2 = (TextView) findViewById(R.id.catAvanzado2);
        botonAvanzadocat3 = (TextView) findViewById(R.id.catAvanzado3);

        //----TIPOGRAFIA----
        //cargando ruta
        final String fontPach = "fonts/century-gothic.ttf";
        //cargando fuente
        final Typeface tf = Typeface.createFromAsset(getAssets(), fontPach);
        //----TIPOGRAFIA----

        //creando toolbar
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Logros");
        //para poner boton atras
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        botonInicial.setTypeface(tf);
        botonInicialcat1.setTypeface(tf);
        botonInicialcat2.setTypeface(tf);
        botonInicialcat3.setTypeface(tf);

        botonIntermedio.setTypeface(tf);
        botonIntermediocat1.setTypeface(tf);
        botonIntermediocat2.setTypeface(tf);
        botonIntermediocat3.setTypeface(tf);

        botonAvanzado.setTypeface(tf);
        botonAvanzadocat1.setTypeface(tf);
        botonAvanzadocat2.setTypeface(tf);
        botonAvanzadocat3.setTypeface(tf);
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
