package com.armagefinder.morriss.armagefinder;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class PositionPlayerActivity extends AppCompatActivity {
    public EditText Question1EditText;
    public EditText Question2EditText;
    public EditText Question3EditText;
    public EditText Question4EditText;
    public EditText Question5EditText;
    public EditText Question6EditText;
    public EditText Question7EditText;

    int falseChecks = 0;
    int Question1AnswerInt;
    String Question1AnswerString;
    int Question2AnswerInt;
    String Question2AnswerString;
    int Question3AnswerInt;
    String Question3AnswerString;
    int Question4AnswerInt;
    String Question4AnswerString;
    int Question5AnswerInt;
    String Question5AnswerString;
    String Question6AnswerString;
    int Question7AnswerInt;
    String Question7AnswerString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position_player);
    }

    public void onPPCalculateButtonClicked(View view){
        MainActivity.age -= 5;

        Question1EditText = (EditText)findViewById(R.id.Question1EditText);
        Question1AnswerString = Question1EditText.getText().toString();
        if(tryParseIntQuestion1(Question1AnswerString))
        {
            Question1AnswerInt = Integer.parseInt(Question1AnswerString);  //We know it is safe to parse.
            MainActivity.age += Question1AnswerInt;
        }
        else
        {
            falseChecks++;
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Please enter a valid numeric value on question 1.");
            dlgAlert.setTitle("Error: Invalid Integer");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();

            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        }

        Question2EditText = (EditText)findViewById(R.id.Question2EditText);
        Question2AnswerString = Question2EditText.getText().toString();
        if(tryParseIntQuestion2(Question2AnswerString))
        {
            Question2AnswerInt = Integer.parseInt(Question2AnswerString);
            if (Question2AnswerInt == 1)
            {
                falseChecks++;
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                dlgAlert.setMessage("This is for position players, not pitchers.");
                dlgAlert.setTitle("Error:");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();

                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
            }

            else if (Question2AnswerInt == 2)
            {
                MainActivity.age += 2;
            }
            else if (Question2AnswerInt == 3)
            {
                MainActivity.age += 0;
            }
            else if (Question2AnswerInt == 4)
            {
                MainActivity.age += 0;
            }
            else if (Question2AnswerInt == 5)
            {
                MainActivity.age += 1;
            }
            else if (Question2AnswerInt == 6)
            {
                MainActivity.age += 1;
            }
            else if (Question2AnswerInt == 7 || Question2AnswerInt == 8)
            {
                MainActivity.age += 1;
            }
            else if (Question2AnswerInt == 9)
            {
                MainActivity.age += 2;
            }
            else
            {
                falseChecks++;
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                dlgAlert.setMessage("Please enter a valid position number on question 2.");
                dlgAlert.setTitle("Error: Invalid Position");
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

        else
        {
            falseChecks++;
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Please enter a valid numeric value on question 2.");
            dlgAlert.setTitle("Error: Invalid Integer");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();

            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        }

        Question3EditText = (EditText)findViewById(R.id.Question3EditText);
        Question3AnswerString = Question3EditText.getText().toString();
        if(tryParseIntQuestion3(Question3AnswerString))
        {
            Question3AnswerInt = Integer.parseInt(Question3AnswerString);
            if (Question3AnswerInt == 0)
            {
                MainActivity.age += 0;
            }
            else if (Question3AnswerInt > 0 && Question3AnswerInt < 5)
            {
                MainActivity.age++;
            }
            else if (Question3AnswerInt >= 5 && Question3AnswerInt < 10)
            {
                MainActivity.age += 2;
            }
            else if (Question3AnswerInt >= 10 && Question3AnswerInt < 15)
            {
                MainActivity.age += 3;
            }
            else if (Question3AnswerInt >= 15 && Question3AnswerInt < 20)
            {
                MainActivity.age += 4;
            }
            else if (Question3AnswerInt >= 20 && Question3AnswerInt < 25)
            {
                MainActivity.age += 5;
            }
            else
            {
                MainActivity.age += 6;
            }
        }

        else
        {
            falseChecks++;
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Please enter a valid numeric value on question 3.");
            dlgAlert.setTitle("Error: Invalid Integer");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();

            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        }

        Question4EditText = (EditText)findViewById(R.id.Question4EditText);
        Question4AnswerString = Question4EditText.getText().toString();
        if(tryParseIntQuestion4(Question4AnswerString))
        {
            Question4AnswerInt = Integer.parseInt(Question4AnswerString);
            if (Question4AnswerInt == 0)
            {
                MainActivity.age += 0;
            }
            else if (Question4AnswerInt >= 0 && Question4AnswerInt <= 4)
            {
                MainActivity.age += 1;
            }
            else if (Question4AnswerInt >= 5 && Question4AnswerInt <= 9)
            {
                MainActivity.age += 2;
            }
            else if (Question4AnswerInt >= 10 && Question4AnswerInt <= 14)
            {
                MainActivity.age += 3;
            }
            else if (Question4AnswerInt >= 15)
            {
                MainActivity.age += 4;
            }
        }

        else
        {
            falseChecks++;
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Please enter a valid numeric value on question 4.");
            dlgAlert.setTitle("Error: Invalid Integer");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();

            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        }

        Question5EditText = (EditText)findViewById(R.id.Question5EditText);
        Question5AnswerString = Question5EditText.getText().toString();
        if(tryParseIntQuestion5(Question5AnswerString))
        {
            Question5AnswerInt = Integer.parseInt(Question5AnswerString);
            if (Question5AnswerInt == 0)
            {
                MainActivity.age += 0;
            }
            else if (Question5AnswerInt >= 1 && Question5AnswerInt <= 3)
            {
                MainActivity.age += 1;
            }
            else if (Question5AnswerInt == 4 || Question5AnswerInt == 5)
            {
                MainActivity.age += 1;
            }
            else if (Question5AnswerInt == 6)
            {
                MainActivity.age += 2;
            }
            else if (Question5AnswerInt == 7)
            {
                MainActivity.age += 3;
            }
            else if (Question5AnswerInt > 7)
            {
                falseChecks++;
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                dlgAlert.setMessage("Please enter a valid number of days on question 5.");
                dlgAlert.setTitle("Error: Invalid Number of Days");
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

        else
        {
            falseChecks++;
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Please enter a valid numeric value on question 5.");
            dlgAlert.setTitle("Error: Invalid Integer");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();

            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        }

        Question6EditText = (EditText)findViewById(R.id.Question6EditText);
        Question6AnswerString = Question6EditText.getText().toString();
        if (Question6AnswerString.equals("No") || Question6AnswerString.equals("no") || Question6AnswerString.equals("NO") || Question6AnswerString.equals("nO"))
        {
            MainActivity.age += 0;
        }
        else if (Question6AnswerString.equals("Yes") || Question6AnswerString.equals("yes") || Question6AnswerString.equals("YES") || Question6AnswerString.equals("yEs") || Question6AnswerString.equals("yeS") || Question6AnswerString.equals("yES") || Question6AnswerString.equals("YEs"))
        {
            MainActivity.age += 2;
        }

        else
        {
            falseChecks++;
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Please format your entry like the example on question 6.");
            dlgAlert.setTitle("Error: Invalid Entry");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();

            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        }

        Question7EditText = (EditText)findViewById(R.id.Question7EditText);
        Question7AnswerString = Question7EditText.getText().toString();
        if(tryParseIntQuestion7(Question7AnswerString))
        {
            Question7AnswerInt = Integer.parseInt(Question7AnswerString);
            if (Question7AnswerInt == 0)
            {
                MainActivity.age += 0;
            }
            else if (Question7AnswerInt == 1)
            {
                MainActivity.age += 5;
            }
            else if (Question7AnswerInt == 2)
            {
                MainActivity.age += 10;
            }
            else if (Question7AnswerInt > 2)
            {
                MainActivity.age += 15;
            }
        }
        else
        {
            falseChecks++;
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Please enter a valid numeric value on question 7.");
            dlgAlert.setTitle("Error: Invalid Integer");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();

            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        }

        if (falseChecks == 0) {
            Intent results = new Intent(this, ResultsActivity.class);
            startActivity(results);
        }

        else if(falseChecks > 0){
            falseChecks = 0;
            MainActivity.age = 0;
        }


    }

    private boolean tryParseIntQuestion1(String question1AnswerString) {
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

    private boolean tryParseIntQuestion2(String question2AnswerString) {
        try
        {
            Integer.parseInt(question2AnswerString);
            return true;
        } catch(NumberFormatException nfe)
        {
            falseChecks++;
            return false;
        }
    }

    private boolean tryParseIntQuestion3(String question3AnswerString) {
        try
        {
            Integer.parseInt(question3AnswerString);
            return true;
        } catch(NumberFormatException nfe)
        {
            falseChecks++;
            return false;
        }
    }

    private boolean tryParseIntQuestion4(String question4AnswerString) {
        try
        {
            Integer.parseInt(question4AnswerString);
            return true;
        } catch(NumberFormatException nfe)
        {
            falseChecks++;
            return false;
        }
    }

    private boolean tryParseIntQuestion5(String question5AnswerString) {
        try
        {
            Integer.parseInt(question5AnswerString);
            return true;
        } catch(NumberFormatException nfe)
        {
            falseChecks++;
            return false;
        }
    }

    private boolean tryParseIntQuestion7(String question7AnswerString) {
        try
        {
            Integer.parseInt(question7AnswerString);
            return true;
        } catch(NumberFormatException nfe)
        {
            falseChecks++;
            return false;
        }
    }
}
