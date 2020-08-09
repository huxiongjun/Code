package com.hu.exception;

/**
 * @author huxiongjun
 *
 * 自定义异常
 */
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) throws MyException {
        String name = null;
        if (name  == null){
            throw new MyException("名字不能为空............");
        }
    }
}
