package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//import java.io.FileReader;------------dlya chtenija
public class Reader1 {
    public static void main(String[] args) {
        BufferedReader reader = null;
//                BufferedReader-s pomoshju etogo klassa mi otkrivaem i chitaem faili
        String s;
//      String s;---------    raz stroka string doljen bit obyazetelno
        String s1;
        try{
            reader =new BufferedReader(new FileReader("file.txt"));
            s= reader.readLine();
            s1= reader.readLine();
            System.out.println(s);
            System.out.print(s1);
        }catch (Exception e) {
            System.out.print("Error:" + e);
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
//                alt+enter gde close----surround....ispravil oshibku
            }
        }
    }
}
