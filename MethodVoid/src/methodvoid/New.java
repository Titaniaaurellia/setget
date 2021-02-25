/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodvoid;

/**
 *
 * @author MOKLET-2
 */
public class New {
        double panjang;
        double lebar;
        double luas;
        
    void PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    void luas(){
        luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang : " +luas);
}
    }