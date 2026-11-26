import java.util.Scanner;

public class ReturnValueDenganParameter {
    public static double luasLingkaran(double r) {
        double luas = 3.14 * r * r;
        return luas;
    }

    public static double volumeTabung(double r, double t) {
        double luas = luasLingkaran(r);
        double volume = luas * t;
        return volume;
    }

    public static double luasPermukaanTabung(double r, double t) {
        double luas = luasLingkaran(r);
        double luasPermukaan = (2 * luas) + (2 * 3.14 * r * t);
        return luasPermukaan;
    }

    public static double volumeKerucut(double r, double t) {
        double luas = volumeTabung(r, t);
        double volume = luas / 3;
        return volume;
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
                System.out.print("\nMasukkan jari-jari tabung:");
                double r = sc.nextDouble();

                double luas = luasLingkaran(r);
                System.out.println("Luas Lingkaran adalah: " + luas);

            } else if (input == 2) {
                System.out.print("\nMasukkan jari-jari tabung:");
                double r = sc.nextDouble();
                System.out.print("Masukkan tinggi tabung:");
                double t = sc.nextDouble();
                double volume = volumeTabung(r, t);
                System.out.println("Volume tabung adalah: " + volume);

            } else if (input == 3) {
                System.out.print("\nMasukkan jari-jari tabung:");
                double r = sc.nextDouble();
                System.out.print("Masukkan tinggi tabung:");
                double t = sc.nextDouble();
                double luas = luasPermukaanTabung(r, t);
                System.out.println("\nLuas Permukaan tabung: " + luas);

            } else if (input == 4) {
                System.out.print("\nMasukkan jari-jari tabung:");
                double r = sc.nextDouble();
                System.out.print("Masukkan tinggi tabung:");
                double t = sc.nextDouble();
                double volume = volumeKerucut(r, t);
                System.out.println("Volume kerucut adalah: " + volume);
            } else if (input == 0) {
                break;

            } else {
                System.out.println("Input tidak valid");
            }

            System.out.print("\nApakah ingin menghitung lagi? (1: ya, 0: tidak): ");
            input = sc.nextInt();

        } while (input == 1);

        sc.close();
    }
}
