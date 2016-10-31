package com.app.nonasoft.grupo2_desarrollodesoftware.Parsers;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import com.app.nonasoft.grupo2_desarrollodesoftware.Login.JSONParser;
import com.app.nonasoft.grupo2_desarrollodesoftware.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Adara on 10/30/2016.
 */
public class CategoriesGet extends ActionBarActivity {
    // Progress Dialog
    private ProgressDialog pDialog;


    // Creating JSON Parser object
    JSONParser jParser = new JSONParser();

    public ArrayList<HashMap<String, String>> categorielist;


    // url to get all products list
    private static String url_all_categories = "http://nonasoftdev.com/get/categories.php";

    // JSON Node names
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_PRODUCTS = "categoria";
    private static final String TAG_ID = "idCategoria";
    private static final String TAG_NOMBRE = "titulo";

    // products JSONArray
    JSONArray products = null;

    ExpandableListView lista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_segunda);

        categorielist = new ArrayList<HashMap<String, String>>();

        new LoadAllProducts().execute();
        lista = (ExpandableListView) findViewById(R.id.expandableListView1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

    }//fin onCreate


    class LoadAllProducts extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(CategoriesGet.this);
            pDialog.setMessage("Cargando categorias. Por favor espere...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(false);
            pDialog.show();
        }

        /**
         * obteniendo todos las categorias
         * */
        protected String doInBackground(String... args) {
            List params = new ArrayList();
            JSONObject json = jParser.makeHttpRequest(url_all_categories, "GET", params);


            Log.d("All categories: ", json.toString());

            try {
                int success = json.getInt(TAG_SUCCESS);

                if (success == 1) {
                    products = json.getJSONArray(TAG_PRODUCTS);


                    for (int i = 0; i < products.length(); i++) {
                        JSONObject c = products.getJSONObject(i);


                        String id = c.getString(TAG_ID);
                        String name = c.getString(TAG_NOMBRE);


                        HashMap map = new HashMap();

                        map.put(TAG_ID, id);
                        map.put(TAG_NOMBRE, name);

                        categorielist.add(map);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }


        protected void onPostExecute(String file_url) {
            pDialog.dismiss();
            runOnUiThread(new Runnable() {
                public void run() {
                    ListAdapter adapter = new SimpleAdapter(
                            CategoriesGet.this,
                            categorielist,
                            R.layout.content_segunda,
                            new String[] {
                                    TAG_ID,
                                    TAG_NOMBRE,
                            },
                            new int[] {
                            R.id.expandableListView1,
                    });
                    lista.setAdapter(adapter);
                }
            });
        }
    }

    public ArrayList<HashMap<String, String>> getContext(){
        return categorielist;
    }
}
