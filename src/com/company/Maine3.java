package com.company;

import java.util.Scanner;

public class Maine3 {
    public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            int first, second, result;
            System.out.print("Enter first number:");
            first = num.nextInt();
            System.out.println(first);
            System.out.print("Enter second number:");
            second = num.nextInt();
            // polzovatel smog  vel samost.chislo
            System.out.println(second);
            result = first + second;
            System.out.print("Summa is " +result);



    }
}
