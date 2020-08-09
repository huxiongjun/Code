package com.hu.annotation.model;

import com.hu.annotation.demo.Annotation01;

import java.util.Date;

/**
 * @author huxiongjun
 */
@Annotation01("/order")
public class Student {
    private String  name;
    private int age;
    private String sex;
    private Date birth;

    private String grade;


    public Student() {
    }


    public Student(String name, int age, String sex) {

        this.name = name;
        this.age = age;
        this.sex = sex;
    }



    public Student(String name, int age, String sex, Date birth) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birth = birth;
    }


    public void speak(){
        System.out.println("hello...");
    }

    private void speak(String name){
        System.out.println("你好,我的名字是:"+name);
    }

    public void speak(String name,int age){
        System.out.println("你好,我的名字是:"+name+",我"+age+"了");
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }


    public Date getBirth() {
        return birth;
    }


    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", grade='" + grade + '\'' +
                '}';
    }
}
