package PraktikumP8;

class Civitas {
    String nama, status;

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void tampil() {
        System.out.println("Nama: " + nama + " | Status: " + status
                + " (Civitas Akademika Fakultas Teknik)");
    }
}

class Dosen extends Civitas {
    Dosen(String nama) {
        super(nama, "Dosen");
    }
}

class Mahasiswa extends Civitas {
    Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
    }
}

class Staff extends Civitas {
    Staff(String nama) {
        super(nama, "Staff");
    }
}

public class Soal6 {
    public static void main(String[] args) {
        Civitas[] data = {
            new Dosen("Pak Budi"),
            new Mahasiswa("Bintang"),
            new Staff("Bu Sari")
        };
        for (Civitas c : data) c.tampil();
    }
}
