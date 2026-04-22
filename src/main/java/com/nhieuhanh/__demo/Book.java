package com.nhieuhanh.__demo;

public class Book {

    private String id;
    private String tenSach;
    private String tacGia;
    private String theLoai;
    private boolean conSan;

    public Book() {
    }

    public Book(String id, String tenSach, String tacGia, String theLoai, boolean conSan) {
        this.id = id;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.conSan = conSan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isConSan() {
        return conSan;
    }

    public void setConSan(boolean conSan) {
        this.conSan = conSan;
    }
}
