package com.yuntai.mechrevo.common;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

import java.lang.ref.WeakReference;

@Interceptor(priority = 8, name = "test interceptor")
public class LoginInterceptor implements IInterceptor {

    protected Context mContext;

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        // if 已经登陆
        Toast.makeText(mContext,"拦截到了",Toast.LENGTH_SHORT).show();
        SharedPreferences mSp = mContext.getSharedPreferences("Login", Context.MODE_PRIVATE);
        boolean isLogin = mSp.getBoolean("isLogin", false);
        String path = postcard.getPath();
        if (isLogin) {
            callback.onContinue(postcard);
            return;
        }
        if ("/login/Login".equals(path)) {
            Intent mIntent = new Intent(mContext, LoginActivity.class);
            //跳转
            if (mContext instanceof Application) {
                mIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            }
            mContext.startActivity(mIntent);
            return;
        }
        if ("不需要进行登陆的".equals(path)){
            //不用登陆的,就直接直接进行跳转 也不用greenChannel了
            Toast.makeText(mContext,"GreenChannel",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void init(Context context) {
        mContext = context;
    }
}
