package com.code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by HipHopCoder
 * 输入两个数字,分别求他们的,和差积商
 *
 */
public class inputTwoNum {

    public void inputNum(){
        try {
            BufferedReader brd = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入一个数字:");
            String str = brd.readLine();
            int a = Integer.parseInt(str);


            System.out.println("请再输入一个数:");
            String str2 = brd.readLine();
            int b = Integer.parseInt(str2);


            System.out.printf("两个数的和为:%d+%d=%d\n",a,b,a+b);
            System.out.printf("两个数的差为:%d-%d=%d\n",a,b,a-b);
            System.out.printf("两个数的积为:%d*%d=%d\n",a,b,a*b);
            System.out.printf("两个数的商为:%d/%d=%d\n",a,b,a/b);


        }catch (IOException e){
            e.printStackTrace();
        }



    }


    public static void main(String[] args) {

        inputTwoNum num = new inputTwoNum();
        num.inputNum();

    }



}
