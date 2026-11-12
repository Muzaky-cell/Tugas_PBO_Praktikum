package PraktikumP6;
public class Soal5 {
    public static void main(String[] args) {
        int tinggi = 5;

        System.out.printf("%-14s%s%n", "Half Triangle", "Full Triangle");

        for (int i = 1; i <= tinggi; i++) {
            // --- Half Triangle: 1, 3, 5, 7, 9 bintang ---
            int bintangHalf = 2 * i - 1;
            int spasiHalf = tinggi - i;
            String half = " ".repeat(spasiHalf) + "*".repeat(bintangHalf);

            // --- Full Triangle: 1, 3, 5, 3, 1 bintang ---
            int bintangFull = (i <= 3) ? 2 * i - 1 : 2 * (tinggi - i + 1) - 1;
            int spasiFull = (5 - bintangFull) / 2;
            String full = " ".repeat(spasiFull) + "*".repeat(bintangFull);

            System.out.printf("%-14s%s%n", half, full);
        }
    }
}
