package jp.techacademy.hato.yasuhiko.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CalcResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_result);

        Intent intent = getIntent();
        String result = intent.getStringExtra("RESULT");

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(result);
    }
}
