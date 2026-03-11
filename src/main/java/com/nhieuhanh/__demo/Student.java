package com.nhieuhanh.__demo;

public class Student {

    private String id;
    private String hoTen;

    public Student() {}
    public Student(String id, String hoTen) {
        this.id = id;
        this.hoTen = hoTen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}