package org.example;

public class KiemTra {

        // Phương thức tìm phần tử bé nhất trong mảng
        public static int timPhanTuMin(int[] arr) {
            // Kiểm tra nếu mảng rỗng
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Mảng không thể rỗng");
            }

            // Giả sử phần tử đầu tiên là bé nhất
            int min = arr[0];

            // Duyệt qua mảng để tìm phần tử bé nhất
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            return min;
        }
    }

