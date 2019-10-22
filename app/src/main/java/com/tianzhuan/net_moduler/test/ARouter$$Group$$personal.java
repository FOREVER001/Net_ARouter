package com.tianzhuan.net_moduler.test;

import com.tianzhuan.arouter_api.ARouterLoadGroup;
import com.tianzhuan.arouter_api.ARouterLoadPath;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟ARouter路由的组文件
 */
public class ARouter$$Group$$personal implements ARouterLoadGroup {
    @Override
    public Map<String, Class<? extends ARouterLoadPath>> loadGroup() {
        Map<String,Class< ? extends  ARouterLoadPath>> groupMap = new HashMap<>();
        groupMap.put("personal",ARouter$$Path$$personal.class);
        return groupMap;
    }
}
