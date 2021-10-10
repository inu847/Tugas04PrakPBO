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

public class Bola {
    public static void main(String[] args) 
        {
            System.out.print("Masukkan jari-jari bola : ");
            Scanner input = new Scanner(System.in); 
            float jari = input.nextFloat();
            System.out.println("Volume Bola adalah " + jari*jari*jari*22/7*4/3);
            System.out.println("Luas Permukaan Bola adalah " + jari*jari*22/7*4);
        }
}
