package com.tutorial.annotation.processor;

import com.tutorial.annotation.CustomizeAnnotation;

import java.lang.annotation.Annotation;

/**
 * Created by WilliamsLiu on 16/8/25.
 */
public class CustomizeAnnotationProcessor {

    public static void processorCustomizeAnnotation(Class<?> clazz) {
        System.out.println(clazz.getDeclaredAnnotations()[0]);// excludes inherited annotations
        System.out.println(clazz.getAnnotations()[0]);
        Class<CustomizeAnnotation> annotationClass = CustomizeAnnotation.class;
        System.out.println(clazz.isAnnotationPresent(annotationClass));
        CustomizeAnnotation annotation = clazz.getAnnotation(annotationClass);
        System.out.println(annotation.value());
    }
}
