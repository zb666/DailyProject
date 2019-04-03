package com.yuntai.mechrevo.dailyproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yuntai.mechrevo.moudle_a.A_Activity;
import com.yuntai.mechrevo.moudle_b.B_Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(this);


    }

    @Override
    protected void onResume() {
        super.onResume();
//        findViewById(R.id.tv).performClick();
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, B_Activity.class));
        overridePendingTransition(R.anim.left_overpadding, R.anim.right_overpadding);
    }
}
