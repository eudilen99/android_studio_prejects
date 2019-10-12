package com.example.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import javax.microedition.khronos.egl.EGLDisplay;

public class MainActivity extends AppCompatActivity {

    private Button btnOK;
    private EditText edtText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int [] iamgens = {R.drawable.download,R.drawable.downloadd,R.drawable.imagesax};

        final int[] idade = new int[1];

    Button  btnOK = (Button) findViewById(R.id.btnOK);
    btnOK.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText dataAno = (EditText) findViewById(R.id. dataAno);
            TextView textResult = (TextView) findViewById(R.id.textResult);
            TextView textResult2 = (TextView) findViewById(R.id.textResult2);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);


            int ano = Integer.parseInt(dataAno.getText().toString());
            idade[0] = -ano - (-2019);

            if (idade[0] <= 12){
                textResult.setText(idade[0] +"");
                textResult2.setText("Criança");
                imageView.setImageResource(R.drawable.download);
            }
                if (idade[0] >12 && idade[0] <= 18){
                    textResult.setText(idade[0] +"");
                    textResult2.setText("Adolecente");
                    imageView.setImageResource(R.drawable.downloadd);
                    }
                    if (idade[0] > 18){
                        textResult.setText(idade[0] +"");
                        textResult2.setText("Adulto");
                        imageView.setImageResource(R.drawable.imagesax);
                    }

        }
    });
    }}



