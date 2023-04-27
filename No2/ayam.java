/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hewan;

/**
 *
 * @author asus
 */
public class ayam extends hewaan{
    private String jenis;

    public ayam(String nama, String jenis) {
        super(nama);
        this.jenis = jenis;
    }

    @Override
    public void bersuara() {
        System.out.println("Kukuruyukk!");
    }
}
