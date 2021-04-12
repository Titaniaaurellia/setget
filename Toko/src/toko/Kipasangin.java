/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko;

/**
 *
 * @author MOKLET-2
 */
public class Kipasangin extends Toko{
    int ukuran;
    
    public void setHarga(float harga){
        super.harga = harga;
    }
    public float getHarga(){
        System.out.println("Harga : Rp 969.000");
        return harga;
    }
    public void settotal(int totalUnit){
        super.totalUnit = totalUnit;
    }
    public int gettotal(){
        System.out.println("Total unit : 3");
        return totalUnit;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getMerk(){
        System.out.println("Merk : Miyako");
        return merk;
    }
    public void setJenis (String jenis){
        this.jenis = jenis;
    }
    public String getJenis(){
        System.out.println("Jenis : TJR-101");
        return jenis;
    }   
    
    @Override
    public void display(){
            System.out.println ("Data Kipas angin yang di entry : ");
        }
}
