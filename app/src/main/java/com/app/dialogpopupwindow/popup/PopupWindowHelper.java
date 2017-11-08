package com.app.dialogpopupwindow.popup;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;

import com.app.dialogpopupwindow.R;
import com.app.dialogpopupwindow.utils.ScreenUtil;

/**
 * Created by ruibing.han on 2017/11/7.
 */

public class PopupWindowHelper {
    public static PopupWindow popup(View parent, Context context) {

        return new CommonPopupWindow.Builder(context)
                .setView(R.layout.layout_window)
                .setBackGroundLevel(0.5f)//设置背景透明度
                .setOutsideTouchable(true)//设置点击窗口外部是否消失
                .setWidthAndHeight(ScreenUtil.getScreenWidth(context) * 2 / 3, ScreenUtil.getScreenHeight(context)/3)//设置PopupWindow的宽高
                .setAnimationStyle(R.style.anim_dialog)//设置动画的样式ID
                .setViewOnclickListener(new CommonPopupWindow.ViewInterface() {
                    @Override
                    public void getChildView(View view, int layoutResId) {

                    }
                }).create()
                .showNormal(parent, Gravity.LEFT);//设置显示在parent的左边
    }
}
