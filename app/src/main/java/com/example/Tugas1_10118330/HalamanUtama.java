package com.example.Tugas1_10118330;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HalamanUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        TextView MainActivity = (TextView)findViewById(R.id.txkeluar);
        MainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(HalamanUtama.this, MainActivity.class);
                startActivity(o);
            }
        });
        TextView HalamanUtama = (TextView)findViewById(R.id.txprofile);
        HalamanUtama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(HalamanUtama.this, Profile.class);
                startActivity(p);
            }
        });
    }
}