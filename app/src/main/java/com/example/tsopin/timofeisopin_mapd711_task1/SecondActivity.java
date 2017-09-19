package com.example.tsopin.timofeisopin_mapd711_task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();

// Output Full Name
        String Name = i.getStringExtra("name");
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setText(Name);

// Output Qualification
        String qualification = i.getStringExtra("qual");
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setText(qualification);

// Output Profession
        String profession = i.getStringExtra("prof");
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setText(profession);

// Output Hobby
        String hobby = i.getStringExtra("hobby");
        TextView textView4 = (TextView)findViewById(R.id.textView4);
        textView4.setText(hobby);

// Output Dream Job
        String job = i.getStringExtra("job");
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        textView5.setText(job);
    }
}

