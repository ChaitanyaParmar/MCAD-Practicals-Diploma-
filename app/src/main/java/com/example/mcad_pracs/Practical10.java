package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.*;

public class Practical10 extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical10);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rg = (RadioGroup) findViewById(R.id.radiogroup);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int checked = rg.getCheckedRadioButtonId();
                ll = (LinearLayout) findViewById(R.id.ll);
                rb = (RadioButton) findViewById(checked);
                switch (rg.getCheckedRadioButtonId())
                {
                    case R.id.rred:
                        ll.setBackgroundColor(Color.RED);
                        break;
                    case R.id.rgreen:
                        ll.setBackgroundColor(Color.GREEN);
                        break;
                    case R.id.rblue:
                        ll.setBackgroundColor(Color.BLUE);
                        break;
                }
            }
        });
    }
}