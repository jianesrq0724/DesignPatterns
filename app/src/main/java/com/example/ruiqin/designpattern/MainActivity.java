package com.example.ruiqin.designpattern;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ruiqin.designpattern.builder.ParkBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ParkBuilder.Builder sectionId = new ParkBuilder.Builder().setSectionId("sectionId");

        new ParkBuilder.Builder().setSectionId("sectionId")
                .builder();

        new AlertDialog.Builder(this)
                .setTitle("title")
                .setMessage("message");

    }
}
