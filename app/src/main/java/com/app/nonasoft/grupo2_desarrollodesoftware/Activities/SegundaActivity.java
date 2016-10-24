package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Intent;
import android.content.res.Resources;
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
import android.widget.ExpandableListView;
import android.widget.TabHost;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

public class SegundaActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ExpandableListView lista_expandible_incial;
    ExpandableListView lista_expandible_intermedo;
    ExpandableListView lista_expandible_avazado;
    private Button btnJugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        btnJugar = (Button) findViewById(R.id.btnJugar);

        //Creando las tablas "inicial" "medio" "avanzado"
        Resources res = getResources();
        TabHost tabs = (TabHost) findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("mitab1");
        spec.setContent(R.id.inicial);
        spec.setIndicator("inicial");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("mitab2");
        spec.setContent(R.id.intermedio);
        spec.setIndicator("medio");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("mitab3");
        spec.setContent(R.id.avanzado);
        spec.setIndicator("avanzado");
        tabs.addTab(spec);
        tabs.setCurrentTab(0);
        //Final de tabs

        //ExpandableListView
        lista_expandible_incial = (ExpandableListView) findViewById(R.id.expandableListView1);
        lista_expandible_incial.setAdapter(new AdaptadorInicial(this));

        //Funcionalidad btnJugar
        btnJugar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btnNext = new Intent(SegundaActivity.this, OpcionesMinijuego.class);
                startActivity(btnNext);
            }
        });

        lista_expandible_incial.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String eleccion = AdaptadorInicial.tutoriales_inicial[groupPosition][childPosition];
                Intent intent = new Intent(SegundaActivity.this, TutorialActivity.class);
                intent.putExtra("ELECCION", eleccion);
                startActivity(intent);
                return false;
            }
        });


        lista_expandible_intermedo = (ExpandableListView) findViewById(R.id.expandableListView2);
        lista_expandible_intermedo.setAdapter(new AdaptadorIntermedio(this));

        lista_expandible_intermedo.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String eleccion = AdaptadorIntermedio.tutoriales_intermedio[groupPosition][childPosition];
                Intent intent = new Intent(SegundaActivity.this, TutorialActivity.class);
                intent.putExtra("ELECCION", eleccion);
                startActivity(intent);
                return false;
            }
        });


        lista_expandible_avazado = (ExpandableListView) findViewById(R.id.expandableListView3);
        lista_expandible_avazado.setAdapter(new AdaptadorAvanzado(this));

        lista_expandible_avazado.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String eleccion = AdaptadorAvanzado.tutoriales_avanzado[groupPosition][childPosition];
                Intent intent = new Intent(SegundaActivity.this, TutorialActivity.class);
                intent.putExtra("ELECCION", eleccion);
                startActivity(intent);
                return false;
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
        getMenuInflater().inflate(R.menu.segunda, menu);
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

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {
            Intent intent = new Intent(Intent.ACTION_MAIN); finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
