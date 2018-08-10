package com.vip.control;

import java.util.Arrays;

public class Wook04 {
    public static void main(String[] args){
        int[] arr1 = {254,45,1,6,4,547,14,26,48,21,41,14,15,17,15,23,56,156,26};
        int[] arr2 = {26,48,21,41,14,15,17,15,23,56,156,26};
        Wook04 wook = new Wook04();
//        wook.moreThanEighteen(arr1);
//        wook.evenMemuSum(arr1);
        System.out.println(Arrays.toString(wook.mergeArrag(arr1,arr2)));
    }
    public void moreThanEighteen(int[] arr){
        System.out.println("该数组中大于18的数的位置：");
        for(int i=0,size=arr.length; i<size; i++){
            if(arr[i]>18){
                System.out.print(i+", ");
            }
        }
    }
    public void evenMemuSum(int[] arr){
        int count = 0;
        for(int e : arr){
            if(e%2 == 0){
                count+=e;
            }
        }
        System.out.println("数组中的偶数和为："+count);
    }
    public int[] addItem(int[] arr){
        int len = arr.length;
        int[] newArray = new int[len+1];
        System.arraycopy(arr,0,newArray,0,len);
        newArray[newArray.length-1] = 15;
        return newArray;
    }
    public int[] addFirstItem(int[] arr){
        int len = arr.length;
        int[] newArray = new int[len+1];
        System.arraycopy(arr,0,newArray,1,len);
        newArray[0] = 15;
        return newArray;
    }
    public int[] mergeArrag(int[] arr1,int[] arr2){
        int[] newArray = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,newArray,0,arr1.length);
        System.arraycopy(arr2,0,newArray,arr1.length,arr2.length);
        return newArray;
    }
}
