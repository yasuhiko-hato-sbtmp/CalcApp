package jp.techacademy.hato.yasuhiko.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private double mValue1;
    private double mValue2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = (Button)findViewById(R.id.plus);
        plus.setOnClickListener(this);
        Button minus = (Button)findViewById(R.id.minus);
        minus.setOnClickListener(this);
        Button multi = (Button)findViewById(R.id.multi);
        multi.setOnClickListener(this);
        Button division = (Button)findViewById(R.id.division);
        division.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editTextValue1 = (EditText)findViewById(R.id.value1);
        EditText editTextValue2 = (EditText)findViewById(R.id.value2);
        mValue1 = Double.valueOf(editTextValue1.getText().toString());
        mValue2 = Double.valueOf(editTextValue2.getText().toString());
        Intent intent = new Intent(this, CalcResult.class);
        String result = new String();
        String operator = new String();

        if (v.getId() == R.id.plus) {
            result = String.valueOf(mValue1 + mValue2);
            operator = "+";
        } else if (v.getId() == R.id.minus) {
            result = String.valueOf(mValue1 - mValue2);
            operator = "-";
        } else if (v.getId() == R.id.multi) {
            result = String.valueOf(mValue1 * mValue2);
            operator = "*";
        } else if (v.getId() == R.id.division) {
            result = String.valueOf(mValue1 / mValue2);
            operator = "/";
        }

        result = String.valueOf(mValue1) + " " + operator + " " + String.valueOf(mValue2) + " = " + result;
        intent.putExtra("RESULT", result);
        startActivity(intent);
    }
}
