package com.example.peso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int [] imagens = {R.drawable.downloadmen,R.drawable.download};
        final float[] alt = new float[1];
        final float[] pesoIdeal = new float[1];
        final RadioButton mas = (RadioButton) findViewById(R.id.masculino);
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.downloadmen);
        }
        });
        final RadioButton fem = (RadioButton) findViewById(R.id.feminino);
        fem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.download);

            }

        });

        Button btcalcular = (Button) findViewById(R.id.btcalcular);
        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtAltura = (EditText) findViewById(R.id.edtAltura);
                TextView txtPeso = (TextView) findViewById(R.id.txtPeso);
                float altura = Float.parseFloat(edtAltura.getText().toString());
                alt[0] = altura * 100;
                if(mas.isChecked()==true){
                    pesoIdeal[0] = (alt[0] - 100) - (alt[0] - 150)/4;
                    txtPeso.setText(pesoIdeal[0] +"");
                } else if (fem.isChecked()==true){
                    pesoIdeal[0] = (alt[0] - 100) - (alt[0] - 150)/2;
                    txtPeso.setText(pesoIdeal[0]+"");
                }

            }
        });





            }
}
