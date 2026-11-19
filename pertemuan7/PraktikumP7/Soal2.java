package PraktikumP7;

public class Soal2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        int indeks = -1;
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            mobil[indeks] = "Toyota";
            System.out.println("Indeks yang diubah : " + indeks);
            System.out.println("Nilai baru         : " + mobil[indeks]);
        } else {
            System.out.println("Nilai \"Suzuki\" tidak ditemukan.");
        }
    }
}
