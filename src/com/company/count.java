package com.company;

public class count {
//    count---podchet skolko raz
    public static void main(String[] args) {
        String someString="elephant";
//       String --- ""---pishem v kovichkah
//        char---------''----pishem odinarni
        char someChar ='e';
        int count=0;
//        System.out.print(someString.length());
        for(int i=0; i<someString.length();i++) {
//            someString.length-----opred-dlinu massiva ili stringa
            if(someString.charAt(i)== someChar){
                count++;
//                System.out.print(count);-----libo tak ili kak nije
            }else{
                System.out.print("Hello");
            }
        }
        System.out.print(count);
    }
}
