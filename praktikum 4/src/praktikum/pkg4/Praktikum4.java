/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg4;

/**
 *
 * @author MOKLET-2
 */
public class Praktikum4 {
    public static void main(String[] args) {
        //deklarasi variabel
        for (int b = 1; b <= 4; b++){
            for (int c = 0; c <= 3; c++){
             if (b==1||b==4||c==0||c==3){
                 //menampilkan output
                System.out.print("@");
            }
             else
             {
                 //menampilkan output lagi
                 System.out.print(" ");
             }
            }
            //menampilkan output ke user
            System.out.println("");
        }
    } 
}