package com.company;

public class While {
    public static void main(String[] args) {
        // rabotaet poka znach.yavl istinnim ili neistinnm to est true ili false
        boolean isTrue=true;
        // boolean libo true libo false dr.znachenie ne bivaet
        int j=0;
        while(isTrue) {
            System.out.println("hello!");
            //System.out.print("hello!");---vivod v konsol
            j++;
            if(j>5){
                isTrue=false;
                // mojno break zamenit breake
                // tolko v while tsikle stavitsya break
                //budet vivoditsya 6 raz tak kak j=o



            }

        }

    }
}
