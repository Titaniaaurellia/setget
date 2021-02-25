/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodnonvoid;

/**
 *
 * @author MOKLET-2
 */
public class New {
    int alas;
    int sisi1;
    int sisi2;
    
    void Segitiga (int sisi1, int sisi2, int alas){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.alas = alas;
    }
    
    void keliling(){
        int keliling = sisi1+alas+sisi2;
        System.out.println("Keliling Segitiga adalah : " +keliling);
    }
    }