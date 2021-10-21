package com.company;

import java.util.Arrays;
import java.util.Collections;
//Collections--rabotaet bolshe s list....

public class Dom_zadanie6 {
    public static void main(String[] args) {
    Integer [] numbers = {62710589, 62710591,62710573,  62710619, 62710631, 62710633, 62710639, 62710651, 62710657, 62710693};
//        Integer--klass obiekt, a int to chto v nee vhodit ---dlya primera 4 integer
//        Collections ne mojet rabotat tolko s int, bolshe pred.brat obiemnoe
//        Int [] numbers = {62710589, 62710591,62710573,  62710619, 62710631, 62710633, 62710639, 62710651, 62710657, 62710693}; ----dlasya ost eto, krome primera 4
    int min, max;
    min = max = numbers[0];
//    0=62710573
//        dlya vivoda otsortirovki ot naim.k bolsemu

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
//        System.out.print(Arrays.toString(numbers));---dlya vivoda v konsol otsortiroval s naim .k bolshemu

        //primer3 dlya vivoda  nashego massiv v poryad-vozrs
        Arrays.sort(numbers);
        System.out.println("Arrays: " +Arrays.toString(numbers));

        //primer 2 dlya vivoda max i min
//        int[] numbers = {62710573, 62710589, 62710591, 62710619, 62710631, 62710633, 62710639, 62710651, 62710657, 62710693};
//        Arrays.sort(numbers);
//        System.out.print("Min: " + numbers[0]+ " " + "Max: " + numbers[numbers.length -1] );

        //primer 4 dlya vivoda v poryadke ubivanija
//        Integer[] numbers = {62710589, 62710591,62710573,  62710619, 62710631, 62710633, 62710639, 62710651, 62710657, 62710693};
        Arrays.sort(numbers, Collections.reverseOrder());
//        reverseOrder--perevernut posled.v poryadke ubivanija
        System.out.println("Arrays: " +Arrays.toString(numbers));



        for (int i = 1; i < 10; i++) {
//        1=62710589
        if (numbers[i] < min)
            min = numbers[i];
        if(numbers[i] > max){
            max = numbers[i];
        }
    }
    System.out.println("min is: " + min + "; max is: " + max);
}
}

