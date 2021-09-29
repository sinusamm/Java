package com.company;

public class exception {
//    exception-iskluchenie
    // try-pitaemsya-.--------catch-lovit
public static void main(String[] args) {
    int num;
    int array[]={1,2,3};
    try{
        num=100/0;
        System.out.println(array[5]);
    }catch(Exception e){
        System.out.println(e);
    }
        try{
            System.out.println(array[8]);
        }catch(Exception e){
            System.out.println(e);
    }finally {
//    }finally {----eto v lubom sluchae vivoditsya
        System.out.print("Hello world!");
}
}
}