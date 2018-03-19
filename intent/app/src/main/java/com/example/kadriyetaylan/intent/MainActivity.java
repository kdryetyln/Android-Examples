package com.example.kadriyetaylan.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText kullanicigirisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeAktivity(View view)
    {
        kullanicigirisi=(EditText) findViewById(R.id.editText);
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);

        intent.putExtra("input",kullanicigirisi.getText().toString());
        //kullanıcıgirişi metnini al stringe çevir

        startActivity(intent);

    }
}
