import java.util.Scanner;

class Lingkaran{
    public static void main(String[] args) {
        System.out.println("\n=== MENGHITUNG LUAS LINGKARAN ===");
        Luas lingkaran = new Luas();
        lingkaran.luas();

        System.out.println("\n\n=== MENGHITUNG KELILING LINGKARAN ===");
        Keliling keliling = new Keliling();
        keliling.keliling();
    }
}

class Luas{
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
class Keliling{
    public void keliling(){
        Scanner scanner = new Scanner(System.in);

        double phi = 3.14, keliling;
        int r;

        System.out.print("Masukkan Jari-Jari : ");
        r = scanner.nextInt();

        keliling = 2*phi*r;

        System.out.println("Luas Lingkaran : " + keliling);
    }
}