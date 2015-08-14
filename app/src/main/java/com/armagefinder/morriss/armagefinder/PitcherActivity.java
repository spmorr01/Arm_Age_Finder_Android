package com.armagefinder.morriss.armagefinder;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class PitcherActivity extends AppCompatActivity {
    public EditText Question1EditText;

    boolean check;
    int falseChecks = 0;
    int Question1AnswerInt;
    String Question1AnswerString;
    int Question2Answer;
    int Question3Answer;
    int Question4Answer;
    int Question5Answer;
    int Question6Answer;
    String Question7Answer;
    int Question8Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitcher);


    }

    public void onPCalculateButtonClicked(View view){


        Question1EditText = (EditText)findViewById(R.id.Question1EditText);
        Question1AnswerString = Question1EditText.getText().toString();
        if(tryParseInt(Question1AnswerString))
        {
            Question1AnswerInt = Integer.parseInt(Question1AnswerString);  //We know it is safe to parse.
            MainActivity.age += Question1AnswerInt;
        }

        if (falseChecks == 0) {
            Intent results = new Intent(this, ResultsActivity.class);
            startActivity(results);
        }

        else if(falseChecks > 0){
            falseChecks = 0;
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

            dlgAlert.setMessage("Please enter a valid answer to the questions.");
            dlgAlert.setTitle("Error: Invalid Input");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();

            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        }
    }

    private boolean tryParseInt(String question1AnswerString) {
        try
        {
            Integer.parseInt(question1AnswerString);
            return true;
        } catch(NumberFormatException nfe)
        {
            falseChecks++;
            return false;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pitcher, menu);
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
