import java.util.Scanner;

public class BankSampah19 {

    public static double[] inputSetoran(int n) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nasabah: ");
        n = sc.nextInt();

        double[] dataSetoran = new double[n];

        System.out.println("Setoran Nasabah:");
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

    public static double hitungSaldo(double[] dataSetoran) {
        double saldo = 0;
        for (int i = 0; i < dataSetoran.length; i++) {
            saldo += dataSetoran[i] * 3000;
        }
        return saldo;
    }

    public static int nasabahTerbanyak(double[] dataSetoran, int n) {
        int terbanyak = 0;

        for (int i = 0; i < dataSetoran.length; i++) {
            if (dataSetoran[i] > dataSetoran[terbanyak]) {
                terbanyak = (i + 1);
            }
        }
        return terbanyak;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        double[] dataSetoran = inputSetoran(n);
        tampilSetoran(dataSetoran);

        double total = totalSetoran(dataSetoran);
        System.out.println("\nTotal setoran nasabah: " + total);

        double saldo = hitungSaldo(dataSetoran);
        System.out.println("\nTotal saldo nasabah: " + saldo);

        double terbanyak = nasabahTerbanyak(dataSetoran, n);
        System.out.println("\nNasabah terbanyak: " + terbanyak);

        sc.close();
    }
}