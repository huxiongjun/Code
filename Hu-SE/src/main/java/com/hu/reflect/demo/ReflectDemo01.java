package com.hu.reflect.demo;

import com.hu.reflect.model.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author huxiongjun
 *
 * 反射demo
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Student> clazz = (Class<Student>) Class.forName("com.hu.reflect.model.Student");
        Student student = clazz.newInstance();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        student.setAge(23);
        student.setName("zhangSan");
        student.speak();

        System.out.println(student.toString());

        /**
         * 通过构造函数
         */
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        System.out.println(constructors.length);

        Constructor<Student> constructor = clazz.getConstructor(String.class, int.class, String.class);
        Student stu = constructor.newInstance("张三", 18, "男");
        System.out.println(stu);

    }
}
