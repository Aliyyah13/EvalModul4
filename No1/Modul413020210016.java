/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul413020210016;

/**
 *
 * @author asus
 */
public class Modul413020210016 {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();

        // menggunakan method setter dari kelas induk untuk mengubah nilai atribut name
        mahasiswa1.setNama("A. Nur Aliyyah");

        // menggunakan method setter dari kelas turunan untuk mengubah nilai atribut id
        mahasiswa1.setStb(16);

        // menggunakan method getter dari kelas induk untuk mengambil nilai atribut name
        String nama = mahasiswa1.getNama();

        // menggunakan method getter dari kelas turunan untuk mengambil nilai atribut id
        long stb = mahasiswa1.getStb();

        System.out.println("Nama : " + nama);
        System.out.println("STB  : " + stb);
    }
}
