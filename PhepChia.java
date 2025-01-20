package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PhepChia {

    // Kiểm tra chia cho các số dương và âm
    @Test
    public void testDivide_PositiveNumbers() {
        assertEquals(IntegerDivider.divide(10, 2), 5.0);
        assertEquals(IntegerDivider.divide(7, 2), 3.5);
    }

    @Test
    public void testDivide_NegativeNumbers() {
        assertEquals(IntegerDivider.divide(-10, 2), -5.0);
        assertEquals(IntegerDivider.divide(-7, 2), -3.5);
        assertEquals(IntegerDivider.divide(10, -2), -5.0);
    }

    @Test
    public void testDivide_MixedSigns() {
        assertEquals(IntegerDivider.divide(-10, -2), 5.0);
    }

    // Kiểm tra chia cho số 0 (phần vùng tương đương)
    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivide_ByZero() {
        IntegerDivider.divide(10, 0);
    }

    // Kiểm tra biên cho các số nguyên lớn
    @Test
    public void testDivide_LargeNumbers() {
        assertEquals(IntegerDivider.divide(Integer.MAX_VALUE, 1), (double) Integer.MAX_VALUE);
        assertEquals(IntegerDivider.divide(Integer.MIN_VALUE, -1), (double) Integer.MIN_VALUE);
    }

    // Kiểm tra chia với số 1 và -1 (biên)
    @Test
    public void testDivide_ByOne() {
        assertEquals(IntegerDivider.divide(10, 1), 10.0);
        assertEquals(IntegerDivider.divide(-10, 1), -10.0);
    }

    // Kiểm tra chia cho chính nó (biên)
    @Test
    public void testDivide_SameNumbers() {
        assertEquals(IntegerDivider.divide(10, 10), 1.0);
        assertEquals(IntegerDivider.divide(-10, -10), 1.0);
    }

    // Kiểm tra chia cho số lớn nhất và nhỏ nhất
    @Test
    public void testDivide_LargeDivisions() {
        assertEquals(IntegerDivider.divide(Integer.MAX_VALUE, Integer.MIN_VALUE), (double) Integer.MAX_VALUE / Integer.MIN_VALUE);
        assertEquals(IntegerDivider.divide(Integer.MIN_VALUE, Integer.MAX_VALUE), (double) Integer.MIN_VALUE / Integer.MAX_VALUE);
    }

    // Kiểm tra chia với số nhỏ nhất
    @Test
    public void testDivide_MinValue() {
        assertEquals(IntegerDivider.divide(Integer.MIN_VALUE, 1), (double) Integer.MIN_VALUE);
        assertEquals(IntegerDivider.divide(Integer.MAX_VALUE, Integer.MAX_VALUE), 1.0);
    }

    // Kiểm tra chia Integer.MIN_VALUE cho -1 (tràn số)
    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivide_MinValueByNegativeOne() {
        IntegerDivider.divide(Integer.MIN_VALUE, -1);  // Đây sẽ gây ra tràn số
    }


    public class IntegerDivider {

        // Phương thức thực hiện phép chia hai số nguyên
        public static double divide(int numerator, int denominator) {
            // Kiểm tra trường hợp chia cho 0
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            // Xử lý phép chia bình thường
            return (double) numerator / denominator;
        }
    }

}
