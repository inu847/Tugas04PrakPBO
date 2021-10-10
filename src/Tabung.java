import java.util.Scanner;

class Tabung {
    public static void main(String[] args) {
        System.out.println("=== MENGHITUNG VOLUME TABUNG ===");
        VolTabung volTabung = new VolTabung();
        volTabung.volume();

        System.out.println("\n=== MENGHITUNG LUAS PERMUKAAN ===");
        LuasPermukaan luasPermukaan = new LuasPermukaan();
        luasPermukaan.luas();
    }
}
class VolTabung{
    public void volume(){
        Scanner scanner = new Scanner(System.in);

        double V ,phi = 3.14, r , t;

        System.out.println("Masukkan Jari-Jari : ");
        r = scanner.nextInt();

        System.out.println("Masukkan Tinggi Tabung : ");
        t = scanner.nextInt();

        V = phi * r * r * t;

        System.out.println("Volume Tabung = " + V);
    }
}
class LuasPermukaan{
    public void luas(){
        Scanner scanner = new Scanner(System.in);

        double phi = 3.14, luas;
        int r;

        System.out.print("Masukkan Jari-Jari : ");
        r = scanner.nextInt();

        luas = phi * r * r;

        System.out.print("luas Lingkaran : " + luas);
    }
}
