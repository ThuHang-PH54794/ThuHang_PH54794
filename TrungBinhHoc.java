package org.example;


import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TrungBinhHoc {

    // Kiểm tra trung bình cộng với danh sách hợp lệ
    @Test
    public void testCalculateAverage_ValidNumbers() {
        List<Double> numbers = List.of(10.0, 20.0, 30.0);
        double result = Main.AverageCalculator.calculateAverage(numbers);
        assertEquals(20.0, result, 0.0001);
    }

    // Kiểm tra ngoại lệ khi danh sách rỗng
    @Test
    public void testCalculateAverage_EmptyList() {
        List<Double> emptyList = List.of();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Main.AverageCalculator.calculateAverage(emptyList);
        });

        assertEquals("Không thể chia cho 0, danh sách rỗng.", exception.getMessage());
    }

    // Kiểm tra trung bình cộng với một số duy nhất
    @Test
    public void testCalculateAverage_SingleNumber() {
        List<Double> numbers = List.of(5.0);
        double result = Main.AverageCalculator.calculateAverage(numbers);
        assertEquals(5.0, result, 0.0001);  // Thêm delta
    }

    // Kiểm tra trung bình cộng với số âm
    @Test
    public void testCalculateAverage_NegativeNumbers() {
        List<Double> numbers = List.of(-10.0, -20.0, -30.0);
        double result = Main.AverageCalculator.calculateAverage(numbers);
        assertEquals(-20.0, result, 0.0001);
    }

    // Kiểm tra trung bình cộng với số 0
    @Test
    public void testCalculateAverage_Zeroes() {
        List<Double> numbers = List.of(0.0, 0.0, 0.0);
        double result = Main.AverageCalculator.calculateAverage(numbers);
        assertEquals(0.0, result, 0.0001);  // Thêm delta
    }
}
