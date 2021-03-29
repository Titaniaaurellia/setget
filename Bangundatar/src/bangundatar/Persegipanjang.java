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
public class Persegipanjang extends BangunDatar {
    //deklarasi variabel
    int panjang;
    int lebar;
    int tinggi;

    public Persegipanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    Persegipanjang() {
        throw new UnsupportedOperationException("persegiPanjang.BangunDatar."); 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float luas() {
        return this.panjang * this.lebar;
    }

    @Override
    public float volume() {
        return this.panjang * this.lebar * this.tinggi;
    }
}
