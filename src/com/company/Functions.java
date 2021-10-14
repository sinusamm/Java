package com.company;

import java.util.Arrays;

public class Functions {
//    funktsii oni je i set metodi


//    1-oe zadanie
//public static void main(String[] args) {
//    main-eto klass
//    void-ne vozvrashaet nikakie znachenija
//    static- модификатор, применяемый к полю, блоку, методу или внутреннему классу. Данный модификатор указывает на  привязку субъекта  к текущему классу.
//    System.out.println(function0(10000,500));
//    System.out.println(function1(10000,500));
//}
//    public static int function0(int num1, int num2){
//    int result;
//    result=num1 +num2;
//    return result;
//    }
//    public static int function1(int num1, int num2){
//        int result;
//        result=num1 - num2;
//        return result;
//}
//    }

// primer-2  vivod prostix chisel s pomoshju temi funktsi
    public static void main(String[] args) {
        int length = 1000;
        int[] prostqe = new int[length];
        int n = 0;
        for (int i = 2; n < prostqe.length; i++) {
            if (proverka_prostogo(i)) {
                prostqe[n] = i;
                n++;
            }
        }
        System.out.print(Arrays.toString(prostqe));
//        vivod massiva
    }
    public static boolean proverka_prostogo (int n){
        if(n<2){
            return false;
        }
//        proverka menshe li 2 nashe prostoe chislo
        for(int i=2; i<n;i++){
//            n-est nashe 1000, dlina massiva buder prov.1000 raz
            if(n % i==0){
//                %--delenie s ostatkom, ==----sravnivaem s chem-to
                return false;
            }
    }
//       vivelis chisla kotorie podelilis na samu sebya no tolko ne na dr.chislo...poluch--tolko tseloe chislo
        return true;
     }
}