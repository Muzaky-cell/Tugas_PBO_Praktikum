package PraktikumP8;

class Sumpah {
    String awal;

    Sumpah() {
        awal = "Kami putra dan putri Indonesia"; // dibuat di konstruktor
    }

    void tampil() {
        System.out.println(awal + " mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println(awal + " mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println(awal + " menjunjung bahasa persatuan, bahasa Indonesia.");
    }
}

public class Soal4 {
    public static void main(String[] args) {
        new Sumpah().tampil();
    }
}
