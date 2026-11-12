package PraktikumP6;
public class Soal8 {
    public static void main(String[] args) {
        int[] nilai = {85, 90, 78, 92, 88};
        String[] buah = {"Apel", "Jeruk", "Mangga"};

        System.out.println("Isi array nilai :");
        for (int n : nilai) {                // foreach: ambil satu per satu
            System.out.println(n);
        }

        System.out.println("Isi array buah :");
        for (String b : buah) {
            System.out.println(b);
        }
    }
}
