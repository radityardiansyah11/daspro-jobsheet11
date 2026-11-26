import java.util.Scanner;

public class Kafe19 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        System.out.println("\n===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappucino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("===========================");
        System.out.println("Silahkan ppilih menu yang diinginkan.");
    }

    public static int hitungTotalharga19(int pilihanMenu, int banyakItem) {
        int[] hargaitems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        int hargaTotal = hargaitems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon += total * 0.5;

        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon += total * 0.3;

        } else {
            System.out.println("Kode promo invalid");
        }

        if (isMember) {
            diskon += total * 0.1;
        }

        return diskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 1;
        int totalHarga = 0;
        Menu("Andi", true);

        do {
            System.out.print("\nMasukkan nomor menu yang ingin di pesan: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
                continue;
            }

            System.out.print("Masukkan jumlah item yang ingin di pesan: ");
            int banyakItem = sc.nextInt();

            totalHarga += hitungTotalharga19(pilihanMenu, banyakItem);

            System.out.print("\nApakah anda ingin memesan lagi? (1: ya, 0: tidak): ");
            input = sc.nextInt();

        } while (input == 1);

        System.out.print("\nMasukkan kode promo: ");
        String kodePromo = sc.next();

        int diskon = hitungDiskon(totalHarga, kodePromo, true);
        int totalBayar = totalHarga - diskon;

        System.out.println("\nTotal harga yang harus di bayar: Rp. " + totalHarga);
        System.out.println("Total diskon anda: " + diskon);
        System.out.println("Total harga untuk pesanan anda: Rp." + totalBayar);

        sc.close();
    }

}
