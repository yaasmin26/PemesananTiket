package Tugas2;

/**
 * Kelas Main digunakan untuk menjalankan program pemesanan tiket film.
 */
public class Main {
    /**
     *Method utama program.
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
            PemesananTiket tiket = new PemesananTiket("Avengers: Endgame", 3, 50000);
            tiket.tampilkanDetailTiket();
        }
}

