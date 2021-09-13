package com.company;

public class Chisla_Fibonachchi {
    public static void main(String[] args) {
        int num1,num2,num3;
        num1 = 0;
        num2 = 1;
        System.out.print(num1 + " " + num2 +  " ");
        // viveli 0 i 1
        for(int i=3; i<=13; i++){
            // i=3 ot 3 nachinaetsya...num1 i num2 uje propisali
        num3= num1+num2;
        System.out.print(num3+ " ");
        //viveli num3
        num1=num2;
        num2=num3;
        //0 1 1 2 3 5 8 13 21 34 55 89 144 ....0+1=1---1+2=3
        }
    }
}
