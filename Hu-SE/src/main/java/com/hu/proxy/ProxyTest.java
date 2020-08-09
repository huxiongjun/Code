package com.hu.proxy;

/**
 * @author huxiongjun
 */
public class ProxyTest {
    public static void main(String[] args) {
        TargetProxy targetProxy = new TargetProxy();
        Life life = (Life) targetProxy.newProxyInstance(new MyLife());
        life.coding("java");
        life.eat("apple");
        life.sleep();
    }
}
