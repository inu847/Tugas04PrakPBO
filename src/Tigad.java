import java.util.Scanner;

public class LuasPermukaan{
    public void balok(){
        System.out.println("Balok");
    }
}

public class Volume{
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

class Main(){
    public static void main(String[] args) {
        LuasPermukaan luasPermukaan = new LuasPermukaan();
        luasPermukaan.balok();

        Volume volume = new Volume();
        volume.balok();
    }
}