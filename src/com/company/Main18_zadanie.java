package com.company;

public class Main18_zadanie {
    public static void main(String[] args) {
        int [] array= new int[] {50,60,50,70,10,5,100};
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
    }
//2 primer
//        int [] array= new int[] {50,60,50,70,10,5,100};
//        int sum = 0;
//        for (int element: array) {
//        sum = sum + element;
//            0=0+50-----budet 50--0=50+60--i t-d
//        }
//        System.out.println(sum);

//3 primer
//        int [] array= new int[] {50,60,50,70,10,5,100};
//        int sum = Arrays stream(array).sum();
//Arrays stream------chitaet vnutri skobki, chtobi znachenija slojit,tak kak  skobki meshaut chitat
//        System.out.println(sum);

//4 primer
//        int [] array= new int[] {50,60,50,70,10,5,100};
//        for (int i=0; i < array.length; i++){
////        sum += array;
//        }
//        System.out.println(sum);

//5 primer
//        int [] array= new int[] {50,60,50,70,10,5,100};
//        System.out.print(Arrays.stream(array).sum());

//6 primer
//        int [] array= new int[] {50,60,50,70,10,5,100};
//        IntStream dannie= IntStream.of(array);
//        sum=dannie.sum();
//        System.out.print(sum);

//7 primer
//        int [] array= new int[] {50,60,50,70,10,5,100};
//        while(i<array.length){
//        sum=sum+array[i];
//        i++;
//        }
//        system.out.println(sum);

//8 primer
//        int [] array= new int[] {50,60,50,70,10,5,100};
//        int sum=0;
//        boolean isTrue=true;
//        while(isTrue){
//        sum+=array[i];
//        i++;
//         if(i>array.length){
//          isTrue=false
//           break;
//    }
//    }
//        System.out.println(sum);
