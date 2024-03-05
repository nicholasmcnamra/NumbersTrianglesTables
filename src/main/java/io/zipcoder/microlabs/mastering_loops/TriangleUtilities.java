package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 2; i <= numberOfRows; i++) {
            for (int j = 1; j < i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {
        String width = "";
        for (int i = 1; i <= numberOfStars; i++) {
            width += "*";
        }
        return width;
    }

    public static String getSmallTriangle() {
        String smallTriangle = "";
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                smallTriangle += "*";
            }
            smallTriangle += "\n";
        }
        return smallTriangle;
    }

    public static String getLargeTriangle() {
        String largeTriangle = "";
        for (int i = 2; i <= 10; i++) {
            for (int j = 1; j < i; j++) {
                largeTriangle += "*";
            }
            largeTriangle += "\n";
        }
        return largeTriangle;
    }
}
