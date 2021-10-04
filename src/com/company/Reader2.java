package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;

public class Reader2 {
    public static void main(String[] args) {
        BufferedReader reader=null;
        try{
            reader=new BufferedReader(new FileReader("file.txt"));
            String line;
//            String line;---sozd.stroki
            while((line=reader.readLine()) !=null) {
//                while((line=reader.readLine()) !=null)------esli on 0 to on ne budet rabotat, budet chitat esli tam ne budet pusto
//                readLine--del.stroku
                System.out.println(line);
                //rabota so strokoi..polnostju vivedet tekst iz tekstovogo faila
                System.out.println(line.length());
//                System.out.println(line.length());--podchet kol.simv v kajdoi stroke
                String[] array=line.split("");
                //                        line.split-razbivka na elementi vnutri massiva
//                ("");---format dlini---- (" ");---s probelom i s zapyatim,---(" ")---v kovichke dva probela bez zapyatogo
                System.out.println(Arrays.toString(array));
//                System.out.println(array[1]);-------dlya vivoda naprimer vtorogo slova v kajdoi stroke
//                System.out.println(Arrays.toString(array));---prochitat chto vnutri massiva
//                System.out.println(line.toUpperCase());  ---vivod vse slova iz bolshoi bukvi
//                System.out.println(line.toLowerCase());  ---vivod vse slova iz malenkoi bukvi
            }
        }catch(Exception e) {
            System.out.print("Error:" + e);
        }  finally{
//            etoi shemoi mi obyaz.zakrivaem, eta sxema dlya perestrahovki,mojno bilo bez fainally, propisav posle while tsikla    --} reader.close();
            try {
                reader.close();
            }catch(Exception e) {
                System.out.print("Error: "+ e);

            }
        }
    }
}
