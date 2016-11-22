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
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

public class SegundaActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ExpandableListView lista_expandible_incial;
    ExpandableListView lista_expandible_intermedo;
    ExpandableListView lista_expandible_avazado;

    private TextView niveles;
    private Button btnTutorial, btnJugar;
    private boolean isButtonClicked = false;

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout5);
        niveles = (TextView) findViewById(R.id.niveles);

        btnJugar = (Button) findViewById(R.id.btnJugar);
        btnTutorial = (Button) findViewById(R.id.btnTutorial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //----TIPOGRAFIA----
        //cargando ruta
        final String fontPach = "fonts/century-gothic.ttf";
        //cargando fuente
        final Typeface tf = Typeface.createFromAsset(getAssets(), fontPach);
        //----TIPOGRAFIA----

        niveles.setTypeface(tf);
        btnTutorial.setText("TUTORIALES");
        btnTutorial.setTypeface(tf);
        btnJugar.setText("JUEGOS");
        btnJugar.setTypeface(tf);



        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        //Creando las tablas "inicial" "medio" "avanzado"
        Resources res = getResources();
        final TabHost tabs = (TabHost) findViewById(android.R.id.tabhost);
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
        //-----------------------------

        //-----Al entrar a la app-----------
        niveles.setText("TUTORIAL: Inicial");
        //------COLORES------
        niveles.setBackgroundColor(Color.parseColor("#DA251D"));
        niveles.setTextColor(Color.parseColor("#ffffff"));
        tabs.setBackgroundColor(Color.parseColor("#F2B57D"));
        btnJugar.setBackgroundColor(Color.parseColor("#F2B57D"));
        linearLayout.setBackgroundColor(Color.parseColor("#F2B57D"));
        //------Al entrar a la app-------
        //-----TABS/LISTENER-------
        tabs.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if ("mitab1".equals(tabId)){
                    niveles.setText("TUTORIAL: Inicial");
                    //------COLORES------
                    niveles.setBackgroundColor(Color.parseColor("#DA251D"));
                    niveles.setTextColor(Color.parseColor("#ffffff"));
                    tabs.setBackgroundColor(Color.parseColor("#F2B57D"));
                    btnJugar.setBackgroundColor(Color.parseColor("#F2B57D"));
                    linearLayout.setBackgroundColor(Color.parseColor("#F2B57D"));
                }
                if ("mitab2".equals(tabId)){
                    niveles.setText("TUTORIAL: Intermedio");
                    //------COLORES------
                    niveles.setBackgroundColor(Color.parseColor("#007CC3"));
                    niveles.setTextColor(Color.parseColor("#ffffff"));
                    tabs.setBackgroundColor(Color.parseColor("#CBEAFA"));
                    btnJugar.setBackgroundColor(Color.parseColor("#CBEAFA"));
                    linearLayout.setBackgroundColor(Color.parseColor("#CBEAFA"));
                }
                if ("mitab3".equals(tabId)){
                    niveles.setText("TUTORIAL: Avanzado");
                    //------COLORES------
                    niveles.setBackgroundColor(Color.parseColor("#974578"));
                    niveles.setTextColor(Color.parseColor("#ffffff"));
                    tabs.setBackgroundColor(Color.parseColor("#E7C7D6"));
                    btnJugar.setBackgroundColor(Color.parseColor("#E7C7D6"));
                    linearLayout.setBackgroundColor(Color.parseColor("#E7C7D6"));
                }
            }
        });
        //-----TABS/LISTENER-------

        //Final de tab
        btnJugar.setBackgroundColor(Color.parseColor("#FFFFFF"));

        tabs.setVisibility(View.VISIBLE);
        //Funcionalidad btnJugar
        btnJugar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegundaActivity.this, MiniJuegoActivity.class);
                startActivity(intent);
            }
        });

        //ExpandableListView
        lista_expandible_incial = (ExpandableListView) findViewById(R.id.expandableListView1);
        lista_expandible_incial.setAdapter(new AdaptadorInicial(this));

        lista_expandible_incial.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String eleccion = AdaptadorInicial.tutoriales_inicial_generico[groupPosition][childPosition];
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
                String eleccion = AdaptadorIntermedio.tutoriales_intermedio_generico[groupPosition][childPosition];
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
                String eleccion = AdaptadorAvanzado.tutoriales_avanzado_generico[groupPosition][childPosition];
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

        if (id == R.id.nav_logro) {
            Intent intent = new Intent(SegundaActivity.this, LogrosActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_salir) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
