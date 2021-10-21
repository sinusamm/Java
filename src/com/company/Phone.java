package com.company;

public class Phone {
//    sozdanie  obijektov
    public static void main(String[] args) {
        PhoneDemo phone1=new PhoneDemo();
        PhoneDemo phone2=new PhoneDemo();
        PhoneDemo2 phone3= new PhoneDemo2("+372 58677640", 500,  "Huawei");
        PhoneDemo3 phone4=new PhoneDemo3( "+372 58436363",800, "Sony");
        PhoneDemo3 phone5=new PhoneDemo3( "+372 52536343","LG");
//        viveli eto  sozdav v klassah kostruktori i poetomu vse vivoditsya v odin ryad
        PhoneParametrs phone6=new PhoneParametrs();
        PhoneParametrs phone7=new PhoneParametrs(2, 64, "IOS");
//        2 i 64 bez kovichki tak kak mi eto zadaem kak int
        PhoneParametrs phone8=new PhoneParametrs(2, 1500, "IOS", "+372 56495036", 64, "Iphone_12");


        phone1.number= "+372 56565675";
        phone1.price=700;
        phone1.model="Samsung";
//        a tut mi propisivaem vse v ruchnyju-----ili mojem propisat vnutri klassov, mi sosd-konstr po umolch...poetomu zdes propis.v ruchnuju i vizivaem s pomoshju   ----naprimer---  System.out.println(phone3.number);

        phone2.number= "+372 56365674";
        phone2.price=1000;
        phone2.model="Apple";

        System.out.println(phone1.getNumber());
//        System.out.println(phone1.getNumber());------vizvali func
        System.out.println(phone1.price);
        System.out.println(phone1.model);
        System.out.println(" ");
//        System.out.println(" ");--dlya probela
        System.out.println(phone2.number);
        System.out.println(phone2.price);
        System.out.println(phone2.model);
        System.out.println(" ");
        System.out.println(phone3.number);
        System.out.println(phone3.price);
        System.out.println(phone3.model);
            System.out.println(" ");
            System.out.println(phone4.number);
            System.out.println(phone4.price);
            System.out.println(phone4.model);
        System.out.println(" ");
        System.out.println(phone5.number);
        System.out.println(phone5.model);
        System.out.println(" ");
        System.out.println(phone6.model);
        System.out.println(phone6.system);
        System.out.println(phone4.number);
        System.out.println(phone4.price);
        System.out.println(phone4.model);
        System.out.println(" ");
        System.out.println(phone7.core);
        System.out.println(phone7.memory);
        System.out.println(phone7.system2);
        System.out.println(" ");
        phone1.calling("Mom");
//        eto dlya viziv funk k kontr obektu
        phone1.calling("Dad");
//ln---on vidit ot klassa PhoneDemo
        phone6.tellModel("Xiaomi");
        phone8.GetPhone8();
//        ---mi sozd.vnutri kakogo to klassa funktsiju, potom vnutri metoda system.... a dlya vizova suda         phone8.GetPhone8();
    }
}
