package com.tianzhuan.net_moduler.test;

import com.tianzhuan.arouter_api.ARouterLoadGroup;
import com.tianzhuan.arouter_api.ARouterLoadPath;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟ARouter路由的组文件
 */
public class ARouter$$Group$$order implements ARouterLoadGroup {
    @Override
    public Map<String, Class<? extends ARouterLoadPath>> loadGroup() {
        Map<String,Class< ? extends  ARouterLoadPath>> groupMap = new HashMap<>();
        groupMap.put("order",ARouter$$Path$$order.class);
        return groupMap;
    }
}
