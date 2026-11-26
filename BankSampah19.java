import java.util.Scanner;

public class BankSampah19 {

    public static double[] inputSetoran(int n) {
        Scanner sc = new Scanner(System.in);
        double[] dataSetoran = new double[n];

        System.out.println("\nSetoran Nasabah:");
        for (int i = 0; i < n; i++) {
            System.out.print(" Masukkan setoran nasabah ke-" + (i + 1) + ": ");
            dataSetoran[i] = sc.nextDouble();
        }

        return dataSetoran;
    }

    public static void tampilSetoran(double[] dataSetoran) {
        System.out.println("\nData Setoran Nasabah");
        for (int i = 0; i < dataSetoran.length; i++) {
            System.out.println(" Nasabah ke-" + (i + 1) + ": " + dataSetoran[i]);
        }
    }

    public static double totalSetoran(double[] dataSetoran) {
        double total = 0;
        for (int i = 0; i < dataSetoran.length; i++) {
            total += dataSetoran[i];
        }
        return total;
    }

    public static double hitungSaldo(double berat, double hargaPerKg) {
        double saldo = berat * hargaPerKg;
        return saldo;
    }

    public static int nasabahTerbanyak(double[] dataSetoran, int n) {
        int terbanyak = 0;

        for (int i = 0; i < dataSetoran.length; i++) {
            if (dataSetoran[i] > dataSetoran[terbanyak]) {
                terbanyak = i;
            }
        }
        return terbanyak;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.print("Masukkan jumlah nasabah: ");
        n = sc.nextInt();

        double[] dataSetoran = inputSetoran(n);
        tampilSetoran(dataSetoran);

        double total = totalSetoran(dataSetoran);
        System.out.println("\nTotal setoran nasabah: " + total);

        System.out.println("\nSaldo setiap nasabah: ");
        for (int i = 0; i < dataSetoran.length; i++) {
            Double saldo = hitungSaldo(dataSetoran[i], 3000);
            System.out.println("Saldo nasabah ke-" + (i + 1) + ": Rp" + saldo);
        }

        int terbanyak = nasabahTerbanyak(dataSetoran, n);
        System.out.println("\nNasabah terbanyak: " + (terbanyak + 1));

        sc.close();
    }
}