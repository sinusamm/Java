package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
public class Reader3 {
//    zadanie na podshet bukvi a
    public static void main(String[] args) {
        BufferedReader reader=null;
        try{
            reader=new BufferedReader(new FileReader("file.txt"));
            String line;
            int count=0;
            char someChar='a';
            while((line=reader.readLine()) !=null) {
                System.out.println(line);
                for (int i = 0; i < line.length(); i++) {
//                    line. length()---vivod dlini stroki
                    if (line.charAt(i) == someChar) {
                        count++;
                    }
                }
                System.out.println(count);
                count=0;
//                count=0;----esli eto ne zapisat, on budet chitat v kajdoi stroke bukvu i v sled.perexode pribavlyat k podchitannoi kol.bukve a
            }
            reader.close();
        }catch(Exception e) {
            System.out.print("Error:" + e);
            }
        }
    }

