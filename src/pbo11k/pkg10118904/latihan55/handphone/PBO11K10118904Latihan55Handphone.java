/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan55.handphone;

/**
 *
 * @author Firman Alfinas
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program untuk menampilkan jenis" handphone
 */
public class PBO11K10118904Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android a = new Android("Samsung", "Android", "Grand", 3000000);
        a.setKeyStore("234ibfd3840fo");
        a.displayProduct();
        System.out.println("Android Key Store : "+a.getKeyStore());
        System.out.println("");
        BlackBerry b = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        b.setPinBB("BHS249");
        b.displayProduct();
        System.out.println("PIN : "+ b.getPinBB());
        System.out.println("");
        WindowsPhone w = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        w.setWpKeyStore("UUUQIJWORJ");
        w.displayProduct();
        System.out.println("Wp Key Store : "+ w.getWpKeyStore());
    }
    
}
