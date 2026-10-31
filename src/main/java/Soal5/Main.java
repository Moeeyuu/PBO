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

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new Tiket(
            "TK001", "Avengers: Endgame",
            "Reguler", 50000, 2
        ));

        daftarTiket.add(new Tiket(
            "TK002", "Interstellar",
            "VIP", 100000, 1
        ));

        daftarTiket.add(new Tiket(
            "TK003", "The Conjuring",
            "Reguler", 45000, 3
        ));

        double totalPendapatan = 0;
        int totalTiket = 0;

        System.out.println("==============================");
        System.out.println("      STRUK TIKET BIOSKOP");
        System.out.println("==============================");

        for (Tiket tiket : daftarTiket) {
            tiket.tampilData();

            totalPendapatan += tiket.hitungTotal();
            totalTiket += tiket.getJumlahTiket();
        }

        System.out.println("RINGKASAN TRANSAKSI");
        System.out.println("Total Tiket Terjual: " + totalTiket);
        System.out.println(
            "Total Pendapatan: Rp" + totalPendapatan
        );
        System.out.println("==============================");
    }
}

