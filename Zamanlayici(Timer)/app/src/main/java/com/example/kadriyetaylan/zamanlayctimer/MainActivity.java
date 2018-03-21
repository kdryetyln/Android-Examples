package com.example.kadriyetaylan.zamanlayctimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(11000,1000)//milisaniye cinsinden istiyor. 1 sn =1000 ms
        {
            TextView tw=(TextView) findViewById(R.id.textview1);

            @Override
            public void onTick(long finish_sn) {//yukarıda countDownInterval de belirttiğimiz 1000ms =1sn de bir ne yapılacaksa bu fonksiyonda yazılır

                tw.setText("Kalan zaman : "+finish_sn/1000);
                //100e bölüyoruz çünkü saniye cinsinden görmek istiyoruz.

            }

            @Override
            public void onFinish() {//sayaç bitince ne yapılacaksa burada yazılır
                Toast.makeText(getApplicationContext(),"Zamanın doldu.\n Time's Done",Toast.LENGTH_LONG).show();
                //toast ile mesaj paneli oluşturuyoruz
                tw.setText("Kalan zaman : 0");
            }
        }.start();//zamanlayıcı başlat
    }
}
