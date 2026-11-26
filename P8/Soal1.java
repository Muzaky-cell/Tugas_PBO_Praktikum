package PraktikumP8;

class Mobil {
    String merk;

    void jalan() {
        System.out.println(merk + " berjalan");
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Mobil m = new Mobil(); // objek dibuat dari kelas
        m.merk = "Toyota";
        m.jalan();
    }
}
