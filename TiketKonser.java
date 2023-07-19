/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket.konser;

/**
 *
 * @author Lenovo
 */
public class TiketKonser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String KELAS = "VVIP";
        if(KELAS.equals("VVIP")){
            System.out.println("Rp 1.000.000");
        }
        else if(KELAS.equals("VIP")){
            System.out.println("Rp 250.000");
        }
        else if(KELAS.equals("PEJABAT")){
            System.out.println("Rp 450.000");
        }
        else if(KELAS.equals("TRIBUN")){
            System.out.println("Rp 50.000");
        }
        else {
            System.out.println("CEK ULANG");
        }
    }
}
