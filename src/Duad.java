import java.util.Scanner;

public class Luas {
    public void persegi(Double p, Double l, Double t){
        System.out.println("Luas Persegi");
    }

    public void persegiPanjang(Double p, Double l, Double t){
        System.out.println("Keliling Persegi Panjang");
    }

    public void segitiga(Double p, Double l, Double t){
        System.out.println("Keliling Segitiga");
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

public class Keliling{
    public void persegi(Double p, Double l, Double t){
        System.out.println("Keliling Persegi");
    }

    public void persegiPanjang(Double p, Double l, Double t){
        System.out.println("Luas Persegi Panjang");
    }

    public void segitiga(Double p, Double l, Double t){
        System.out.println("Luas Segitiga");
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

class Main{
    public static void main(String[] args) {
        double p, l, t;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Panjang\t: ");
        p = scanner.nextInt();

        System.out.print("Masukkan Lebar\t\t: ");
        l = scanner.nextInt();

        System.out.print("Masukkan Tinggi\t\t: ");
        t = scanner.nextInt();

        Luas luas = new Luas();
        luas.persegi(p, l, t);
        luas.persegiPanjang(p, l, t);
        luas.segitiga(p, l, t);

        Keliling keliling = new Keliling();
        keliling.persegi(p, l, t);
        keliling.persegiPanjang(p, l, t);
        keliling.segitiga(p, l, t);
    }
}
