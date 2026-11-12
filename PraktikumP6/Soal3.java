package PraktikumP6;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak baris : ");
        int baris = input.nextInt();

        int angka = 1;
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {   // baris ke-i berisi i angka
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}
