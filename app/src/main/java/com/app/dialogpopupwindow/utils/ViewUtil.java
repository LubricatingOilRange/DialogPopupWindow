package com.app.dialogpopupwindow.utils;

import android.util.Log;
import android.view.View;

/**
 * Created by ruibing.han on 2017/11/8.
 */

public class ViewUtil {
    private static final int[] location = new int[2] ;
    /**
     * 获取目标View在屏幕中的位置
     * @param parent （目标View）
     * @return
     */
    public static int[] getViewLocation(View parent) {
        parent.getLocationInWindow(location);
        return location;
    }

    /**
     * 获取控件的宽高
     * @param parent
     * @return
     */
    public static int[] getViewWH(View parent) {
        parent.measure(0, 0);
        return new int[]{parent.getMeasuredWidth(),parent.getMeasuredHeight()};
    }

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
