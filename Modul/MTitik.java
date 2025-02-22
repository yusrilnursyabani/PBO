/*  Nama File   : MTitik.java 
    Deskripsi   : berisi atribut dan method dalam class Titik
    Pembuat     : Moh Yusril Nur Syabani
    Tanggal     : 19 - Februari - 2025
*/




public class MTitik {
    public static void main(String[] args) {
        // Membuat titik T1 di (3, 4)
        Titik T1 = new Titik(3, 4);
        T1.printTitik();
        
        // Menguji kuadran
        System.out.println("T1 berada di kuadran: " + T1.getKuadran());

        // Menguji jarak dari pusat
        System.out.println("Jarak T1 dari pusat: " + T1.getJarakPusat());

        // Membuat titik T2 di (-3, -4)
        Titik T2 = new Titik(-3, -4);
        T2.printTitik();

        // Menguji jarak antara T1 dan T2
        System.out.println("Jarak antara T1 dan T2: " + T1.getJarak(T2));

        // Menguji refleksi terhadap sumbu X
        T1.refleksiX();
        System.out.println("T1 setelah refleksi terhadap sumbu X:");
        T1.printTitik();

        // Menguji refleksi terhadap sumbu Y
        T2.refleksiY();
        System.out.println("T2 setelah refleksi terhadap sumbu Y:");
        T2.printTitik();

        // Menguji getRefleksiX() (menghasilkan objek baru)
        Titik T3 = T1.getRefleksiX();
        System.out.println("T3 adalah hasil refleksi T1 terhadap sumbu X:");
        T3.printTitik();

        // Menguji getRefleksiY() (menghasilkan objek baru)
        Titik T4 = T2.getRefleksiY();
        System.out.println("T4 adalah hasil refleksi T2 terhadap sumbu Y:");
        T4.printTitik();

        // Menampilkan jumlah objek Titik yang telah dibuat
        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
    }
}
