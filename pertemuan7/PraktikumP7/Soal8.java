package PraktikumP7;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah thread yang diinginkan: ");
        int jumlah = sc.nextInt();

        Pekerja[] daftar = new Pekerja[jumlah];

        for (int i = 0; i < jumlah; i++) {
            daftar[i] = new Pekerja(i + 1);
            daftar[i].start();
        }

        for (Pekerja p : daftar) {
            p.join();
        }

        System.out.println("Semua " + jumlah + " thread telah selesai. Thread utama berakhir.");
        sc.close();
    }
}

class Pekerja extends Thread {
    private final int nomor;

    Pekerja(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread-" + nomor + " : langkah " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread-" + nomor + " terganggu");
            }
        }
        System.out.println("Thread-" + nomor + " selesai.");
    }
}
