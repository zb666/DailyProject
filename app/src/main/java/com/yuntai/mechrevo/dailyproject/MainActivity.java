package com.yuntai.mechrevo.dailyproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yuntai.mechrevo.dailyproject.activity.BaseActivity;
import com.yuntai.mechrevo.dailyproject.activity.LoveLayoutActivity;
import com.yuntai.mechrevo.dailyproject.activity.PushWaveActivity;
import com.yuntai.mechrevo.dailyproject.activity.WaveActivity;
import com.yuntai.mechrevo.dailyproject.view.PushWaveView;
import com.yuntai.mechrevo.dailyproject.view.WaveView;
import com.yuntai.mechrevo.moudle_a.A_Activity;
import com.yuntai.mechrevo.moudle_b.B_Activity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById(R.id.tvLoveLayout).setOnClickListener(this);
        findViewById(R.id.tvPushWace).setOnClickListener(this);
        findViewById(R.id.tvWarmAnim).setOnClickListener(this);
        findViewById(R.id.tvWave).setOnClickListener(this);
    }

    @Override
    protected int initId() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.tvLoveLayout:
               jumpActivity(LoveLayoutActivity.class);
                break;
            case R.id.tvPushWace:
                jumpActivity(PushWaveActivity.class);
                break;
            case R.id.tvWarmAnim:
                break;
            case R.id.tvWave:
                jumpActivity(WaveActivity.class);
                break;
        }
    }


    void jumpActivity(@NonNull Class<? extends BaseActivity> tClass){
        Intent intent = new Intent(this,tClass);
        startActivity(intent);
    }
}
