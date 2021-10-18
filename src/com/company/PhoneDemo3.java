package com.company;

public class PhoneDemo3 {
    String number;
    int price;
    String model;

    PhoneDemo3(String number,int price, String model){
        this.number=number;
//        this---on ukazivaet na nomer tolko iz etogo klassa....tochnee   PhoneDemo3(String number,int price, String model){
        this.price= price;;
        this.model=model;
    }
    PhoneDemo3(String number, String model){
//        mi tut mozhem sozdat takuy je finc tolko vnutri skobki doljni bit otlichija
        this.number= number;
        this.model=model;
    }
}
