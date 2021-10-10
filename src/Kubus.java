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

      int sisi;
      int Volume;
      System.out.println("Menghitung Volume Kubus");
      System.out.print("Masukkan sisi : ");
      sisi = input.nextInt();

      Volume = sisi*sisi*sisi;

      System.out.println("Volume Kubus = " + Volume);
    }
}
