package Praktikum;
import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("NIK            : ");
        String nik = in.nextLine();
        System.out.print("Nama           : ");
        String nama = in.nextLine();
        System.out.print("Kode golongan (1-4): ");
        int gol = in.nextInt();

        String status;
        double gajiPokok;
        double tunjPasangan = 0, tunjAnak = 0;
        int jmlAnak = 0;

        switch (gol) {
            case 1 -> {
                status = "Menikah";
                gajiPokok = 1200000;
            }
            case 2 -> {
                status = "Belum menikah";
                gajiPokok = 1500000;
            }
            case 3 -> {
                status = "Cerai";
                gajiPokok = 1750000;
            }
            case 4 -> {
                status = "Menikah dan punya anak";
                gajiPokok = 2000000;
            }
            default -> {
                System.out.println("Kode golongan tidak valid!");
                return;
            }
        }

        if (gol == 1 || gol == 4) {
            tunjPasangan = 0.10 * gajiPokok;
        }
        if (gol == 4) {
            System.out.print("Jumlah anak    : ");
            jmlAnak = in.nextInt();
            tunjAnak = 0.05 * gajiPokok * jmlAnak;
        }

        double gajiBersih = gajiPokok + tunjPasangan + tunjAnak;

        System.out.println("===== SLIP GAJI =====");
        System.out.println("NIK             : " + nik);
        System.out.println("Nama            : " + nama);
        System.out.println("Status          : " + status);
        System.out.println("Jumlah anak     : " + jmlAnak);
        System.out.printf("Gaji pokok      : Rp%,.0f%n", gajiPokok);
        System.out.printf("Tunjangan pasangan: Rp%,.0f%n", tunjPasangan);
        System.out.printf("Tunjangan anak  : Rp%,.0f%n", tunjAnak);
        System.out.printf("Gaji bersih     : Rp%,.0f%n", gajiBersih);
    }
}
