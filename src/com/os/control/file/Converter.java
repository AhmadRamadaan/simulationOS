package com.os.control.file;

public class Converter {

    public static int convertStringToInt(String s) {
        int i;
        int result = 0;
        char[] toCharArray = s.toCharArray();
        for (Character c : toCharArray) {
            
            i = convertOneDigit(c.toString());
            result = (result * 10) + i;
        }
        return result;
    }

    public static int convertOneDigit(String s) {

        if (s.equals("0")) {
            return 0;
        }

        if (s.equals("1")) {
            return 1;
        }

        if (s.equals("2")) {
            return 2;
        }

        if (s.equals("3")) {
            return 3;
        }

        if (s.equals("4")) {
            return 4;
        }

        if (s.equals("5")) {
            return 5;
        }

        if (s.equals("6")) {
            return 6;
        }

        if (s.equals("7")) {
            return 7;
        }

        if (s.equals("8")) {
            return 8;
        }

        if (s.equals("9")) {
            return 9;
        }

        return -1;
    }

}
