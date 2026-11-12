package PraktikumP6;
public class Soal7 {
    public static void main(String[] args) {
        // while dengan i++ (post-increment): dibandingkan dulu, baru ditambah
        int i = 0;
        System.out.println("Dengan i++ :");
        while (i++ < 3) {
            System.out.println("  i = " + i);
        }

        // while dengan ++i (pre-increment): ditambah dulu, baru dibandingkan
        int j = 0;
        System.out.println("Dengan ++i :");
        while (++j < 3) {
            System.out.println("  j = " + j);
        }
    }
}
