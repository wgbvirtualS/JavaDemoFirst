package com.vip.control;

import java.util.Scanner;

public class Wook02 {
    public static void main(String[] args){
//        wook();
//        weightBMI();
//        employ();
//        ageStage();
//        season();
        leapYear();
    }
    public static void wook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入今天是星期几：");
        String day = sc.next();
        if(day.equals("星期六")){
            System.out.println("唱歌");
        }else if(day.equals("星期日")){
            System.out.println("植物园");
        }else{
            System.out.println("上班");
        }
    }
    public static void weightBMI(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个体重：");
        double weight = sc.nextDouble();
        System.out.print("请输入一个身高");
        double height = sc.nextDouble();
        double bmi = weight/Math.pow(height,2);
        String condition;
        if(bmi<18.5){
            condition = "过轻";
        }else if(bmi>=18.5 && bmi<25){
            condition = "正常";
        }else if(bmi>=25 && bmi<28){
            condition = "过重";
        }else if(bmi>=28 && bmi<=32){
            condition = "肥胖";
        }else{
            condition = "非常肥胖";
        }
        System.out.println("\n\n你输入的这个人的BMI值为："+bmi+"   身体状况："+condition);
    }
    public static void employ(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请问你会HTML吗？(Yes/No)");
        String answer = sc.next();
        boolean result = false;
        if(answer.equals("Yes")){
            System.out.print("请问你会css吗？(Yes/No)");
            answer = sc.next();
            if(answer.equals("Yes")){
                System.out.print("请问你会JavaScript吗？(Yes/No)");
                answer = sc.next();
                if(answer.equals("Yes")){
                    result = true;
                }
            }
        }
        if(result){
            System.out.println("恭喜你被录用了！");
        }else{
            System.out.println("Sorry,您不符合我们的条件！");
        }
    }
    public static void ageStage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的年龄：");
        int age = sc.nextInt();
        String stage;
        if(age<=44){
            stage = "青年";
        }else if(age>=45 && age<=59){
            stage = "中年";
        }else if(age>=60 && age<=89){
            stage = "老年人";
        }else{
            stage = "长寿老年人";
        }
        System.out.println("小明年龄段为："+stage);
    }
    public static void season(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个月份：");
        int season = sc.nextInt();
        switch (season){
            case 12:
            case 1:
            case 2:System.out.println(season+"月是冬季");break;
            case 3:
            case 4:
            case 5:System.out.println(season+"月是春季");break;
            case 6:
            case 7:
            case 8:System.out.println(season+"月是夏季");break;
            case 9:
            case 10:
            case 11:System.out.println(season+"月是秋季");break;
            default:System.out.println("你是火星人吧");
        }
    }
    public static void ageLimited(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的年龄：");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("可以观看");
        }else if(age>=10){
            System.out.println("是否继续查看(Yes/No)");
        }else{
            System.out.println("年龄不够");
        }
    }
    public static void leapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = sc.nextInt();

        if(year%100==0 && year%400==0){
            System.out.println(year+"年是世纪闰年！");
        }else if(year%4 == 0){
            System.out.println(year+"年是普通闰年！");
        }else{
            System.out.println(year+"年是平年");
        }
    }
}

