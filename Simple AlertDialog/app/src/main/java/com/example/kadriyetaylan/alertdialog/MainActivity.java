package com.example.kadriyetaylan.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("SAVE");//başlık
        alert.setMessage("Are you sure ?");//gösterilecek olan mesaj
        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                //yes e tıklarsa kullanıcı ekrana saved yazacak
            }
        });
        alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Not Saved", Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}
