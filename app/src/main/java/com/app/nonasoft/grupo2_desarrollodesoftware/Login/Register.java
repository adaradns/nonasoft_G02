package com.app.nonasoft.grupo2_desarrollodesoftware.Login;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

<<<<<<< HEAD
import com.app.nonasoft.grupo2_desarrollodesoftware.Activities.IntroductionOneActivity;
=======
>>>>>>> test
import com.app.nonasoft.grupo2_desarrollodesoftware.R;

import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> test
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adara on 9/22/2016.
 */
public class Register  extends Activity implements View.OnClickListener {
    private EditText user, pass;
    private Button btnRegistrar;
    private TextView txtName, txtPassword;
    private CheckBox showpassword;

    // Progress Dialog
    private ProgressDialog pDialog;

    // JSON parser class
    JSONParser jsonParser = new JSONParser();

    //si lo trabajan de manera local en xxx.xxx.x.x va su ip local
    // private static final String REGISTER_URL = "http://xxx.xxx.x.x:1234/cas/register.php";

    private static final String REGISTER_URL = "http://nonasoftdev.com/login/register.php";

    private static final String TAG_SUCCESS = "success";
    private static final String TAG_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        //EditText
        user = (EditText)findViewById(R.id.username);
        pass = (EditText)findViewById(R.id.password);
     //   confirmpass = (EditText) findViewById(R.id.confirmpass);

        //set textColor
        user.setHintTextColor(getResources().getColor(R.color.grey));
        pass.setHintTextColor(getResources().getColor(R.color.grey));
        //confirmpass.setHintTextColor(getResources().getColor(R.color.grey));

        //Set typePassword
        pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
      //  confirmpass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        //TextView
        txtName = (TextView) findViewById(R.id.txtName);
        txtPassword = (TextView) findViewById(R.id.txtPassword);
     //   txtConfirmpass = (TextView) findViewById(R.id.txtConirmpass);

        //Checkbox
        showpassword = (CheckBox) findViewById(R.id.showpassword);

        //Buttons
        btnRegistrar = (Button)findViewById(R.id.registro);
        btnRegistrar.setOnClickListener(this);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setText("");
                txtName.setVisibility(View.VISIBLE);
                txtPassword.setVisibility(View.VISIBLE);
              //  txtConfirmpass.setVisibility(View.VISIBLE);

            }
        });

        showpassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    pass.setTransformationMethod(null);
                //    confirmpass.setTransformationMethod(null);
                    showpassword.setText("OCULTAR CONTRASEÑA");
                }else{
                    showpassword.setText("VER CONTRASEÑA");
                    pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                //    confirmpass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });


        //validator
        pass.addTextChangedListener(new Validator(pass, user) {
            @Override
            public void validate(EditText pass, EditText user, String textUser, String textPass) {
                //Reglas de validacion
                if(textUser.length() < 5){
                    user.setError("El nombre es demasiado corto");
                }
                if( textPass.length() < 7 ){
                    pass.setError( "La contraseña es demasiado corta" );
                }
            }
        });

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        new CreateUser().execute();

<<<<<<< HEAD


=======
>>>>>>> test
    }

    class CreateUser extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(Register.this);
            pDialog.setMessage("Creando usuario...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... args) {
            // TODO Auto-generated method stub
            int success;
            String username = user.getText().toString();
            String password = pass.getText().toString();


<<<<<<< HEAD

=======
>>>>>>> test
            try {
                // Parametros de construccion
                List params = new ArrayList();
                params.add(new BasicNameValuePair("username", username));
                params.add(new BasicNameValuePair("password", password));

<<<<<<< HEAD

=======
>>>>>>> test
                //registrar los datos del usuario
                JSONObject json = jsonParser.makeHttpRequest(
                        REGISTER_URL, "POST", params);

                //json response
                Log.d("Registrando...", json.toString());

                // json success element
                success = json.getInt(TAG_SUCCESS);

                 if (success == 1) {
                    Log.d("Usuario creado", json.toString());
                    finish();
                    return json.getString(TAG_MESSAGE);
                }else{
                    Log.d("Fallo en el registro!", json.getString(TAG_MESSAGE));
                    return json.getString(TAG_MESSAGE);

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;

        }

        protected void onPostExecute(String file_url) {
            pDialog.dismiss();
            if (file_url != null){
                Toast.makeText(Register.this, file_url, Toast.LENGTH_LONG).show();
<<<<<<< HEAD
=======

                finish();
>>>>>>> test
            }
        }
    }
}
