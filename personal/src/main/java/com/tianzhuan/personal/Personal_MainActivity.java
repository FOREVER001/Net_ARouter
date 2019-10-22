package com.tianzhuan.personal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tianzhuan.arouter_annotation.ARouter;

@ARouter(path = "/personal/Personal_MainActivity")
public class Personal_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal__main);
        if(getIntent()!=null){
            Log.e("Personal >>>",getIntent().getStringExtra("name"));
        }
    }


    //跳转到app首页
    public void jumpApp(View view) {

    }
    //跳转到order
    public void jumpOrder(View view) {

    }
}
