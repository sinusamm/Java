package com.company;

import java.util.Scanner;

public class Praktika3 {
    public static void main(String[] args) {
        int num1, num2, answer;
        boolean isTrue=true;
        //answer= result
        char operator;
        // (+, -,*,  /):");---pishem dlya edinichnogo elementa..odin iz tipov dannih
        Scanner reader = new Scanner(System.in);
        // Scanner reader-----prosto nazvanie scannera
        System.out.print("Enter first number: ");
        num1 = reader.nextInt();
        System.out.print("Enter second number: ");
        num2 = reader.nextInt();
        System.out.print(" \n Enter an operator (+, -,*,  /):");
        operator= reader.next().charAt(0);
        switch (operator) {
            case '+':answer= num1+num2;
                System.out.println(answer);
                // ctobi vivodilas peremennaja bez kovichkov (answer)
                // chtobi vivodit string, to est sami propisat stavim kovichki  System.out.println("please");
                break;
            case '-':answer= num1-num2;
                System.out.println(answer);
                break;
            case '*':answer= num1*num2;
                System.out.println(answer);
                break;
            case '/':answer= num1/num2;
                System.out.println(answer);
                break;

            default: while(isTrue){
                System.out.println("Error! Incorrect operator! Please enter an operator again!");
                System.out.print("Enter an operator (+, -,*,  /):");
                operator= reader.next().charAt(0);
                switch (operator) {
                    case '+':answer= num1+num2;
                        System.out.println(answer);
                        isTrue=false;
                        // dlya vihoda iz odnogo keisa
                        break;
                    case '-':answer= num1-num2;
                        System.out.println(answer);
                        isTrue=false;
                        break;
                    case '*':answer= num1*num2;
                        System.out.println(answer);
                        isTrue=false;
                        break;
                    case '/':answer= num1/num2;
                        System.out.println(answer);
                        isTrue=false;
                        break;
            }
            }
                }
        }
    }

