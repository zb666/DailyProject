package com.yuntai.mechrevo.common;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface IAProvider extends IProvider {

    /**
     * 获取到A模块中的功能
     * @param name
     * @return
     */
    String getAExtendtion(String name);

}
