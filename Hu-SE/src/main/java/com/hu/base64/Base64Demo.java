package com.hu.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;


/**
 * @author huxiongjun
 */
public class Base64Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String encode = Base64.getEncoder().encodeToString("zengguilan".getBytes("utf-8"));
        System.out.println(encode);
        byte[] decode = Base64.getDecoder().decode(encode);
        System.out.println(new String(decode,"utf-8"));

    }
}
