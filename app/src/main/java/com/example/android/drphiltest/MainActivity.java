package com.example.android.drphiltest;



import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

      public static final String EXTRA_MESSAGE = "com.example.Drphiltest.result";

    int points = 0;
    TextView message ;
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    RadioGroup radioGroup6;
    RadioGroup radioGroup7;
    RadioGroup radioGroup8;
    RadioGroup radioGroup9;
    RadioGroup radioGroup10;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup1 = (RadioGroup) findViewById(R.id.ans1);

        radioGroup2 = (RadioGroup) findViewById(R.id.ans2);
        radioGroup3 = (RadioGroup) findViewById(R.id.ans3);
        radioGroup4 = (RadioGroup) findViewById(R.id.ans4);
        radioGroup5 = (RadioGroup) findViewById(R.id.ans5);
        radioGroup6 = (RadioGroup) findViewById(R.id.ans6);
        radioGroup7 = (RadioGroup) findViewById(R.id.ans7);
        radioGroup8 = (RadioGroup) findViewById(R.id.ans8);
        radioGroup9 = (RadioGroup) findViewById(R.id.ans9);
        radioGroup10 = (RadioGroup) findViewById(R.id.ans10);
        message = (TextView) findViewById(R.id.hint);
    }

    // Check screen orientation or screen rotate event here
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }


    public void calculatePoints(View v) {


        //variables to save the answers of questions
        RadioButton ans1A = (RadioButton) findViewById(R.id.ans1_1);
        RadioButton ans1B = (RadioButton) findViewById(R.id.ans1_2);
        RadioButton ans1C = (RadioButton) findViewById(R.id.ans1_3);

        RadioButton ans2A = (RadioButton) findViewById(R.id.ans2_1);
        RadioButton ans2B = (RadioButton) findViewById(R.id.ans2_2);
        RadioButton ans2C = (RadioButton) findViewById(R.id.ans2_3);
        RadioButton ans2D = (RadioButton) findViewById(R.id.ans2_4);
        RadioButton ans2E = (RadioButton) findViewById(R.id.ans2_5);

        RadioButton ans3A = (RadioButton) findViewById(R.id.ans3_1);
        RadioButton ans3B = (RadioButton) findViewById(R.id.ans3_2);
        RadioButton ans3C = (RadioButton) findViewById(R.id.ans3_3);
        RadioButton ans3D = (RadioButton) findViewById(R.id.ans3_4);
        RadioButton ans3E = (RadioButton) findViewById(R.id.ans3_5);

        RadioButton ans4A = (RadioButton) findViewById(R.id.ans4_1);
        RadioButton ans4B = (RadioButton) findViewById(R.id.ans4_2);
        RadioButton ans4C = (RadioButton) findViewById(R.id.ans4_3);
        RadioButton ans4D = (RadioButton) findViewById(R.id.ans4_4);

        RadioButton ans5A = (RadioButton) findViewById(R.id.ans5_1);
        RadioButton ans5B = (RadioButton) findViewById(R.id.ans5_2);
        RadioButton ans5C = (RadioButton) findViewById(R.id.ans5_3);
        RadioButton ans5D = (RadioButton) findViewById(R.id.ans5_4);


        RadioButton ans6A = (RadioButton) findViewById(R.id.ans6_1);
        RadioButton ans6B = (RadioButton) findViewById(R.id.ans6_2);
        RadioButton ans6C = (RadioButton) findViewById(R.id.ans6_3);


        RadioButton ans7A = (RadioButton) findViewById(R.id.ans7_1);
        RadioButton ans7B = (RadioButton) findViewById(R.id.ans7_2);
        RadioButton ans7C = (RadioButton) findViewById(R.id.ans7_3);

        RadioButton ans8A = (RadioButton) findViewById(R.id.ans8_1);
        RadioButton ans8B = (RadioButton) findViewById(R.id.ans8_2);
        RadioButton ans8C = (RadioButton) findViewById(R.id.ans8_3);
        RadioButton ans8D = (RadioButton) findViewById(R.id.ans8_4);
        RadioButton ans8E = (RadioButton) findViewById(R.id.ans8_5);
        RadioButton ans8F = (RadioButton) findViewById(R.id.ans8_6);
        RadioButton ans8G = (RadioButton) findViewById(R.id.ans8_7);


        RadioButton ans9A = (RadioButton) findViewById(R.id.ans9_1);
        RadioButton ans9B = (RadioButton) findViewById(R.id.ans9_2);
        RadioButton ans9C = (RadioButton) findViewById(R.id.ans9_3);
        RadioButton ans9D = (RadioButton) findViewById(R.id.ans9_4);
        RadioButton ans9E = (RadioButton) findViewById(R.id.ans9_5);

        RadioButton ans10A = (RadioButton) findViewById(R.id.ans10_1);
        RadioButton ans10B = (RadioButton) findViewById(R.id.ans10_2);
        RadioButton ans10C = (RadioButton) findViewById(R.id.ans10_3);
        RadioButton ans10D = (RadioButton) findViewById(R.id.ans10_4);
        RadioButton ans10E = (RadioButton) findViewById(R.id.ans10_5);
        RadioButton ans10F = (RadioButton) findViewById(R.id.ans10_6);

        //points for question 1
        if (ans1A.isChecked()) {
            points += 2;
        }
        if (ans1B.isChecked()) {
            points += 4;
        }
        if (ans1C.isChecked()) {
            points += 6;
        }
        //points for question 2
        if (ans2A.isChecked()) {
            points += 6;
        }
        if (ans2B.isChecked()) {
            points += 4;
        }
        if (ans2C.isChecked()) {
            points += 7;
        }
        if (ans2D.isChecked()) {
            points += 2;
        }
        if (ans2E.isChecked()) {
            points += 1;
        }
        //points for question 3
        if (ans3A.isChecked()) {
            points += 4;
        }
        if (ans3B.isChecked()) {
            points += 2;
        }
        if (ans3C.isChecked()) {
            points += 5;
        }
        if (ans3D.isChecked()) {
            points += 7;
        }
        if (ans3E.isChecked()) {
            points += 6;
        }
        //points for question 4
        if (ans4A.isChecked()) {
            points += 4;
        }
        if (ans4B.isChecked()) {
            points += 6;
        }
        if (ans4C.isChecked()) {
            points += 2;
        }
        if (ans4D.isChecked()) {
            points += 1;
        }
        //points for question 5
        if (ans5A.isChecked()) {
            points += 6;
        }
        if (ans5B.isChecked()) {
            points += 4;
        }
        if (ans5C.isChecked()) {
            points += 3;
        }
        if (ans5D.isChecked()) {
            points += 5;
        }
        //points for question 6
        if (ans6A.isChecked()) {
            points += 6;
        }
        if (ans6B.isChecked()) {
            points += 4;
        }
        if (ans6C.isChecked()) {
            points += 2;
        }
        //points for question 7
        if (ans7A.isChecked()) {
            points += 6;
        }
        if (ans7B.isChecked()) {
            points += 2;
        }
        if (ans7C.isChecked()) {
            points += 4;
        }
        //points for question 8
        if (ans8A.isChecked()) {
            points += 6;
        }

        if (ans8B.isChecked()) {
            points += 7;
        }
        if (ans8C.isChecked()) {
            points += 5;
        }
        if (ans8D.isChecked()) {
            points += 4;
        }
        if (ans8E.isChecked()) {
            points += 3;
        }
        if (ans8F.isChecked()) {
            points += 2;
        }

        if (ans8G.isChecked()) {
            points += 1;
        }

        //points for question 9
        if (ans9A.isChecked()) {
            points += 7;
        }
        if (ans9B.isChecked()) {
            points += 6;
        }
        if (ans9C.isChecked()) {
            points += 4;
        }
        if (ans9D.isChecked()) {
            points += 4;
        }

        if (ans9E.isChecked()) {
            points += 1;
        }
        //points for question 10
        if (ans10A.isChecked()) {
            points += 5;
        }
        if (ans10B.isChecked()) {
            points += 4;
        }
        if (ans10C.isChecked()) {
            points += 3;
        }
        if (ans10D.isChecked()) {
            points += 6;
        }

        if (ans10E.isChecked()) {
            points += 7;
        }
        if (ans10F.isChecked()) {
            points += 5;
        }

        displayPoints();



    }

    // display the score and the comment
    public void displayPoints() {
        String result = "";

        if (radioGroup1.getCheckedRadioButtonId() == -1 || radioGroup2.getCheckedRadioButtonId() == -1 ||
                radioGroup3.getCheckedRadioButtonId() == -1 || radioGroup4.getCheckedRadioButtonId() == -1 ||
                radioGroup5.getCheckedRadioButtonId() == -1 || radioGroup6.getCheckedRadioButtonId() == -1 ||
                radioGroup7.getCheckedRadioButtonId() == -1 || radioGroup8.getCheckedRadioButtonId() == -1 ||
                radioGroup9.getCheckedRadioButtonId() == -1 || radioGroup10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, getString(R.string.toast), Toast.LENGTH_SHORT).show();
        } else {
            if (points >= 60) {
                result = getString(R.string.points) + points + "\n " + getString(R.string.greater60);


            } else if (points < 60 && points > 50) {

                result = getString(R.string.points) + points + "\n " + getString(R.string.greater50);


            } else if (points <= 50 && points > 40) {

                result = getString(R.string.points) + points + "\n " + getString(R.string.greater40);
            } else if (points <= 40 && points > 30) {

                result = getString(R.string.points) + points + "\n " +getString(R.string.greater30);

            } else if (points <= 30 && points > 20) {

                result = getString(R.string.points) + points + "\n " + getString(R.string.greater20);

            } else if (points < 20) {
                result = getString(R.string.points) + points + "\n " + getString(R.string.less20);
            }
            Intent intent = new Intent(this,Main2Activity.class);
            intent.putExtra(EXTRA_MESSAGE,result);
            startActivity(intent);

        }



    }



    // reset all the app
    public void reset(View view) {


        radioGroup1.clearCheck();


        radioGroup2.clearCheck();

        radioGroup3.clearCheck();

        radioGroup4.clearCheck();

        radioGroup5.clearCheck();

        radioGroup6.clearCheck();

        radioGroup7.clearCheck();

        radioGroup8.clearCheck();

        radioGroup9.clearCheck();

        radioGroup10.clearCheck();
        points = 0;

    }
}
