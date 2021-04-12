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
public class Smartphone extends Toko{
    int jmlKamera;
    
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
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getMerk(){
        System.out.println("Merk : Samsung");
        return merk;
    }
    public void setjmlkamera(int jmlkamera){
        super.jmlkamera = jmlkamera;
    }
    public int getjmlkamera(){
        System.out.println("Jumlah kamera : 5");
        return jmlKamera;
    }   
    
    @Override
    public void display(){
            System.out.println ("Data Smartphone yang di entry : ");
        }
}