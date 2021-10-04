/*
 * Java Web Development
 * JWD 35
 * Oleg Kotov
 * Task2
 * JUnit, Maven
 * From 01-10-2021 to 03-10-2021
 */
package com.epam.jwd35.kotov.task2.junit_maven.main;

import java.util.Scanner;

/*
 * Вычислить периметр и площадь прямоугольного треугольника по длинам двух катетов.
 */
public class TrianglePerimetrAdnAria {
    final static String CATHETUS_NUMBER1 = "first";
    final static String CATHETUS_NUMBER2 = "second";
    final static String PERIMETR_VALUE_NAME = "Perimetr";
    final static String AREA_VALUE_NAME = "Area";

    public static void main(String[] args) {
        manageProgram();
    }

    private static double readDoubleNumber(String cathetusNumber) {
        double length;
        boolean trueData;
        @SuppressWarnings("resource")
        Scanner inputData = new Scanner(System.in);

        length = 0;
        trueData = false;

        printMessageForReading(cathetusNumber);
        while (!isPositiveCathetusLength(length)) {
            if (trueData) {
                printErrorMessageForReading();
                printMessageForReading(cathetusNumber);
            }
            while (!inputData.hasNextDouble()) {
                inputData.nextLine();
                printErrorMessageForReading();
                printMessageForReading(cathetusNumber);
            }
            length = inputData.nextDouble();
            trueData = true;
        }
        return length;
    }

    private static boolean isPositiveCathetusLength(double length) {
        return (length > 0 ? true : false);
    }

    public static double calculatePerimeter(double cathetusLength1, double cathetusLength2) {
        double perimetr;
        double hypotenuse;

        if (cathetusLength1 <= 0 || cathetusLength2 <= 0) {
            perimetr = -1;
        } else {
            hypotenuse = Math.sqrt(Math.pow(cathetusLength1, 2) + Math.pow(cathetusLength2, 2));
            perimetr = cathetusLength1 + cathetusLength2 + hypotenuse;
        }
        return perimetr;
    }

    public static double calculateArea(double cathetusLength1, double cathetusLength2) {
        double area;

        if (cathetusLength1 <= 0 || cathetusLength2 <= 0) {
            area = -1;
        } else {
            area = (cathetusLength1 * cathetusLength2) / 2;
        }
        return area;
    }

    private static void manageProgram() {
        double cathetusLength1;
        double cathetusLength2;
        int valueCapacity;
        double perimetr;
        double area;

        valueCapacity = 2;
        cathetusLength1 = readDoubleNumber(CATHETUS_NUMBER1);
        cathetusLength2 = readDoubleNumber(CATHETUS_NUMBER2);
        perimetr = calculatePerimeter(cathetusLength1, cathetusLength2);
        area = calculateArea(cathetusLength1, cathetusLength2);

        if (perimetr == -1) {
            printErrorMessageForReading();
        } else {
            perimetr = roundOff(perimetr, valueCapacity);
            printMessageForWriting(PERIMETR_VALUE_NAME, perimetr);
        }

        if (area == -1) {
            printErrorMessageForReading();
        } else {
            area = roundOff(area, valueCapacity);
            printMessageForWriting(AREA_VALUE_NAME, area);
        }
    }

    private static void printMessageForReading(String cathetusNumber) {
        System.out.println("Enter the length of the " + cathetusNumber + " cathetus:");
    }

    private static void printErrorMessageForReading() {
        System.out.println("Incorrect data entered.");
    }

    private static void printMessageForWriting(String valueName, double value) {
        System.out.println(valueName + ": " + value);
    }

    private static double roundOff(double number, int capacity) {
        double scale;
        double result;

        scale = Math.pow(10, capacity);
        result = Math.round(number * scale) / scale;
        return result;
    }
}