package com.isoft.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2,t3,tres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.t1);
        t2 = (EditText) findViewById(R.id.t2);
        t3 = (EditText) findViewById(R.id.t3);
    }



    public void calcular(View view) {
        //Toast.makeText(this,"hola",Toast.LENGTH_SHORT).show();
        int n1=Integer.parseInt(t1.getText().toString());
        int n2=Integer.parseInt(t2.getText().toString());
        int n3=Integer.parseInt(t3.getText().toString());
        tres = (EditText) findViewById(R.id.tres);
        if (n1 > n2) {
            if (n1 > n3) {
                tres.setText(n1+"");
            } else {
                tres.setText(n3+"");
            }
        } else if (n2 > n3) {
            tres.setText(n2+"");
        } else {
            tres.setText(n3+"");
        }
    }

}
