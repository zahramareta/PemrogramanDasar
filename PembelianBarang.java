/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembelian.barang;

/**
 *
 * @author Lenovo
 */
public class PembelianBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int harga, diskon, bayar;
        harga = 50000;
        diskon = 10000;
        if (harga >= 50000){
            System.out.println("total beli= " +harga);
            System.out.println("diskon= " +diskon);
            bayar = harga-diskon;
            System.out.println("bayar= " +bayar);
        }  
        else {
            System.out.println("total beli= " +harga);
            System.out.println("diskon= " +diskon);
            System.out.println("bayar= " +harga);
        }
    }
    
}
