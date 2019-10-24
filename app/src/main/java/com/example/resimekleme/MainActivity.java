package com.example.resimekleme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btntas,btnmakas,btnkagit;
    public ImageView ivtas;
    TextView txt,txtcomputer;

    int sayi=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btntas=(Button)findViewById(R.id.idbtntas);
        btnkagit=(Button)findViewById(R.id.idbtnkagit);
        btnmakas=(Button)findViewById(R.id.idbtnmakas);

        ivtas=(ImageView)findViewById(R.id.idtas);

        txt=(TextView)findViewById(R.id.idtxtsonuc);
        txtcomputer=(TextView)findViewById(R.id.idtxtcomputer);



        final int[] resimler={R.drawable.cc,R.drawable.bb,R.drawable.asdsadasd};

        btntas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                sayi=rnd.nextInt(3);

                ivtas.setImageResource(resimler[sayi]);
                ivtas.setVisibility(View.VISIBLE);

                if (sayi==0)
                {
                    txtcomputer.setText("BENİM SECIMIM TAS");
                    txt.setText("BERABERE");

                }
                else if(sayi==1)
                {
                    txtcomputer.setText("BENİM SECIMIM KAGIT");
                    txt.setText("KAYBETTINIZ");

                }
                else
                {
                    txtcomputer.setText("BENİM SECIMIM MAKAS");
                    txt.setText("KAZANDINIZ");
                }




            }
        });

        btnkagit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                sayi=rnd.nextInt(3);

                ivtas.setImageResource(resimler[sayi]);
                ivtas.setVisibility(View.VISIBLE);
                if (sayi==0)
                {
                    txtcomputer.setText("BENİM SECIMIM TAS");
                    txt.setText("KAZANDINIZ");

                }
                else if(sayi==1)
                {
                    txtcomputer.setText("BENİM SECIMIM KAGIT");
                    txt.setText("BERABERE");

                }
                else
                {
                    txtcomputer.setText("BENİM SECIMIM MAKAS");
                    txt.setText("KAYBETTINIZ");
                }

            }
        });

        btnmakas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                sayi=rnd.nextInt(3);

                ivtas.setImageResource(resimler[sayi]);
                ivtas.setVisibility(View.VISIBLE);
                if (sayi==0)
                {
                    txtcomputer.setText("BENİM SECIMIM TAS");
                    txt.setText("KAYBETTINIZ");

                }
                else if(sayi==1)
                {
                    txtcomputer.setText("BENİM SECIMIM KAGIT");
                    txt.setText("KAZANDINIZ");

                }
                else
                {
                    txtcomputer.setText("BENİM SECIMIM MAKAS");
                    txt.setText("BERABERE");
                }

            }
        });



    }




    }

