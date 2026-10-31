/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author MoeeYuu
 */

package soal2;

public class Sepeda {
    private final String kodeSepeda;
    private final String jenisSepeda;
    private final int lamaSewa;
    private final double hargaPerJam;

    public Sepeda(String kodeSepeda, String jenisSepeda,
                  int lamaSewa, double hargaPerJam) {
        this.kodeSepeda = kodeSepeda;
        this.jenisSepeda = jenisSepeda;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    public double hitungBiaya() {
        return lamaSewa * hargaPerJam;
    }

    public void tampilData() {
        System.out.println("Kode Sepeda : " + kodeSepeda);
        System.out.println("Jenis Sepeda: " + jenisSepeda);
        System.out.println("Lama Sewa   : " + lamaSewa + " jam");
        System.out.println("Harga per Jam: Rp" + hargaPerJam);
        System.out.println("Total Biaya : Rp" + hitungBiaya());
        System.out.println();
    }
}

