package com.yuntai.mechrevo.common;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface ITestProvider extends IProvider {
    String getTest(String input);
}
