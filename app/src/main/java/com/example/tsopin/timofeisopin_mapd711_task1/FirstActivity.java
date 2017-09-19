package com.example.tsopin.timofeisopin_mapd711_task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }
    public void sendButton(View v)
    {
        if (v.getId() == R.id.button)
        {
            Intent i = new Intent(FirstActivity.this, SecondActivity.class);

            EditText text1 = (EditText)findViewById(R.id.textEd1); // Getting text from textEd1
            i.putExtra("name", text1.getText().toString()); // Converting to string

            EditText text2 = (EditText)findViewById(R.id.textEd2); // Getting text textEd2
            i.putExtra("qual", text2.getText().toString()); // Converting to string

            EditText text3 = (EditText)findViewById(R.id.textEd3); // Getting text textEd3
            i.putExtra("prof", text3.getText().toString()); // Converting to string

            EditText text4 = (EditText)findViewById(R.id.textEd4); // Getting text textEd4
            i.putExtra("hobby", text4.getText().toString()); // Converting to string

            EditText text5 = (EditText)findViewById(R.id.textEd5); // Getting text textEd5
            i.putExtra("job", text5.getText().toString()); // Converting to string

        startActivity(i);
    }
}

}