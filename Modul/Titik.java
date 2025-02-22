/*  Nama File   : Titik.java 
    Deskripsi   : berisi atribut dan method dalam class Titik
    Pembuat     : Moh Yusril Nur Syabani
    Tanggal     : 19 - Februari - 2025
*/



public class Titik {
    /********* ATRIBUT **********/
    private double absis;
    private double ordinat;
    static int counterTitik = 0;

    /********* KONSTRUKTOR **********/
    // Konstruktor dengan parameter
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Konstruktor tanpa parameter (default)
    public Titik() {
        this(0, 0);
    }

    /********* METHOD **********/
    // Mengembalikan jumlah objek Titik yang telah dibuat
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengubah nilai ordinat
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser titik sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik ke layar
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    /********* FINALISASI METHOD LAINNYA **********/

    // Mengembalikan kuadran titik
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        if (absis < 0 && ordinat > 0) return 2;
        if (absis < 0 && ordinat < 0) return 3;
        if (absis > 0 && ordinat < 0) return 4;
        return 0; // Jika berada di sumbu X atau Y
    }

    // Mengembalikan jarak titik dari pusat (0,0) menggunakan rumus Pythagoras
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Mengembalikan jarak antara titik saat ini dengan titik T lainnya
    public double getJarak(Titik T) {
        return Math.sqrt((absis - T.absis) * (absis - T.absis) + (ordinat - T.ordinat) * (ordinat - T.ordinat));
    }

    // Merefleksikan titik terhadap sumbu X
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // Merefleksikan titik terhadap sumbu Y
    public void refleksiY() {
        absis = -absis;
    }

    // Mengembalikan objek baru hasil refleksi terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // Mengembalikan objek baru hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
}
