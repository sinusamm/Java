package com.company;

public class Parametrs_Phone2vlozhkl {
//    public class Phone2 {----eti klassi svyaz-mejdu soboi
// na temu vlozhennie klassi java
    class core{
//        sozdali class
        String core="switch off";
        public void working(){
            core= "working";
//            vkluchili onn tochnee
            System.out.println("core is "+ core);

        }
        public void notworking(){
            core="not working";
            System.out.println("core is "+ core);
        }
}
    class memory{
        String memory= "switched off";
    //vikluchen

    public void working(){
    memory= "working";
//            vkluchili onn tochnee
    System.out.println("memory is " + memory);

}
    public void notworking() {
        memory = "not working";
        System.out.println("memory is " + memory);
    }
}
            core intelcore=new core();
//    intelcore--vid protsesora..est eshe ryzen
    memory kingston= new memory();

}
