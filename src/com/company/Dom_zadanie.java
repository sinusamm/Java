package com.company;

import java.util.Scanner;
import java.util.Random;
public class Dom_zadanie {
    public static void main(String[] args) {
    Scanner number2= new Scanner(System.in);
            System.out.println("This is a game");
            System.out.println("Game rules: Summa must be lower then 100, but one of 2 numbers is secret");
    int num1, num2,result;
    boolean isTrue=true;
            System.out.print("First number is secret, please enter second number: ");
    num2 = number2.nextInt();
        Random rand= new Random();
    num1 = rand.nextInt(100);
    System.out.println(num1);
 // num1---zarandomit
    while(isTrue){
        if(num2<10){
            System.out.println("Second number must be bigger than 10");
                    System.out.print("Enter second number again: ");
            num2 = number2.nextInt();
        }else{
            result = num1 + num2;
            if(result<100){
                System.out.print("You won the game!, because result was"+result);
            }else {
                 System.out.print( "Game over!, because result was bigger then 100!,because result was"+result);
    }
            break;

        }
    }
    }
    }