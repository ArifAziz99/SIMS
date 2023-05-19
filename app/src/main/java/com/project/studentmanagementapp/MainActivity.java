package com.project.studentmanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    public int counter;
//    TextView timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView title = (TextView) findViewById(R.id.title);
//        TextView sub_title = (TextView) findViewById(R.id.sub_title);
//        TextView receive = (TextView) findViewById(R.id.receive);
//        EditText otp1 = (EditText) findViewById(R.id.otp1);
//        EditText otp2 = (EditText) findViewById(R.id.otp2);
//        EditText otp3 = (EditText) findViewById(R.id.otp3);
//        EditText otp4 = (EditText) findViewById(R.id.otp4);
//        Button submitBtn = (Button) findViewById(R.id.submitBtn);
//        timer = (TextView) findViewById(R.id.timer);


//   ----------------SUBMIT BUTTON-----------------------------
//        submitBtn.setOnClickListener(new View.OnClickListener(){
//            @override
//            public void onClick(View v){
//                Intent myIntent = new Intent(CurrentActivity.this, NextActivity.class);
//        myIntent.putExtra("key", value); //Optional parameters
//        CurrentActivity.this.startActivity(myIntent);
//            }
//        });

//        countDownTimer logic
//        timer = (TextView) findViewById (R.id.timer);
        {

//  -----------------resend text clickable-----------------------
//        TextView timer=(TextView)findViewById(R.id.resend);
//        resend.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                //perform your action here
//            }
//        });
    }
//-------------------TIMER---------------------------------------
//        void startTimer() {
//            timer = (TextView) findViewById(R.id.timer);
//            timer = new CountDownTimer(30000, 1000) {
//                public void onTick(long millisUntilFinished) {
//                    timer.setText("seconds remaining: " +String.valueOf(millisUntilFinished/1000));
//                }
//                public void onFinish() {
//                    timer.setText("Re send OTP!");
//                    resend.setEnabled(true);
//                }
//            };
//            timer.start();
//        }

}

    public void myMethod(View view) {
    }

//    public void myMethod(View view) {
//        Intent myIntent = new Intent(CurrentActivity.this, NextActivity.class);
//        myIntent.putExtra("key", value); //Optional parameters
//        CurrentActivity.this.startActivity(myIntent);
//    }
}

