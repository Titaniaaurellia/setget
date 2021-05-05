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
public class Kalung extends pembelianaksesoris {
    String mdlLiontin;
    
    public void setHarga(float harga){
        super.harga = harga;
    }
    public float getHarga(){
        System.out.println("Harga : Rp 5.000.000");
        return harga;
    }
    public void settotal(int totalUnit){
        super.totalUnit = totalUnit;
    }
    public int gettotal(){
        System.out.println("Total unit : 2");
        return totalUnit;
    }
    public void setmdlLiontin(String mdlliontin){
        this.mdlliontin = mdlliontin;
    }
    public String getmdlLiontin(){
        System.out.println("Model Liontin : Angsa");
        return mdlliontin;
    }  
    
    @Override
    public void display(){
            System.out.println ("Kalung yang di pilih : ");
        }
}