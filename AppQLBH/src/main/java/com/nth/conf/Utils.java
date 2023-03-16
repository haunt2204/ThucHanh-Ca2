/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nth.conf;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class Utils {
    public static Alert getBox(String content, Alert.AlertType type){
        Alert a = new Alert(type);
        a.setContentText(content);
        return a;
    }
}
