package com.app.nonasoft.grupo2_desarrollodesoftware.Login;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.InputType;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.app.nonasoft.grupo2_desarrollodesoftware.Activities.IntroductionOneActivity;
import com.app.nonasoft.grupo2_desarrollodesoftware.R;

import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adara on 9/22/2016.
 */
public class Login extends Activity implements View.OnClickListener {

    private EditText user, pass;
    private Button btnIngresar, btnRegistrar;
    private TextView txtName, txtPassword;
    private CheckBox showpassword;


    private ProgressDialog pDialog;

    // Clase JSONParser
    JSONParser jsonParser = new JSONParser();



    //La URL con la que se va a conectar si se trabaja de manera local seria: "http://mi ip/carpeta/login.php"
    private static final String LOGIN_URL = "http://nonasoftdev.com/login/login.php";

    // defino las variables para las respuestas del JSON
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // set input fields
        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);

        pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        //set textView
        txtName = (TextView) findViewById(R.id.txtName);
        txtPassword = (TextView) findViewById(R.id.txtPassword);

        // set buttons
        btnIngresar = (Button) findViewById(R.id.login);
        btnRegistrar = (Button) findViewById(R.id.registro);

        // set checkbox
        showpassword = (CheckBox) findViewById(R.id.showpassword);

        // registro listeners
        btnIngresar.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setText("");
                txtName.setVisibility(View.VISIBLE);
                txtPassword.setVisibility(View.VISIBLE);
            }
        });


        showpassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    pass.setTransformationMethod(null);
                    showpassword.setText("OCULTAR CONTRASEÑA");
                }else{
                    showpassword.setText("VER CONTRASEÑA");
                    pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });


    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.login:
                new AttemptLogin().execute();
                break;
            case R.id.registro:
                Intent i = new Intent(this, Register.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }

    class AttemptLogin extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(Login.this);
            pDialog.setMessage("Iniciando sesion...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... args) {
            int success;
            String username = user.getText().toString();
            String password = pass.getText().toString();
            try {
                // Building Parameters
                List params = new ArrayList();
                params.add(new BasicNameValuePair("username", username));
                params.add(new BasicNameValuePair("password", password));

                Log.d("request!", "starting");
                JSONObject json = jsonParser.makeHttpRequest(LOGIN_URL, "POST",
                        params);


                Log.d("Login attempt", json.toString());

                // json success
                success = json.getInt(TAG_SUCCESS);
                if (success == 1) {
                    Log.d("Login correcto!", json.toString());
                    // save user data
                    SharedPreferences sp = PreferenceManager
                            .getDefaultSharedPreferences(Login.this);
                    SharedPreferences.Editor edit = sp.edit();
                    edit.putString("username", username);
                    edit.commit();

                    Intent i = new Intent(Login.this, IntroductionOneActivity.class);
                    finish();
                    startActivity(i);
                    return json.getString(TAG_MESSAGE);
                } else {
                    Log.d("Fallo la sesion!", json.getString(TAG_MESSAGE));
                    return json.getString(TAG_MESSAGE);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;

        }

        protected void onPostExecute(String file_url) {
            if (file_url != null) {
                Toast.makeText(Login.this, file_url, Toast.LENGTH_LONG).show();
            }
        }
    }
}