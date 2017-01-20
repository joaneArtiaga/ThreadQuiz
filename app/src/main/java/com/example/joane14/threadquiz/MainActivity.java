package com.example.joane14.threadquiz;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button trueBtn, falseBtn;
    TextView etCounter, etBackground, etColorText, etScore;
    Switch cntrlSwitch;
    String bgColor;
    int score;
    boolean correct;
//    boolean choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score=0;
        trueBtn = (Button) findViewById(R.id.btnTrue);
        falseBtn = (Button) findViewById(R.id.btnFalse);
        bgColor = "";
        etCounter=(TextView) findViewById(R.id.etCounter);
        etBackground=(TextView) findViewById(R.id.background);
        etColorText=(TextView) findViewById(R.id.colorText);
        etScore=(TextView) findViewById(R.id.etScore);

        cntrlSwitch = (Switch) findViewById(R.id.switch14);

            cntrlSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if(b==true){
                        startTimer(200000);
                        trueBtn.setEnabled(true);
                        falseBtn.setEnabled(true);
                    Log.d("afsadfsa", "gagasdsa");
                        Random rand = new Random();
                        int numBGColor = rand.nextInt(6-1) + 1;
                        int numColText = rand.nextInt(6-1) + 1;
                        Log.d("dili musolod", "kapoy kaayo");
                        String lala = Integer.toString(numBGColor);
                        Log.d("random",lala);
                        if(numBGColor==1){
                            etBackground.setBackgroundColor(Color.BLUE);
                            bgColor="Blue";
                        }
                        else if(numBGColor==2){
                            etBackground.setBackgroundColor(Color.GREEN);
                            bgColor="Green";
                        }
                        else if(numBGColor==3){
                            etBackground.setBackgroundColor(Color.RED);
                            bgColor="Red";
                        }
                        else if(numBGColor==4){
                            etBackground.setBackgroundColor(Color.YELLOW);
                            bgColor="Yellow";
                        }
                        else if(numBGColor==5){
                            etBackground.setBackgroundColor(Color.MAGENTA);
                            bgColor="Magenta";
                        }
                        if(numColText==1){
                            etColorText.setText("Blue");
                            if(bgColor=="Blue"){
                                correct=true;
                            }
                            else{
                                correct=false;
                            }
                        }
                        else if(numColText==2){
                            etColorText.setText("Green");
                            if(bgColor=="Green"){
                                correct=true;
                            }
                            else{
                                correct=false;
                            }
                        }
                        else if(numColText==3){
                            etColorText.setText("Red");
                            if(bgColor=="Red"){
                                correct=true;
                            }
                            else{
                                correct=false;
                            }
                        }
                        else if(numColText==4){
                            etColorText.setText("Yellow");
                            if(bgColor=="Yellow"){
                                correct=true;
                            }
                            else{
                                correct=false;
                            }
                        }
                        else if(numColText==5){
                            etColorText.setText("Magenta");
                            if(bgColor=="Magenta"){
                                correct=true;
                            }
                            else{
                                correct=false;
                            }
                        }
                        String strScore = "";
                        if(correct){
                            score++;
                            etScore.setText(""+score);
                        }else{
                            score--;
                            etScore.setText(""+score);
                        }

                    }
                    else{
                        trueBtn.setEnabled(false);
                        falseBtn.setEnabled(false);
                    }
//                    Log.d("afsadfsa", "gagasdsa");
//                    if(b){
//                        Random rand = new Random();
//                        int numBGColor = rand.nextInt(6-1) + 1;
//                        int numColText = rand.nextInt(6-1) + 1;
//                        changeBGColor(numBGColor);
//                        changeColorText(numColText);
//
////            trueBtn.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View view) {
////                    choice = true;
////                }
////            });
////
////            falseBtn.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View view) {
////                    choice=false;
////                }
////            });
//
//                    }
//                    else{
//
//                    }
                }
            });
    }
    private void startTimer(long time){
        CountDownTimer counter = new CountDownTimer(10000, 1000){
            public void onTick(long millisUntilDone){

                Log.d("counter_label", "Counter text should be changed");
                etCounter.setText(""+Math.round(millisUntilDone*0.001));
            }

            public void onFinish() {
                etCounter.setText("Over!");

            }
        }.start();
    }


//        trueBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                 choice = true;
//            }
//        });
//
//        falseBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                choice=false;
//            }
//        });


//    public void onCheckedChanged(CompoundButton switch14, boolean isChecked){
//        if(isChecked){
//            Random rand = new Random();
//            int numBGColor = rand.nextInt(6-1) + 1;
//            int numColText = rand.nextInt(6-1) + 1;
//            changeBGColor(numBGColor);
//            changeColorText(numColText);
//
////            trueBtn.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View view) {
////                    choice = true;
////                }
////            });
////
////            falseBtn.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View view) {
////                    choice=false;
////                }
////            });
//
//        }
//        else{
//
//        }
//    }



    public void changeColorText(int num){
        if(num==1){
            etColorText.setText("Blue");
        }
        else if(num==2){
            etColorText.setText("Green");
        }
        else if(num==3){
            etColorText.setText("Red");
        }
        else if(num==4){
            etColorText.setText("Yellow");
        }
        else if(num==5){
            etColorText.setText("Magenta");
        }
        else{
            etColorText.setText("Gray");
        }
    }


}
