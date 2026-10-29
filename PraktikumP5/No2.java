package Praktikum;
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan kode hari (1-7): ");
        int kode = in.nextInt();
        String hari;

        hari = switch (kode) {
            case 1 -> "Senin";
            case 2 -> "Selasa";
            case 3 -> "Rabu";
            case 4 -> "Kamis";
            case 5 -> "Jumat";
            case 6 -> "Sabtu";
            case 7 -> "Minggu";
            default -> "Kode hari tidak valid";
        };
        System.out.println("Hari: " + hari);
    }
}
