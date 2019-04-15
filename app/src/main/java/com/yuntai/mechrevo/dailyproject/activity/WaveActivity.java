package com.yuntai.mechrevo.dailyproject.activity;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.animation.LinearInterpolator;
import com.yuntai.mechrevo.dailyproject.R;
import com.yuntai.mechrevo.dailyproject.view.PushWaveView;
import com.yuntai.mechrevo.dailyproject.view.WaveBezierView;
import com.yuntai.mechrevo.dailyproject.view.WaveView;

public class WaveActivity extends BaseActivity {
    @Override
    protected int initId() {
        return R.layout.activity_wave;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WaveView mHostWaveView = findViewById(R.id.wave);
        mHostWaveView.setDuration(1600);
        mHostWaveView.setStyle(Paint.Style.FILL);
        mHostWaveView.setColor(Color.GRAY);
        mHostWaveView.setSpeed(500);
        mHostWaveView.setInitialRadius(40);
        mHostWaveView.setMaxRadiusRate(1f);
        mHostWaveView.setInterpolator(new LinearInterpolator());
        mHostWaveView.start();
    }
}
