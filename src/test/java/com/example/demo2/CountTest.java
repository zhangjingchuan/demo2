package com.example.demo2;

import java.util.regex.Pattern;

public class CountTest {

    public static void main(String[] args) {
        String str = "123d  sfadfg  zEd241_(-893";
        count(str);
    }

    private static void count(String str){
        //判断字符串是否为空
        if(str==null){
            System.out.println("字符串为空");
            return ;
        }

        //定义变量
        int num = 0;
        int chart = 0;
        int space = 0;
        int other = 0;

        //将字符串拆分为单个char数组
        char[] chars = str.toCharArray();
        for(char c : chars){
            //使用正则表达式判断
            if(Pattern.matches("[0-9]",c+"")){
                num++;
                continue;
            }

            if(Pattern.matches("[a-z|A-Z]",c+"")){
                chart++;
                continue;
            }

            if(Pattern.matches("\\s+",c+"")){
                space++;
                continue;
            }
            other++;
        }

        //结果输出
        System.out.println("数字： "+num +" 个");
        System.out.println("字母： "+chart +" 个");
        System.out.println("空格： "+space +" 个");
        System.out.println("其他： "+other +" 个");
    }

}
