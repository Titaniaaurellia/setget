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
public class Bando extends pembelianaksesoris {
    String wrnBando;
    
    public void setHarga(float harga){
        super.harga = harga;
    }
    public float getHarga(){
        System.out.println("Harga : Rp 50.000");
        return harga;
    }
    public void settotal(int totalUnit){
        super.totalUnit = totalUnit;
    }
    public int gettotal(){
        System.out.println("Total unit : 4");
        return totalUnit;
    }
    public void setwrnBando(String wrnbando){
        this.wrnbando = wrnbando;
    }
    public String getwrnBando(){
        System.out.println("Warna Bando : Biru, Merah, Hitam, Pink");
        return wrnbando;
    }  
    
    @Override
    public void display(){
            System.out.println ("Bando yang di pilih : ");
        }
}
