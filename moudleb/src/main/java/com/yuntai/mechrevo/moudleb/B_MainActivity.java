package com.yuntai.mechrevo.moudleb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/moudleb/b")
public class B_MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        findViewById(R.id.tvJumpA).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ARouter.getInstance().build("/moudlea/a").navigation();
    }
}
