package com.yuntai.mechrevo.moudle_b;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yuntai.mechrevo.common.IHelloService;
import com.yuntai.mechrevo.common.LogUtils;

@Route(path ="/b/By")
public class B_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        findViewById(R.id.tv_A).setOnClickListener(this);

        IHelloService navigation = ARouter.getInstance().navigation(IHelloService.class);

        String hello = navigation.getHello("hello A  this is B");
        LogUtils.showLog(hello);
    }

    @Override
    public void onClick(View v) {
        ARouter.getInstance().build("/a/Ay").navigation();
    }
}
