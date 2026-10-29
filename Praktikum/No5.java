package Praktikum;
import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Penjualan hari ini (Rp): ");
        double jual = in.nextDouble();

        double uangJasa, komisi;

        if (jual <= 2000000) {
            uangJasa = 100000;
            komisi = 0.10 * jual;
        } else if (jual <= 5000000) {
            uangJasa = 200000;
            komisi = 0.15 * jual;
        } else {
            uangJasa = 300000;
            komisi = 0.20 * jual;
        }

        double pendapatan = uangJasa + komisi;

        System.out.printf("Uang jasa  : Rp%,.0f%n", uangJasa);
        System.out.printf("Komisi     : Rp%,.0f%n", komisi);
        System.out.printf("Pendapatan : Rp%,.0f%n", pendapatan);
    }
}
