package com.company;

import java.util.Scanner;

public class MainArray7 {
    public static void main(String[] args) {
//        int [] nazvanie_massiva= new int[] {1,2,3,4,5};
//        System.out.print(nazvanie_massiva [3]);
//    int [] nazvanie_massiva = new int[5];
//    nazvanie_massiva [0]=10;
//    nazvanie_massiva [1]=20;
//    nazvanie_massiva [2]=30;
//    nazvanie_massiva [3]=40;
//    nazvanie_massiva [4]=50;
//        System.out.print(nazvanie_massiva [4]);
        Scanner to_chto_vvodit_polzovatel = new Scanner(System.in);
        //polzov.sam vvodit dlinu massiva a takje znachenija
        int [] nazvanie_massiva;
        int length_of_array;
        System.out.print("Enter length of array: ");
        //vvedi sam dlinu massiva
        length_of_array= to_chto_vvodit_polzovatel.nextInt();
        //length_of_array----to chto vvodit polzovatel
        nazvanie_massiva= new int[length_of_array];
        for(int i=0; i<length_of_array; i++){
            System.out.print("Enter nazvanie_massiva["+ i + "] = ");
            nazvanie_massiva [i] = to_chto_vvodit_polzovatel.nextInt();
            //chtobi opyat polzovatel mog znachenie pod poryadkovim nomerom
        }


  }
}
