/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nth.pojo;

/**
 *
 * @author admin
 */
public class HoaDon {
    private int id;
    private String maSP;
    private int soLuong;
    private float giamGia;

    public HoaDon() {
    }

    public HoaDon(int id, String maSP, int soLuong, float giamGia) {
        this.id = id;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.giamGia = giamGia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }
    
}
