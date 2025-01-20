package org.example;

import java.util.List;

public class Main {
    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int multiply(int a, int b) {
        return a * b;

    }
    public static int divide(int a, int b) {
        return a / b;

    }




    public class AverageCalculator {
        public static double calculateAverage(List<Double> numbers) {
            if (numbers == null || numbers.isEmpty()) {
                throw new ArithmeticException("Không thể chia cho 0, danh sách rỗng.");
            }

            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }

            return sum / numbers.size();
        }
    }


    public class ArrayUtils {
        public static <T> T getElementAtIndex(T[] array, int index) {
            if (index < 0 || index >= array.length) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of range.");
            }
            return array[index];
        }
    }



}


