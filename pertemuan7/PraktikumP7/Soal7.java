package PraktikumP7;

public class Soal7 {
    public static void main(String[] args) {
        ThreadBaru t = new ThreadBaru();

        t.start();

        System.out.println("Thread utama selesai dijalankan.");
    }
}

class ThreadBaru extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread baru berjalan: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread terganggu: " + e.getMessage());
            }
        }
    }
}
