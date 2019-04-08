package com.yuntai.mechrevo.moudle_a;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yuntai.mechrevo.common.ITestProvider;

@Route(path ="/a/Ay")
public class A_Activity extends AppCompatActivity implements View.OnClickListener,ITestProvider {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        findViewById(R.id.tv_B).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ARouter.getInstance().build("/b/By")
                .navigation();
    }

    @Override
    public String getTest(String input) {
        return "A produce itself data to B";
    }

    @Override
    public void init(Context context) {

    }

}
