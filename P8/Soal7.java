package PraktikumP8;

import java.util.Scanner;

class Data {
    String nama, npm, kelas;

    Data(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampil() {
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}

public class Soal7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama  : ");
        String n = in.nextLine();
        System.out.print("NPM   : ");
        String p = in.nextLine();
        System.out.print("Kelas : ");
        String k = in.nextLine();
        new Data(n, p, k).tampil();
    }
}
