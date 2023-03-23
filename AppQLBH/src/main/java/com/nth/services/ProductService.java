/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nth.services;

import com.nth.conf.jdbcUtils;
import com.nth.pojo.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ProductService {

    public boolean themSanPham(SanPham sp) throws SQLException {
        if (sp != null) {
            try ( Connection conn = jdbcUtils.getConn()) {
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

    public List<SanPham> getDSSanPham(String kw) throws SQLException {
        List<SanPham> results = new ArrayList<>();
        try ( Connection conn = jdbcUtils.getConn()) {
            String sql = "SELECT * FROM SanPham";
            if (kw != null && !kw.isEmpty()) {
                sql += " WHERE TenSP like concat('%',?,'%')";
            }
            PreparedStatement stm = conn.prepareCall(sql);
            if (kw != null && !kw.isEmpty()) {
                stm.setString(1, kw);
            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4));
                results.add(sp);
            }
        }
        return results;
    }

    public SanPham getById(String id) throws SQLException {
        SanPham result = null;
        if (id != null && !id.isEmpty()) {
            try ( Connection conn = jdbcUtils.getConn()) {
                String sql = "SELECT * FROM SanPham WHERE idSanPham=?";
                PreparedStatement stm = conn.prepareCall(sql);
                stm.setString(1, id);
                ResultSet rs = stm.executeQuery();
                while (rs.next()) {
                    result = new SanPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4));
                    break;
                }
            }
        }
        return result;
    }
}
