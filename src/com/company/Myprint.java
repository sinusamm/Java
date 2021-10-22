package com.company;

public class Myprint implements Print, Read {
//    hotim podkl.k nashemu interfeisu Print
//    eto rebenok ot rodit.chto to brat
//    implements----eto realizatsija i prinadlezhnost
//Print, Read--podkl.nashi interfeisi...mojem realizovat skolko ugodno interfeisov
    String mark;
    String model;

    Myprint(String mark, String model){
//        sozd-konstruktor
        this.mark=mark;
        this.model=model;
    }
    public void printCar(){
        System.out.println(mark+ " " + model);
//        " "---eto probel
    }
    public void printBike() {
        System.out.println(mark + " " + model);
    }
    public void readCar(){
        System.out.println("Bmw x5");
    }
    public void readBike() {
        System.out.println("Yamaha Z2");
    }
        }
//        disk s krasnoe vectorom ---pokaz.iz kakogo klassa beretsya, eto navigatsija

