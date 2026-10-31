/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal4;

/**
 *
 * @author MoeeYuu
 */

package soal4;

import java.util.ArrayList;

import java.util.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pemeriksaan> daftarPemeriksaan =
            new ArrayList<>();

        daftarPemeriksaan.add(new Pemeriksaan(
            "PK001", "Andi", "Dr. Budi", 150000
        ));

        daftarPemeriksaan.add(new Pemeriksaan(
            "PK002", "Siti", "Dr. Rina", 200000
        ));

        daftarPemeriksaan.add(new Pemeriksaan(
            "PK003", "Bambang", "Dr. Agus", 175000
        ));

        double totalBiaya = 0;

        System.out.println("DATA PEMERIKSAAN KLINIK");
        System.out.println("========================");

        for (Pemeriksaan p : daftarPemeriksaan) {
            p.tampilData();
            totalBiaya += p.hitungTotal();
        }

        System.out.println("========================");
        System.out.println(
            "Jumlah Pemeriksaan: " + daftarPemeriksaan.size()
        );
        System.out.println("Total Biaya: Rp" + totalBiaya);
    }
}

