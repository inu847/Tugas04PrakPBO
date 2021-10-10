/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas;

/**
 *
 * @author Brillian Dzaka Mahatva Yoda
 */
import java.util.Scanner;

public class Prisma_Segitiga {
    public static void main(String[] args) {
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
 
        volume = La * tinggi;
        System.out.println("Volumenya          : " + volume);
    }
}
