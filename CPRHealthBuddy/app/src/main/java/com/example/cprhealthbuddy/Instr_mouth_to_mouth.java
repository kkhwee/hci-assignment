package com.example.cprhealthbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Instr_mouth_to_mouth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mouth_to_mouth_step);
    }

    public void next(View view){
        Intent i=new Intent(Instr_mouth_to_mouth.this,mouth_to_mouth.class);
        startActivity(i);
    }
}
