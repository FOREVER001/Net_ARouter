package com.tianzhuan.order;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tianzhuan.arouter_annotation.ARouter;

@ARouter(path = "/order/Order_MainActivity")
public class Order_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order__main);
        Intent intent = getIntent();
        if(intent!=null){
            Log.e("Order_MainActivity>>",intent.getStringExtra("name"));
        }
    }

    //跳转到app首页
    public void jumpApp(View view) {

    }
    //跳转到personal
    public void jumpPersonal(View view) {

    }
}
