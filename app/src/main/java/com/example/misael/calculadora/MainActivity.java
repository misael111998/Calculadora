package com.example.misael.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnsuma,btnresta,btndivision,btnmultiplicacion,btnclear;
    EditText p;
    char o;
    double op1,op2,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.uno);
        btn2=findViewById(R.id.dos);
        btn3=findViewById(R.id.tres);
        btn4=findViewById(R.id.cuatro);
        btn5=findViewById(R.id.cinco);
        btn6=findViewById(R.id.seis);
        btn7=findViewById(R.id.siete);
        btn8=findViewById(R.id.ocho);
        btn9=findViewById(R.id.nueve);
        btn0=findViewById(R.id.cero);
        btnsuma=findViewById(R.id.suma);
        btnresta=findViewById(R.id.resta);
        btnmultiplicacion=findViewById(R.id.multiplicacion);
        btndivision=findViewById(R.id.division);
        btnclear=findViewById(R.id.clear);
        p=findViewById(R.id.p);
    }


}
