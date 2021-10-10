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
