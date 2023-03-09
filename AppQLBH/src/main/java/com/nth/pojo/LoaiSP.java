/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nth.pojo;

/**
 *
 * @author admin
 */
public class LoaiSP {
    private int id;
    private String tenLoaiSP;
    private String moTa;

    public LoaiSP() {
    }

    public LoaiSP(int id, String tenLoaiSP, String moTa) {
        this.id = id;
        this.tenLoaiSP = tenLoaiSP;
        this.moTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLoaiSP() {
        return tenLoaiSP;
    }

    public void setTenLoaiSP(String tenLoaiSP) {
        this.tenLoaiSP = tenLoaiSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
}
