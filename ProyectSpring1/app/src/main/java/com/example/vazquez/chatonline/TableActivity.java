package com.example.vazquez.chatonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
    }

    public void nextActivityChat(View view) {
        startActivity(new Intent(this,
               MainActivity.class));
    }
    public void nextActivityCompa(View view) {
        startActivity(new Intent(this,
                MainTwoActivity.class));
    }

}
