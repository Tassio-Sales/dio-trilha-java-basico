package edu.tassio.firstWeek;

public class MyClass {

    public static void main(String [] args) {

        /*String myName = "Tássio";
        int yearManufacture = 2023;
        boolean real = false;
        yearManufacture = 2018;*/

        String firstName = "Tássio";
        String surName = "Sales";

        String fullName = fullName(firstName, surName);

        System.out.println(fullName);

    }
    public static String fullName (String firstName, String surName) {

        return firstName.concat(" ").concat(surName);

    }
}
