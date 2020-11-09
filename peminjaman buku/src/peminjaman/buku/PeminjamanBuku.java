/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjaman.buku;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class PeminjamanBuku {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String [] pilihanbuku = {"Hujan","Bulan","Matahari","Bintang","Bumi"};
        int [] harga = {10000,8000,5000,6000,5000};
        int a,pilihan,jumlah,totalharga;
        double bayar;
        
        System.out.println(">>>>Selamat Datang di Perpustakaan Bulan<<<<<");
        System.out.println("----------------------------------------------");
        System.out.println("Buku mana yang akan anda pinjam?");
        
        for (a=0; a<harga.length;a++){
        System.out.println(a+". " +pilihanbuku[a]+ " Harganya "+ harga[a]);
    }
    System.out.print("Masukkan Pilihan Anda : ");
        pilihan = input.nextInt();
        System.out.println("Buku Pilihan : " + pilihanbuku[pilihan]);
        System.out.println("Harga Sewa : " + harga[pilihan]);
        System.out.print("Jumlah Sewa : ");
        jumlah = input.nextInt();
        
        totalharga = harga[pilihan] * jumlah;
        System.out.println("Total Harga : "+totalharga);
        
        System.out.print ("Masukkan Uang Anda : ");
        bayar = input.nextDouble();
        
        if (totalharga > bayar){
            System.out.println("Maaf Uang Tidak cukup");
        }else if (totalharga == bayar){
            System.out.println("Selamat Membaca Buku"); 
        }else {
            System.out.println("Kembalian : "+(bayar - totalharga));
}