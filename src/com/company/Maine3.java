package com.company;

import java.util.Scanner;

public class Maine3 {
    public static void main(String[] args) {
//            Scanner num = new Scanner(System.in);
//            int first, second, result;
//        //tip dannix
//            System.out.print("Enter first number:");
//            // vivod peremennoi
//            first = num.nextInt();
//            //prozvali tak peremennyi
//            System.out.println(first);
//            System.out.print("Enter second number:");
//            second = num.nextInt();
//            // polzovatel smog  vel samost.chislo
//            System.out.println(second);
//            result = first + second;
//            System.out.print("Summa is " +result);
//            Scanner number = new Scanner(System.in);
//                    //neww Scanner(System.in); chtobi polzovatel vel daniie
//            System.out.print("Enter first number:");
//            //nr1
//            float nr1, nr2, result;
//            nr1 = number.nextFloat();
//            // to chto vpis polz      number.nextFloat()
////            System.out.print("Please tell me this number" +nr1);
//            nr2 = 10.5F;
//            System.out.println("Second number is secret!");
//            result = nr1 + nr2;
//            System.out.print(" Summa is "+result);

            Scanner number2= new Scanner(System.in);
            System.out.println("This is a game");
                    //system out- eto mi vivodim v terminal
            System.out.println("Game rules: Summa must be lower then 100, but one of 2 numbers is secret");
            int num1, num2,result;
            System.out.print("First number is secret, please enter second number: ");
            num2 = number2.nextInt();
            num1 =78;
            result = num1 + num2;
            if(result<100  || 100>result){
                    System.out.print("You won the game!");
            }else {
                    System.out.print( "Game over!, because result was bigger then 100!");
            }

    }
}
