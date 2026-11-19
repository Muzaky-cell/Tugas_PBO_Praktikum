package PraktikumP7;

public class Soal1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int[] b = {1, 2, 3, 4, 5};

        int[] c = new int[]{5, 10, 15, 20, 25};

        System.out.println("Variasi 1: " + java.util.Arrays.toString(a));
        System.out.println("Variasi 2: " + java.util.Arrays.toString(b));
        System.out.println("Variasi 3: " + java.util.Arrays.toString(c));
    }
}
