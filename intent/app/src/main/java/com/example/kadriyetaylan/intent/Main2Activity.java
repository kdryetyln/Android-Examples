package com.example.kadriyetaylan.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv2=(TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();

        String str=intent.getStringExtra("input");
        tv2.setText(str);

    }

    public void changescreen(View view)
    {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }
}
