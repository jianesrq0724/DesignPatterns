package com.ruiqin.designpattern;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;

import com.ruiqin.designpattern.base.BaseActivity;
import com.ruiqin.designpattern.builder.ParkBuilder;
import com.ruiqin.designpattern.builder.SecondActivity;
import com.ruiqin.designpattern.singleton.TestSingleton;

public class MainActivity extends BaseActivity {
    private Button mBuilderBtn;


    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mBuilderBtn = findViewById(R.id.builder_btn);
        mBuilderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SecondActivity.Builder(mContext).setSectionId("0000").setBerthCode("0001").setCarPlate("粤B").builder();
//                SecondActivity.startActivity(MainActivity.this, "0000", "0001", "粤B");
            }
        });

        findViewById(R.id.single_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestSingleton.getInstance().test1();
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
