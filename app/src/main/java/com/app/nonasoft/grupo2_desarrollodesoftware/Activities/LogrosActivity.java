package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

public class LogrosActivity extends AppCompatActivity {

    Context context;

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

        //para mostrar los logros conseguidos
        context = this;
        SharedPreferences logros = getSharedPreferences("logrosConseguidos",0);

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

        //----Cargando logros conseguidos -----
            //INICIAL
        int logroIni1 = logros.getInt("btnLogroInicial1", 0);
        if(logroIni1 == 1){
            botonInicialcat1.setCompoundDrawablesWithIntrinsicBounds(android.R.drawable.ic_menu_manage, 0, android.R.drawable.star_big_on, 0);
        }
        int logroIni2 = logros.getInt("btnLogroInicial2", 0);
        if(logroIni2 == 1){
            botonInicialcat2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_person_add_black_24dp, 0, android.R.drawable.star_big_on, 0);
        }
        int logroIni3 = logros.getInt("btnLogroInicial3", 0);
        if(logroIni3 == 1){
            botonInicialcat3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_phone_forwarded_black_24dp, 0, android.R.drawable.star_big_on, 0);
        }
            //si tengo todos los logros de la una categoria, se pone la estrellita en su titulo
        if((logroIni1 == 1) && (logroIni2 == 1) && (logroIni3 == 1)){
            botonInicial.setCompoundDrawablesWithIntrinsicBounds(0, 0, android.R.drawable.star_big_on, 0);
        }
            //INTERMEDIO
        int logroInter1 = logros.getInt("btnLogroIntermedio1", 0);
        if(logroInter1 == 1){
            botonIntermediocat1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_android_black_24dp, 0, android.R.drawable.star_big_on, 0);
        }
        int logroInter2 = logros.getInt("btnLogroIntermedio2", 0);
        if(logroInter2 == 1){
            botonIntermediocat2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_group_black_24dp, 0, android.R.drawable.star_big_on, 0);
        }
        int logroInter3 = logros.getInt("btnLogroIntermedio3", 0);
        if(logroInter3 == 1){
            botonIntermediocat3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_person_add_black_24dp, 0, android.R.drawable.star_big_on, 0);
        }
        //si tengo todos los logros de la una categoria, se pone la estrellita en su titulo
        if((logroInter1 == 1) && (logroInter2 == 1) && (logroInter3 == 1)){
            botonIntermedio.setCompoundDrawablesWithIntrinsicBounds(0, 0, android.R.drawable.star_big_on, 0);
        }
            //AVANzADO
        int logroAvan1 = logros.getInt("btnLogroAvanzado1", 0);
        if(logroAvan1 == 1){
            botonAvanzadocat1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_email_black_24dp, 0, android.R.drawable.star_big_on, 0);
        }
        int logroAvan2 = logros.getInt("btnLogroAvanzado2", 0);
        if(logroAvan2 == 1){
            botonAvanzadocat2.setCompoundDrawablesWithIntrinsicBounds(android.R.drawable.ic_menu_manage, 0, android.R.drawable.star_big_on, 0);
        }
        int logroAvan3 = logros.getInt("btnLogroAvanzado3", 0);
        if(logroAvan3 == 1){
            botonAvanzadocat3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_public_black_24dp, 0, android.R.drawable.star_big_on, 0);
        }
        //si tengo todos los logros de la una categoria, se pone la estrellita en su titulo
        if((logroAvan1 == 1) && (logroAvan2 == 1) && (logroAvan3 == 1)){
            botonAvanzado.setCompoundDrawablesWithIntrinsicBounds(0, 0, android.R.drawable.star_big_on, 0);
        }
        //----Cargando logros conseguidos
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
