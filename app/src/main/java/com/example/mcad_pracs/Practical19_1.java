package com.example.mcad_pracs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Practical19_1 extends AppCompatActivity {
    TextView name;
    TextView comp;
    TextView ldate;
    TextView price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical19_1);
        name = findViewById(R.id.cname);
        comp = findViewById(R.id.ccomp);
        ldate = findViewById(R.id.cldate);
        price = findViewById(R.id.cprice);
        Intent intent = getIntent();
        String item = intent.getStringExtra("item");
        if(item.equals("Mustang")) {
            name.setText("Mustang");
            comp.setText("Ford");
            ldate.setText("1-March-2022");
            price.setText("₹ 74,00,000");
        }
        else if(item.equals("XUV700")) {
            name.setText("XUV700");
            comp.setText("Mahindra");
            ldate.setText("30-October-2021");
            price.setText("₹ 12,00,000");
        }
        else if(item.equals("Harrier")) {
            name.setText("Harrier");
            comp.setText("Tata");
            ldate.setText("23-January-2019");
            price.setText("₹ 15,00,000");
        }
        else if(item.equals("Creta")) {
            name.setText("Creta");
            comp.setText("Hyundai");
            ldate.setText("21-July-2015");
            price.setText("₹ 10,00,000");
        }
        else if(item.equals("Scorpio")) {
            name.setText("Scorpio");
            comp.setText("Mahindra");
            ldate.setText("20-June-2002");
            price.setText("₹ 13,00,000");
        }
        else if(item.equals("Compass")) {
            name.setText("Compass");
            comp.setText("Jeep");
            ldate.setText("1-July-2017");
            price.setText("₹ 17,00,000");
        }
        else if(item.equals("Baleno")) {
            name.setText("Baleno");
            comp.setText("Suzuki");
            ldate.setText("26-October-2015");
            price.setText("6,00,000");
        }
    }
}