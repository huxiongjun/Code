package com.hu.annotation.demo;

import com.hu.annotation.model.Student;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author huxiongjun
 */
public class Demo01 {

    @Annotation01("/fun01")
    public void fun01() {
        System.out.println("fun01");
    }

    @Annotation01("/fun02")
    public void fun02() {
        System.out.println("fun02");
    }

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException {
        // 得到对应的字节码对象
        Class<?> clazz = Class.forName("com.hu.annotation.demo.Demo01");
        // 得到该字节码对象的所有方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            // 如果该方法上面有对应的注解
            if (method.isAnnotationPresent(Annotation01.class)) {
                // 得到对应的注解
                Annotation01 methodAnnotation = method.getAnnotation(Annotation01.class);
                // 得到对应的注解上面的值
                String string = methodAnnotation.value();
                System.out.println("string:" + string);
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations) {
                    // 打印出对应的注解值
                    System.out.println(annotation.toString());
                }
                // 就执行对应的方法
                method.invoke(clazz.newInstance());
            }
        }

        /*
          判断某个类上面是否存在某个注解,如果存在注解,就获取该注解上面的值
         */
        Class<Student> studentClass = Student.class;
        boolean annotationPresent = studentClass.isAnnotationPresent(Annotation01.class);
        if (annotationPresent){
            Annotation01 annotation = studentClass.getAnnotation(Annotation01.class);
            System.out.println(annotation.value());
        }
    }
}
