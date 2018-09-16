/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JDialog;

/**
 *
 * @author Alexander Adam
 */
public class viewTambahPasienBaru {

    public static void main(String[] args) {
        TambahPasienBaruDialog test = new TambahPasienBaruDialog("Antrian Baru");
        test.setSize(800, 750);
        test.getContentPane().setBackground(Color.CYAN);
        test.setVisible(true);
        test.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
}
