package com.example.realnapster.weatherapp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.realnapster.weatherapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private  MainPresenter mPresenter;
    @BindView(R.id.editText)
    TextView editText;

    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ButterKnife.bind(this);
        mPresenter = new MainPresenter(this);
    }

    @OnClick(R.id.button)
    public void onEnterClick(){
        String zip = editText.getText().toString();
        mPresenter.handleEnterClick(zip);
    }

    @Override
    public void showEnterScreen() {
        Toast.makeText(this,"Enter Screen",Toast.LENGTH_SHORT).show();

    }
}
