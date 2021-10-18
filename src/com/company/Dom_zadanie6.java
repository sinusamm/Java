package com.company;

public class Dom_zadanie6 {
    public static void main(String[] args) {
    int[] numbers = {62710573, 62710589, 62710591, 62710619, 62710631, 62710633, 62710639, 62710651, 62710657, 62710693};
    int min, max;
    min = max = numbers[0];

    for (int i = 1; i < 10; i++) {
        if (numbers[i] < min)
            min = numbers[i];
        if(numbers[i] > max){
            max = numbers[i];
        }
    }
    System.out.println("min is: " + min + "; max is: " + max);
}
}
