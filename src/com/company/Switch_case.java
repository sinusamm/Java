package com.company;

public class Switch_case {
    public static void main(String[] args) {
        int number;
        number=5;
        switch (number) {
            // switch eto uslovni operator
            case 5:
                System.out.println("Number is 5");
                break;
            case 6:
                System.out.println("Number is 6");
                break;
            default:
                // srabotaet v lubom sluchae default daje esli ne srabotaet odin iz casev
                // case mojet sushestv.bez default, default bez case ne mojet
                // posle kajdogo case obyazetelno stavim break
                System.out.print("Number is not 5 or 6");
        }
    }
}
