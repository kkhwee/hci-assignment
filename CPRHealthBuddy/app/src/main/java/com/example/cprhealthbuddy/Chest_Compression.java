package com.example.cprhealthbuddy;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.os.Vibrator;

public class Chest_Compression extends AppCompatActivity implements SensorEventListener{

    private TextView xText, yText, zText;
    private Sensor mySensor;
    private SensorManager SM;
    private static int compressioncount = 0;
    private Vibrator v;
    private Animation an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest__compression);

        //CREATE SENSOR MANAGER
        SM = (SensorManager)getSystemService(SENSOR_SERVICE);

        //ACCELERATOR SENSOR
        mySensor = SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //REGISTER SENSOR LISTENER
        SM.registerListener(this, mySensor, SensorManager.SENSOR_DELAY_NORMAL);

        //CREATE VIBRATOR SERVICE
        v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        //CREATE ANIMATION
        an = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);

        //ASSSIGN TEXT VIEW
        zText = (TextView)findViewById(R.id.zText);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        //NOT IN USE
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
//        xText.setText("X: " + event.values[0]);
//        yText.setText("Y: " + event.values[1]);
        float z = event.values[2] ;
        if(Math.round(z) > 11 )
        {
            zText.setText(Integer.toString(++compressioncount));
            zText.startAnimation(an);
            v.vibrate(500);
        }
    }

    public void next(View v){
        Intent i=new Intent(Chest_Compression.this,Instr_mouth_to_mouth.class);
        startActivity(i);
    }
}
