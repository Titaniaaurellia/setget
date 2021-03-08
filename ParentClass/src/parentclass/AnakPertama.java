/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentclass;

/**
 *
 * @author MOKLET-2
 */
public class AnakPertama extends ParentClass {
    //deklarasi variabel
    float gaji = 4000000;
    String nama = "Jhonny";
    String bagianpekerjaan = "Sekertaris";
    int umur = 25;
      
    
    public void showInfo(){
        //menampilkan output
        System.out.println("Nama : " + super.nama);
        System.out.println("Umur : " + super.umur);
        System.out.println("Bagian Pekerjaan : " + super.bagianpekerjaan);
        System.out.println("Gaji : Rp " + gaji);
}
}