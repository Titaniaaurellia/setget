/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg15;
//library untuk inputan keyboard
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Latihan15 {
    public static void main(String[] args) {
    //membuat scanner baru
    Scanner masukan = new Scanner(System.in);
    //deklarasi variabel
    int bil, hasil;
    //menampilkan output
    System.out.print("Masukkan suatu Bilangan : ");
    //menginputkan bilangan
    bil = masukan.nextInt();
    hasil = faktorial(bil);
    //menampilkan output ke user
    System.out.println("Nilai faktorial "+ bil +" adalah "+ hasil);
}
    //konstruktor
    private static int faktorial(int a){ 
    if (a==1){
        return 1;
    }else;
        return (a*faktorial(a-1));
}  
}