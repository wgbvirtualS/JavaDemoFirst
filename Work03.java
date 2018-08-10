package com.vip.control;

import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {
        aboutSeven();
        threeDivision();
        throughTheven();
        daffodilNumber();
        factorialOfTen();
        heightPaper();
        rightAngle();
        isoscele();
        rhombus();
        multiplication();
        hollow();
        primeNumber();
    }
    //输出1-100关于7的数字
    public static void aboutSeven(){
        for(int i=1; i<100; i++){
            if(i%7==0 || String.valueOf(i).contains("7")){
                System.out.print(i+", ");
            }
        }
    }
    //输出从1到100之间所有不能被3整除的数;并输出这些整数的和
    public static void threeDivision(){
        int sum = 0;
        for(int i=1; i<100; i++){
            if(i%3==0){
                continue;
            }else{
                sum+=i;
                System.out.print(i+", ");
            }
        }
        System.out.println("\n所有不能被三整除的数的和为："+sum);
    }
    //报7游戏的安全数（轮流报数，报到能被7整除或者尾数是7都要表演节目），报出1-100之间的安全数
    public static void throughTheven(){
        for(int i=1; i<100; i++){
            if(i%7==0 || String.valueOf(i).contains("7")){
                continue;
            }else{
                System.out.print(i+", ");
            }
        }
    }
    //打印100-1000内的水仙花数
    public static void daffodilNumber(){
        int a,b,c,daffodil;
        System.out.print("100-1000中所有的水仙花数：");
        for(int i=100; i<1000; i++){
            a = i/100;
            b = i/10%10;
            c = i%10;
            daffodil = a*a*a+b*b*b+c*c*c;
            if(daffodil == i){
                System.out.print(daffodil + ", ");
            }
        }
    }
    //10的阶乘
    public static void factorialOfTen(){
        int result = 1;
        for(int i=1; i<=10; i++){
            result*=i;
        }
        System.out.print("10的阶乘为："+result);
    }
    public static void heightPaper(){
        double paper = 0.01;
        double tgls = 8848;
        int i=0;
        for(; paper<=5591; i++){
            paper = paper*2;
        }
        System.out.println(i);
    }
    public static void rightAngle(){
        for(int i=0; i<5; i++){
            for(int j=0; j<i*2+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //等腰三角形
    public static void isoscele(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入边长：");
        int length = sc.nextInt();
        for(int i=1; i<=length; i++){
            for(int j=0; j<length-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i*2-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //菱形
    public static void rhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入边长：");
        int length = sc.nextInt();
        for(int i=1; i<=length; i++){
            for(int j=0; j<length-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i*2-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int x=length-1; x>0; x--){
            for(int y=0; y<length-x; y++){
                System.out.print(" ");
            }
            for(int z=0; z<x*2-1; z++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //九九乘法表
    public static void multiplication(){
        for(int i=1; i<=9; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+"x"+j+"=" + i*j+"  ");
            }
            System.out.println("");
        }
    }
    //空心等腰三角形
    public static void hollow(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入边长：");
        int len = sc.nextInt();
        for(int i=1; i<=len; i++){
            for(int j=0; j<len-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                if(k==1 || k==i*2-1 ){
                    System.out.print("*");
                }else if(len==i && k%2==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    //打印1-100之间的质数
    public static void primeNumber(){
        for(int i=2;i<=100;i++){
            for(int j=2; j<=i; j++){
                if(i==j){
                    System.out.print(i+", ");
                }
                if(i%j==0){
                    break;
                }
            }
        }
    }
}
