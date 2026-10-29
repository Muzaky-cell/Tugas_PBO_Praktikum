package Praktikum;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " adalah bilangan GENAP");
        } else {
            System.out.println(n + " adalah bilangan GANJIL");
        }
    }
}
