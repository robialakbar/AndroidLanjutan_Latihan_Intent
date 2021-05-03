package com.robialakbar.latihan_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//tambahkan import ini
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // tambahkan View ini juga
    public void pindah(View View){
        Intent i = new Intent(this, Tujuan.class);
        startActivity(i);
    }
}