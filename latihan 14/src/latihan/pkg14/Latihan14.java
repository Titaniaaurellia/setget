/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg14;
//library untuk inputan keyboard
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Latihan14 {
    public static void main(String[] args) {
    //membuat scanner baru
    Scanner masukan = new Scanner(System.in);
    //deklarasi variabel
    int a, b, c;
    //menampilkan output
    System.out.println("Program Menjumlahkan 2 Nilai");
    System.out.print("Masukkan Nilai a : ");
    //menginputkan a
    a = masukan.nextInt();
    //menampilkan output untuk nilai b
    System.out.print("Masukkan Nilai b : ");
    //menginputkan b
    b = masukan.nextInt();
    //menampilkan output untuk nilai c
    System.out.print("Masukkan Nilai c : ");
    //menginputkan c
    c = masukan.nextInt();
    //menampilkan output ke user
    System.out.println("");
    System.out.println("Jumlah a + b : " + (jumlah(a,b)));
    System.out.println("Jumlah b + c : " + (jumlah(b,c)));
    System.out.println("Jumlah a + c : " + (jumlah(a,c)));
    }
//konstruktor
private static int jumlah(int a, int b){
    int hasil = a + b;
    return hasil;
}
}