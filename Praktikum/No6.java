package Praktikum;
import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Apakah punya kartu member? (y/t): ");
        char member = in.next().toLowerCase().charAt(0);
        System.out.print("Total belanja (Rp): ");
        double belanja = in.nextDouble();

        double diskon = 0;

        if (member == 'y') {
            if (belanja > 500000) {
                diskon = 50000;
            } else if (belanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (belanja > 100000) {
                diskon = 10000;
            }
        }

        double bayar = belanja - diskon;

        System.out.print("Uang yang diberikan (Rp): ");
        double uang = in.nextDouble();

        if (uang < bayar) {
            System.out.println("Uang tidak cukup!");
        } else {
            double kembali = uang - bayar;
            System.out.printf("Diskon         : Rp%,.0f%n", diskon);
            System.out.printf("Total bayar    : Rp%,.0f%n", bayar);
            System.out.printf("Kembalian      : Rp%,.0f%n", kembali);
        }
    }
}
