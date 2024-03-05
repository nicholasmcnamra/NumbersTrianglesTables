package io.zipcoder.microlabs.mastering_loops;

import static io.zipcoder.microlabs.mastering_loops.NumberUtilities.getRange;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        int [] [] matrix = new int[5][5];
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i * j > 9) {
                    table += " " + i * j + " |";
                }
                else {
                    table += "  " + i * j + " |";
                }
            }
            table += "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        int [] [] matrix = new int[10][10];
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i * j >= 100) {
                    table += "" + i * j + " |";
                }
                else if (i * j > 9) {
                    table += " " + i * j + " |";
                }
                else {
                    table += "  " + i * j + " |";
                }
            }
            table += "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        int [] [] matrix = new int[tableSize][tableSize];
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i * j >= 100) {
                    table += "" + i * j + " |";
                }
                else if (i * j > 9) {
                    table += " " + i * j + " |";
                }
                else {
                    table += "  " + i * j + " |";
                }
            }
            table += "\n";
        }
        return table;
    }
}
