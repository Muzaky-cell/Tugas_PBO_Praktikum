package PraktikumP7;

import java.util.Arrays;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            data[i] = sc.nextInt();
        }

        int max = data[0], idxMax = 0;
        int min = data[0], idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (data[i] > max) { max = data[i]; idxMax = i; }
            if (data[i] < min) { min = data[i]; idxMin = i; }
        }
        System.out.println("\n(c) Nilai terbesar : " + max + " (indeks " + idxMax + ")");
        System.out.println("    Nilai terkecil : " + min + " (indeks " + idxMin + ")");

        int total = 0;
        for (int x : data) total += x;
        double rata = (double) total / n;
        System.out.println("(d) Jumlah         : " + total);
        System.out.println("    Rata-rata      : " + rata);

        int jumlahGanjil = 0;
        for (int i = 1; i < n; i += 2) jumlahGanjil += data[i];
        System.out.println("(e) Jumlah elemen berindeks ganjil : " + jumlahGanjil);

        int jumlahGenap = 0;
        for (int i = 0; i < n; i += 2) jumlahGenap += data[i];
        System.out.println("(f) Jumlah elemen berindeks genap  : " + jumlahGenap);

        System.out.print("\nMasukkan digit terakhir NPM kamu: ");
        int digitNpm = sc.nextInt();
        int hasil;
        String langkah;
        if (digitNpm % 2 == 0) {
            hasil = jumlahGanjil;
            langkah = "e (indeks ganjil)";
        } else {
            hasil = jumlahGenap;
            langkah = "f (indeks genap)";
        }
        String jenis = (hasil % 2 == 0) ? "GENAP" : "GANJIL";
        System.out.println("(g) Hasil langkah " + langkah + " = " + hasil + " -> bernilai " + jenis);

        Arrays.sort(data);
        System.out.println("(h) Array setelah diurutkan: " + Arrays.toString(data));

        sc.close();
    }
}
