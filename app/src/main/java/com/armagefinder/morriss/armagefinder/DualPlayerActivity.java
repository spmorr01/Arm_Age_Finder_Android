package com.armagefinder.morriss.armagefinder;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class DualPlayerActivity extends AppCompatActivity {
    public EditText Question1EditText;
    public EditText Question2EditText;
    public EditText Question3EditText;
    public EditText Question4EditText;
    public EditText Question5EditText;
    public EditText Question6EditText;
    public EditText Question7EditText;
    public EditText Question8EditText;
    public EditText Question9EditText;
    public EditText Question10EditText;

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
    int Question6AnswerInt;
    String Question6AnswerString;
    int Question7AnswerInt;
    String Question7AnswerString;
    int Question8AnswerInt;
    String Question8AnswerString;
    int Question9AnswerInt;
    String Question9AnswerString;
    int Question10AnswerInt;
    String Question10AnswerString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dual_player);
    }

    public void onPCalculateButtonClicked(View view) {
        MainActivity.age += 2;

        Question1EditText = (EditText) findViewById(R.id.Question1EditText);
        Question1AnswerString = Question1EditText.getText().toString();
        if (tryParseIntQuestion1(Question1AnswerString)) {
            Question1AnswerInt = Integer.parseInt(Question1AnswerString);  //We know it is safe to parse.
            MainActivity.age += Question1AnswerInt;
        } else {
            falseChecks++;
            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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
            Question2AnswerInt = Integer.parseInt(Question2AnswerString);  //We know it is safe to parse.
            if (Question2AnswerInt == 0)
            {
                MainActivity.age += 0;
            }
            else if (Question2AnswerInt >= 1 && Question2AnswerInt < 5)
            {
                MainActivity.age += 1;
            }
            else if (Question2AnswerInt >= 5 && Question2AnswerInt < 10)
            {
                MainActivity.age += 2;
            }
            else if (Question2AnswerInt >= 10 && Question2AnswerInt < 15)
            {
                MainActivity.age += 4;
            }
            else if (Question2AnswerInt >= 15 && Question2AnswerInt < 20)
            {
                MainActivity.age += 8;
            }
            else if (Question2AnswerInt >= 20 && Question2AnswerInt < 25)
            {
                MainActivity.age += 12;
            }
            else
            {
                MainActivity.age += 16;
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
            else if (Question3AnswerInt >=1 && Question3AnswerInt < 70)
            {
                MainActivity.age += 1;
            }
            else if (Question3AnswerInt >= 70 && Question3AnswerInt < 75)
            {
                MainActivity.age += 2;
            }
            else if (Question3AnswerInt >= 75 && Question3AnswerInt < 80)
            {
                MainActivity.age += 3;
            }
            else if (Question3AnswerInt >= 80 && Question3AnswerInt < 85)
            {
                MainActivity.age += 4;
            }
            else if (Question3AnswerInt >= 85 && Question3AnswerInt < 90)
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
            else if (Question4AnswerInt >= 1 && Question4AnswerInt <= 3)
            {
                MainActivity.age += 1;
            }
            else if (Question4AnswerInt == 4 || Question4AnswerInt == 5)
            {
                MainActivity.age += 2;
            }
            else if (Question4AnswerInt == 6)
            {
                MainActivity.age += 3;
            }
            else if (Question4AnswerInt == 7)
            {
                MainActivity.age += 4;
            }
            else if (Question4AnswerInt > 7)
            {
                falseChecks++;
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                dlgAlert.setMessage("Please enter a valid number of days for question 4.");
                dlgAlert.setTitle("Error: Invalid Amount of Days");
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
            else if (Question5AnswerInt >= 1  && Question5AnswerInt <= 3)
            {
                MainActivity.age += 1;
            }
            else if (Question5AnswerInt == 4)
            {
                MainActivity.age += 2;
            }
            else if (Question5AnswerInt == 5)
            {
                MainActivity.age += 3;
            }
            else if (Question5AnswerInt == 6)
            {
                MainActivity.age += 4;
            }
            else if (Question5AnswerInt == 7)
            {
                MainActivity.age += 5;
            }
            else if (Question5AnswerInt > 7)
            {
                falseChecks++;
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                dlgAlert.setMessage("Please enter a valid number of days for question 5.");
                dlgAlert.setTitle("Error: Invalid Amount of Days");
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
        if(tryParseIntQuestion6(Question6AnswerString))
        {
            Question6AnswerInt = Integer.parseInt(Question6AnswerString);
            if (Question6AnswerInt == 0)
            {
                MainActivity.age += 0;
            }
            else if (Question6AnswerInt == 1 || Question6AnswerInt == 2)
            {
                MainActivity.age += 1;
            }
            else if (Question6AnswerInt == 3)
            {
                MainActivity.age += 2;
            }
            else if (Question6AnswerInt == 4)
            {
                MainActivity.age += 3;
            }
            else if (Question6AnswerInt == 5)
            {
                MainActivity.age += 4;
            }
            else if (Question6AnswerInt > 5)
            {
                MainActivity.age += 5;
            }
        }
        else
        {
            falseChecks++;
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Please enter a valid numeric value on question 6.");
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

        Question7EditText = (EditText)findViewById(R.id.Question7EditText);
        Question7AnswerString = Question7EditText.getText().toString();
        if(tryParseIntQuestion7(Question7AnswerString))
        {
            Question7AnswerInt = Integer.parseInt(Question7AnswerString);
            if (Question7AnswerInt == 1)
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

            else if (Question7AnswerInt == 2)
            {
                MainActivity.age += 2;
            }
            else if (Question7AnswerInt == 3)
            {
                MainActivity.age += 0;
            }
            else if (Question7AnswerInt == 4)
            {
                MainActivity.age += 0;
            }
            else if (Question7AnswerInt == 5)
            {
                MainActivity.age += 1;
            }
            else if (Question7AnswerInt == 6)
            {
                MainActivity.age += 1;
            }
            else if (Question7AnswerInt == 7 || Question7AnswerInt == 8)
            {
                MainActivity.age += 1;
            }
            else if (Question7AnswerInt == 9)
            {
                MainActivity.age += 2;
            }
            else
            {
                falseChecks++;
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                dlgAlert.setMessage("Please enter a valid position number on question 7.");
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

        Question8EditText = (EditText)findViewById(R.id.Question8EditText);
        Question8AnswerString = Question8EditText.getText().toString();
        if(tryParseIntQuestion8(Question8AnswerString))
        {
            Question8AnswerInt = Integer.parseInt(Question8AnswerString);
            if (Question8AnswerInt == 0)
            {
                MainActivity.age += 0;
            }
            else if (Question8AnswerInt > 0 && Question8AnswerInt < 5)
            {
                MainActivity.age++;
            }
            else if (Question8AnswerInt >= 5 && Question8AnswerInt < 10)
            {
                MainActivity.age += 2;
            }
            else if (Question8AnswerInt >= 10 && Question8AnswerInt < 15)
            {
                MainActivity.age += 3;
            }
            else if (Question8AnswerInt >= 15 && Question8AnswerInt < 20)
            {
                MainActivity.age += 4;
            }
            else if (Question8AnswerInt >= 20 && Question8AnswerInt < 25)
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
            dlgAlert.setMessage("Please enter a valid numeric value on question 8.");
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

        Question9EditText = (EditText)findViewById(R.id.Question9EditText);
        Question9AnswerString = Question9EditText.getText().toString();
        if(tryParseIntQuestion9(Question9AnswerString))
        {
            Question9AnswerInt = Integer.parseInt(Question9AnswerString);
            if (Question9AnswerInt == 0)
            {
                MainActivity.age += 0;
            }
            else if (Question9AnswerInt >= 0 && Question9AnswerInt <= 4)
            {
                MainActivity.age += 1;
            }
            else if (Question9AnswerInt >= 5 && Question9AnswerInt <= 9)
            {
                MainActivity.age += 2;
            }
            else if (Question9AnswerInt >= 10 && Question9AnswerInt <= 14)
            {
                MainActivity.age += 3;
            }
            else if (Question9AnswerInt >= 15)
            {
                MainActivity.age += 4;
            }
        }

        else
        {
            falseChecks++;
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Please enter a valid numeric value on question 9.");
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

        Question10EditText = (EditText)findViewById(R.id.Question10EditText);
        Question10AnswerString = Question10EditText.getText().toString();
        if(tryParseIntQuestion10(Question10AnswerString))
        {
            Question10AnswerInt = Integer.parseInt(Question10AnswerString);
            if (Question10AnswerInt == 0)
            {
                MainActivity.age += 0;
            }
            else if (Question10AnswerInt == 1)
            {
                MainActivity.age += 5;
            }
            else if (Question10AnswerInt == 2)
            {
                MainActivity.age += 10;
            }
            else if (Question10AnswerInt > 2)
            {
                MainActivity.age += 15;
            }
        }
        else
        {
            falseChecks++;
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Please enter a valid numeric value on question 10.");
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

    private boolean tryParseIntQuestion6(String question6AnswerString) {
        try
        {
            Integer.parseInt(question6AnswerString);
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

    private boolean tryParseIntQuestion8(String question8AnswerString) {
        try
        {
            Integer.parseInt(question8AnswerString);
            return true;
        } catch(NumberFormatException nfe)
        {
            falseChecks++;
            return false;
        }
    }

    private boolean tryParseIntQuestion9(String question9AnswerString) {
        try
        {
            Integer.parseInt(question9AnswerString);
            return true;
        } catch(NumberFormatException nfe)
        {
            falseChecks++;
            return false;
        }
    }

    private boolean tryParseIntQuestion10(String question10AnswerString) {
        try
        {
            Integer.parseInt(question10AnswerString);
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
        getMenuInflater().inflate(R.menu.menu_dual_player, menu);
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
