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

public class Kubus {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);   

      double sisi, volume, permukaan;
      System.out.println("Menghitung Volume Kubus");
      System.out.println("========================================");
      System.out.print("Masukkan sisi : ");
      sisi = input.nextInt();

      volume = sisi*sisi*sisi;
      permukaan = sisi * sisi * 6;
      
      
      System.out.println("========================================");
      System.out.println("Volume Kubus = " + volume);
      System.out.println("Luas Permukaan Kubus Adalah = " + permukaan);
    }
}
