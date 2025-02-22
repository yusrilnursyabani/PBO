/*  Nama File   : Garis.java 
    Deskripsi   : berisi atribut dan method dalam class Garis
    Pembuat     : Moh Yusril Nur Syabani
    Tanggal     : 19 - Februari - 2025
*/





public class Garis {
    // Atribut: k awal, k akhir, dan counterGaris untuk menghitung jumlah objek Garis
    private Titik awal;
    private Titik akhir;
    static int counterGaris = 0;

    // a. Konstruktor tanpa parameter:
    // Menginisialisasi k awal dengan (0,0) dan k akhir dengan (1,1)
    public Garis() {
        this.awal = new Titik(0, 0);
        this.akhir = new Titik(1, 1);
        counterGaris++;
    }

    // b. Konstruktor dengan parameter masukan k awal dan k akhir
    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    // c. Selektor (getter) dan mutator (setter) untuk k awal dan k akhir
    public Titik getAwal() {
        return awal;
    }

    public void setAwal(Titik awal) {
        this.awal = awal;
    }

    public Titik getAkhir() {
        return akhir;
    }

    public void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    // Selektor untuk mendapatkan nilai static counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // d. Method untuk mendapatkan panjang sebuah garis
    public double getPanjang() {
        // Menggunakan method getJarak dari class Titik
        return awal.getJarak(akhir);
    }

    // e. Method untuk mendapatkan gradien dari sebuah garis
    public double getGradien() {
        double deltaX = akhir.getAbsis() - awal.getAbsis();
        // Jika garis vertikal (deltaX nol), kembalikan nilai tak terhingga
        if (Math.abs(deltaX) < 1e-9) {
            return Double.POSITIVE_INFINITY;
        }
        return (akhir.getOrdinat() - awal.getOrdinat()) / deltaX;
    }

    // f. Method untuk mendapatkan k tengah (titik tengah) dari sebuah garis
    public Titik getTengah() {
        double midX = (awal.getAbsis() + akhir.getAbsis()) / 2.0;
        double midY = (awal.getOrdinat() + akhir.getOrdinat()) / 2.0;
        return new Titik(midX, midY);
    }

    // g. Method untuk mengecek apakah garis tersebut sejajar dengan garis lainnya
    public boolean isSejajar(Garis g) {
        double gradien1 = this.getGradien();
        double gradien2 = g.getGradien();
        // Jika kedua gradien tak hingga, berarti kedua garis vertikal dan sejajar
        if (Double.isInfinite(gradien1) && Double.isInfinite(gradien2)) {
            return true;
        }
        // Menggunakan toleransi untuk membandingkan bilangan pecahan
        return Math.abs(gradien1 - gradien2) < 1e-9;
    }

    // h. Method untuk mengecek apakah garis tersebut tegak lurus dengan garis lainnya
    public boolean isTegakLurus(Garis g) {
        double gradien1 = this.getGradien();
        double gradien2 = g.getGradien();
        // Kasus khusus: satu garis vertikal dan garis lainnya horizontal (gradien 0)
        if (Double.isInfinite(gradien1) && Math.abs(gradien2) < 1e-9) return true;
        if (Double.isInfinite(gradien2) && Math.abs(gradien1) < 1e-9) return true;
        // Jika salah satu garis vertikal (tak terhingga) dan yang lain tidak horizontal, tidak tegak lurus
        if (Double.isInfinite(gradien1) || Double.isInfinite(gradien2)) return false;
        // Dua garis tegak lurus jika hasil perkalian gradiennya adalah -1
        return Math.abs(gradien1 * gradien2 + 1) < 1e-9;
    }

    // i. Method untuk menampilkan ke layar k awal dan k akhir garis
    public void displayGaris() {
        System.out.print("Garis: ");
        awal.printTitik();
        System.out.print(" - ");
        akhir.printTitik();
        System.out.println();
    }

    // j. Method untuk menampilkan persamaan garis dalam bentuk string "y = mx + c"
    public String getPersamaanGaris() {
        double deltaX = akhir.getAbsis() - awal.getAbsis();
        // Jika garis vertikal, tampilkan dalam bentuk "x = konstanta"
        if (Math.abs(deltaX) < 1e-9) {
            return "x = " + awal.getAbsis();
        } else {
            double m = (akhir.getOrdinat() - awal.getOrdinat()) / deltaX;
            double c = awal.getOrdinat() - m * awal.getAbsis();
            String equation = "y = " + m + "x";
            if (c > 0) {
                equation += " + " + c;
            } else if (c < 0) {
                equation += " - " + (-c);
            }
            return equation;
        }
    }
}
