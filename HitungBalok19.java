import java.util.Scanner;

public class HitungBalok19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol, Lp;

        System.out.println("Masukkan panjang");
        p = input.nextInt();

        System.out.println("Masukkan lebar");
        l = input.nextInt();

        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah " + L);

        vol = p * l * t;
        System.out.println("Volume balok adalah " + vol);

        Lp = 2 * (hitungLuas(p, l) + (p * t) + (l * t));
        System.out.println("Luas Permukaan Balok " + Lp);

        input.close();
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        int luasPermukaan = 2 * (hitungLuas(p, l) + (p * t) + (l + t));
        return luasPermukaan;
    }
}