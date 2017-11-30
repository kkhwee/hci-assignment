package com.example.cprhealthbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainPage extends AppCompatActivity {

    int[] intid= {R.drawable.cpr_steps,R.drawable.step_1, R.drawable.step_2, R.drawable.step_3, R.drawable.step_4, R.drawable.step_5, R.drawable.step_6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        // initiate a ListView
        ListView listView = (ListView) findViewById(R.id.listView);
        // set the adapter to fill the data in ListView
        CustomAdaptor customAdapter = new CustomAdaptor(getApplicationContext(), intid);
        listView.setAdapter(customAdapter);
    }
//
    public void start_action(View view) {
        Intent i=new Intent(MainPage.this,Instr_Chest_Compression.class);
        startActivity(i);
    }
}
