package com.example.jhonny.actividad;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup container;
    Button boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        container = (RadioGroup) findViewById(R.id.radiobut);
        boton2 = (Button) findViewById(R.id.button2);
        boton2.setOnClickListener(this);
        container.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(checkedId == R.id.radioButton1){
                    Toast.makeText(getApplicationContext(), "usted oprimio el boton 1", Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.radioButton2){
                    Toast.makeText(getApplicationContext(), "usted oprimio el boton 2", Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.radioButton3){
                    Toast.makeText(getApplicationContext(), "usted oprimio el boton 3", Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.radioButton4){
                    Toast.makeText(getApplicationContext(), "usted oprimio el boton 4", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public void onClick(View v) {
        super.onBackPressed();
    }
}
