package com.example.gitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("THIS IS MY SECOND COMMIT");
        System.out.println("Local change");
        System.out.println("Change 1");
    }
}