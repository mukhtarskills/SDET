package com.syntax.review1;

public class whatIf {

    public static void main(String[] args) {
        int a =10;
        int b = 20;
        String c = "Hello";
        String d = "Bye";

        System.out.println(a + b + c + d); //30HelloBye

        System.out.println(a + b + c + d); //10Hello 20Bye

        System.out.println(a + b + c + d); // HelloBye 1020

        System.out.println(a + b + c + d); // HelloBye 30

    }
}
