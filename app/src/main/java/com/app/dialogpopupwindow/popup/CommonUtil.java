package com.app.dialogpopupwindow.popup;

import android.util.Log;
import android.view.View;

/**
 * Created by 神马都是浮云 on 2017-10-29.
 */
public class CommonUtil {
    public static void measureWidthAndHeight(View view) {
        //设置测量模式为UNSPECIFIED可以确保测量不受父View的影响
        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        view.measure(w, h);
        //得到测量宽度
        int mWidth = view.getMeasuredWidth();
        //得到测量高度
        int mHeight = view.getMeasuredHeight();
        Log.e("aaa", "mWidth:" + mWidth + "/mHeight:" + mHeight);
    }
}
