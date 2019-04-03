package com.yuntai.mechrevo.common;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface IHelloService extends IProvider {
    String getHello(String name);
}
