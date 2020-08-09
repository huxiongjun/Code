package com.hu.result;

import com.hu.constant.StatusCodeConstant;

/**
 * @author huxiongjun
 *
 * 返回结果封装
 */


public class Result<T> {
    /**
     * 是否成功
     */
    private boolean flag;

    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 返回时的消息
     */
    private String message;

    /**
     * 返回消息体
     */
    private T data;

    public Result(boolean flag, Integer code, String message, T data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = (T)data;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result() {
        this.flag = true;
        this.code = StatusCodeConstant.OK;
        this.message = "操作成功!";
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
