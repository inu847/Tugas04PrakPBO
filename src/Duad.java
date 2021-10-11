// Import Scanner untuk input data
import java.util.Scanner;

// Class luas
// KONSEP INHERITANCE
class Luas extends MainDuad{
    public void persegi(){
        System.out.println("=== LUAS PERSEGI ===");
        Scanner scanner = new Scanner(System.in);

        double s, luas ;

        System.out.print("Masukkan Sisi Persegi : ");
        s = scanner.nextInt();

        luas = s * s ;

        System.out.println("Luas Persegi : " + luas);
    }

    public void persegiPanjang(){
        System.out.println("=== LUAS PERSEGI PANJANG ===");
        Scanner scanner = new Scanner(System.in);

        double p, l, luas;

        System.out.print("Masukkan Panjang Persegi Panjang: ");
        p = scanner.nextInt();

        System.out.print("Masukkan Lebar Persegi Panjang:");
        l = scanner.nextInt();

        luas = p * l;

        System.out.print("Luas Persegi Panjang : "+luas);
    }

    public void segitiga(){
        System.out.println("=== LUAS SEGITIGA ===");
        Scanner scanner = new Scanner(System.in);

        double a, t, luas;

        System.out.print("Masukkan Alas Segitiga : ");
        a = scanner.nextInt();

        System.out.print("Masukkan Tinggi Segitiga : ");
        t = scanner.nextInt();

        luas = 0.5 * a * t;

        System.out.println("Luas Segitiga : " + luas);
    }

    public void lingkaran(){
        System.out.println("\n=== MENGHITUNG LUAS LINGKARAN ===");
        Scanner scanner = new Scanner(System.in);

        double phi = 3.14, luas;
        int r;

        System.out.print("Masukkan Jari-Jari : ");
        r = scanner.nextInt();

        luas = phi * r * r;

        System.out.print("luas Lingkaran : " + luas);
    }
}

// KONSEP POLYMORPHISM
class Keliling{
    public void persegi(){
        System.out.println("=== KELILING PERSEGI ===");
        Scanner scanner = new Scanner(System.in);

        double s, kel ;

        System.out.print("Masukkan Sisi Persegi : ");
        s = scanner.nextInt();

        kel = s * s * s * s;

        System.out.println("Keliling Persegi : " + kel);
    }

    public void persegiPanjang(){
        System.out.println("\n=== KELILING PERSEGI PANJANG ===");
        Scanner scanner = new Scanner(System.in);

        double p, l, kel;

        System.out.print("Masukkan Panjang Persegi Panjang : ");
        p = scanner.nextInt();

        System.out.print("Masukkan Lebar Persegi Panjang: ");
        l = scanner.nextInt();

        kel = 2 * p + l;

        System.out.println("Keliling Persegi Panjang : " + kel);
    }

//    KONSEP INTERFACE
    public void segitiga(){
        System.out.println("Segitiga Sama Sisi");
        segitigaSamaSisi();
        System.out.println("Segitiga Sama Kaki");
        segitigaSamaKaki();
    }

    private void segitigaSamaSisi(){
        System.out.println("=== KELILING SEGITIGA Sama Sisi===");
        Scanner scanner = new Scanner(System.in);

        double s, kel;

        System.out.print("Masukkan Panjang Sisi Segitiga : ");
        s = scanner.nextInt();

        kel = 3 * s;

        System.out.println("Keliling Segitiga : "+kel);
    }

    private void segitigaSamaKaki(){
        System.out.println("=== KELILING SEGITIGA Sama Kaki===");
        Scanner scanner = new Scanner(System.in);

        double s, kel;

        System.out.print("Masukkan Panjang Sisi Segitiga : ");
        s = scanner.nextInt();

        kel = 3 * s;

        System.out.println("Keliling Segitiga : "+kel);
    }

    public void lingkaran(){
        System.out.println("\n\n=== MENGHITUNG KELILING LINGKARAN ===");
        Scanner scanner = new Scanner(System.in);

        double phi = 3.14, keliling;
        int r;

        System.out.print("Masukkan Jari-Jari : ");
        r = scanner.nextInt();

        keliling = 2*phi*r;

        System.out.println("Luas Lingkaran : " + keliling);
    }
}

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

        Luas luas = new Luas();
        Keliling keliling = new Keliling();

        int option;
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();

        switch (option){
            case 1:
                luas.persegi();
                break;
            case 2:
                luas.persegiPanjang();
                break;
            case 3:
                luas.segitiga();
                break;
            case 4:
                luas.lingkaran();
                break;
            case 5:
                keliling.persegi();
                break;
            case 6:
                keliling.persegiPanjang();
                break;
            case 7:
                keliling.segitiga();
                break;
            case 8:
                keliling.lingkaran();
                break;
        }
    }
}
