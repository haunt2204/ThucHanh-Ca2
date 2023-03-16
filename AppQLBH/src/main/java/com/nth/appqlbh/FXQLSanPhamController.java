/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.nth.appqlbh;

import com.nth.conf.Utils;
import com.nth.pojo.LoaiSP;
import com.nth.pojo.SanPham;
import com.nth.services.CategoryService;
import com.nth.services.ProductService;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class FXQLSanPhamController implements Initializable {
    @FXML ComboBox<LoaiSP> cbLoaiSP;
    @FXML TextField txtMaSP;
    @FXML TextField txtTenSP;
    @FXML TextField txtGiaBanSP;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtMaSP.setDisable(true);
        txtMaSP.setText(UUID.randomUUID().toString());
        CategoryService c = new CategoryService();
        try {
            cbLoaiSP.setItems(FXCollections.observableArrayList(c.getLoaiSP()));
        } catch (SQLException ex) {
            Logger.getLogger(FXQLSanPhamController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public void themSanPham(){
        SanPham sp = new SanPham(txtMaSP.getText(), txtTenSP.getText(), cbLoaiSP.getSelectionModel().getSelectedItem().getId(), Float.parseFloat(txtGiaBanSP.getText()));
        ProductService p =  new ProductService();
        try {
            p.themSanPham(sp);
            Utils.getBox("Thêm sản phẩm thành công!", Alert.AlertType.INFORMATION).show();
        } catch (SQLException ex) {
            Utils.getBox("Thêm sản phẩm thất bại!", Alert.AlertType.ERROR).show();
        }
    }
}
