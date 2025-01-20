package org.example;

public class HoSo {
    private String tenNguoiDung;

    public HoSo(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getTenNguoiDung() {
        if (tenNguoiDung == null) {
            throw new NullPointerException("Tên người dùng không tồn tại.");
        }
        return tenNguoiDung;
    }
}