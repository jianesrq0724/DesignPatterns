package com.ruiqin.designpattern.builder;

import android.content.Context;
import android.content.Intent;

import com.ruiqin.designpattern.R;
import com.ruiqin.designpattern.base.BaseActivity;
import com.ruiqin.designpattern.utils.ToastUtils;

public class SecondActivity extends BaseActivity {

    private static final String EXTRA_SECTION_ID = "section_id";

    private static final String EXTRA_BERTH_CODE = "berth_code";

    private static final String EXTRA_CAR_PLATE = "car_plate";

    private static final String EXTRA_VEHICLE_TYPE = "vehicle_type";

    private String mSectionId;
    private String mBerthCode;
    private String mCarPlate;
    private String mVehicleType;

//    public static void startActivity(Context context, String sectionId, String berthCode, String carPlate) {
//        startActivity(context, sectionId, berthCode, carPlate, null);
//    }
//
//    private static void startActivity(Context context, String sectionId, String berthCode, String carPlate, String vehicleType) {
//        Intent intent = new Intent(context.getApplicationContext(), SecondActivity.class);
//        intent.putExtra(EXTRA_SECTION_ID, sectionId);
//        intent.putExtra(EXTRA_BERTH_CODE, berthCode);
//        intent.putExtra(EXTRA_CAR_PLATE, carPlate);
//        intent.putExtra(EXTRA_VEHICLE_TYPE, vehicleType);
//        context.startActivity(intent);
//    }

    public static class Builder {
        private String sectionId;
        private String berthCode;
        private String carPlate;
        private Context mContext;

        public Builder(Context context) {
            this.mContext = context;
        }

        public SecondActivity.Builder setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }

        public SecondActivity.Builder setBerthCode(String berthCode) {
            this.berthCode = berthCode;
            return this;
        }


        public SecondActivity.Builder setCarPlate(String carPlate) {
            this.carPlate = carPlate;
            return this;
        }

        public void builder() {
            Intent intent = new Intent(mContext.getApplicationContext(), SecondActivity.class);
            intent.putExtra(EXTRA_SECTION_ID, this.sectionId);
            intent.putExtra(EXTRA_BERTH_CODE, this.berthCode);
            intent.putExtra(EXTRA_CAR_PLATE, this.carPlate);
            mContext.startActivity(intent);
        }
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
