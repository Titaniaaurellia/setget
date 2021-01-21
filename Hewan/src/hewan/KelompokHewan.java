/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class KelompokHewan {
    //deklarasi variabel
    public String Nama, Makanan, Jenis, BerkembangBiak;
    public int JumlahKaki, JumlahBerkembangBiak;
    
    //konstruktor
    public KelompokHewan(){
        Nama         = null;
        Makanan      = null;
        Jenis        = null;
        JumlahKaki   = 0;
    }
    
    public void IsiNilaiProperti(){
        //membuat scanner baru
        Scanner input = new Scanner(System.in);
        //menampilkan output
        System.out.print("Nama Hewan : ");
        //menginputkan nama
        Nama = input.nextLine();
        //menampilkan output lagi
        System.out.print("Jenis Makanan : ");
        //menginputkan makanan
        Makanan = input.nextLine();
        if (Makanan.equalsIgnoreCase("Tumbuhan")){
            Jenis = "Herbivora";
        }if (Makanan.equalsIgnoreCase("Daging")){
            Jenis = "Karnivora";
        }if (Makanan.equalsIgnoreCase("Tumbuhan & Daging")){
            Jenis = "Omnivora";
        }else Jenis = "Bukan Hewan";
        System.out.print("Jumlah Kaki : ");
        //menginputkan jumlah kaki
        JumlahKaki = input.nextInt();
        
        }

    public void CetakNilaiProperti(){
        //menampilkan output ke user
        System.out.println ("Nama Hewan" + Nama );
        System.out.println ("Jenis Makanan" + Makanan);
        System.out.println ("Jenis Hewan" + Jenis);
        System.out.println ("Jumlah Kaki" + JumlahKaki);

}
     public void Bergerak(){
         //membuat scanner baru
         Scanner input = new Scanner(System.in);
         //deklarasi variabel
         int a;
         //menampilkan output
         System.out.println ("-------------------- ");
         System.out.print ("Berkembang Biak : ");
         //menginputkan Berkembang Biak
         BerkembangBiak = input.nextLine();
         //menampilkan output Jumlah Berkembang Biak
         System.out.print("Jumlah Berkembang Biak : ");
         //menginputkan Jumlah Berkembang Biak
         JumlahBerkembangBiak = input.nextInt();
         //deklarasi variabel
         for (a=1; a <= JumlahBerkembangBiak; a++){
             System.out.println(BerkembangBiak);
         }
     }
}