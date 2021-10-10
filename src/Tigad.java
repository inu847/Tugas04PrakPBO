import java.util.Scanner;

class LuasPermukaan{
    public void tabung(){
        System.out.println("\n=== MENGHITUNG LUAS PERMUKAAN ===\n");
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

    public void bola()
    {
        System.out.print("Masukkan jari-jari bola : ");
        Scanner input = new Scanner(System.in);
        float jari = input.nextFloat();
        System.out.println("Luas Permukaan Bola adalah " + jari*jari*22/7*4);
    }

    public void prisma() {
        Scanner userInput = new Scanner(System.in);

        float La, Ka, tinggi, luasP, volume;

        System.out.println("Luas Permukaan & Volume Prisma Segitiga");
        System.out.println("========================================");

        System.out.print("Masukkan Luas Alas     : ");
        La = userInput.nextFloat();

        System.out.print("Masukkan Keliling Alas : ");
        Ka = userInput.nextFloat();

        System.out.print("Masukkan Tinggi        : ");
        tinggi = userInput.nextFloat();

        System.out.println("======================================");
        luasP = (2 * La) + (Ka * tinggi);
        System.out.println("Luas Permukaannya  : " + luasP);
    }
}

class Volume{
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
        System.out.println("\n=== MENGHITUNG VOLUME TABUNG ===\n");
        Scanner scanner = new Scanner(System.in);

        double V ,phi = 3.14, r , t;

        System.out.print("Masukkan Jari-Jari : ");
        r = scanner.nextInt();

        System.out.print("Masukkan Tinggi Tabung : ");
        t = scanner.nextInt();

        V = phi * r * r * t;

        System.out.println("Volume Tabung : " + V);
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

    public void bola()
    {
        System.out.print("Masukkan jari-jari bola : ");
        Scanner input = new Scanner(System.in);
        float jari = input.nextFloat();
        System.out.println("Luas Permukaan Bola adalah " + jari*jari*22/7*4);
    }

    public void prisma() {
        Scanner userInput = new Scanner(System.in);

        float La, tinggi, volume;

        System.out.println("Luas Permukaan & Volume Prisma Segitiga");
        System.out.println("========================================");

        System.out.print("Masukkan Luas Alas     : ");
        La = userInput.nextFloat();

        System.out.print("Masukkan Keliling Alas : ");

        System.out.print("Masukkan Tinggi        : ");
        tinggi = userInput.nextFloat();

        volume = La * tinggi;
        System.out.println("Volumenya          : " + volume);
    }
}

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

        System.out.print("Chose Options : ");

        LuasPermukaan luasPermukaan = new LuasPermukaan();
        Volume volume = new Volume();

        int option;
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();

        switch (option){
            case 1:
                luasPermukaan.balok();
                break;
            case 2:
                luasPermukaan.tabung();
                break;
            case 3:
                luasPermukaan.kubus();
                break;
            case 4:
                luasPermukaan.bola();
                break;
            case 5:
                luasPermukaan.prisma();
                break;
            case 6:
                volume.balok();
                break;
            case 7:
                volume.tabung();
                break;
            case 8:
                volume.kubus();
                break;
            case 9:
                volume.bola();
                break;
            case 10:
                volume.prisma();
                break;
        }
    }
}