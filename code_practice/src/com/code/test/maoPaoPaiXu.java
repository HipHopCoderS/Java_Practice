package com.code.test;

import java.awt.*;

/**
 * Created by HipHopCoder
 *
 * for 两层循环
 * 内层循环 分别与每个值比较一次,得到一个泡泡
 *
 * 外层循环 根据list 的长度,看最终会有几个泡泡冒出来
 *
 */
public class maoPaoPaiXu {


    public void maomap1(int[] list){

        for(int i=0;i<list.length-1;i++){
            for(int j=0;j<list.length-1-i;j++){

                if(list[j]>list[j+1]){
                    int value = list[j+1];
                    list[j+1] = list[j];
                    list[j] = value;
                }
            }

            for (int x:list
                    ) {
                System.out.print(x+"\t");
            }
            System.out.print("\n");
        }




    }


    public static void main(String[] args) {

       int[] testList = {8,43,22,11,5};


       maoPaoPaiXu mp = new maoPaoPaiXu();
        mp.maomap1(testList);


    }


}
