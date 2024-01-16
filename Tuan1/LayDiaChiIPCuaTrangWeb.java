package com.mycompany.javaapplication.Tuan1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Long
 */
import java.net.InetAddress;

public class LayDiaChiIPCuaTrangWeb {
    public static void main(String[] args) {
        try {
            // In địa chỉ IP
            // Lấy địa chỉ IP của www.google.com
            InetAddress inet = InetAddress.getByName("www.google.com");
            // In địa chỉ IP
            System.err.println("Dia chi IP cua Google la : " + inet.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
