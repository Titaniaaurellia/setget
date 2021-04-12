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
public class TV extends Toko{
    String Jenis;
    
    public void setHarga(float harga){
        super.harga = harga;
    }
    public float getHarga(){
        System.out.println("Harga : Rp 3.000.000");
        return harga;
    }
    public void settotal(int totalUnit){
        super.totalUnit = totalUnit;
    }
    public int gettotal(){
        System.out.println("Total unit : 1");
        return totalUnit;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getMerk(){
        System.out.println("Merk : LG");
        return merk;
    }
    public void setUkuran(int ukuran){
        super.ukuran = ukuran;
    }
    public int getUkuran(){
        System.out.println("Ukuran : Led 43 inch");
        return ukuran;
    }
    
    @Override
    public void display(){
            System.out.println ("Data TV yang di entry : ");
        }
}
