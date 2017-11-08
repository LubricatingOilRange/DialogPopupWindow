package com.app.dialogpopupwindow.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.app.dialogpopupwindow.BaseViewHolder;
import com.app.dialogpopupwindow.R;
import com.app.dialogpopupwindow.utils.ScreenUtil;

/**
 * Created by Haoz on 2017/4/6 0006.
 */

public class DialogFragmentHelper {
    public static final String Dialog = "dialog";

    public static CommonDialogFragment showDialog(FragmentManager manager, CommonDialogFragment commonDialogFragment) {
        if (commonDialogFragment == null) {
            commonDialogFragment = CommonDialogFragment.newInstance(new CommonDialogFragment.OnDialogCallBack() {
                @Override
                public Dialog getDialog(final Context context) {
                    //Dialog参数可以从外部传进来，这需要个人喜好设置
                    return new CommonDialog.Builder(context)
                            .setBackGroundLevel(1f)//背景透明（0-1）
                            //.setWidthAndHeight(ScreenUtil.getScreenWidth(context) * 2 / 3, ScreenUtil.getScreenHeight(context) / 3)//dialog的宽高
                            .setWidthAndHeight(0, 0)//dialog的宽高
//                            .setXAndY(-100, 300)//设置dialog坐标点(基于Gravity之后的偏移量，默认为中心点)
                            .setXAndY(0, 0)//设置dialog坐标点(基于Gravity之后的偏移量，默认为中心点)
                            .setOutsideTouchable(true)//设置dialog外部点击是否消失
                            .setAnimationStyle(R.style.anim_dialog)//设置dialog显示消失动画
                            .setGravity(Gravity.CENTER)//设置显示在activity的左边
                            .setView(R.layout.layout_window, new CommonDialogFragment.OnHandleViewCallBack() {
                                @Override
                                public void onHandleView(BaseViewHolder holder) {
                                    holder.setText(R.id.tv_window, "你来了")
                                            .setText(R.id.bt_window, "点我试一试")
                                            .setOnClickListener(R.id.bt_window, new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Toast.makeText(context, "你为什么要点我嘞!", Toast.LENGTH_SHORT).show();
                                                }
                                            });
                                }
                            })//布局ID
                            .create(R.style.dialog);//主题创建
                }
            });
        }
        commonDialogFragment.show(manager, Dialog);

        return commonDialogFragment;
    }
}