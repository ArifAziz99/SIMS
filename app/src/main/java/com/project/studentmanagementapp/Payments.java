package com.project.studentmanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Payments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);

//        TextView title = (TextView) findViewById(R.id.title4);
//        ImageView menu = (ImageView) findViewById(R.id.menu);
//        androidx.cardview.widget.CardView card1 = (androidx.cardview.widget.CardView) findViewById(R.id.card1);  //cardview me typo nhi h
//        androidx.cardview.widget.CardView card2 = (androidx.cardview.widget.CardView) findViewById(R.id.card2);
//        androidx.cardview.widget.CardView card3 = (androidx.cardview.widget.CardView) findViewById(R.id.card3);
//        androidx.cardview.widget.CardView card4 = (androidx.cardview.widget.CardView) findViewById(R.id.card4);
//        androidx.cardview.widget.CardView card5 = (androidx.cardview.widget.CardView) findViewById(R.id.card5);
//        androidx.cardview.widget.CardView card6 = (androidx.cardview.widget.CardView) findViewById(R.id.card6);
    }
    public void P1_bay(View view) {
        Toast.makeText(this, "You have clicked P1", Toast.LENGTH_LONG).show();
    }
}