public class PengunjungCafe19 {
    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Nomor meja: " + nomorMeja);

        System.out.println("Daftar Nama Pengunjung");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static int hitungTotalBelanja(int... harga) {
        int total = 0;

        for (int nilai : harga) {
            total += nilai;
        }

        return total;
    }

    public static void main(String[] args) {
        String[] tamu = { "Ali", "Budi", "Citra" };
        daftarPengunjung(3, tamu);

        System.out.println("\nTotal belanja 1 argumen: Rp" +
                hitungTotalBelanja(18000));

        System.out.println("Total belanja 3 argumen: Rp" +
                hitungTotalBelanja(17000, 9000, 27000));

        System.out.println("Total belanja 5 argumen: Rp" +
                hitungTotalBelanja(11000, 13000, 20000, 9000, 54000));
    }
}