import java.util.Scanner;

public class LuasPermukaan{
    public void balok(){
        System.out.println("Balok");
    }

    public void tabung(){
        System.out.println("\n=== MENGHITUNG LUAS PERMUKAAN ===");
        Scanner scanner = new Scanner(System.in);

        double phi = 3.14, luas;
        int r;

        System.out.print("Masukkan Jari-Jari : ");
        r = scanner.nextInt();

        luas = phi * r * r;

        System.out.print("luas Lingkaran : " + luas);
    }

    public void kubus(){
        Scanner input = new Scanner (System.in);

        double sisi, volume, permukaan;
        sisi = input.nextInt();

        volume = sisi*sisi*sisi;
        permukaan = sisi * sisi * 6;


        System.out.println("========================================");
        System.out.println("Volume Kubus = " + volume);
        System.out.println("Luas Permukaan Kubus Adalah = " + permukaan);
    }

    public void balok(){
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, hasil;
        System.out.println("Program Menghitung Luas Balok");
        System.out.println("=============================");

        System.out.print("Masukan Panjang Balok: ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar balok: ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi Balok: ");
        tinggi = input.nextInt();

        hasil =  2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

        System.out.println("Luas Balok tersebut adalah: " + hasil);
    }
}

public class Volume{
    public void balok(){
        Scanner input = new Scanner(System.in);
        double panjang, lebar, tinggi, volume;
        System.out.println("Program Menghitung Luas Balok");
        System.out.println("=============================");

        System.out.print("Masukan Panjang Balok: ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar balok: ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi Balok: ");
        tinggi = input.nextInt();

        volume = panjang * lebar * tinggi;

        System.out.println("====================================");
        System.out.println("Volume Balok Tersebut adalah " + volume);
    }

    public void tabung(){
        System.out.println("=== MENGHITUNG VOLUME TABUNG ===");
        Scanner scanner = new Scanner(System.in);

        double V ,phi = 3.14, r , t;

        System.out.println("Masukkan Jari-Jari : ");
        r = scanner.nextInt();

        System.out.println("Masukkan Tinggi Tabung : ");
        t = scanner.nextInt();

        V = phi * r * r * t;

        System.out.println("Volume Tabung = " + V);
    }

    public void kubus(){
        Scanner input = new Scanner (System.in);

        int sisi;
        int Volume;
        System.out.println("Menghitung Volume Kubus");
        System.out.print("Masukkan sisi : ");
        sisi = input.nextInt();

        Volume = sisi*sisi*sisi;

        System.out.println("Volume Kubus = " + Volume);
    }
}

class Main(){
    public static void main(String[] args) {
        LuasPermukaan luasPermukaan = new LuasPermukaan();
        luasPermukaan.balok();

        Volume volume = new Volume();
        volume.balok();
    }
}