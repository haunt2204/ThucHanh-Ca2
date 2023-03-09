/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nth.pojo;

/**
 *
 * @author admin
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private int loaiSP;
    private float giaBan;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int loaiSP, float giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.giaBan = giaBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(int loaiSP) {
        this.loaiSP = loaiSP;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    
}
