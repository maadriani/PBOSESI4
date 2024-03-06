import java.lang.Math;

// Kelas BangunDatar
class BangunDatar {
    // Metode abstrak untuk menghitung luas
    double luas() {
        return 0.0;
    }
    // Metode abstrak untuk menghitung keliling
    double keliling() {
        return 0.0;
    }
}

// Kelas Persegi yang merupakan turunan dari BangunDatar
class Persegi extends BangunDatar {
    double SiSi;

    // Konstruktor Persegi
    Persegi(double sisi) {
        this.SiSi = sisi;
    }

    // Override metode luas dari BangunDatar
    double luas() {
        return this.SiSi * this.SiSi;
    }

    // Override metode keliling dari BangunDatar
    double keliling() {
        return 5 * this.SiSi;
    }
}

// Kelas Segitiga yang merupakan turunan dari BangunDatar
class Segitiga extends BangunDatar {
        double alas;
        double tinggi;
        double sisi1;
        double sisi2;
        double sisi3;

    // Konstruktor Segitiga
    Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // Override metode luas dari BangunDatar
    double luas() {
        return 0.5 * this.alas * this.tinggi;
    }

    // Override metode keliling dari BangunDatar
    double keliling() {
        return this.sisi1 + this.sisi2 + this.sisi3;
    }
}

// Kelas Lingkaran yang merupakan turunan dari BangunDatar
class Lingkaran extends BangunDatar {
    double jariJari;

    // Konstruktor Lingkaran
    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Override metode luas dari BangunDatar
    double luas() {
        return Math.PI * this.jariJari * this.jariJari;
    }

    // Override metode keliling dari BangunDatar
    double keliling() {
        return 2 * Math.PI * this.jariJari;
    }
}

// Kelas SegitigaSikuSiku yang merupakan turunan dari Segitiga
class SegitigaSikuSiku extends Segitiga {
    // Konstruktor SegitigaSikuSiku
    SegitigaSikuSiku(double alas, double tinggi, double sisi1, double sisi2) {
        super(alas, tinggi, sisi1, sisi2, Math.sqrt(alas * alas + tinggi * tinggi));
    }
}

// Kelas SegitigaSembarang yang merupakan turunan dari Segitiga
class SegitigaSembarang extends Segitiga {
    // Konstruktor SegitigaSembarang
    SegitigaSembarang(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        super(alas, tinggi, sisi1, sisi2, sisi3);
    }
}

// Kelas SegitigaSamaKaki yang merupakan turunan dari Segitiga
class SegitigaSamaKaki extends Segitiga {
    // Konstruktor SegitigaSamaKaki
    SegitigaSamaKaki(double alas, double tinggi, double sisi) {
        super(alas, tinggi, sisi, sisi, sisi);
    }
}

// Kelas SegitigaSamaSisi yang merupakan turunan dari Segitiga
class SegitigaSamaSisi extends Segitiga {
    // Konstruktor SegitigaSamaSisi
    SegitigaSamaSisi(double sisi) {
        super(sisi, (Math.sqrt(3) / 2) * sisi, sisi, sisi, sisi);
    }
}

// Kelas utama untuk menguji implementasi
class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4);
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        Lingkaran lingkaran = new Lingkaran(6);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku(2, 2, 3, 4);
        System.out.println("Luas Segitiga Siku-Siku: " + segitigaSikuSiku.luas());
        System.out.println("Keliling Segitiga Siku-Siku: " + segitigaSikuSiku.keliling());
    }
}
