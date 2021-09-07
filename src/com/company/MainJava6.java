package com.company;

import java.util.Scanner;

public class MainJava6 {
    public static void main(String[] args) {
        Scanner to_chto_budet_vvodit_polzovatel= new Scanner(System.in);
        int granica_pensii;
        System.out.print("Vvedite granicu pensii");
        granica_pensii = to_chto_budet_vvodit_polzovatel.nextInt();
        for (int i=0; i<granica_pensii; i++){
            System.out.println("Rabota poka nam " +i+ "Let");
        }

    }
}
