/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Toko t = new Toko();
        Smartphone hp = new Smartphone();
        TV tv = new TV();
        Kipasangin ka = new Kipasangin();
        
        t.display();
        t.setAdmin("nana");
        t.getAdmin();
        
        hp.display();
        hp.setHarga(5000000);
        hp.settotal(2);
        hp.setMerk("Samsung");
        hp.setjmlkamera(5);
        hp.getHarga();
        hp.gettotal();
        hp.getMerk();
        hp.getjmlkamera();
       
        tv.display();
        tv.setHarga(3000000);
        tv.settotal(1);
        tv.setMerk("LG");
        tv.setUkuran(43);
        tv.getHarga();
        tv.gettotal();
        tv.getMerk();
        tv.getUkuran();
        
        ka.display();
        ka.setHarga(969000);
        ka.settotal(3);
        ka.setMerk("Miyako");
        ka.setJenis("TJR - 101");
        ka.getHarga();
        ka.gettotal();
        ka.getMerk();
        ka.getJenis();
    }
    }