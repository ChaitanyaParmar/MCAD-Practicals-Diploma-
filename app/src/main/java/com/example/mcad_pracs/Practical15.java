package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Practical15 extends AppCompatActivity {
    EditText editText;
    Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical15);
        editText = (EditText) findViewById(R.id.editText3);
        textView = (TextView) findViewById(R.id.textView4);
        btn = (Button) findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                double c = Double.parseDouble(s);
                double f = (c * 9 / 5) + 32;
                textView.setText("Fahrenhit value for " + c + "° C is : " + f);
            }
        });
    }
}