package Praktikum;
import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== MENU LUAS BANGUN DATAR ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu (1-5): ");
        int pilih = in.nextInt();

        double luas;

        switch (pilih) {
            case 1 -> {
                System.out.print("Sisi: ");
                double s = in.nextDouble();
                luas = s * s;
                System.out.println("Luas persegi = " + luas);
            }
            case 2 -> {
                System.out.print("Alas: ");
                double a = in.nextDouble();
                System.out.print("Tinggi: ");
                double t = in.nextDouble();
                luas = 0.5 * a * t;
                System.out.println("Luas segitiga = " + luas);
            }
            case 3 -> {
                System.out.print("Jari-jari: ");
                double r = in.nextDouble();
                luas = Math.PI * r * r;
                System.out.println("Luas lingkaran = " + luas);
            }
            case 4 -> {
                System.out.print("Sisi sejajar 1: ");
                double a1 = in.nextDouble();
                System.out.print("Sisi sejajar 2: ");
                double a2 = in.nextDouble();
                System.out.print("Tinggi: ");
                double tt = in.nextDouble();
                luas = 0.5 * (a1 + a2) * tt;
                System.out.println("Luas trapesium = " + luas);
            }
            case 5 -> {
                System.out.print("Diagonal 1: ");
                double d1 = in.nextDouble();
                System.out.print("Diagonal 2: ");
                double d2 = in.nextDouble();
                luas = 0.5 * d1 * d2;
                System.out.println("Luas layang-layang = " + luas);
            }
            default -> System.out.println("Menu tidak valid!");
        }
    }
}
