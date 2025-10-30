package Tugas1;

import java.util.Scanner;

public class NotaRestoran {
    static String[] menu = {"Nasi Goreng", "Mie Ayam", "Ayam Geprek", "Es Teh", "Kopi Hitam"};
    static int[] harga = {20000, 15000, 18000, 5000, 7000};

    public static void tampilkanMenu() {
        System.out.println("=== MENU RESTORAN ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }
    }

    public static int hitungTotal(Scanner input) {
        int total = 0;
        while (true) {
            System.out.print("Pilih nomor menu (0 untuk selesai): ");
            int pilih = input.nextInt();
            if (pilih == 0) break;
            if (pilih > 0 && pilih <= menu.length) {
                total += harga[pilih - 1];
                System.out.println(menu[pilih - 1] + " ditambahkan ke pesanan.");
            } else {
                System.out.println("Nomor tidak valid!");
            }
        }
        return total;
    }

    public static void main() {
        Scanner input = new Scanner(System.in);
        tampilkanMenu();
        int total = hitungTotal(input);
        System.out.println("\n=== NOTA PEMBAYARAN ===");
        System.out.println("Total Bayar: Rp" + total);
        input.close();
    }
}


