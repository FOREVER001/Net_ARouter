package com.tianzhuan.arouter_annotation.model;

import javax.lang.model.element.Element;

/**
 * PathBean对象的升级版
 */
public class RouterBean {



    public enum Type {
        ACTIVITY
    }
    //枚举类型
    private Type mType;
    //类节点
    private Element mElement;
    //被@ARouter注解的类对象
    private Class<?> clazz;
    //路由的组名
    private String group;
    //路由的地址
    private String path;
    private RouterBean(Builder builder) {
        this.mElement=builder.mElement;
        this.path=builder.path;
        this.clazz=builder.clazz;
        this.group=builder.group;
        this.mType=builder.mType;

    }
    private RouterBean(Type type, Class<?> clazz, String path, String group) {
        this.path=path;
        this.clazz=clazz;
        this.group=group;
        this.mType=type;
    }

    public void setType(Type type) {
        mType = type;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Type getType() {
        return mType;
    }

    public Element getElement() {
        return mElement;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public String getGroup() {
        return group == null ? "" : group;
    }

    public String getPath() {
        return path == null ? "" : path;
    }
    //对外还提供一种简单的实例化方法
    public static RouterBean create(Type type,Class<?> clazz,String path,String group){
       return new RouterBean(type,clazz,path,group);
    }

    public final static class Builder{
        //枚举类型
        private Type mType;
        //类节点
        private Element mElement;
        //被@ARouter注解的类对象
        private Class<?> clazz;
        //路由的组名
        private String group;
        //路由的地址
        private String path;

        public Builder setType(Type type) {
            this.mType = type;
            return this;
        }

        public Builder setElement(Element element) {
            this.mElement = element;
            return this;
        }

        public Builder setClazz(Class<?> clazz) {
            this.clazz = clazz;
            return this;
        }

        public Builder setGroup(String group) {
            this.group = group;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }
        //最后一个方法build或者create，往往是做参数的校验或者初始化工作
        public RouterBean build(){
            if(path ==null || path.length()==0){
                throw new IllegalArgumentException("path必填项为空，如：/app/MainActivity");
            }
            return new RouterBean(this);
        }
    }

}
