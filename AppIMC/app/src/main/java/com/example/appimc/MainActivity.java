package com.example.appimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    final float[] imc = new float[1];
    Button btnCalcular = (Button) findViewById(R.id.btnImc);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText peso = (EditText) findViewById(R.id.peso);
            EditText altura = (EditText) findViewById(R.id.altura);
            TextView imcResult = (TextView) findViewById(R.id.imcResult);
            TextView textDescricao = (TextView) findViewById(R.id.imcResultD);
            int peso2= Integer.parseInt(peso.getText().toString());
            float altura2 = Float.parseFloat(altura.getText().toString());
            imc[0] = peso2 / (altura2*altura2);
            if(imc[0]<18.5){
                imcResult.setText(imc[0]+"");
                textDescricao.setText("Muito Baixo Peso");
            } else{
                if(imc[0]<18.49){
                    imcResult.setText(imc[0]+"");
                    textDescricao.setText("Abaixo Peso");
                } else{
                    if(imc[0]<24.99){
                        imcResult.setText(imc[0]+"");
                        textDescricao.setText("Peso Normal");
                    } else{
                        if(imc[0]<29.99){
                            imcResult.setText(imc[0]+"");
                            textDescricao.setText("Acima do Peso");
                        } else{
                            if(imc[0]<34.99){
                                imcResult.setText(imc[0]+"");
                                textDescricao.setText("Obesidade I");
                            } else{
                                if(imc[0]<39.99){
                                    imcResult.setText(imc[0]+"");
                                    textDescricao.setText("Obesidade II");
                                } else{
                                    if(imc[0]>40){
                                        imcResult.setText(imc[0]+"");
                                        textDescricao.setText("Obesidade III");
                                    }



                                }


                            }


                        }


                    }



                }


            }


        }


    }
        );}
}