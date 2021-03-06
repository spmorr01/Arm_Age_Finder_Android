package com.armagefinder.morriss.armagefinder;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {
    CheckBox PCheckBox, DPCheckBox, PPCheckBox;
    public static int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PCheckBox = (CheckBox) findViewById(R.id.PCheckBox);
        PPCheckBox = (CheckBox) findViewById(R.id.PPCheckBox);
        DPCheckBox = (CheckBox) findViewById(R.id.DPCheckBox);
        age = 0;
    }

    public void onCheckboxClicked(View view) {

        switch(view.getId()) {

            case R.id.PCheckBox:
                PPCheckBox.setChecked(false);
                DPCheckBox.setChecked(false);
                Intent pitcher = new Intent(this, PitcherActivity.class);
                startActivity(pitcher);
                new CountDownTimer(1000, 1000){
                    public void onFinish(){
                        PCheckBox.setChecked(false);
                    }

                    public void onTick(long millisUntilFinished){
                    }
                }.start();
                break;

            case R.id.PPCheckBox:

                PCheckBox.setChecked(false);
                DPCheckBox.setChecked(false);
                Intent positionPlayer = new Intent(this, PositionPlayerActivity.class);
                startActivity(positionPlayer);
                new CountDownTimer(1000, 1000){
                    public void onFinish(){
                        PPCheckBox.setChecked(false);
                    }

                    public void onTick(long millisUntilFinished){
                    }
                }.start();
                break;

            case R.id.DPCheckBox:

                PCheckBox.setChecked(false);
                PPCheckBox.setChecked(false);
                Intent dualPlayer = new Intent(this, DualPlayerActivity.class);
                startActivity(dualPlayer);
                new CountDownTimer(1000, 1000){
                    public void onFinish(){
                        DPCheckBox.setChecked(false);
                    }

                    public void onTick(long millisUntilFinished){
                    }
                }.start();
                break;
        }
    }
}
