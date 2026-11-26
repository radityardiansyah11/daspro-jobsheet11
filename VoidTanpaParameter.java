
import java.util.Scanner;

public class VoidTanpaParameter {

    static Scanner sc = new Scanner(System.in);

    public static double luasLingkaran() {
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = sc.nextDouble();

        double luas = 3.14 * r * r;
        return luas;
    }

    public static double volumeTabung() {
        System.out.print("Masukkan jari-jari tabung: ");
        double r = sc.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double t = sc.nextDouble();

        double luas = 3.14 * r * r;
        double volume = luas * t;

        return volume;
    }

    public static double luasPermukaanTabung() {
        System.out.print("Masukkan jari-jari tabung: ");
        double r = sc.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double t = sc.nextDouble();

        double luas = 3.14 * r * r;
        double luasPermukaan = (2 * luas) + (2 * 3.14 * r * t);

        return luasPermukaan;
    }

    public static double volumeKerucut() {
        System.out.print("Masukkan jari-jari kerucut: ");
        double r = sc.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        double t = sc.nextDouble();

        double luas = 3.14 * r * r;
        double volumeTabung = luas * t;
        double volume = volumeTabung / 3;

        return volume;
    }

    public static void main(String[] args) {
        int input;

        do {
            System.out.println("\n==== Menu Perhitungan ====");
            System.out.println("1: Luas Lingkaran");
            System.out.println("2: Volume Tabung");
            System.out.println("3: Luas Permukaan Tabung");
            System.out.println("4: Volume Kerucut");
            System.out.println("0: Keluar");
            System.out.println("==========================");

            System.out.print("Masukkan Input: ");
            input = sc.nextInt();

            if (input == 1) {
                double luas = luasLingkaran();
                System.out.println("Luas lingkaran adalah: " + luas);

            } else if (input == 2) {
                double volume = volumeTabung();
                System.out.println("Volume tabung adalah: " + volume);

            } else if (input == 3) {
                double luas = luasPermukaanTabung();
                System.out.println("Luas permukaan tabung adalah: " + luas);

            } else if (input == 4) {
                double volume = volumeKerucut();
                System.out.println("Volume kerucut adalah: " + volume);

            } else if (input == 0) {
                System.out.println("Program selesai.");

            } else {
                System.out.println("Input tidak valid.");
            }

            System.out.print("\nApakah ingin menghitung lagi? (1: ya, 0: tidak): ");
            input = sc.nextInt();

        } while (input == 1);

        sc.close();
    }
}
