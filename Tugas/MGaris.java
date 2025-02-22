/*  Nama File   : MGaris.java 
    Deskripsi   : berisi atribut dan method dalam class Garis
    Pembuat     : Moh Yusril Nur Syabani
    Tanggal     : 19 - Februari - 2025
*/

public class MGaris {
    public static void main(String[] args) {
        System.out.println("=== Testing Garis (Default Constructor) ===");
        // Konstruktor default: awal = (0,0), akhir = (1,1)
        Garis g1 = new Garis();
        g1.displayGaris();
        System.out.println("Persamaan garis: " + g1.getPersamaanGaris());
        System.out.println("Panjang garis: " + g1.getPanjang());
        System.out.println("Gradien garis: " + g1.getGradien());
        System.out.print("Titik tengah: ");
        g1.getTengah().printTitik();
        System.out.println();

        System.out.println("=== Testing Garis (Parameterized Constructor) ===");
        // Membuat garis dengan titik (-2,0) dan (0,4)
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis g2 = new Garis(t1, t2);
        g2.displayGaris();
        System.out.println("Persamaan garis: " + g2.getPersamaanGaris());
        System.out.println("Panjang garis: " + g2.getPanjang());
        System.out.println("Gradien garis: " + g2.getGradien());
        System.out.print("Titik tengah: ");
        g2.getTengah().printTitik();
        System.out.println();

        System.out.println("=== Testing Hubungan Antargaris ===");
        // Membuat garis lain untuk menguji apakah garis sejajar atau tegak lurus
        Titik t3 = new Titik(1, 1);
        Titik t4 = new Titik(3, 5);
        Garis g3 = new Garis(t3, t4);
        g3.displayGaris();
        System.out.println("Garis g2 dan g3 sejajar? " + g2.isSejajar(g3));
        System.out.println("Garis g2 dan g3 tegak lurus? " + g2.isTegakLurus(g3));
        System.out.println();

        // Menampilkan jumlah objek Garis yang telah dibuat
        System.out.println("Jumlah objek Garis = " + Garis.getCounterGaris());
    }
}
