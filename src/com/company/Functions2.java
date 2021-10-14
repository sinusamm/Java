package com.company;

import java.util.Arrays;

public class Functions2 {
//  zadanie na  otsortirovat prostie chisla
//    prostoe chislo eto kogda chislo del-samu na sebya
    public static void main(String[] args) {
        int length =3;
//        1000 na samom dele, chtobi besk.ne srabatival stavim tolko 3
        int[] prostqe = new int[length];
        int n = 0;
        for (int i = 2; n < prostqe.length; i++) {
            boolean isTrue = true;
            for (int j = 2; j<i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                }
                System.out.println("i: "+i);
                System.out.println("j: "+j);
            }
            if(isTrue){
                prostqe[n]=i;
                n++;
//                chtobi zapisat vnutr massiva deistv.prostoe chislo
            }
        }
        System.out.print(Arrays.toString(prostqe));
//        [2,3,5]
    }
}
