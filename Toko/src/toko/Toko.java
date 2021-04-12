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
public class Toko {
    private String admin;
        float harga;
        int totalUnit, ukuran, jmlkamera;
        String merk, jenis;
        
        public void display(){
            System.out.println ("Data barang yang di entry : ");
        }
        
        public void setAdmin(String admin){
            this.admin = admin;
        }
        
        public String getAdmin(){
            System.out.println("Admin : nana");
            return admin;
}
}