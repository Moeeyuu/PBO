/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author MoeeYuu
 */

package Soal1;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku(
            "1038", "PBO", "Donny", 25000
        );

        Buku buku2 = new Buku(
            "2024", "Struktur Data",
            "Budi Santoso", 60000
        );

        buku1.tampilData();
        buku2.tampilData();
    }
}
