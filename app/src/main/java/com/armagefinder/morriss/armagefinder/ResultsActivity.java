package com.armagefinder.morriss.armagefinder;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class ResultsActivity extends AppCompatActivity {
    TextView ArmAge;
    TextView Diagnosis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        ArmAge = (TextView)findViewById(R.id.ArmAge);
        String Age = Integer.toString(MainActivity.age);
        Diagnosis = (TextView)findViewById(R.id.Diagnosis);
        ArmAge.setText(Age);
        if (MainActivity.age <= 30)
        {
            Diagnosis.setText("Your arm is fine.");
        }
        else if (MainActivity.age > 30 && MainActivity.age <= 40)
        {
            Diagnosis.setText("I bet you're starting to notice the pain.");
        }
        else if (MainActivity.age > 40 && MainActivity.age <= 45)
        {
            Diagnosis.setText("Enjoy the last few years of your arm's life.");
        }
        else if (MainActivity.age > 45 && MainActivity.age <= 55)
        {
            Diagnosis.setText("The end is near...");
        }
        else if (MainActivity.age > 55 && MainActivity.age <= 65)
        {
            Diagnosis.setText("Hang up the cleats and get to a doctor ASAP!");
        }
        else if (MainActivity.age > 65)
        {
            Diagnosis.setText("Are you sure your arm is still actually attached to your body?");
        }
    }

    public void onRestartButtonClicked(View view)
    {
        Intent restart = new Intent(this, MainActivity.class);
        startActivity(restart);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_results, menu);
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
