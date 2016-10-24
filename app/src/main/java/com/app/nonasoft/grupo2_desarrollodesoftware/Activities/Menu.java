package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.nonasoft.grupo2_desarrollodesoftware.MainActivity;
import com.app.nonasoft.grupo2_desarrollodesoftware.R;


public class Menu extends Activity {

    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,MainActivity.class);
                startActivity(intent);
                System.exit(0);
            }
        });

    }


}
