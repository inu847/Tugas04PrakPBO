import java.util.Scanner;

class Limas {
    public static void main(String[] args) {
        limassegiempat limassegiempat = new limassegiempat();
        limassegiempat.vollimassegiempat();
        limassegiempat.luaspermukaanlimassegiempat();

        limassegitiga limassegitiga = new limassegitiga();
        limassegitiga.vollimassegitiga();
        limassegitiga.luaspermukaanlimassegitiga();
    }
}
class limassegiempat{
    void vollimassegiempat(){
        Scanner scanner = new Scanner(System.in);

        double la, t, vol;

        System.out.print("Masukkan Luas Alas : ");
        la = scanner.nextInt();

        System.out.print("Masukkan Tinggi Limas : ");
        t = scanner.nextInt();

        vol = 0.33 * la * t;

        System.out.println("Volume Limas Segiempat : " + vol);
    }
    void luaspermukaanlimassegiempat(){
        Scanner scanner = new Scanner(System.in);

        double s, a, t, l;

        System.out.print("Masukkan Sisi : ");
        s = scanner.nextInt();

        System.out.print("Masukkan Luas Alas : ");
        a = scanner.nextInt();

        System.out.print("Masukkan Tinggi : ");
        t = scanner.nextInt();

        l = (s * s) + (4 * 0.5 * a * t) ;

        System.out.println("Luas Permukaan Limas Segiempat : " + l);
    }
}
class limassegitiga{
    void vollimassegitiga(){
        Scanner scanner = new Scanner(System.in);

        double la,t,vol;

        System.out.print("Masukkan Luas Alas Limas Segitiga : ");
        la = scanner.nextInt();

        System.out.print("Masukkan Tinggi Limas Segitiga : ");
        t = scanner.nextInt();

        vol = 0.33 * la * t;

        System.out.println("Volume Limas Segitiga : " + vol);
    }
    void luaspermukaanlimassegitiga() {
        Scanner scanner = new Scanner(System.in);

        double la, ls, lp;

        System.out.print("Masukkan Luas Alas : ");
        la = scanner.nextInt();

        System.out.print("Masukkan Sisi Tegak : ");
        ls = scanner.nextInt();

        lp = la + (3 * ls );

        System.out.println("Luas Permukaan Limas Segiempat : " + lp);
    }
}
