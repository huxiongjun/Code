package com.hu.proxy;

import java.awt.*;

/**
 * @author huxiongjun
 *
 * 实现某个接口
 */
public class MyLife implements Life {
    public void eat(String food) {
        System.out.println("eat:"+food);
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public void coding(String language) {
        System.out.println("coding:"+ language);
    }
}
