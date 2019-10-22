package com.tianzhuan.arouter_api;

import com.tianzhuan.arouter_annotation.model.RouterBean;

import java.util.Map;

/**
 * 路由组Group对应的详细Path加载接口
 * 比如app分组对应有哪些类需要加载
 */
public interface ARouterLoadPath {
    /**
     * 加载路由组Group中的path详细数据
     * 比如：“app”分组下有这些信息
     * @return key:"/app/MainActivity" value :MainActivity信息封装到RouterBean对象中
     */
    Map<String, RouterBean> loadPath();
}
