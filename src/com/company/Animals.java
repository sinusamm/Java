package com.company;

import java.util.concurrent.Callable;

public class Animals {
//    Sozdanie obiektov i rabota s klassami
    public static void main(String[] args) {
        Dogs Archi= new Dogs();
//        sozdali obiekt
        Dogs Katy=new Dogs();
     Cats Liza=new Cats();
     Liza.age=10;
        Archi.age=6;
        System.out.println(Katy.age);
        System.out.println(Archi.age);
        System.out.println(Liza.age);

    Katy.say( "Gav");

    }

}
