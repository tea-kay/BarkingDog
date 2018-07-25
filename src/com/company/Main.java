package com.company;

public class Main {

    public static void main(String[] args) {

        bark(true, -1);
    }

    public static boolean bark(boolean barking, int hourOfDay){

        if ((barking) && (hourOfDay >= 0 && hourOfDay < 8)) {

            return true;

        } else if ((barking) && (hourOfDay > 22 && hourOfDay <= 23)) {

            return true;

        } else {

            return false;

        }
    }

}
