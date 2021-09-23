package com.company;
import java.util.Scanner;
public class Chernovik {
    public static void main(String[] args) {
        int num1, num2, answer;
        boolean isTrue=true;
        // bez etoi commandi tsikl ne srabotaet
        char operator;
        // eto sam polzovatel?
        Scanner reader = new Scanner(System.in);
        // nazv.scannera
        System.out.print("Enter first number: ");
        num1 = reader.nextInt();
        System.out.print("Enter second number: ");
        num2 = reader.nextInt();
        System.out.print(" \n Enter an operator (+, -,*,  /):");
        operator= reader.next().charAt(0);
        // do suda srabativaet tolko komanda vvoda...pochemu net result
        switch (operator) {
            //  switch- proverka chego-to libo (+, -,*,  /):");
            case '+':answer= num1+num2;
        System.out.println(answer);
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
                // esli ne prav vvod plusa i minusa pishet chto prosto protses oastanivlen, chtobi vse eto perezapustit
            // postavim tsikl
            default: while(isTrue){
                System.out.println("Error! Incorrect operator! Please enter an operator again!");
                System.out.print("Enter an operator (+, -,*,  /):");
                operator= reader.next().charAt(0);
                // zdes on budet beskonechno budet davat stavit prav (+, -,*,  /):"), rezult.ne budet
                switch (operator) {
                    case '+':answer= num1+num2;
                        System.out.println(answer);
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
                }
            }
        }
}
}
