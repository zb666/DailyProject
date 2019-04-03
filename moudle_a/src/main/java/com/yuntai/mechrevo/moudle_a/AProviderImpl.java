package com.yuntai.mechrevo.moudle_a;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.yuntai.mechrevo.common.IAProvider;

/**
 * 这是A模块功能的具体输入点
 */
@Route(path = "/a/AProvider")
public class AProviderImpl implements IAProvider {
    @Override
    public String getAExtendtion(String name) {
        return "这是A的功能模块数据";
    }

    @Override
    public void init(Context context) {

    }
}
