package PraktikumP7;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while (true) {
            try {
                System.out.print("Masukkan banyak bilangan: ");
                n = Integer.parseInt(sc.nextLine().trim());
                if (n <= 0) {
                    System.out.println("Jumlah harus lebih dari 0!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: masukkan bilangan bulat, bukan huruf/simbol!");
            }
        }

        double[] angka = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Bilangan ke-" + (i + 1) + ": ");
                String masukan = sc.nextLine().trim();
                try {
                    angka[i] = Double.parseDouble(masukan);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: \"" + masukan + "\" bukan bilangan! Silakan ulangi.");
                }
            }
            total += angka[i];
        }

        System.out.println("\nJumlah    : " + total);
        System.out.println("Rata-rata : " + (total / n));

        sc.close();
    }
}
