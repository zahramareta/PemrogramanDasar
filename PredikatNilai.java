/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predikat.nilai;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PredikatNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai;
        String predikat;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai:");
        nilai = scan.nextInt();
        if(nilai >= 90){
            predikat = "A";
        }
        else if(nilai >= 80){
            predikat = "B";
        }
        else if(nilai >= 70){
            predikat = "C";
        }
        else if(nilai >= 60){
            predikat = "D";
        }
        else {
             predikat = "E";
        }
        
        System.out.println("Predikat: " +predikat);
    }
    
}
