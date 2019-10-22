package com.tianzhuan.net_moduler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tianzhuan.arouter_annotation.model.RouterBean;
import com.tianzhuan.arouter_api.ARouterLoadGroup;
import com.tianzhuan.arouter_api.ARouterLoadPath;
import com.tianzhuan.net_moduler.test.ARouter$$Group$$order;
import com.tianzhuan.net_moduler.test.ARouter$$Group$$personal;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpOrder(View view) {
        //最终集成化模式，所以子模块APT生成的类文件都会打包到apk
        ARouterLoadGroup loadGroup = new ARouter$$Group$$order();
        Map<String, Class<? extends ARouterLoadPath>> groupMap = loadGroup.loadGroup();
        //app-person
        Class<? extends ARouterLoadPath> clazz = groupMap.get("order");
        try {
            //类加载的技术
            ARouterLoadPath path = clazz.newInstance();
            Map<String, RouterBean> pathMap = path.loadPath();
            //获取personal/Personal_MainActivity
            RouterBean routerBean = pathMap.get("/order/Order_MainActivity");
            if(routerBean!=null){
                Intent intent = new Intent(this,routerBean.getClazz());
                intent.putExtra("name","simon");
                startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void jumpPersonal(View view) {
        //最终集成化模式，所以子模块APT生成的类文件都会打包到apk
        ARouterLoadGroup loadGroup = new ARouter$$Group$$personal();
        Map<String, Class<? extends ARouterLoadPath>> groupMap = loadGroup.loadGroup();
        //app-person
        Class<? extends ARouterLoadPath> clazz = groupMap.get("personal");
        try {
            //类加载的技术
            ARouterLoadPath path = clazz.newInstance();
            Map<String, RouterBean> pathMap = path.loadPath();
            //获取personal/Personal_MainActivity
            RouterBean routerBean = pathMap.get("/personal/Personal_MainActivity");
            if(routerBean!=null){
                Intent intent = new Intent(this,routerBean.getClazz());
                intent.putExtra("name","simon");
                startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
