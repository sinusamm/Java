package com.company;

public class Function__zadanie3 {
    public static void main(String[] args) {
//        nahojd.max i min s pomoshju dvuh function v massive

        int[] numbers = {62710573, 62710589, 62710591, 62710619, 62710631, 62710633, 62710639, 62710651, 62710657, 62710693};
        System.out.println(GetMax(numbers));
        System.out.println(GetMin(numbers));
    }
    public static int GetMax(int[]array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
//        return----peredaet dannie v pervuju func
    }
    public static int GetMin(int[]array){
//        array=numbers----odno i toshe
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;

    }
}
