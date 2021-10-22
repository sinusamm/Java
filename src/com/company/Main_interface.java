package com.company;

public class Main_interface {
//    otkuda nachin.ves klass
    public static void main(String[] args){
//        sozdaem sdez obiekt
        Myprint car=new Myprint("Audi", "A6");
        car.printCar();
//        eto nasha funktsija----------        car-printCar();
        Myprint bike=new Myprint("Yamaha", "Z1");
        bike.printBike();
        car.readCar();
        bike.readBike();
    }
}
