package com.tianzhuan.arouter_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Activity使用布局文件注解
 * @Target(Element.Type)//接口、类、枚举、注解
 * @Target(Element.FIELD)//属性、枚举的常量
 * @Target(Element.METHOD)//方法
 * @Target(Element.PARAMETER)//方法参数
 * @Target(Element.CONSTRUCTOR)//构造函数
 * @Target(Element.LOCAL_VARIABLE)//局部变量
 * @Target(Element.ANNOTATION_TYPE)//该注解使用在另外一个注解上
 * @Target(Element.PACKAGE)//包
 * @Retention(RetentionPolicy.RUNTIME)//注解会在class字节码文件中存在，jvm加载时可以通过反射获取到该注解的内容
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface ARouter {
    //详细的路由路径（必填），如“app/MainActivity"
    String path();
    //从path中截取出来，规范开发者的编码
    String group() default "";
}
