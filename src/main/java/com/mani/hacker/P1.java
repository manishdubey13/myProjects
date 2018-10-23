package com.mani.hacker;

import java.util.Scanner;

public class P1
{


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            Double d  = scan.nextDouble();
            String s = scan.next();
            scan.close();
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }

}
