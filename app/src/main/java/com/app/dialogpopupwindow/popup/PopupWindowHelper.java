package com.app.dialogpopupwindow.popup;

import android.content.Context;
import android.view.Gravity;
import android.view.View;

import com.app.dialogpopupwindow.R;
import com.app.dialogpopupwindow.utils.ScreenUtil;

/**
 * Created by ruibing.han on 2017/11/7.
 */

public class PopupWindowHelper {
    private static final int GRAVITY = Gravity.CENTER;

    /**
     * 默认显示中间
     * @param parent
     * @param context
     * @param commonPopupWindow
     */
    public static void showNormal(View parent, Context context,CommonPopupWindow commonPopupWindow) {
        if (commonPopupWindow == null) {
            commonPopupWindow = new CommonPopupWindow.Builder(context)
                    .setView(R.layout.layout_window)
                    .setBackGroundLevel(0.5f)//设置背景透明度
                    .setOutsideTouchable(true)//设置点击窗口外部是否消失
                    .setWidthAndHeight(ScreenUtil.getScreenWidth(context) * 2 / 3, ScreenUtil.getScreenHeight(context) / 3)//设置PopupWindow的宽高
                    //.setAnimationStyle(R.style.anim_dialog)//设置动画的样式ID
                    .create();
        }
        commonPopupWindow.showNormal(parent, GRAVITY);//设置显示在parent的左边
    }

    /**
     *展示在parent的左方
     * @param parent
     * @param context
     * @param commonPopupWindow
     */
    public static void showLeft(View parent, Context context,CommonPopupWindow commonPopupWindow) {
        if (commonPopupWindow == null) {
            commonPopupWindow = new CommonPopupWindow.Builder(context)
                    .setView(R.layout.layout_window)
                    .setBackGroundLevel(0.5f)//设置背景透明度
                    .setOutsideTouchable(true)//设置点击窗口外部是否消失
                    .setWidthAndHeight(ScreenUtil.getScreenWidth(context) * 2 / 3, ScreenUtil.getScreenHeight(context) / 3)//设置PopupWindow的宽高
                    //.setAnimationStyle(R.style.anim_dialog)//设置动画的样式ID
                    .create();
        }
        commonPopupWindow.showLeft(parent, Gravity.LEFT);//设置显示在parent的左边
    }

    /*
     *展示在parent的左方
     * @param parent
     * @param context
     * @param commonPopupWindow
     */
    public static void showUp(View parent, Context context,CommonPopupWindow commonPopupWindow) {
        if (commonPopupWindow == null) {
            commonPopupWindow = new CommonPopupWindow.Builder(context)
                    .setView(R.layout.layout_window)
                    .setBackGroundLevel(0.5f)//设置背景透明度
                    .setOutsideTouchable(true)//设置点击窗口外部是否消失
                    .setWidthAndHeight(ScreenUtil.getScreenWidth(context) * 2 / 3, ScreenUtil.getScreenHeight(context) / 3)//设置PopupWindow的宽高
                    //.setAnimationStyle(R.style.anim_dialog)//设置动画的样式ID
                    .create();
        }
        commonPopupWindow.showUp(parent, Gravity.BOTTOM);//设置显示在parent的左边
    }

    /**
     *展示在parent的左方
     * @param parent
     * @param context
     * @param commonPopupWindow
     */
    public static void showRight(View parent, Context context,CommonPopupWindow commonPopupWindow) {
        if (commonPopupWindow == null) {
            commonPopupWindow = new CommonPopupWindow.Builder(context)
                    .setView(R.layout.layout_window)
                    .setBackGroundLevel(0.5f)//设置背景透明度
                    .setOutsideTouchable(true)//设置点击窗口外部是否消失
                    .setWidthAndHeight(ScreenUtil.getScreenWidth(context) * 2 / 3, ScreenUtil.getScreenHeight(context) / 3)//设置PopupWindow的宽高
                    //.setAnimationStyle(R.style.anim_dialog)//设置动画的样式ID
                    .create();
        }
        commonPopupWindow.showRight(parent, Gravity.RIGHT);//设置显示在parent的左边
    }

    /**
     *展示在parent的左方
     * @param parent
     * @param context
     * @param commonPopupWindow
     */
    public static void showBottom(View parent, Context context,CommonPopupWindow commonPopupWindow) {
        if (commonPopupWindow == null) {
            commonPopupWindow = new CommonPopupWindow.Builder(context)
                    .setView(R.layout.layout_window)
                    .setBackGroundLevel(0.5f)//设置背景透明度
                    .setOutsideTouchable(true)//设置点击窗口外部是否消失
                    .setWidthAndHeight(ScreenUtil.getScreenWidth(context) * 2 / 3, ScreenUtil.getScreenHeight(context) / 3)//设置PopupWindow的宽高
                    //.setAnimationStyle(R.style.anim_dialog)//设置动画的样式ID
                    .create();
        }
        commonPopupWindow.showBottom(parent, Gravity.BOTTOM);//设置显示在parent的左边
    }
}
