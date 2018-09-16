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
 * @author Alexander Adam
 */
public class viewTambahAntrian {

    public static void main(String[] args) {
        TambahAntrianDialog test = new TambahAntrianDialog("Pasien Baru");
        test.setSize(800, 750);
        test.getContentPane().setBackground(Color.yellow);
        test.setVisible(true);
        test.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
}
