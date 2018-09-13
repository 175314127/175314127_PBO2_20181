/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JDialog;

/**
 *
 * @author admin
 */
public class view {

    public static void main(String[] args) {
//        DaftarAntrianPasien test = new DaftarAntrianPasien("Daftar Antrian Pasien");
//        test.setSize(500, 400);
//        test.setVisible(true);

        TambahPasienBaruDialog test2 = new TambahPasienBaruDialog("Pasien Baru");
        test2.setSize(1000, 750); 
        test2.setBackground(Color.yellow);
        test2.setVisible(true);
         
       
    }
}
