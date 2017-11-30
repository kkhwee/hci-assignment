package com.example.cprhealthbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Instr_Chest_Compression extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instr__chest__compression);
    }
    public void next(View view){
        Intent i=new Intent(Instr_Chest_Compression.this,Chest_Compression.class);
        startActivity(i);
    }
}
