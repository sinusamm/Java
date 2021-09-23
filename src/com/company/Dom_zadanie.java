package com.company;

import java.util.Scanner;
import java.util.Random;
public class Dom_zadanie {
    public static void main(String[] args) {
    Scanner number2= new Scanner(System.in);
            System.out.println("This is a game");
            System.out.println("Game rules: Summa must be lower then 100, but one of 2 numbers is secret");
    int num1, num2,result;
            System.out.print("First number is secret, please enter second number: ");
    num2 = number2.nextInt();
        Random rand= new Random();
        for(int i=0; i<5; i++) {
    num1 = rand.nextInt();
    System.out.println(num1);
 // num1---zarandomit
    result = num1 + num2;
            if(result<100){
        System.out.print("You won the game!");
    }else {
        System.out.print( "Game over!, because result was bigger then 100!");
    }
        }
}
}
