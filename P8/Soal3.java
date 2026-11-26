package PraktikumP8;

import java.util.Scanner;

public class Soal3 {
    static int tebak(int bulan, int tanggal) {
        int h = bulan * 5;
        h += 6;
        h *= 4;
        h += 9;
        h *= 5;
        h += tanggal;
        return h - 165;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Bulan lahir (1-12): ");
        int b = in.nextInt();
        System.out.print("Tanggal lahir: ");
        int t = in.nextInt();
        System.out.println("Hasil = " + tebak(b, t));
    }
}
