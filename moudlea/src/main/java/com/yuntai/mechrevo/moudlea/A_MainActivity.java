package com.yuntai.mechrevo.moudlea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yuntai.mechrevo.common.TestObject;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

@Route(path = "/moudle_a/a")
public class A_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_a);
        ARouter.getInstance().inject(this);
        findViewById(R.id.tvB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestObject testObject = new TestObject();
                testObject.age = 26;
                testObject.name = "zb666";
                ARouter.getInstance().build("/moudleb/b")
                        .withParcelable("test",testObject)
                        .navigation();
            }
        });
    }
}
