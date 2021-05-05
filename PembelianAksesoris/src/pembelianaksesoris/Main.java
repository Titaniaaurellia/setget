/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembelianaksesoris;
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
        
       pembelianaksesoris pa = new pembelianaksesoris();
       Kalung kl = new Kalung();
       Gelang gl = new Gelang();
       Cincin cn = new Cincin();
       Bando bn = new Bando();
       
       pa.display();
       pa.setAdmin("nana");
       pa.getAdmin();
       
       kl.display();
       kl.setHarga(5000000);
       kl.settotal(2);
       kl.setmdlLiontin("Angsa");
       kl.getHarga();
       kl.gettotal();
       kl.getmdlLiontin();
       
       gl.display();
       gl.setHarga(2000000);
       gl.settotal(1);
       gl.setmdlPermata("Krystal");
       gl.getHarga();
       gl.gettotal();
       gl.getmdlPermata();
       
       cn.display();
       cn.setHarga(2000000);
       cn.settotal(1);
       cn.setjmlpermata(2);
       cn.getHarga();
       cn.gettotal();
       cn.getjmlpermata();
       
       bn.display();
       bn.setHarga(2000000);
       bn.settotal(1);
       bn.setwrnBando("Biru, Merah, Hitam, Pink");
       bn.getHarga();
       bn.gettotal();
       bn.getwrnBando();
    }
}