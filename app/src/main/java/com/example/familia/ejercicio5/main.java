package com.example.familia.ejercicio5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class main extends AppCompatActivity {

    private Spinner spinner1;
    private EditText et1, et2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv3 = (TextView) findViewById(R.id.tv3);

        spinner1 = (Spinner) findViewById(R.id.spinner);
        String[] opciones = {"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    //Este método se ejecutará cuando se presione el botón "Operar"
    public void operar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String selec = spinner1.getSelectedItem().toString();
        switch (selec) {
            case "sumar": {
                int suma = nro1 + nro2;
                String resu = String.valueOf(suma);
                tv3.setText(resu);
                break;
            }
            case "restar": {
                int resta = nro1 - nro2;
                String resu = String.valueOf(resta);
                tv3.setText(resu);
                break;
            }
            case "multiplicar": {
                int multi = nro1 * nro2;
                String resu = String.valueOf(multi);
                tv3.setText(resu);
                break;
            }
            case "dividir": {
                int divi = nro1 / nro2;
                String resu = String.valueOf(divi);
                tv3.setText(resu);
                break;
            }
        }
    }
}

