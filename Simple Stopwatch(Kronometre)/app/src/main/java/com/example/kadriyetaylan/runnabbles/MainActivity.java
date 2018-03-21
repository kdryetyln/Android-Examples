package com.example.kadriyetaylan.runnabbles;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Runnables ile belli bir periyot içinde aynı kodu devamlı tekrarlayabiliyoruz ve bunda bir zaman sınırlaması koymaya gerek yok

public class MainActivity extends AppCompatActivity {

    TextView tw;
    int num;
    Handler handler;
    Runnable run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        tw=(TextView) findViewById(R.id.textview1);
        num=0;
        handler=new Handler();
        run=new Runnable() {
            @Override
            public void run() {
                tw.setText("Zaman : "+num);
                num++;
                tw.setText("Zaman : "+num);
                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);
    }

    public void stop(View view){
        handler.removeCallbacks(run);//run ı sonlandır. yani sayacı
        num=0;
        tw=(TextView) findViewById(R.id.textview1);
        tw.setText("Zaman : "+num);

    }
}
