package com.yuntai.mechrevo.moudleb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yuntai.mechrevo.common.TestObject;

@Route(path = "/moudleb/b")
public class B_MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Autowired(name = "test")
    TestObject testObject;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ARouter.getInstance().inject(this);
        findViewById(R.id.tvJumpA).setOnClickListener(this);
        Log.d("BobTest",testObject.toString());
    }

    @Override
    public void onClick(View v) {
        ARouter.getInstance().build("/moudle_a/a").navigation();
    }
}
