package com.company;

import java.util.Arrays;

public class Dom_zadanie6 {
    public static void main(String[] args) {
    int[] numbers = {62710573, 62710589, 62710591, 62710619, 62710631, 62710633, 62710639, 62710651, 62710657, 62710693};
    int min, max;
    min = max = numbers[0];
//    0=62710573
//        dlya vivoda otsortirovki ot naim.k bolsemu

        Arrays.sort(numbers);
        System.out.print(Arrays.toString(numbers));
//        System.out.print(Arrays.toString(numbers));---dlya vivoda v konsol otsortiroval s naim .k bolshemu


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
//primer 2 dlya vivoda max i min
//        int[] numbers = {62710573, 62710589, 62710591, 62710619, 62710631, 62710633, 62710639, 62710651, 62710657, 62710693};
//        Arrays.sort(numbers);
//        System.out.print("Min: " + numbers[0]+ " " + "Max: " + numbers[numbers.length -1] );



