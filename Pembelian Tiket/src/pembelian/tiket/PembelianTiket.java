 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembelian.tiket;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class PembelianTiket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] tujuan = {"Jakarta","Bandung","Jogja","Malang"};
        int [] harga = {60000,45000,30000,15000};
        int a,pilihan,jumlah,totalharga;
        double bayar;
        
        System.out.println("Selamat Datang di Stasiun Ngebruk");
        System.out.println("Kemana Tujuan Anda?");
        
        for (a=0; a<harga.length;a++){
        System.out.println(a+". " +tujuan[a]+ " Harganya "+ harga[a]);
    }
        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = input.nextInt();
        System.out.println("Tempat Tujuan : " + tujuan[pilihan]);
        System.out.println("Hrga Tiket : " + harga[pilihan]);
        System.out.print("Jumlah Beli : ");
        jumlah = input.nextInt();
        
        totalharga = harga[pilihan] * jumlah;
        System.out.println("Total Harga : "+totalharga);
        
        System.out.print ("Berikan Uang Anda : ");
        bayar = input.nextDouble();
        
        if (totalharga > bayar){
            System.out.println("Maaf Uang Tidak cukup");
        }else if (totalharga == bayar){
            System.out.println("Semoga Perjalanan Anda Menyenangkan"); 
        }else {
            System.out.println("Kembalian : "+(bayar - totalharga));
        }  