package com.example.saveme2;




import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.os.Bundle;

import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView floorTxt = findViewById(R.id.floorTxt);
        String address = getIntent().getStringExtra("address");
        String floor = getIntent().getStringExtra("floor");


        //myLocation.setText(floor);
        TextView locationTxt = findViewById(R.id.locationTxt);
        locationTxt.setText(address);
        floorTxt.setText(floor + "층");

    }
}