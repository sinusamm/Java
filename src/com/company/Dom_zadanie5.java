package com.company;

public class Dom_zadanie5 {
    public static void main(String[] args) {
        int[] num = new int[]{62710573, 62710589, 62710591, 62710619, 62710631, 62710633, 62710639, 62710651, 62710657, 62710693};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);
        System.out.println("Среднее арифметическое " + sum / num.length);
    }
}


