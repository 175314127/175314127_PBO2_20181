/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import model.Pasien;

/**
 *
 * @author Alexander Adam
 */
public class RSFrame extends JFrame implements ActionListener{

    private JMenuBar MenuBar;
    private JMenu fileMenu;
    private JMenuItem exit, MenuItem;
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;

    public void DaftarAntrianPasien(String judul) {
        this.setTitle("Antrian Pasien");
        init();
        Text();
        Button();
    }

    public void init() {
        this.setLayout(null);
      
        judulLabel = new JLabel("Daftar Antrian Pasien");
        judulLabel.setBounds(150, 50, 150, 50);
        this.add(judulLabel);

        namaLabel = new JLabel("nama           :");
        namaLabel.setBounds(60, 130, 100, 50);
        this.add(namaLabel);

        namaLabel = new JLabel("No Rekam Medis : ");
        namaLabel.setBounds(60, 100, 120, 50);
        this.add(namaLabel);

        namaLabel = new JLabel("Alamat : ");
        namaLabel.setBounds(60, 160, 100, 50);
        this.add(namaLabel);
    }

    public void Text() {

        namaText = new JTextField();
        namaText.setBounds(200, 146, 150, 300);
        namaText.setSize(150, 20);
        this.add(namaText);

        namaText = new JTextField();
        namaText.setBounds(200, 120, 150, 300);
        namaText.setSize(100, 20);
        this.add(namaText);

        namaText = new JTextField();
        namaText.setBounds(200, 175, 150, 300);
        namaText.setSize(100, 20);
        this.add(namaText);
    }

    public void Button() {

        saveButton = new JButton("Simpan");
        saveButton.setBounds(200, 250, 100, 300);
        saveButton.setSize(100, 50);
        this.add(saveButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Pasien o = new Pasien();
        o.setNama(namaText.getText());
        o.setAlamat(namaText.getText());
        
        Pasien.tambahPasienBaru(o);
    }

    
   

}
