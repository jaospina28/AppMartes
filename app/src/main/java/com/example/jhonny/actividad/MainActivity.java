package com.example.jhonny.actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    TextView label1;
    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label1 = (TextView) findViewById(R.id.label1);
        boton1 = (Button) findViewById(R.id.button);
        boton1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label1 = (TextView) findViewById(R.id.label1);
        boton1 = (Button) findViewById(R.id.button);
        boton1.setOnClickListener(this);*/

        label1.setText("Usted a cambiado el texto oprimiendo el boton");
        //cambiar de actividad
        Intent cambioActi = new Intent(this, Main2Activity.class);
        startActivity(cambioActi);

    }
}
