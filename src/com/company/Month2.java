package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Month2 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner userInput = new Scanner(System.in);
//       daem vozmojnost  vvodit polzovatelu etoi comand luboi nazv mesyatsa
        System.out.print("Please enter name of months January-December(example: June): ");
        String chosenMonth = userInput.nextLine();
//        String---eto u nas .nextLine();
        if (Arrays.asList(months).contains(chosenMonth)) {
//           contains--soderjitsya  li v nashem massive naprimer june?
//            aslist--on daet prav.indeks vnutri massiva
            System.out.print(Arrays.asList(months).indexOf(chosenMonth)+1);
        } else {
            System.out.print("false");
        }
    }
}
//primer2
//        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//        System.out.print("Please enter name of months January-December(example: June): ");
//        String chosenMonth = userInput.nextLine();Scanner userInput = new Scanner(System.in);
//        List<String> monthsnum=Arrays.asList(months);
//     if (monthsnum.contains(chosenMonth)) {
//        System.out.print(monthsnum.indexOf(chosenMonth)+1);
//        }
//        } else {
//        System.out.print("false");
//        }