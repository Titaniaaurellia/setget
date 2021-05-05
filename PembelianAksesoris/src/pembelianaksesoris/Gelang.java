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
public class Gelang extends pembelianaksesoris {
    String mdlPermata;
    
    public void setHarga(float harga){
        super.harga = harga;
    }
    public float getHarga(){
        System.out.println("Harga : Rp 2.000.000");
        return harga;
    }
    public void settotal(int totalUnit){
        super.totalUnit = totalUnit;
    }
    public int gettotal(){
        System.out.println("Total unit : 1");
        return totalUnit;
    }
    public void setmdlPermata(String mdlpermata){
        this.mdlpermata = mdlpermata;
    }
    public String getmdlPermata(){
        System.out.println("Model Permata : Krystal");
        return mdlPermata;
    }  
    
    @Override
    public void display(){
            System.out.println ("Cincin yang di pilih : ");
        }
}