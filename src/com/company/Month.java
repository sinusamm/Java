package com.company;
import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
       String [] months= {"January", "February", "March","April", "May", "June", "July", "August","September", "October", "November", "December"} ;
        Scanner userInput=new Scanner(System.in);
//                userInput=to_chto_vvel_polzovatel
        System.out.println("Choose the number of month from 1 to 12: ");
//    : ");------daet vvesti polzov.samost
        int chosenMonth = userInput.nextInt();
        //   int----nextInt();
        if(chosenMonth>12){
            System.out.print("Enter the number of month from 1 to 12 next time");
        }else if(chosenMonth<1){
            System.out.print("Enter the number of month from 1 to 12 next time");
        }else{
            System.out.print("The month is: " + months[chosenMonth-1]);
            // eto dast  tot mesyats kotori nujen polzovatelu, mi privikli schitat s 1 a ne s 0.
            // esli on zahochet poluchit janvar, on postavit 1 i poluchit fevral...a -1])--eto kamanda nam dast verni otvet
        }
    }
}
