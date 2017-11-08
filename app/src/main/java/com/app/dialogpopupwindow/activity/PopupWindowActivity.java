package com.app.dialogpopupwindow.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.dialogpopupwindow.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class PopupWindowActivity extends AppCompatActivity {

    private Unbinder binder;

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
}
