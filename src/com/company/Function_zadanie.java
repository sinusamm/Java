package com.company;

import java.util.Arrays;

public class Function_zadanie {
    public static void main(String[] args) {

//        Просто́е число́ — натуральное (целое положительное) число, имеющее ровно два различных натуральных делителя — единицу и самого себя.

        int length = 1000;
        int[] prostqe = new int[length];
        int n = 0;
//        n-index ili poryad.nomer...massiv nachin. s 0
        for (int i = 2; n < prostqe.length; i++) {
            if (proverka_prostogo(i)) {
                prostqe[n] = i;
                n++;
            }
        }
        System.out.println(Arrays.toString(prostqe));

//  zadanie 2

        int kvadrat=prostqe[999]*prostqe[999];
        System.out.println(kvadrat);
//        poluchaem 7919*7919=62710651...........999 tak kak granitsa 1000, 999 poruad.nomer v yacheike
        int[] kvadrat_10=new int[10];
//        62710562.63.64.65.66.67.68.69.70.71???---------yavl.li eti prostimi chislami?
        int m= 0;
//        m - index ..poryad.nomer vnutri massiva
        for(int i =kvadrat; m<kvadrat_10.length;i++){
            if(proverka_prostogo(i)){
                kvadrat_10[m]=i;
                m++;
            }
        }
        System.out.println(Arrays.toString(kvadrat_10));
        int sum = 0;
        for (int i = 0; i < kvadrat_10.length; i++) {
            sum = sum +kvadrat_10[i];
        }
        System.out.println(sum);
}
        public static boolean proverka_prostogo (int n){
        if(n<2){
            return false;
        }
        for(int i=2; i<n;i++){
            if(n % i==0){

                return false;
            }
        }

        return true;
    }
}


