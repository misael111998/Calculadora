package com.example.misael.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnigual,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnsuma,btnresta,btndivision,btnmultiplicacion,btnclean,btnborrar,btnpunto;
    TextView Resultado;
    double resultado;
    String operador,mostrar,reserva;
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
        btnclean=findViewById(R.id.clean);
        btnborrar=findViewById(R.id.borrar);
        btnpunto=findViewById(R.id.punto);
        btnigual=findViewById(R.id.igual);

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"0";
                Resultado.setText(mostrar);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"1";
                Resultado.setText(mostrar);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"2";
                Resultado.setText(mostrar);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"3";
                Resultado.setText(mostrar);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"4";
                Resultado.setText(mostrar);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"4";
                Resultado.setText(mostrar);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"5";
                Resultado.setText(mostrar);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"6";
                Resultado.setText(mostrar);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"7";
                Resultado.setText(mostrar);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"8";
                Resultado.setText(mostrar);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"9";
                Resultado.setText(mostrar);
            }
        });
        btnsuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva=Resultado.getText().toString();
                operador="+";
                Resultado.setText("");
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva=Resultado.getText().toString();
                operador="-";
                Resultado.setText("");
            }
        });
        btnmultiplicacion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva=Resultado.getText().toString();
                operador="*";
                Resultado.setText("");
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva=Resultado.getText().toString();
                operador="/";
                Resultado.setText("");
            }
        });
        btnpunto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+".";
                Resultado.setText(mostrar);
            }
        });
        btnclean.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar="";
                Resultado.setText(mostrar);
                reserva="";
                operador="";
            }
        });
        btnborrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar =Resultado.getText().toString();
                mostrar=mostrar.substring(0,mostrar.length()-1);
                Resultado.setText(mostrar);
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar =Resultado.getText().toString();
                mostrar=mostrar+1;
                switch (operador){
                    case "-":{
                        resultado=Double.parseDouble(reserva)-Double.parseDouble(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                    }break;
                    case "+":{
                        resultado=Double.parseDouble(reserva)+Double.parseDouble(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                    }break;
                    case "/":{
                        resultado=Double.parseDouble(reserva)/Double.parseDouble(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                    }break;
                    case "*":{
                        resultado=Double.parseDouble(reserva)*Double.parseDouble(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                    }break;
                }
            }
        });


    }


}
