package com.example.kadriyetaylan.catchthesirinesirineyiyakala;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView twskor;
    TextView twzaman;
    ImageView im;
    ImageView im2;
    ImageView im3;
    ImageView im4;
    ImageView im5;
    ImageView im6;
    ImageView im7;
    ImageView im8;
    ImageView im9;
    int skor;
    ImageView [] sirineler;
    Handler handler;
    Runnable runnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GorseliSakla();

        skor=0;

        im=(ImageView)findViewById(R.id.imageView);
        im2=(ImageView)findViewById(R.id.imageView2);
        im3=(ImageView)findViewById(R.id.imageView3);
        im4=(ImageView)findViewById(R.id.imageView4);
        im5=(ImageView)findViewById(R.id.imageView5);
        im6=(ImageView)findViewById(R.id.imageView6);
        im7=(ImageView)findViewById(R.id.imageView7);
        im8=(ImageView)findViewById(R.id.imageView8);
        im9=(ImageView)findViewById(R.id.imageView9);

        sirineler=new ImageView[]{im,im2,im3,im4,im5,im6,im7,im8,im9};

        new CountDownTimer(30000,1000)
        {

            @Override
            public void onTick(long l) {
                twzaman=(TextView) findViewById(R.id.textzaman);
                twzaman.setText("Zaman : "+l/1000);

            }

            @Override
            public void onFinish() {
                twzaman=(TextView) findViewById(R.id.textzaman);
                twzaman.setText("Zaman Doldu :)");
                twzaman.setTextSize(20);
                handler.removeCallbacks(runnable);//kod durur
                for(ImageView images:sirineler)
                {
                    images.setVisibility(View.INVISIBLE);
                }

            }
        }.start();
    }

    public void skorarttir(View view) {
        skor++;
        twskor=(TextView) findViewById(R.id.textskor);
        twskor.setText("Skor : "+skor);
    }

    public void GorseliSakla()//elimdeki görselleri random açıp random saklamak için bu methodu oluşturduk
    {
        handler=new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                for(ImageView images:sirineler)
                {
                    images.setVisibility(View.INVISIBLE);
                }
                Random random=new Random();
                int i=random.nextInt(8-0);
                sirineler[i].setVisibility(View.VISIBLE);
                handler.postDelayed(this,500);
            }
        };
        handler.post(runnable);

    }
}
