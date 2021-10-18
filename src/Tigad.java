import java.util.Scanner;

// Class Luas Permukaan
// KONSEP INHERITANCE terdapat pada class luaspermukaan yang menjadikan class maintigad untuk induk/superclass dari class LuasPermukaan
// (Pewarisan) Inheritance atau Pewarisan/Penurunan adalah konsep pemrograman
// dimana sebuah class dapat 'menurunkan' property dan method yang dimilikinya kepada class lain.
class LuasPermukaan extends MainTigad{
    public double tabung(double r){
        System.out.println("\n=== MENGHITUNG LUAS PERMUKAAN ===\n");
//        Scanner scanner = new Scanner(System.in);

        double phi = 3.14, luas;

//        System.out.print("Masukkan Jari-Jari : ");
//        r = scanner.nextInt();

        luas = phi * r * r;

        System.out.print("luas Lingkaran : " + luas);
        return luas;
    }

    public double kubus(double sisi){
//        Scanner input = new Scanner (System.in);

        double permukaan;
//        sisi = input.nextInt();

        permukaan = sisi * sisi * 6;

        System.out.println("========================================");
        System.out.println("Luas Permukaan Kubus Adalah = " + permukaan);
        return permukaan;
    }

    public double balok(double panjang, double lebar, double tinggi){
//        Scanner input = new Scanner(System.in);
        double hasil;
        System.out.println("Program Menghitung Luas Balok");
        System.out.println("=============================");

//        System.out.print("Masukan Panjang Balok: ");
//        panjang = input.nextInt();
//        System.out.print("Masukan Lebar balok: ");
//        lebar = input.nextInt();
//        System.out.print("Masukan Tinggi Balok: ");
//        tinggi = input.nextInt();

        hasil =  2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

        System.out.println("Luas Balok tersebut adalah: " + hasil);
        return hasil;
    }

    public double bola(double jari)
    {
//        System.out.print("Masukkan jari-jari bola : ");
//        Scanner input = new Scanner(System.in);
//        float jari = input.nextFloat();
        double hasil = jari*jari*22/7*4;
        System.out.println("Luas Permukaan Bola adalah " + hasil);
        return hasil;
    }

    public double prisma(double La, double Ka, double tinggi) {
//        Scanner userInput = new Scanner(System.in);

        double luasP;

        System.out.println("Luas Permukaan & Volume Prisma Segitiga");
        System.out.println("========================================");

//        System.out.print("Masukkan Luas Alas     : ");
//        La = userInput.nextFloat();
//
//        System.out.print("Masukkan Keliling Alas : ");
//        Ka = userInput.nextFloat();
//
//        System.out.print("Masukkan Tinggi        : ");
//        tinggi = userInput.nextFloat();

        System.out.println("======================================");
        luasP = (2 * La) + (Ka * tinggi);
        System.out.println("Luas Permukaannya  : " + luasP);
        return luasP;
    }

    public double luaspermukaanlimassegiempat(double s, double a, double t){
//        Scanner scanner = new Scanner(System.in);

        double l;

//        System.out.print("Masukkan Sisi : ");
//        s = scanner.nextInt();
//
//        System.out.print("Masukkan Luas Alas : ");
//        a = scanner.nextInt();
//
//        System.out.print("Masukkan Tinggi : ");
//        t = scanner.nextInt();

        l = (s * s) + (4 * 0.5 * a * t) ;

        System.out.println("Luas Permukaan Limas Segiempat : " + l);
        return l;
    }

    double luaspermukaanlimassegitiga(double la, double ls) {
//        Scanner scanner = new Scanner(System.in);

        double lp;

//        System.out.print("Masukkan Luas Alas : ");
//        la = scanner.nextInt();
//
//        System.out.print("Masukkan Sisi Tegak : ");
//        ls = scanner.nextInt();

        lp = la + (3 * ls );

        System.out.println("Luas Permukaan Limas Segiempat : " + lp);
        return lp;
    }
}

// KONSEP POLYMORPHISM
// sebuah konsep OOP di mana class memiliki banyak “bentuk” method yang berbeda,
// meskipun namanya sama. Maksud dari “bentuk” adalah isinya yang berbeda,
// namun tipe data dan parameternya berbeda
class Volume{
    public double balok(double panjang, double lebar, double tinggi){
//        Scanner input = new Scanner(System.in);
        double volume;
        System.out.println("Program Menghitung Luas Balok");
        System.out.println("=============================");

//        System.out.print("Masukan Panjang Balok: ");
//        panjang = input.nextInt();
//        System.out.print("Masukan Lebar balok: ");
//        lebar = input.nextInt();
//        System.out.print("Masukan Tinggi Balok: ");
//        tinggi = input.nextInt();

        volume = panjang * lebar * tinggi;

        System.out.println("====================================");
        System.out.println("Volume Balok Tersebut adalah " + volume);
        return volume;
    }

    public double tabung(double r , double t){
        System.out.println("\n=== MENGHITUNG VOLUME TABUNG ===\n");
//        Scanner scanner = new Scanner(System.in);

        double V ,phi = 3.14;

//        System.out.print("Masukkan Jari-Jari : ");
//        r = scanner.nextInt();
//
//        System.out.print("Masukkan Tinggi Tabung : ");
//        t = scanner.nextInt();

        V = phi * r * r * t;

        System.out.println("Volume Tabung : " + V);
        return V;
    }

    public double kubus(double sisi){
//        Scanner input = new Scanner (System.in);

        double Volume;
        System.out.println("Menghitung Volume Kubus");
//        System.out.print("Masukkan sisi : ");
//        sisi = input.nextInt();

        Volume = sisi*sisi*sisi;

        System.out.println("Volume Kubus = " + Volume);
        return Volume;
    }

    public double bola(double jari)
    {
//        System.out.print("Masukkan jari-jari bola : ");
//        Scanner input = new Scanner(System.in);
//        float jari = input.nextFloat();
        double hasil = jari*jari*22/7*4;
        System.out.println("Luas Permukaan Bola adalah " + hasil);
        return hasil;
    }

    public double prisma(double La, double tinggi) {
//        Scanner userInput = new Scanner(System.in);

        double volume;

        System.out.println("Luas Permukaan & Volume Prisma Segitiga");
        System.out.println("========================================");

//        System.out.print("Masukkan Luas Alas     : ");
//        La = userInput.nextFloat();
//
//        System.out.print("Masukkan Keliling Alas : ");
//
//        System.out.print("Masukkan Tinggi        : ");
//        tinggi = userInput.nextFloat();

        volume = La * tinggi;
        System.out.println("Volumenya\t: " + volume);
        return volume;
    }

    public double vollimassegiempat(double la, double t){
//        Scanner scanner = new Scanner(System.in);

        double vol;

//        System.out.print("Masukkan Luas Alas : ");
//        la = scanner.nextInt();
//
//        System.out.print("Masukkan Tinggi Limas : ");
//        t = scanner.nextInt();

        vol = 0.33 * la * t;

        System.out.println("Volume Limas Segiempat : " + vol);
        return vol;
    }

    public double vollimassegitiga(double la, double t){
//        Scanner scanner = new Scanner(System.in);

        double vol;

//        System.out.print("Masukkan Luas Alas Limas Segitiga : ");
//        la = scanner.nextInt();
//
//        System.out.print("Masukkan Tinggi Limas Segitiga : ");
//        t = scanner.nextInt();

        vol = 0.33 * la * t;

        System.out.println("Volume Limas Segitiga : " + vol);
        return vol;
    }
}

// Class yang mana tempat program dijalankan untuk pertama kali
// karena didalam class MainTigad terdapat double main yang defaultnya
// program dijalankan pertama kali
class MainTigad{
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("=\tOperasi Aritmatika Tiga Dimensi\t=");
        System.out.println("=====================================");
        System.out.println("1. Luas Permukaan Balok ");
        System.out.println("2. Luas Permukaan Tabung");
        System.out.println("3. Luas Permukaan Kubus");
        System.out.println("4. Luas Permukaan Bola");
        System.out.println("5. Luas Permukaan Prisma");

        System.out.println("6. Volume Balok ");
        System.out.println("7. Volume Tabung");
        System.out.println("8. Volume Kubus");
        System.out.println("9. Volume Bola");
        System.out.println("10. Volume Prisma");
        System.out.println("11. Luas Permukaan Limas Segitiga");
        System.out.println("12. Luas Permukaan Limas Segiempat");
        System.out.println("13. Volume Limas Segitiga");
        System.out.println("14. Volume Limas Segiempat");
        System.out.print("Chose Options : ");

//        Pemanggilan Construktor dari class diatas
//        LuasPermukaan luasPermukaan = new LuasPermukaan();
//        Volume volume = new Volume();

//        Membuat inputan yang digunakan untuk pemilihan opsi
//        dengan menggunakan switch case
//        int option;
//        Scanner scanner = new Scanner(System.in);
//        option = scanner.nextInt();
//
//        switch (option){
//            case 1:
//                luasPermukaan.balok();
//                break;
//            case 2:
//                luasPermukaan.tabung();
//                break;
//            case 3:
//                luasPermukaan.kubus();
//                break;
//            case 4:
//                luasPermukaan.bola();
//                break;
//            case 5:
//                luasPermukaan.prisma();
//                break;
//            case 6:
//                volume.balok();
//                break;
//            case 7:
//                volume.tabung();
//                break;
//            case 8:
//                volume.kubus();
//                break;
//            case 9:
//                volume.bola();
//                break;
//            case 10:
//                volume.prisma();
//                break;
//            case 11:
//                luasPermukaan.luaspermukaanlimassegiempat();
//                break;
//            case 12:
//                luasPermukaan.luaspermukaanlimassegitiga();
//                break;
//            case 13:
//                volume.vollimassegiempat();
//                break;
//            case 14:
//                volume.vollimassegitiga();
//                break;
//        }
    }
}