package io.zipcoder.microlabs.mastering_loops;

import static io.zipcoder.microlabs.mastering_loops.NumberUtilities.getRange;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        int [] [] matrix = new int[4][4];
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= column; j++) {
                table += String.valueOf(i * j);
            }
            table += "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
