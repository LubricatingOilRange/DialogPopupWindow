package com.app.dialogpopupwindow.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import com.app.dialogpopupwindow.BaseViewHolder;

/**
 * Created by 神马都是浮云 on 2017-09-02.
 */
public class CommonDialogFragment extends DialogFragment {

    /**     * 回调获得需要显示的dialog     */
    private OnDialogCallBack mOnDialogCallBack;

    public interface OnDialogCallBack {
        Dialog getDialog(Context context);
    }

    /**
     * 处理布局的回掉接口
     */
    public interface OnHandleViewCallBack {
        void onHandleView(BaseViewHolder holder);
    }


    public static CommonDialogFragment newInstance(OnDialogCallBack call) {
        CommonDialogFragment instance = new CommonDialogFragment();
        instance.mOnDialogCallBack = call;
        return instance;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (null == mOnDialogCallBack) {
           return super.onCreateDialog(savedInstanceState);
        } else {
            return mOnDialogCallBack.getDialog(getActivity());
        }
    }
}
