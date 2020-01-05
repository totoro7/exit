package com.example.saveme2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String text = "전달 받은 값은";
        int id = 0;



        // Bundle extras = getIntent().getExtras();
        //        //String floor = extras.getString("floor");
        //String address = extras.getString("address");


        Bundle extras = getIntent().getExtras();
        String floor = extras.getString("floorid");
        /*if (extras == null) {
            text = "값을 전달 받는데 문제 발생";
        }
        else
            id = extras.getInt("notificationId");*/

        TextView textView = findViewById(R.id.textView);
        textView.setText(floor);






        // TextView addressTxt = findViewById(R.id.addressTxt);
        //final String address = getIntent().getStringExtra("addressGo");
        //final String floor = getIntent().getStringExtra("myfloor");

        //addressTxt.setText(address);


           /*if (extras == null) {
            text = "값을 전달 받는데 문제 발생";
        }
        else
            id = extras.getInt("notificationId");*/

        // TextView floorTxt = (TextView) findViewById(R.id.floorTxt);
        // floorTxt.setText(floor +"층 화재 발생 대피하세요");

        NotificationManager notificationManager =  (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        //노티피케이션 제거
        notificationManager.cancel(id);


        /*
        Button homeBtn = findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(ResultActivity.this,HomeActivity.class);
                //intent.putExtra("floor",floor);
                //intent.putExtra("address",address);

                //  startActivity(intent);
            }
        });
*/
    }
}