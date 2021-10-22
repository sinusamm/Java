package com.company;

public class exception {
    //    exception-iskluchenie
    // try-pitaemsya-.--------catch-lovit
    public static void main(String[] args) {
        int num;
        int array[] = {1, 2, 3};
        try {
            System.out.println(array[5]);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
//    tut srab.catch---catch eto oshibka---tak kak 5 el.ne sushest
//        Index 5 out of bounds for length 3


//     2 primer...no pri etom etot try mojet sush.s drugim tryem tozhe ,,,,100/0---nelzya i v etom sluc-toje srab-catch
        try {
            num = 100 / 0;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
//    }finally {----eto v lubom sluchae vivoditsya
            System.out.print("Hello world!");
        }
    }
}
//java.lang.ArithmeticException: / by zero