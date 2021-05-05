/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembelianaksesoris;

/**
 *
 * @author MOKLET-2
 */
public class Cincin extends pembelianaksesoris {
    int jmlPermata;
    
    public void setHarga(float harga){
        super.harga = harga;
    }
    public float getHarga(){
        System.out.println("Harga : Rp 1.000.000");
        return harga;
    }
    public void settotal(int totalUnit){
        super.totalUnit = totalUnit;
    }
    public int gettotal(){
        System.out.println("Total unit : 2");
        return totalUnit;
    }
    public void setjmlpermata(int jmlpermata){
        super.jmlpermata = jmlpermata;
    }
    public int getjmlpermata(){
        System.out.println("Jumlah Permata : 2");
        return jmlpermata;
    }  
    
    @Override
    public void display(){
            System.out.println ("Kalung yang di pilih : ");
        }
}
