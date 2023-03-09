/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nth.UnitTest;

import com.nth.conf.jdbcUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author admin
 */
public class CategoryTester {
    private static Connection conn;
    
    @BeforeAll
    public static void testBeforeAll() throws SQLException{
        conn = jdbcUtils.getConn();
    }
    
    @AfterAll
    public static void testAfterAll() throws SQLException{
        if(conn!=null){
            conn.close();
        }
    }
    
    @Test
    public void testUnique() throws SQLException{
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM LoaiSP");
        List<String> kq = new ArrayList<>();
        while(rs.next()){
            kq.add(rs.getString("TenLoaiSP"));
            System.out.println(rs.getString("TenLoaiSP"));
        }
        Set<String> kq2 = new HashSet<>(kq);
        
        Assertions.assertEquals(kq.size(), kq2.size());
    }
}
