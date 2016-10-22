package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

public class IntroductionTwoActivity extends Activity {


    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_two);

        btnNext = (Button) findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btnNext = new Intent(IntroductionTwoActivity.this, IntroductionThreeActivity.class);
                startActivity(btnNext);
            }
        });

    }
}
