package com.yuntai.mechrevo.moudle_b;

import android.app.ActivityOptions;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yuntai.mechrevo.common.IAProvider;
import com.yuntai.mechrevo.common.IHelloService;
import com.yuntai.mechrevo.common.ITestProvider;
import com.yuntai.mechrevo.common.LogUtils;

@Route(path = "/b/By")
public class B_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        findViewById(R.id.tv_A).setOnClickListener(this);

        //获取其他模块暴露的暴露的服务的两种方法
        IAProvider iProvider = (IAProvider) ARouter.getInstance().build("/a/AProvider").navigation();
        IAProvider iAProvider = ARouter.getInstance().navigation(IAProvider.class);
        String extOrigin = iProvider.getAExtendtion("");
        String extExtA = iAProvider.getAExtendtion("");

        LogUtils.showLog(extOrigin + "   " + extExtA);

        //下面代码的  pathProvider 为null 相同的path 只能存一样字节码文件，不能是两个
        //map.put("a",A_Activity.class)，取数据 map.get("a") 这种方式去进行存取
//        ITestProvider pathProvider = (ITestProvider) ARouter.getInstance().build("/a/Ay").navigation();
//        String pathProviderStr = pathProvider.getTest("这是Token 请给与我数据");
//        LogUtils.showLog(pathProviderStr);
//        ActivityOptions.
    }

    @Override
    public void onClick(View v) {
        ARouter.getInstance().build("/a/Ay").navigation();
    }
}
