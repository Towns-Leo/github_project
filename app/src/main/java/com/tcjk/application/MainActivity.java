package com.tcjk.application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @BindView(R.id.text_view)
    TextView textView;
    @BindView(R.id.btn)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.text_view)
    public void onViewClicked() {

        Toast.makeText(this, "click11133332444555", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn)
    public void onBtnClicked() {
    }
}
