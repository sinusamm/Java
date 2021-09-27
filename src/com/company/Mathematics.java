package com.company;

public class Mathematics {
    public static void main(String[] args) {
//        [0;1)---- interval ot 0 vkluchitelno do  1 iskluchit
//        Math.random()--- printsip raboti rabotaet ot  0 vluchit. do 1 iskluchit. ----------0,01 i 0,9 mojet sushestv
//        Math.floor---okruglenie do naimenshego
//        Math.ceil---okruglenie do naibolshego tselogo
//        [0;1)*100= [0;100) ottuda Math.random()*100
//        Math.round---matem.okruglenie, okrugl.kak mi privikli-----99,6=100
//        Math.max---nahojd.max znachenija
//        Math.min---nahojd.min znachenija
//        Math.sqrt----- izvlechenija kornya...kvadr.koren 3 v kvad=9


//         primer 1
//        double num1;
//        num1=Math.random();
//        System.out.print(num1);

//        primer 2
//        double num2=99.99999999d;
//        System.out.print((int)Math.floor(num2));
//        int---tseloe chislo, poetomu dast 99 a ne 99.0
//        result=99

//        primer3
        double num3=99.99999999d;
        System.out.print((int)Math.ceil(num3));
//        result=100

//        primer4
        double num4=99.5d;
        System.out.print((int)Math.round(num4));
//        result=100

//      primer5(nahojdenie max i min)------Math.max-----Math.min
         int num5, num6;
         num5=10;
         num6=20;
         System.out.print("maximum: " + Math.max(num5,num6));
        System.out.print("minimum: " + Math.min(num5,num6));

//      primer6(izvle.kornya)
        int num7=9;
        System.out.print("Izvlechenie kornya: "+Math.sqrt(num7));
//        res=3
    }
}
