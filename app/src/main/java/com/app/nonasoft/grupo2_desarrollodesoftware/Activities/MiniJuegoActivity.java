package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
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
    private Button btnInicial4;
        //nivel intermedio
    private Button btnIntermedio1;
    private Button btnIntermedio2;
    private Button btnIntermedio3;
    private Button btnIntermedio4;
        //nivel avanzado
    private Button btnAvanzado1;
    private Button btnAvanzado2;
    private Button btnAvanzado3;

    TabHost tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_juego);

        txtNiveles = (TextView) findViewById(R.id.txtNiveles);

        btnTutorial2 = (Button) findViewById(R.id.btnTutorialJuego);
        btnJugar2 = (Button) findViewById(R.id.btnJugarJuego);

        btnInicial1 = (Button) findViewById(R.id.btnInicial1);
        btnInicial2 = (Button) findViewById(R.id.btnInicial2);
        btnInicial3 = (Button) findViewById(R.id.btnInicial3);
        btnInicial4 = (Button) findViewById(R.id.btnInicial4);

        btnIntermedio1 = (Button) findViewById(R.id.btnIntermedio1);
        btnIntermedio2 = (Button) findViewById(R.id.btnIntermedio2);
        btnIntermedio3 = (Button) findViewById(R.id.btnIntermedio3);
        btnIntermedio4 = (Button) findViewById(R.id.btnIntermedio4);

        btnAvanzado1 = (Button) findViewById(R.id.btnAvanzado1);
        btnAvanzado2 = (Button) findViewById(R.id.btnAvanzado2);
        btnAvanzado3 = (Button) findViewById(R.id.btnAvanzado3);

        btnTutorial2.setBackgroundColor(Color.parseColor("#FFFFFF"));

        //-------------------------NAVEGATION DRAWER
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

        txtNiveles.setText("JUEGO: Inicial");

        //-----TABS/LISTENER-------
        tabs.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if ("juegotab1".equals(tabId)){
                    txtNiveles.setText("JUEGO: Inicial");
                }
                if ("juegotab2".equals(tabId)){
                    txtNiveles.setText("JUEGO: Intermedio");
                }
                if ("juegotab3".equals(tabId)){
                    txtNiveles.setText("JUEGO: Avanzado");
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
