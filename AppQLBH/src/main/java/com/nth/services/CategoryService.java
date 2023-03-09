/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nth.services;

import com.nth.conf.jdbcUtils;
import com.nth.pojo.LoaiSP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class CategoryService {
    public List<LoaiSP> getLoaiSP() throws SQLException{
        List<LoaiSP> result = new ArrayList<>();
        try(Connection conn = jdbcUtils.getConn()){
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM LoaiSP");
            
            while(rs.next()){
                result.add(new LoaiSP(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        }
      
        return result;
    }
}
