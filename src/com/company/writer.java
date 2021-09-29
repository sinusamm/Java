package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
//java.util.Arrays;---soderjimoe massiva prevratit v string
//PrintWriter-zapis vnutr faila

public class writer {
    public static void main(String[] args) {
        try{
//            primer 1
            File file= new File("file.txt");
//            "src/com/company/file.txt"--------puti sozd.faila
            // ..------------viti is papki-----------------"../file.txt"
            if(!file.exists()){
//                if(!file.exists()){-ne sushestv.li etot fail uje??? Idet proverka..esli ego net to on sozd..esli net to on ne sozd., tak kak uje sushestv.
//                !-ne sushestvuet li?
                    file.createNewFile();
//                    File-rabota s failami
            }
            String [] months= {"January", "February", "March","April", "May", "June", "July", "August", "September", "October", "November", "December"};
            PrintWriter sometext= new PrintWriter(file);
            sometext.println("Hello world!");
//          sometext.println(" ");----------eto komanda udalit nadpis v faile
            sometext.println("Hello!");
//            sometext.print("Hello world!")----zapis teksta v faile
            sometext.print(Arrays.toString(months));
//            Arrays.toString--chtobi perenes text kakoi ukazali vnutri massiva v text.fail
            sometext.close();
            //            sometext.close()----nujno pisat vsegda, inache nichego ne zapishetsya...etu komandu pishem poslednim
        }catch(Exception e){
                System.out.print("Error: " +e);
            }
        }
        }
//primer 2
//vze eto pishem vnutri konstr-try
//        PrintWriter sometext= new PrintWriter(file);
//        int num=100/10
//        sometext.println("Hello world!");
//        sometext.println("Hello!");
//        sometext.println("number is:c+num");
//        sometext.close();