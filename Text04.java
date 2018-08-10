package com.vip.control;

import java.util.Arrays;
import java.util.Scanner;

public class Text04 {
    public static void main(String[] args) {
        systemTest();
    }
    public static void systemTest(){
        double[] sys1 = new double[7];
        double[] sys2 = new double[7];
        int i=0;
        int[] result = {0,0,0,0,0,0};
        while(i<=1000000){
            sysCreate(sys1,1);
            sysCreate(sys2,1);
            switch (judge(sys1,sys2)){
                case 1:result[0]++;break;
                case 2:result[1]++;break;
                case 3:result[2]++;break;
                case 4:result[3]++;break;
                case 5:result[4]++;break;
                case 6:result[5]++;break;
                default:break;
            }
            i++;
        }
        System.out.println("运行100000次：1-6等奖中奖结果如下：");
        for(int r : result){
            System.out.println(r+"，");
        }
    }
/*
一等奖：7个号码相符（6个红色球号码和1个蓝色球号码）（红色球号码顺序不限，下同），浮动奖金，最高1000万元；

        二等奖：6个红色球号码相符，浮动奖金；

        三等奖：5个红色球号码和1个蓝色球号码相符，3000元；

        四等奖：5个红色球号码或4个红色球号码和1个蓝色球号码相符，200元；

        五等奖：4个红色球号码或3个红色球号码和1个蓝色球号码相符，10元；

        六等奖：1个蓝色球号码相符（有无红色球号码相符均可），5元；*/
    public static void doubleColor(){
        Scanner sc = new Scanner(System.in);
        double[] sys = new double[7];
        double[] user = new double[7];
        sysCreate(sys,0);             //系统生成双色球
        userCreate(user);           //用户选择双色球
        System.out.println("选择完毕！以下是您的中奖结果");
        int result = judge(sys,user);        //判断中奖结果

    }
    //系统生成双色球
    public static double[] sysCreate(double[] param,int dorp){

        param[0] = Math.floor(Math.random()*16+1);     //生成一个 蓝色球
        double index;
        for(int i=dorp; i<7; i++){             //生成6个红色球
            index = Math.floor(Math.random()*33+1);
            if(Arrays.toString(param).contains(String.valueOf(index))){
                    sysCreate(param,i);
            }else{
                param[i] = index;
            }
        }
        return param;
    }
    //用户选择双色球
    public static double[] userCreate(double[] param){
        Scanner sc = new Scanner(System.in);
        System.out.print("请选择六位红色球数字：");
        for(int j=1;j<7;j++){
            param[j] = sc.nextInt();
        }
        System.out.print("请选择一位蓝色球数字：");
        param[0] = sc.nextInt();
        return param;
    }
    //判断中奖
    public static int judge(double paramSys[],double paramUser[]){
//        System.out.println("您的球号码"+ Arrays.toString(paramUser));
//        System.out.println("中奖球号码"+ Arrays.toString(paramSys));
        int red = 0;
        int blue = 0;
        for(int i=1; i<7; i++){         //先判断红球
            for(int j=1; j<7; j++){
                if(paramSys[i]==paramUser[j]){
                    red++;
                    paramSys[j] = 0;     //将已经相同的红色球值为零
                    break;
                }
            }
        }
        if(paramUser[0]==paramSys[0]){            //再判断蓝色球
            blue++;
        }
        //判断中奖情况
        if(red+blue==7){
//            System.out.println("一等奖");
            return 1;
        }else if(red==6 && blue==0){
//            System.out.println("二等奖");
            return 2;
        }else if(red==5 && blue==1){
//            System.out.println("三等奖，3000元奖金");
            return 3;
        }else if(red+blue == 5){
//            System.out.println("四等奖，200元奖金");
            return 4;
        }else if(red+blue == 4){
//            System.out.println("五等奖，10元奖金");
            return 5;
        }else if(blue == 1){
//            System.out.println("六等奖，5元奖金");
            return 6;
        }else{
//            System.out.println("很遗憾，未中奖");
            return 7;
        }
    }
}