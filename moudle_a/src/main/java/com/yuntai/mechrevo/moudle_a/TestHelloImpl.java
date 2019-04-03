package com.yuntai.mechrevo.moudle_a;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.yuntai.mechrevo.common.IHelloService;


@Route(path = "/a/HelloService")
public class TestHelloImpl implements IHelloService {

    @Override
    public String getHello(String name) {
        return "嗯 老铁你好";
    }

    @Override
    public void init(Context context) {

    }
}
