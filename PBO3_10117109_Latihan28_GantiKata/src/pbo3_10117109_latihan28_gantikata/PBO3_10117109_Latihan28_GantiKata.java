/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan28_gantikata;

import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Membuat Program Mengganti Kata
 */
public class PBO3_10117109_Latihan28_GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
	String kata;
	String kata1;

        Scanner scn = new Scanner(System.in);
        System.out.println("=======PROGAM MENGGANTI KATA=======");
        System.out.println("");
        System.out.println("Masukkan Kalimat : ");
        kalimat = scn.nextLine();

        System.out.println("Ganti Kata : ");
        kata = scn.nextLine();

        System.out.println("Menjadi Kata : ");
        kata1 = scn.nextLine();


        String gantiKata = kalimat.replace(kata,kata1);
        System.out.println("=======HASIL FORMATTING=======");
        System.out.println("Kalimat Awal : "+kalimat);
        System.out.println("Kalimat Baru : "+gantiKata);
    }
    
}
