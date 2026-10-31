/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal5;

/**
 *
 * @author MoeeYuu
 */

package soal5;

public class Tiket {
    private String kodeTiket;
    private String namaFilm;
    private String jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;

    public Tiket(String kodeTiket, String namaFilm,
                 String jenisTiket, double hargaTiket,
                 int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }

    public double hitungTotal() {
        return hargaTiket * jumlahTiket;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void tampilData() {
        System.out.println("Kode Tiket  : " + kodeTiket);
        System.out.println("Nama Film   : " + namaFilm);
        System.out.println("Jenis Tiket : " + jenisTiket);
        System.out.println("Harga       : Rp" + hargaTiket);
        System.out.println("Jumlah      : " + jumlahTiket);
        System.out.println("Total       : Rp" + hitungTotal());
        System.out.println("------------------------------");
    }
}

