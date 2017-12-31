package com.example.ruiqin.designpattern;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;

import com.example.ruiqin.designpattern.base.BaseActivity;
import com.example.ruiqin.designpattern.builder.ParkBuilder;
import com.example.ruiqin.designpattern.builder.SecondActivity;

public class MainActivity extends BaseActivity {
    private Button mButton0;


    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mButton0 = findViewById(R.id.btn0);
        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity.startActivity(MainActivity.this, "0000", "0001", "粤B");
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    private void testBuilder() {
        ParkBuilder.Builder sectionId = new ParkBuilder.Builder().setSectionId("sectionId");

        new ParkBuilder.Builder().setSectionId("sectionId")
                .builder();

        new AlertDialog.Builder(this)
                .setTitle("title")
                .setMessage("message");
    }
}
