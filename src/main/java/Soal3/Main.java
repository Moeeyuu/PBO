/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal3;

/**
 *
 * @author MoeeYuu
 */

package soal3;

public class Main {
    public static void main(String[] args) {
        Menu menu1 = new Menu(
            "MQ1", "Nasi Goreng", 18000, "Makanan"
        );

        Menu menu2 = new Menu(
            "MN2", "Es Teh", 5000, "Minuman"
        );

        // Menggunakan constructor tanpa parameter
        Menu menu3 = new Menu();

        menu1.tampilMenu();
        menu2.tampilMenu();

        int jumlah = 2;

        System.out.println("PESANAN KASIR");
        System.out.println("Nama   : Nasi Goreng");
        System.out.println("Jumlah : " + jumlah);
        System.out.println(
            "Total  : Rp" + menu1.hitungHarga(jumlah)
        );

        System.out.println();
        System.out.println("MENU DEFAULT");
        menu3.tampilMenu();
    }
}

