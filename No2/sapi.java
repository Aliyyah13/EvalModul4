/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hewan;

/**
 *
 * @author asus
 */
public class sapi extends hewaan {
    private String ras;

    public sapi(String nama, String ras) {
        super(nama);
        this.ras = ras;
    }

    @Override
    public void bersuara() {
        System.out.println("Ngoooo!");
    }
}
