/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg13;
//library untuk inputan keyboard
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Latihan13 {

    public static void main(String[] args) {
    //membuat scanner baru
    Scanner masukan = new Scanner(System.in);
    //deklarasi variabel
    int pilihan=9;
    do {
       //menampilkan output ke user
       System.out.println(" Menu Luas Bangun ");
       System.out.println(" 1. Menghitung Luas Persegi ");
       System.out.println(" 2. Menghitung Luas Persegi Panjang ");
       System.out.println(" 3. Keluar ");
       System.out.print(" Masukkan Pilihan Anda : ");
       //menginputkan pilihan
       pilihan = masukan.nextInt();
    //dekklarasi variabel
    switch(pilihan){
        case 1 : luasPersegi();break;
        case 2 : luasPersegiPanjang();break;
    }
    }while(pilihan != 3);
    }
    private static void luasPersegi (){
        //membuat scanner baru
        Scanner masukan = new Scanner(System.in);
        //deklarasi variabel
        float sisi,luas;
        //menampilkan output
        System.out.println("Masukkan Nilai Sisi");
        //menginputkan sisi
        sisi = masukan.nextFloat();
        luas = sisi * sisi;
        //menampilkan output ke user
        System.out.println("Luas Persegi adalah : " + luas);
    }
    private static void luasPersegiPanjang(){
        //membuat scanner baru
        Scanner masukan = new Scanner(System.in);
        //deklarasi variabel
        float panjang, lebar, luas;
        //menampilkan output
        System.out.print("Masukkan Nilai Panjang : ");
        //menginputkan panjang
        panjang = masukan.nextFloat();
        //menampilkan output lagi
        System.out.print("Masukan Nilai Lebar : ");
        //menginputkan lebar
        lebar = masukan.nextFloat();
        luas = panjang * lebar;
        //menampilkan output ke user
        System.out.println("Luas Persegi Panjang adalah : " + luas);
    }
}
