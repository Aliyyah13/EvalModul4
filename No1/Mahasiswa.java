/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul413020210016;

/**
 *
 * @author asus
 */
public class Mahasiswa extends Orang{
    private int stb; // atribut dengan akses modifier private

    // method setter untuk mengubah nilai atribut id
    public void setStb(int stb) {
        this.stb = stb;
    }
    // method getter untuk mengambil nilai atribut id
    public int getStb() {
        return this.stb;
    }
}
