import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        java.util.Queue<String> q = new LinkedList<>();

        // Menambahkan elemen ke dalam Queue
        q.add("Bebek");
        q.add("Angsa");
        q.add("Kuda");
        q.add("Buaya");
        q.add("Tikus");

        // Melihat elemen pertama dari Queue tanpa menghapusnya
        System.out.println("Peek: " + q.peek());

        // Mencetak semua elemen dalam Queue
        System.out.println("Animals: " + q);

        // Menghapus dua elemen pertama dari Queue
        q.poll();
        q.poll();

        // Mencetak semua elemen dalam Queue setelah dua elemen dihapus
        System.out.println("Animals: " + q);
    }
}