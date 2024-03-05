package io.zipcoder.microlabs.mastering_loops;
import java.util.*;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder evenNumbers = new StringBuilder();
        for (int i = start; i <= stop; i++) {
            if (i % 2 == 0) {
                evenNumbers.append(i);
            }
        }
        return evenNumbers.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        for (int i = start; i <= stop; i++) {
            if (i % 2 != 0) {
                oddNumbers += String.valueOf(i);
            }
        }
        return oddNumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squares = "";
        for (int i = start; i <= stop; i += step) {
            squares += String.valueOf(i * i);
        }
        return squares;
    }

    public static String getRange(int stop) {
        String s = "";
//        for (int i = 0; i < stop; i++){
//            s += String.valueOf(i);
//        }
//        return s;
    return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
//        String s = "";
//        for (int i = start; i < stop; i++) {
//            s += String.valueOf(i);
//        }
//        return s;
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String iterationsByStep = "";
        for (int i = start; i < stop; i += step) {
            iterationsByStep += String.valueOf(i);
        }
        return iterationsByStep;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponations = "";
        for (int i = start; i < stop; i+= step) {
            exponations += String.valueOf((int)Math.pow(i, exponent));
        }
        return exponations;
    }
}


// public int getAge(int num) {
//   int age = 0;
//   System.out.println("Enter your age: ");
//   age = scanner.nextLine;

//   return age;
//     }