package PraktikumP7;

public class Soal10 {
    public static void main(String[] args) {
        Object[] data = {19, 0.2, 'C', "Java", true};

        for (Object o : data) {
            System.out.println(o + "  (" + o.getClass().getSimpleName() + ")");
        }
    }
}
