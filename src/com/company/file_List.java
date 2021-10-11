package com.company;

import java.util.ArrayList;

public class file_List {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        // ArrayList--razdnovidnost massiva,spisok kotori pohoj na massiv
//        ArrayList--pri sod-obiekta
        cars.add("Audi");
        cars.add("Bmw");
        cars.add("Mazda");
        System.out.print(cars.get(1));
    }
}
