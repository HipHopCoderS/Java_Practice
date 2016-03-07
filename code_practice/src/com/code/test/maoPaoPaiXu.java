package com.code.test;

import java.awt.*;

/**
 * Created by HipHopCoder
 */
public class maoPaoPaiXu {


    public void maomap1(int[] testList){

        int  lenList = testList.length;


        for(int i =1;i<=lenList-1;i++){
            for(int j=1;j<=lenList-i;j++){
                if(testList[i]>testList[j]){
                    int value = testList[j];
                    testList[j]=testList[i];
                    testList[i]=value;

                }

            }
            for(int k=0;k<=lenList;k++){
                System.out.println(testList[k]);
            }

        }

    }


    public static void main(String[] args) {

       int[] testList = {88,33,22,11};


       maoPaoPaiXu mp = new maoPaoPaiXu();
        mp.maomap1(testList);


    }


}
