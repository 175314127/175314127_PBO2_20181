/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testView;

import view.TambahPasienBaruDialog;
import javax.swing.JFrame;
/**
 *
 * @author Alexander Adam
 */
public class jggu {
    public static void main(String[] args) {
        TambahPasienBaruDialog test = new TambahPasienBaruDialog();
        test.setSize(800, 750);
        test.setVisible(true);
        test.TambahPasienBaruDialog("Pasien Baru");
    }
}
