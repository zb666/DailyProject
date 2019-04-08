package com.yuntai.mechrevo.dailyproject

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.yuntai.mechrevo.dailyproject", appContext.packageName)

        //返回的是自身
        var str = "String"
        //必须使用it
        val let = str.let {
            it.length
        }

        //类名可以省略
        with(str) {

        }

        //run 函数 是with和let的结合 但是最后一行是返回值
        str.run {

        }

        //apply函数 和  run函数很像，但是apply返回的是自身

        //also返回的是当前的这个对象

    }
}
