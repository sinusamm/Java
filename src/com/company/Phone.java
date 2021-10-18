package com.company;

public class Phone {
//    sozdanie  obijektov
    public static void main(String[] args) {
        PhoneDemo phone1=new PhoneDemo();
        PhoneDemo phone2=new PhoneDemo();
        PhoneDemo2 phone3= new PhoneDemo2("+372 58677640", 500,  "Huawei");
        PhoneDemo3 phone4=new PhoneDemo3( "+372 58436363",800, "Sony");
        PhoneDemo3 phone5=new PhoneDemo3( "+372 52536343","LG");
        PhoneParametrs phone6=new PhoneParametrs();


        phone1.number= "+372 56565675";
        phone1.price=700;
        phone1.model="Samsung";

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

        phone1.calling("Mom");
        phone1.calling("Dad");

//ln---on vidit ot klassa PhoneDemo
    }
}
