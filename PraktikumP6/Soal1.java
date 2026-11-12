package PraktikumP6;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terbesar = 0, terkecil = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            int angka = input.nextInt();

            if (i == 1) {            // bilangan pertama jadi acuan awal
                terbesar = angka;
                terkecil = angka;
            } else {
                if (angka > terbesar) terbesar = angka;
                if (angka < terkecil) terkecil = angka;
            }
        }

        System.out.println("Bilangan terbesar : " + terbesar);
        System.out.println("Bilangan terkecil : " + terkecil);
    }
}
