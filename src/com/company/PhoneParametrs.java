package com.company;

public class PhoneParametrs extends PhoneDemo {
//    budem unasledovat parametri v klasse PhoneDemo
//    extends PhoneDemo---otkuda unasled
//    PhoneParametrs-child
    String osystem= "windows";
    public void tellModel(String name){
        System.out.print("Model is: " + super.model);
//        super- eto k rodit-klassy
    }

}
