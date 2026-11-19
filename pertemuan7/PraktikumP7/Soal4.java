package PraktikumP7;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = sc.nextLine();
            System.out.print("Nilai : ");
            nilai[i] = Integer.parseInt(sc.nextLine());

            status[i] = (nilai[i] <= 50) ? "Tidak Lulus" : "Lulus";
        }

        String garis = "-".repeat(55);
        System.out.println("\n               Daftar Nilai Mahasiswa");
        System.out.println(garis);
        System.out.printf("%-4s %-20s %-8s %-12s%n", "No", "Nama", "Nilai", "Status");
        System.out.println(garis);
        for (int i = 0; i < n; i++) {
            System.out.printf("%-4d %-20s %-8d %-12s%n", (i + 1), nama[i], nilai[i], status[i]);
        }
        System.out.println(garis);

        sc.close();
    }
}
