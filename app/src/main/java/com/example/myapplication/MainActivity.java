package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView etiqueta1;
    private Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*etiqueta1=(TextView) findViewById(R.id.et1);
        etiqueta2=(TextView) findViewById(R.id.et2);
        boton1=(Button)findViewById(R.id.button);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etiqueta2.setText(etiqueta1.getText());
                etiqueta1.setText(etiqueta1.getText()+"1");


            }
        });*/

        etiqueta1=(TextView) findViewById(R.id.et1Frame);
        boton1=(Button) findViewById(R.id.btnFrameLayout);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etiqueta1.getVisibility()==View.INVISIBLE){
                    etiqueta1.setVisibility(View.VISIBLE);
                }else  if(etiqueta1.getVisibility()== View.VISIBLE){
                    etiqueta1.setVisibility(View.INVISIBLE);

                }
            }
        });


    }

    public void  cambio(View v){


    }
}
