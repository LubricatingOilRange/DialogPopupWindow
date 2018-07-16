package com.app.dialogpopupwindow.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

import com.app.dialogpopupwindow.R;
import com.app.dialogpopupwindow.dialog.CommonDialogFragment;
import com.app.dialogpopupwindow.dialog.DialogFragmentHelper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt_dialog)
    Button btDialog;
    @BindView(R.id.bt_popupWindow)
    Button btPopupWindow;
    private Unbinder binder;
    private CommonDialogFragment commonDialogFragment;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binder = ButterKnife.bind(this);
        manager = getSupportFragmentManager();
        Toast.makeText(MainActivity.this,"aaaa",Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"bbbb",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (binder != null) {
            binder.unbind();
        }
    }

    @OnClick({R.id.bt_dialog, R.id.bt_popupWindow})
    public void onViewClicked(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.bt_dialog://展示Dialog的弹框
                DialogFragmentHelper.showDialog(manager,commonDialogFragment);
                break;
            case R.id.bt_popupWindow:
                intent = new Intent(MainActivity.this, PopupWindowActivity.class);
                startActivity(intent);
                break;
        }
    }
}
