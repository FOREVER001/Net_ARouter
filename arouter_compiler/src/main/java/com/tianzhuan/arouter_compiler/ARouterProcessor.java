package com.tianzhuan.arouter_compiler;

import com.google.auto.service.AutoService;
import com.tianzhuan.arouter_compiler.utils.Constants;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

/**
 * 编码此类1语句：细心在细心，出了问题debug真不好调试
 * AutoService则是固定写法，加一个注解就好
 * 通过auto_service中的@AutoService可以自动生成AutoService注解处理器，用来注册
 * 用来生成META_INF/services/javax.annotation.processing.Processor文件
 */
@AutoService(Processor.class)
//允许/支持的注解类型，让注解处理器处理
@SupportedAnnotationTypes({Constants.AROUTER_ANNOTATON_TYPES})
//指定JDK编译版本
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class ARouterProcessor extends AbstractProcessor {
    //操作Element工具类（类，函数，属性都是Element）
    private Elements elementUtils;
    //type (类信息)工具类，包含用于操作TypeMirror的工具方法
    private Types typeUtils;
    //messager用来报告错误，警告和其他提示信息
    private Messager messager;
    //文件生成器 类/资源，Filter用来创建新的类文件，class文件以及辅助文件
    private Filer filer;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        elementUtils=processingEnvironment.getElementUtils();
        typeUtils=processingEnvironment.getTypeUtils();
        messager=processingEnvironment.getMessager();
        filer=processingEnvironment.getFiler();
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        return false;
    }
}
