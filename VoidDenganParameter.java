
import java.util.Scanner;

public class VoidDenganParameter {

    public static void luasLingkaran(double r) {
        double luas = 3.14 * r * r;
        System.out.println("Luas lingkaran adalah: " + luas);
    }

    public static void volumeTabung(double r, double t) {
        double luas = 3.14 * r * r;
        double volume = luas * t;
        System.out.println("Volume tabung adalah: " + volume);
    }

    public static void luasPermukaanTabung(double r, double t) {
        double luas = 3.14 * r * r;
        double luasPermukaan = (2 * luas) + (2 * 3.14 * r * t);
        System.out.println("Luas permukaan tabung: " + luasPermukaan);
    }

    public static void volumeKerucut(double r, double t) {
        double luas = 3.14 * r * r;
        double volumeTabung = luas * t;
        double volumeKerucut = volumeTabung / 3;
        System.out.println("Volume kerucut adalah: " + volumeKerucut);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                System.out.print("Masukkan jari-jari: ");
                double r = sc.nextDouble();

                luasLingkaran(r);

            } else if (input == 2) {
                System.out.print("Masukkan jari-jari tabung: ");
                double r = sc.nextDouble();

                System.out.print("Masukkan tinggi tabung: ");
                double t = sc.nextDouble();

                volumeTabung(r, t);

            } else if (input == 3) {
                System.out.print("Masukkan jari-jari tabung: ");
                double r = sc.nextDouble();

                System.out.print("Masukkan tinggi tabung: ");
                double t = sc.nextDouble();

                luasPermukaanTabung(r, t);

            } else if (input == 4) {
                System.out.print("Masukkan jari-jari kerucut: ");
                double r = sc.nextDouble();

                System.out.print("Masukkan tinggi kerucut: ");
                double t = sc.nextDouble();

                volumeKerucut(r, t);

            } else if (input == 0) {
                break;

            } else {
                System.out.println("Input tidak valid.");
            }

            if (input != 0) {
                System.out.print("\nApakah ingin menghitung lagi? (1: ya, 0: tidak): ");
                input = sc.nextInt();
            }

        } while (input != 0);

        sc.close();
    }
}
