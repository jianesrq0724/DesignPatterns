package com.example.ruiqin.designpattern.builder;

import android.content.Context;
import android.content.Intent;

import com.example.ruiqin.designpattern.R;
import com.example.ruiqin.designpattern.base.BaseActivity;
import com.example.ruiqin.designpattern.utils.ToastUtils;

public class SecondActivity extends BaseActivity {

    /**
     * sectionId
     */
    private static final String EXTRA_SECTION_ID = "section_id";

    private static final String EXTRA_BERTH_CODE = "berth_code";

    private static final String EXTRA_CAR_PLATE = "car_plate";


    private static final String EXTRA_VEHICLE_TYPE = "vehicle_type";

    private String mSectionId;
    private String mBerthCode;
    private String mCarPlate;
    private String mVehicleType;

    public static void startActivity(Context context, String sectionId, String berthCode, String carPlate) {
        startActivity(context, sectionId, berthCode, carPlate, null);
    }

    private static void startActivity(Context context, String sectionId, String berthCode, String carPlate, String vehicleType) {
        Intent intent = new Intent(context.getApplicationContext(), SecondActivity.class);
        intent.putExtra(EXTRA_SECTION_ID, sectionId);
        intent.putExtra(EXTRA_BERTH_CODE, berthCode);
        intent.putExtra(EXTRA_CAR_PLATE, carPlate);
        intent.putExtra(EXTRA_VEHICLE_TYPE, vehicleType);
        context.startActivity(intent);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        mSectionId = intent.getStringExtra(EXTRA_SECTION_ID);
        mBerthCode = intent.getStringExtra(EXTRA_BERTH_CODE);
        mCarPlate = intent.getStringExtra(EXTRA_CAR_PLATE);
        mVehicleType = intent.getStringExtra(EXTRA_VEHICLE_TYPE);
    }

    @Override
    protected void initView() {
        ToastUtils.showShort(mContext, mSectionId + "," + mBerthCode + ", " + mCarPlate + ", " + mVehicleType);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_second;
    }
}
