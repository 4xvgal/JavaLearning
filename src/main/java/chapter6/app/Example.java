package chapter6.app;

import java.util.Scanner;

public class Example {
    public static void main(String[] args){
       /*
       //String to int
       String a = "20";
       int b = Integer.parseInt(a);
       System.out.println("origin : " + a + "    converted : " + b);
        */
        /*
        //String to double
        String a = "35.9";
        double b = Double.parseDouble(a);
        System.out.println("origin : " + a + "    converted : " + b); */

//        //Boolean to string
//        Boolean a = true;
//        String b = Boolean.toString(a);
//        System.out.println("origin : " + a + "    converted : " + b);

       //int to binary string
        String n;
        Scanner scanner = new Scanner(System.in);
        n = Integer.toBinaryString(scanner.nextInt());
        System.out.println(n);
    }
}
