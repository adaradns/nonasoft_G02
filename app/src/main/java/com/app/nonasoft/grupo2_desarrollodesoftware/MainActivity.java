package com.app.nonasoft.grupo2_desarrollodesoftware;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.app.nonasoft.grupo2_desarrollodesoftware.Activities.IndexViewActivity;
import com.app.nonasoft.grupo2_desarrollodesoftware.Login.JSONParser;
import com.app.nonasoft.grupo2_desarrollodesoftware.Login.Login;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnComenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //le seteo a el boton comenzar el id
        btnComenzar = (Button) findViewById(R.id.iniciarBtn);

        btnComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnComenzar = new Intent(MainActivity.this, Login.class);
                startActivity(btnComenzar);
                finish();
            }
        });

    }

}
