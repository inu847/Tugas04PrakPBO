import java.util.Scanner;

class LuasDuad {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        System.out.println("=== LUAS PERSEGI ===");
        persegi.luaspersegi();
        System.out.println("=== KELILING PERSEGI ===");
        persegi.kelpersegi();

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.println("=== LUAS PERSEGI PANJANG ===");
        persegiPanjang.luaspersegipanjang();
        System.out.println("\n=== KELILING PERSEGI PANJANG ===");
        persegiPanjang.kelpersegipanjang();

        Segitiga segitiga = new Segitiga();
        System.out.println("=== LUAS SEGITIGA ===");
        segitiga.luassegitiga();
        System.out.println("=== KELILING SEGITIGA ===");
        segitiga.kelsegitiga();
    }
}
class Persegi{
    void luaspersegi(){
        Scanner scanner = new Scanner(System.in);

        double s, luas ;

        System.out.print("Masukkan Sisi Persegi : ");
        s = scanner.nextInt();

        luas = s * s ;

        System.out.println("Luas Persegi : " + luas);
    }
    void kelpersegi(){
        Scanner scanner = new Scanner(System.in);

        double s, kel ;

        System.out.print("Masukkan Sisi Persegi : ");
        s = scanner.nextInt();

        kel = s * s * s * s;

        System.out.println("Keliling Persegi : " + kel);
    }
}
class PersegiPanjang{
    void luaspersegipanjang(){
        Scanner scanner = new Scanner(System.in);

        double p, l, luas;

        System.out.print("Masukkan Panjang Persegi Panjang: ");
        p = scanner.nextInt();

        System.out.print("Masukkan Lebar Persegi Panjang:");
        l = scanner.nextInt();

        luas = p * l;

        System.out.print("Luas Persegi Panjang : "+luas);
    }
    void kelpersegipanjang(){
        Scanner scanner = new Scanner(System.in);

        double p, l, kel;

        System.out.print("Masukkan Panjang Persegi Panjang : ");
        p = scanner.nextInt();

        System.out.print("Masukkan Lebar Persegi Panjang: ");
        l = scanner.nextInt();

        kel = 2 * p + l;

        System.out.println("Keliling Persegi Panjang : " + kel);
    }
}
class Segitiga{
    void luassegitiga(){
        Scanner scanner = new Scanner(System.in);

        double a, t, luas;

        System.out.print("Masukkan Alas Segitiga : ");
        a = scanner.nextInt();

        System.out.print("Masukkan Tinggi Segitiga : ");
        t = scanner.nextInt();

        luas = 0.5 * a * t;

        System.out.println("Luas Segitiga : " + luas);
    }
    void kelsegitiga(){
        Scanner scanner = new Scanner(System.in);

        double s, kel;

        System.out.print("Masukkan Panjang Sisi Segitiga : ");
        s = scanner.nextInt();

        kel = 3 * s;

        System.out.println("Keliling Segitiga : "+kel);
    }
}