package com.yuntai.mechrevo.common;

import com.alibaba.android.arouter.facade.template.IProvider;

//这部分 因为需要字节码文件 所以要在common模块进行一个存放
public interface IHelloService extends IProvider {
    String getHello(String name);
}
