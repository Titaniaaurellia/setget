/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat class baru
        BangunDatar bangunDatar = new BangunDatar();
       Persegipanjang persegiPanjang = new Persegipanjang();
        
        //memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.volume();
        
        //menampilkan hasil output
        System.out.println("Luas persegi panjang: " + persegiPanjang.luas());
        System.out.println("Volume persegi panjang: " + persegiPanjang.volume());
        
    }  
}