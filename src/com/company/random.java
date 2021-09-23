package com.company;

import java.util.Random;
//class nazv iz mal.bukvi tak kak nazv iz bolshoi bukvi dal bi nam konflikt s bibliotekoi

public class random {
    // Kak randomit  chisla. Prorabotali 2 sposoba
    public static void main(String[] args) {
        // 1-i sposob
//       Random rand= new Random();
//       int num1;
//       for(int i=0; i<5; i++) {
//        num1 = rand.nextInt();
//        System.out.println(num1);
        // Random rand= new Random();  +++  num1 = rand.nextInt();=======eti 2 kommandi obyaz

//         2-oe zadanie
//            int num1;
//            int max=25
//                  for(int i=0; i<5; i++) {
//                   num1 = rand.nextInt(max); max-eto granitsa
//                   System.out.println(num1);
//            v etom sluchae stavim granitsu do 25; 0-25

        // Vtoroi sposob
//           int num1 =0;
//           num1=(int)Math.floor(Math.random()*100);
        //   num1=(int)Math.floor(Math.random()*100);---dlya vtorogo sposoba ego dostatochno
        //Math.floor(Math.random()---------oni idut vmeste
        //*100);---------eto granitsa
        //=(int)----vsegda pishem s chem rabotaet,,,,,eto mojet bit i float i t.d
        //Math.floor-??????????????
        // Math.round-eto okruglenie
//           //randomim ot 0 do 100
//           System.out.print(num1);
    }
        }


