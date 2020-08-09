package com.hu.regex;

import java.util.Scanner;

/**
 * @author huxiongjun
 * <p>
 * 正则表达式
 */
public class RegexDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的QQ号码：");
        String qq = sc.next();

        System.out.println(checkQQ2(qq));

        //1.验证str是否以h开头，以d结尾，中间是a,e,i,o,u中某个字符
        String regex = "h[aeiou]d";
        //2.验证str是否以h开头，以d结尾，中间不是a,e,i,o,u中的某个字符
        regex = "h[^aeiou]d";
        //3.验证str是否a-z的任何一个小写字符开头，后跟ad
        regex = "[a-z]ad";
        //4.验证str是否以a-d或者m-p之间某个字符开头，后跟ad
        regex = "[[a-d][m-p]]ad";
        //1.要求字符串是小写辅音字符开头，后跟ad
        regex = "[a-z&&[^aeiou]]ad";
        //2.要求字符串是aeiou中的某个字符开头，后跟ad
        regex = "[a|e|i|o|u]ad";//这种写法相当于：regex = "[aeiou]ad";
    }


    private static boolean checkQQ2(String qq) {
        String regex = "[1-9]\\d{4,14}";
        return qq.matches(regex);
    }
}
