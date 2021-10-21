package com.company;

public class PhoneParametrs extends PhoneDemo {
//    budem unasledovat parametri v klasse PhoneDemo
//    extends PhoneDemo---otkuda unasled
//    PhoneParametrs-child
//    extends-----eto nasledovanie
    String system= "Windows";
    String system2;
    int core;
    int memory;

    PhoneParametrs(){
//        eto mi sozd-kostr-po umolchaniju()---vnutri skobki pusto
    }

    PhoneParametrs(int core,int memory, String system2){
//        PhoneParametrs(int core,int memory, String system2){---sozd.konstruktor
        //    core--protsesor, memory---pamyat,
        this.system2=system2;
        this.core=core;
        this.memory=memory;
    }
     PhoneParametrs(int core,int memory, String system2, String number, int price, String model){
//         String number, int price, String model){------------delaem nasledovanie berem s dr.klassa..vzyali s klassa rodit- phone demo
         super(number,price,model);
         //         super---gorit krasn...tak kak v rodit.klass phone demo ne soz.kostr; esli est obr-k rodit klassu to pishem pervim, posled.tut vajna
         this.system2=system2;
         this.core=core;
         this.memory=memory;
//         super---gorit krasn...tak kak v rodit.klass phone demo ne soz.kostr
     }
     public void tellModel(String name){
        System.out.println(name + super.model);
//        super- eto obrashenie k rodit-klassy
    }
    public void GetPhone8() {
        System.out.println(system2);
        System.out.println(core);
        System.out.println(memory);
        System.out.println(super.number);
        System.out.println(super.price);
        System.out.println(super.model);
    }
}
