package com.code.test;

/**
 * Created by HipHopCoder
 *
 * 打印乘法表
 *
 */




public class chengFaBiao {

    public void print_CFB(){

        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){

                System.out.printf("%d*%d=%d ",i,j,i*j);
            }

            System.out.println("\n");
        }
    }


    public static void main(String[] args) {

        chengFaBiao cfb = new chengFaBiao();
        cfb.print_CFB();

    }


}
