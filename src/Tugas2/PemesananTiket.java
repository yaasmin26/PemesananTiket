package Tugas2;

/**
 * Kelas PemesananTiket digunakan untuk menghitung total harga tiket film,
 * termasuk diskon 10% dari harga total.
 * @author yaasmin
 * @version 1.0
 */

public class PemesananTiket {
    /**
     * Diskon tetap sebesar 10%*/
    public static final double DISKON = 0.9;
    /**
     * Judul film yang dipesan*/
    private String judulFilm;
    /**
     * Jumlah tiket yang dipesan*/
    private int jumlahTiket;
    /**
     * Harga per tiket*/
    private double hargaTiket;

    /**
     *
     * @return judul film
     */
    public String getJudulFilm() {
            return judulFilm;
        }

    /**
     *
     * @param judulFilm judul film yang akan ditonton
     */
    public void setJudulFilm(String judulFilm) {
            this.judulFilm = judulFilm;
        }

    /**
     *
     * @return jumlah tiket
     */
    public int getJumlahTiket() {
            return jumlahTiket;
        }

    /**
     *
     * @param jumlahTiket jumlah tiket yang dipesan
     */
    public void setJumlahTiket(int jumlahTiket) {
            this.jumlahTiket = jumlahTiket;
        }

    /**
     *
     * @return harga tiket
     */
    public double getHargaTiket() {
            return hargaTiket;
        }

    /**
     *
     * @param hargaTiket harga satu tiket     */
    public void setHargaTiket(double hargaTiket) {
            this.hargaTiket = hargaTiket;
        }

    /**
     * Konstruktor untuk membuat objek PemesananTiket baru.
     * @param judulFilm
     * @param jumlahTiket
     * @param hargaTiket
     */

        public PemesananTiket(String judulFilm, int jumlahTiket, double hargaTiket) {
            this.setJudulFilm(judulFilm);
            this.setJumlahTiket(jumlahTiket);
            this.setHargaTiket(hargaTiket);
        }

    /**
     * Menampilkan detail tiket beserta total harga setelah diskon.
      */
    public void tampilkanDetailTiket() {
            System.out.println("Judul Film: " + getJudulFilm());
            System.out.println("Jumlah Tiket: " + getJumlahTiket());
            System.out.println("Harga per Tiket: " + getHargaTiket());
            System.out.println("Total Harga (dengan diskon 10%): " + hitungTotalHarga());
        }

    /**
     * Menghitung total harga tiket setelah diskon.
     * @return total harga setelah diskon
     */
    private double hitungTotalHarga() {
            return getJumlahTiket() * getHargaTiket() *DISKON;
        }
    }

