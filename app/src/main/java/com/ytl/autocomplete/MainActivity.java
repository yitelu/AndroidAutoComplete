package com.ytl.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        String[] friends = {"Nick", "Rick", "Sara", "James", "Nina", "Noel", "Nire"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, friends);

        autoCompleteTextView.setAdapter(arrayAdapter);

        //how many characters requires to show
        autoCompleteTextView.setThreshold(1);




    }
}
