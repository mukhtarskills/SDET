package com.syntax.review1;

public class Variables {

    public static void main(String[] args) {

        /*
            variablesSyntax
            dataType name;
         */

        // declare a variable and initialize it
        String name = "Zak";

        String lastName; //declaration happens ONLY once
        lastName = "Smith"; // initialize or assign the value

        int age;
        age=21;
        age=22; //reassign or update

        System.out.println(age);

        String Street, City, State;
        Street="123 Test";
        City="Dream City";
        State="Wonderful State";
        State="Different State";

        System.out.println(State);
    }
}
