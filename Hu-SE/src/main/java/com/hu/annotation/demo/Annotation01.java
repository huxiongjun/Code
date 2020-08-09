package com.hu.annotation.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author huxiongjun
 *
 * 注解
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
public @interface Annotation01 {
    int a() default 12;
    String b() default "test";
    Class e() default String.class;
    String[] f() default "a";
    String value();
}
