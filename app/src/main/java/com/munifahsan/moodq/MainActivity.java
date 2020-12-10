package com.munifahsan.moodq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.ilu_1)
    CardView mIlu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.ilu_1)
    public void ilu1OnClick(){
        Intent intent = new Intent(this, Ilu1Activity.class);
        startActivity(intent);
    }

    @OnClick(R.id.ilu_2)
    public void ilu2OnClick(){
        Intent intent = new Intent(this, Ilu2Activity.class);
        startActivity(intent);
    }

    @OnClick(R.id.ilu_3)
    public void ilu3OnClick(){
        Intent intent = new Intent(this, Ilu3Activity.class);
        startActivity(intent);
    }

    @OnClick(R.id.ilu_4)
    public void ilu4OnClick(){
        Intent intent = new Intent(this, Ilu4Activity.class);
        startActivity(intent);
    }

    @OnClick(R.id.ilu_5)
    public void ilu5OnClick(){
        Intent intent = new Intent(this, Ilu5Activity.class);
        startActivity(intent);
    }

    @OnClick(R.id.ilu_6)
    public void ilu6OnClick(){
        Intent intent = new Intent(this, Ilu6Activity.class);
        startActivity(intent);
    }

    @OnClick(R.id.ilu_7)
    public void ilu7OnClick(){
        Intent intent = new Intent(this, Ilu7Activity.class);
        startActivity(intent);
    }

    @OnClick(R.id.info)
    public void info(){
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}