/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119067.latihan24.perbandinganduabuahnilai;
import java.util.Scanner;
/**
 *
 * @author Danhago
 * NAMA     : Andreas Danhago P.I
 * KELAS    : IF2
 * NIM      : 10119067
 * Deskripsi Program :Perbandingan Dua Buah Nilai
 */
public class PBOIF210119067Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param nPertama
     * @param nKedua
     */
    
    public static void banding(double nPertama, double nKedua){
             if (nPertama == nKedua) {
                System.out.println("Hasil : "  + nPertama + " Sama dengan " + nKedua);
             } else if (nPertama > nKedua) {
                System.out.println("Hasil : "  + nPertama + " Lebih besar dari " + nKedua);
             } else {
                System.out.println("Hasil : "  + nPertama + " Lebih kecil dari " + nKedua);
             }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int nPertama = 0;
        int nKedua = 0;
        String lagi;
        boolean kondisi;
        
        System.out.println("======Program Perbandingan Nilai======");

        do {
             System.out.print("Masukkan nilai pertama : ");
             nPertama = input.nextInt();
             System.out.print("Masukkan nilai kedua : ");
             nKedua = input.nextInt();
               
             banding(nPertama,nKedua);
             System.out.println();
             System.out.print("Ulangi aktivitas? (Ya/Tidak) : ");
             lagi=input.next();
             kondisi = "Ya".equals(lagi);
             System.out.println();
        } while(kondisi == true);
        System.out.println("Developed by : Danhago");
       
    }
    
}