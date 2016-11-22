package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

public class MiniJuegoActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TextView txtNiveles;
    //Botones Superiores
    private Button btnTutorial2, btnJugar2;
    //Botones de los mini-juegos de los tutoriales
    //nivel inicial
    private Button btnInicial1;
    private Button btnInicial2;
    private Button btnInicial3;
    //nivel intermedio
    private Button btnIntermedio1;
    private Button btnIntermedio2;
    private Button btnIntermedio3;
    private Button btnIntermedio4;
    //nivel avanzado
    private Button btnAvanzado1;
    private Button btnAvanzado2;
    private Button btnAvanzado3;

    LinearLayout linearLayout;

    TabHost tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_juego);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayoutMinijuegos);

        txtNiveles = (TextView) findViewById(R.id.txtNiveles);

        btnTutorial2 = (Button) findViewById(R.id.btnTutorialJuego);
        btnJugar2 = (Button) findViewById(R.id.btnJugarJuego);

        btnInicial1 = (Button) findViewById(R.id.btnInicial1);
        btnInicial2 = (Button) findViewById(R.id.btnInicial2);
        btnInicial3 = (Button) findViewById(R.id.btnInicial3);

        btnIntermedio1 = (Button) findViewById(R.id.btnIntermedio1);
        btnIntermedio2 = (Button) findViewById(R.id.btnIntermedio2);
        btnIntermedio3 = (Button) findViewById(R.id.btnIntermedio3);

        btnAvanzado1 = (Button) findViewById(R.id.btnAvanzado1);
        btnAvanzado2 = (Button) findViewById(R.id.btnAvanzado2);
        btnAvanzado3 = (Button) findViewById(R.id.btnAvanzado3);

        btnTutorial2.setBackgroundColor(Color.parseColor("#FFFFFF"));

        //-------------------------NAVEGATION DRAWER
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //----TIPOGRAFIA----
        //cargando ruta
        final String fontPach = "fonts/century-gothic.ttf";
        //cargando fuente
        final Typeface tf = Typeface.createFromAsset(getAssets(), fontPach);
        //----TIPOGRAFIA----
        txtNiveles.setTypeface(tf);


        btnTutorial2.setText("TUTORIALES");
        btnTutorial2.setTypeface(tf);
        btnJugar2.setText("JUEGOS");
        btnJugar2.setTypeface(tf);

        //Font para nivel INICIAL
        btnInicial1.setText("CONFIGURACION/ USO INICIAL");
        btnInicial1.setTypeface(tf);
        btnInicial2.setText("MANEJO DE CONTACTOS");
        btnInicial2.setTypeface(tf);
        btnInicial3.setText("GESTION DE LLAMADAS/SMS");
        btnInicial3.setTypeface(tf);

        //Font para nivel INTERMEDIO
        btnIntermedio1.setText("APLICACIONES UTILES");
        btnIntermedio1.setTypeface(tf);
        btnIntermedio2.setText("REDES SOCIALES");
        btnIntermedio2.setTypeface(tf);
        btnIntermedio3.setText("USO DE REDES SOCIALES");
        btnIntermedio3.setTypeface(tf);

        //Font para nivel AVANZADO
        btnAvanzado1.setText("CORREO ELECTRONICO");
        btnAvanzado1.setTypeface(tf);
        btnAvanzado2.setText("CONFIGURACION AVANZADA");
        btnAvanzado2.setTypeface(tf);
        btnAvanzado3.setText("NAVEGAR POR INTERNET");
        btnAvanzado3.setTypeface(tf);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //-------------------------NAVEGATION DRAWER



        //Creando las tablas "inicial" "medio" "avanzado"
        Resources res = getResources();
        tabs = (TabHost) findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("juegotab1");
        spec.setContent(R.id.juegoInicial);
        spec.setIndicator("inicial");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("juegotab2");
        spec.setContent(R.id.juegoIntermedio);
        spec.setIndicator("medio");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("juegotab3");
        spec.setContent(R.id.juegoAvanzado);
        spec.setIndicator("avanzado");
        tabs.addTab(spec);
        tabs.setCurrentTab(0);
        //------------ fin las tablas "inicial" "medio" "avanzado"

        //-----Al entrar a la app-----------
        txtNiveles.setText("JUEGO INICIAL");
        //------COLORES------
        txtNiveles.setBackgroundColor(Color.parseColor("#DA251D"));
        txtNiveles.setTextColor(Color.parseColor("#ffffff"));
        tabs.setBackgroundColor(Color.parseColor("#F2B57D"));
        txtNiveles.setBackgroundColor(Color.parseColor("#DA251D"));
        linearLayout.setBackgroundColor(Color.parseColor("#F2B57D"));




        //-----TABS/LISTENER-------
        tabs.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if ("juegotab1".equals(tabId)){
                    txtNiveles.setText("JUEGO INICIAL");
                    txtNiveles.setBackgroundColor(Color.parseColor("#DA251D"));
                    txtNiveles.setTextColor(Color.parseColor("#ffffff"));
                    tabs.setBackgroundColor(Color.parseColor("#F2B57D"));
                    btnJugar2.setBackgroundColor(Color.parseColor("#F2B57D"));
                    linearLayout.setBackgroundColor(Color.parseColor("#F2B57D"));
                }



                if ("juegotab2".equals(tabId)){
                    txtNiveles.setText("JUEGO INTERMEDIO");

                    txtNiveles.setBackgroundColor(Color.parseColor("#007CC3"));
                    txtNiveles.setTextColor(Color.parseColor("#ffffff"));
                    tabs.setBackgroundColor(Color.parseColor("#CBEAFA"));
                    btnTutorial2.setBackgroundColor(Color.parseColor("#CBEAFA"));
                    linearLayout.setBackgroundColor(Color.parseColor("#CBEAFA"));
                }
                if ("juegotab3".equals(tabId)){
                    txtNiveles.setText("JUEGO AVANZADO");
                    //------COLORES------
                    txtNiveles.setBackgroundColor(Color.parseColor("#974578"));
                    txtNiveles.setTextColor(Color.parseColor("#ffffff"));
                    tabs.setBackgroundColor(Color.parseColor("#E7C7D6"));
                    btnTutorial2.setBackgroundColor(Color.parseColor("#E7C7D6"));
                    linearLayout.setBackgroundColor(Color.parseColor("#E7C7D6"));
                }
            }
        });
        //-----TABS/LISTENER-------

        //Funcionalidad btnTutorial2
        btnTutorial2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MiniJuegoActivity.this, SegundaActivity.class);
                startActivity(intent);
            }
        });


        //IR A MINI JUEGO DE TODAS LAS CATEGORIAS
        //INICIAL
        btnInicial1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String eleccion = "btnInicial1";
                Intent intent = new Intent(MiniJuegoActivity.this, Juego.class);
                intent.putExtra("ELECCION", eleccion);

                startActivity(intent);
            }
        });
        btnInicial2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String eleccion = "btnInicial2";
                Intent intent = new Intent(MiniJuegoActivity.this, Juego.class);
                intent.putExtra("ELECCION", eleccion);

                startActivity(intent);
            }
        });

        btnInicial3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String eleccion = "btnInicial3";
                Intent intent = new Intent(MiniJuegoActivity.this, Juego.class);
                intent.putExtra("ELECCION", eleccion);

                startActivity(intent);
            }
        });


        //INTERMEDIO
        btnIntermedio1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String eleccion = "btnIntermedio1";
                Intent intent = new Intent(MiniJuegoActivity.this, Juego.class);
                intent.putExtra("ELECCION", eleccion);

                startActivity(intent);
            }
        });

        btnIntermedio2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String eleccion = "btnIntermedio2";
                Intent intent = new Intent(MiniJuegoActivity.this, Juego.class);
                intent.putExtra("ELECCION", eleccion);

                startActivity(intent);
            }
        });

        btnIntermedio3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String eleccion = "btnIntermedio3";
                Intent intent = new Intent(MiniJuegoActivity.this, Juego.class);
                intent.putExtra("ELECCION", eleccion);

                startActivity(intent);
            }
        });

        //AVANZADO
        btnAvanzado1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String eleccion = "btnAvanzado1";
                Intent intent = new Intent(MiniJuegoActivity.this, Juego.class);
                intent.putExtra("ELECCION", eleccion);

                startActivity(intent);
            }
        });

        btnAvanzado2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String eleccion = "btnAvanzado2";
                Intent intent = new Intent(MiniJuegoActivity.this, Juego.class);
                intent.putExtra("ELECCION", eleccion);

                startActivity(intent);
            }
        });

        btnAvanzado3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String eleccion = "btnAvanzado3";
                Intent intent = new Intent(MiniJuegoActivity.this, Juego.class);
                intent.putExtra("ELECCION", eleccion);

                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mini_juego, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_logro1) {
            // Handle the camera action
        } else if (id == R.id.nav_salir1) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
