package org.example;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class PhepNhan {
    @Test
    public void testIsInteger_ValidInteger() {
        assertTrue(IntegerMultiplier.isInteger("5"));
        assertTrue(IntegerMultiplier.isInteger("-10"));
    }

    @Test
    public void testIsInteger_InvalidInteger() {
        assertFalse(IntegerMultiplier.isInteger("abc"));
        assertTrue(!IntegerMultiplier.isInteger("3.14"));
        assertFalse(IntegerMultiplier.isInteger(""));
    }

    @Test
    public void testMultiply_ValidIntegers() {
        assertEquals(6, IntegerMultiplier.multiply(2, 3));
        assertEquals(-15, IntegerMultiplier.multiply(-3, 5));
        assertEquals(0, IntegerMultiplier.multiply(0, 10));
    }

    @Test
    public void testMultiply_EdgeCases() {
        assertEquals(Integer.MAX_VALUE, IntegerMultiplier.multiply(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE, IntegerMultiplier.multiply(Integer.MIN_VALUE, 1));
    }


    public class IntegerMultiplier {

        // Phương thức kiểm tra xem một chuỗi có phải là số nguyên hay không
        public static boolean isInteger(String str) {
            if (str == null || str.isEmpty()) {
                return false;
            }
            try {
                Integer.parseInt(str);  // Cố gắng chuyển chuỗi thành số nguyên
                return true;
            } catch (NumberFormatException e) {
                return false;  // Nếu không thể chuyển đổi, trả về false
            }
        }

        // Phương thức nhân hai số nguyên
        public static int multiply(int a, int b) {
            return a * b;
        }
    }




}