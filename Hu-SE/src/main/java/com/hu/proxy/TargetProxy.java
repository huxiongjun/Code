package com.hu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author huxiongjun
 *
 * 目标代理类
 */
public class TargetProxy implements InvocationHandler {

    public Object targetObject;

    /**
     * 新建代理类
     * @param targetObject 需要被代理的对象
     * @return 被代理类的代理对象
     */
    public Object newProxyInstance(Object targetObject){
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法增强的开始...............");
        // 被代理对象需要被增强的方法
        method.invoke(targetObject, args);
        System.out.println("方法增强的结束...............");
        return null;
    }
}
