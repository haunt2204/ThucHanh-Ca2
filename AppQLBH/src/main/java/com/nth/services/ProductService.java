/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nth.services;

import com.nth.conf.jdbcUtils;
import com.nth.pojo.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class ProductService {
    public boolean themSanPham(SanPham sp) throws SQLException{
        if(sp!=null){
            try(Connection conn = jdbcUtils.getConn()){
                conn.setAutoCommit(false);
                String sql = "INSERT INTO SanPham(idSanPham, TenSP, LoaiSP, GiaBan) VALUES (?,?,?,?)";
                PreparedStatement stm = conn.prepareCall(sql);
                stm.setString(1, sp.getMaSP());
                stm.setString(2, sp.getTenSP());
                stm.setInt(3, sp.getLoaiSP());
                stm.setFloat(4, sp.getGiaBan());
                
                stm.executeUpdate();
                conn.commit();
            }
            return true;
        }
        
        return false;
    }
}
