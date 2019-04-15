package com.yuntai.mechrevo.dailyproject.activity;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.animation.LinearInterpolator;
import com.yuntai.mechrevo.dailyproject.R;
import com.yuntai.mechrevo.dailyproject.view.PushWaveView;
import com.yuntai.mechrevo.dailyproject.view.WaveBezierView;

public class PushWaveActivity extends BaseActivity {
    @Override
    protected int initId() {
        return R.layout.activity_pushwave;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PushWaveView pushWaveView= findViewById(R.id.pushwave);
        pushWaveView.setColor(Color.GRAY);
        pushWaveView.setInitialRadius(0);
        pushWaveView.setStyle(Paint.Style.FILL);
        pushWaveView.setInterpolator(new LinearInterpolator());
        pushWaveView.start();

        WaveBezierView waveBezierView = findViewById(R.id.waveBezier);
        waveBezierView.startAnim();
    }
}
