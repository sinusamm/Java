package com.company;
import java.util.Arrays;

public class Dom_zadanie4 {
    public static void main(String[] args) {
        int[] array = new int[]{62710573, 62710589, 62710591, 62710619, 62710631, 62710633, 62710639, 62710651, 62710657, 62710693};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}






