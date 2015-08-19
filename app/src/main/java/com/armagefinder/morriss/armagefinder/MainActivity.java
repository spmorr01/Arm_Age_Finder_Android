package com.armagefinder.morriss.armagefinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
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
    }

    public void onCheckboxClicked(View view) {

        switch(view.getId()) {

            case R.id.PCheckBox:
                PPCheckBox.setChecked(false);
                DPCheckBox.setChecked(false);
                Intent pitcher = new Intent(this, PitcherActivity.class);
                startActivity(pitcher);
                break;

            case R.id.PPCheckBox:

                PCheckBox.setChecked(false);
                DPCheckBox.setChecked(false);
                Intent positionPlayer = new Intent(this, PositionPlayerActivity.class);
                startActivity(positionPlayer);
                break;

            case R.id.DPCheckBox:

                PCheckBox.setChecked(false);
                PPCheckBox.setChecked(false);

                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
