package com.example.cprhealthbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EndPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_page);
    }
    public void home(View view){
        Intent i=new Intent(EndPage.this,MainPage.class);
        startActivity(i);
    }
}
