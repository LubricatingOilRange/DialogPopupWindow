package com.app.dialogpopupwindow.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.app.dialogpopupwindow.R;
import com.app.dialogpopupwindow.popup.CommonPopupWindow;
import com.app.dialogpopupwindow.popup.PopupWindowHelper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class PopupWindowActivity extends AppCompatActivity {

    @BindView(R.id.left)
    Button left;
    @BindView(R.id.up)
    Button up;
    @BindView(R.id.right)
    Button right;
    @BindView(R.id.down)
    Button down;
    @BindView(R.id.target_1)
    Button target1;
    @BindView(R.id.target_2)
    Button target2;
    @BindView(R.id.view_target_red)
    TextView view_target_red;
    private Unbinder binder;
    private CommonPopupWindow commonPopupWindow;
    private int type = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_window);
        binder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (binder != null) {
            binder.unbind();
        }
    }

    @OnClick({R.id.left, R.id.up, R.id.right, R.id.down, R.id.target_1, R.id.target_2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.left://左
                PopupWindowHelper.showLeft(view_target_red, this, commonPopupWindow);
                break;
            case R.id.up://上
                PopupWindowHelper.showUp(view_target_red, this, commonPopupWindow);
                break;
            case R.id.right://右
                PopupWindowHelper.showRight(view_target_red, this, commonPopupWindow);
                break;
            case R.id.down://下
                PopupWindowHelper.showBottom(view_target_red, this, commonPopupWindow);
                break;
            case R.id.target_1://目标一
                type = 1;
                break;
            case R.id.target_2://目标二
                type = 2;
                break;
        }
    }
}
