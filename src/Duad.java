// Import Scanner untuk input data
import java.util.Scanner;

// Class luas
// KONSEP INHERITANCE terdapat pada class Luas yang menjadikan class MainDuad untuk induk/superclass dari class Luas
// (Pewarisan) Inheritance atau Pewarisan/Penurunan adalah konsep pemrograman
// dimana sebuah class dapat 'menurunkan' property dan method yang dimilikinya kepada class lain.
class Luas extends MainDuad{
    public double persegi(double sisi){
        System.out.println("=== LUAS PERSEGI ===");
//        Scanner scanner = new Scanner(System.in);

        double s, luas ;

//        System.out.print("Masukkan Sisi Persegi : ");
//        s = scanner.nextInt();
        luas = sisi * sisi ;

        System.out.println("Luas Persegi : " + luas);
        return luas;
    }

    public double persegiPanjang(Double p, Double l){
        System.out.println("=== LUAS PERSEGI PANJANG ===");
//        Scanner scanner = new Scanner(System.in);

        double luas;

//        System.out.print("Masukkan Panjang Persegi Panjang: ");
//        p = scanner.nextInt();
//
//        System.out.print("Masukkan Lebar Persegi Panjang:");
//        l = scanner.nextInt();

        luas = p * l;

        System.out.print("Luas Persegi Panjang : "+luas);
        return luas;
    }

//    Luas segitiga sama sisi dan sama kaki
    public double segitiga(double a, double t){
        System.out.println("=== LUAS SEGITIGA ===");
//        Scanner scanner = new Scanner(System.in);

        double luas;

//        System.out.print("Masukkan Alas Segitiga : ");
//        a = scanner.nextInt();

//        System.out.print("Masukkan Tinggi Segitiga : ");
//        t = scanner.nextInt();

        luas = 0.5 * a * t;

        System.out.println("Luas Segitiga : " + luas);
        return luas;
    }

    public double lingkaran(double r){
        System.out.println("\n=== MENGHITUNG LUAS LINGKARAN ===");
//        Scanner scanner = new Scanner(System.in);

        double phi = 3.14, luas;
//        int r;

//        System.out.print("Masukkan Jari-Jari : ");
//        r = scanner.nextInt();

        luas = phi * r * r;

        System.out.print("luas Lingkaran : " + luas);
        return luas;
    }
}

// KONSEP POLYMORPHISM
// sebuah konsep OOP di mana class memiliki banyak “bentuk” method yang berbeda,
// meskipun namanya sama. Maksud dari “bentuk” adalah isinya yang berbeda,
// namun tipe data dan parameternya berbeda
class Keliling{
    public double persegi(double s){
        System.out.println("=== KELILING PERSEGI ===");
//        Scanner scanner = new Scanner(System.in);

        double kel;

//        System.out.print("Masukkan Sisi Persegi : ");
//        s = scanner.nextInt();

        kel = s * s * s * s;

        System.out.println("Keliling Persegi : " + kel);
        return kel;
    }

    public double persegiPanjang(double p, double l){
        System.out.println("\n=== KELILING PERSEGI PANJANG ===");
//        Scanner scanner = new Scanner(System.in);

        double kel;

//        System.out.print("Masukkan Panjang Persegi Panjang : ");
//        p = scanner.nextInt();
//
//        System.out.print("Masukkan Lebar Persegi Panjang: ");
//        l = scanner.nextInt();

        kel = 2 * p + l;

        System.out.println("Keliling Persegi Panjang : " + kel);
        return kel;
    }

//    KONSEP INTERFACE
//    suatu mekanisme yang disediakan oleh java yang memungkinkan berbagi konstanta atau
//    menentukan bentuk metode yang dapat digunakan oleh
//    sejumlah kelas bentuk metode yang dapat digunakan oleh sejumlah kelas.
//    public double segitiga(){
//        System.out.println("Segitiga Sama Sisi");
//        segitigaSamaSisi();
//        System.out.println("Segitiga Sama Kaki");
//        segitigaSamaKaki();
//    }

    private double segitigaSamaSisi(double s){
        System.out.println("=== KELILING SEGITIGA Sama Sisi===");
//        Scanner scanner = new Scanner(System.in);

        double kel;

//        System.out.print("Masukkan Panjang Sisi Segitiga : ");
//        s = scanner.nextInt();

        kel = 3 * s;

        System.out.println("Keliling Segitiga : "+kel);
        return kel;
    }

    private double segitigaSamaKaki(double s){
        System.out.println("=== KELILING SEGITIGA Sama Kaki===");
//        Scanner scanner = new Scanner(System.in);

        double kel;

//        System.out.print("Masukkan Panjang Sisi Segitiga : ");
//        s = scanner.nextInt();

        kel = 3 * s;

        System.out.println("Keliling Segitiga : "+kel);
        return kel;
    }

    public double lingkaran(double r){
        System.out.println("\n\n=== MENGHITUNG KELILING LINGKARAN ===");
//        Scanner scanner = new Scanner(System.in);

        double phi = 3.14, kel;

//        System.out.print("Masukkan Jari-Jari : ");
//        r = scanner.nextInt();

        kel = 2*phi*r;

        System.out.println("Luas Lingkaran : " + kel);
        return kel;
    }
}

// Class yang mana tempat program dijalankan untuk pertama kali
// karena didalam class MainDuad terdapat double main yang defaultnya
// program dijalankan pertama kali
class MainDuad{
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("=\tOperasi Aritmatika Dua Dimensi\t=");
        System.out.println("=====================================");
        System.out.println("1. Luas Persegi ");
        System.out.println("2. Luas Persegi Panjang");
        System.out.println("3. Luas Segitiga");
        System.out.println("4. Luas Lingkaran");

        System.out.println("5. Keliling Persegi");
        System.out.println("6. Keliling Persegi Panjang");
        System.out.println("7. Keliling Segitiga");
        System.out.println("8. Keliling Lingkaran");
        System.out.print("Chose Options : ");

//        Pemanggilan Construktor dari class diatas
        Luas luas = new Luas();
        Keliling keliling = new Keliling();

//        Membuat inputan yang digunakan untuk pemilihan opsi
//        dengan menggunakan switch case
        int option;
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();

//        switch (option){
//            case 1:
//                luas.persegi();
//                break;
//            case 2:
//                luas.persegiPanjang();
//                break;
//            case 3:
//                luas.segitiga();
//                break;
//            case 4:
//                luas.lingkaran();
//                break;
//            case 5:
//                keliling.persegi();
//                break;
//            case 6:
//                keliling.persegiPanjang();
//                break;
//            case 7:
//                keliling.segitiga();
//                break;
//            case 8:
//                keliling.lingkaran();
//                break;
//        }
    }
}
