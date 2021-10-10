/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Balok;

/**
 *
 * @author Brillian Dzaka Mahatva Yoda
 */
import java.util.Scanner;

public class Balok {
    public static void main(String[] args) throws Exception {
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