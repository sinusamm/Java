package com.company;

import java.util.Arrays;

public class function_zadanie2 {

    public static void main(String[] args) {
//zadanie chtobi vse chisla lejali v odnom massive
//        Просто́е число́ — натуральное (целое положительное) число, имеющее ровно два различных натуральных делителя — единицу и самого себя.

        int length = 1010;
        int[] prostqe = new int[length];
        int n = 0;
        for (int i = 2; n < 1000; i++) {
            if (proverka_prostogo(i)) {
                prostqe[n] = i;
                n++;
            }
        }

        int kvadrat = prostqe[999] * prostqe[999];
        System.out.println(kvadrat);
        for (int i = kvadrat; n < prostqe.length; i++) {
            if (proverka_prostogo(i)) {
                prostqe[n] = i;
                n++;
            }
        }
        System.out.print(Arrays.toString(prostqe));

    }

    public static boolean proverka_prostogo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return  true;
    }
}
//u nas vishli vse chisla do 1000+10 chisel prostix-----------ot --2- do -7919, +62710573, 62710589, 62710591, 62710619, 62710631, 62710633, 62710639, 62710651, 62710657, 62710693]=posle kvadrata