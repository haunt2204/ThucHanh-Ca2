/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nth.UnitTest;

/**
 *
 * @author admin
 */
import com.nth.conf.jdbcUtils;
import com.nth.pojo.SanPham;
import com.nth.services.ProductService;
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

public class ProductTester {
    @Test
    public void testSPNull() throws SQLException{
        ProductService p = new ProductService();
        SanPham kq = p.getById(null);
        Assertions.assertNull(kq);
    }
    
    @Test
    public void testSPNotNull() throws SQLException{
        ProductService p = new ProductService();
        SanPham kq = p.getById("da69866a-8a3b-4685-81c7-b225df70ffb6");
        Assertions.assertNotNull(kq);
        Assertions.assertEquals("Coca Cola", kq.getTenSP());
        Assertions.assertEquals(1, kq.getLoaiSP());
        Assertions.assertEquals(20000, kq.getGiaBan());
    }
}
