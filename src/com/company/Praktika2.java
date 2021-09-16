package com.company;

public class Praktika2 {
    public static void main(String[] args) {
        for(int a=1; a<10; a++) {
            //skolko srtochek vniz..skolko raz budet rabotat 2 oi tsikl
            for(int b=1; b<=10; b++) {
                //dlina stochki
                System.out.print(a*b + "\t ");
            }
            System.out.print("\n");
            // System.out.println("\n"); eshe bolshe budet s probelom
            //("\n")- slesh n
            // \t- mojem delat odinakovyu tablitsu...simvol poryadka
            //System.out.print(a*b + "\t ");       System.out.print("\n");           eti 2 komandi nujni chtobi poluch tabl
        }
    }
}
