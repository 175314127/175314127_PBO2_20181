/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Alexander Adam
 */
public class DaftarAntrianPasien extends JDialog{

    
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;
    
    public DaftarAntrianPasien(String judul){
        this.setTitle(judul);
        init();
        Text();
        Button();
    }
    public void init(){
        this.setLayout(null);
        
        judulLabel = new JLabel("Daftar Antrian Pasien");
        judulLabel.setBounds(150, 50 ,150 ,50);
        this.add(judulLabel);
        
        namaLabel= new JLabel("nama           :");
        namaLabel.setBounds(60,120,100,50);
        this.add(namaLabel);
        
        namaLabel = new JLabel("No Rekam Medis : ");
        namaLabel.setBounds(60, 100, 120, 50);
        this.add(namaLabel);
        
        namaLabel = new JLabel("Alamat : ");
    }
    public void Text(){
              
        namaText = new JTextField();
        namaText.setBounds(200, 136,150,300);
        namaText.setSize(50, 20);
        this.add(namaText);
        
        namaText = new JTextField();
        namaText.setBounds(200, 120,150,300);
        namaText.setSize(100, 20);
        this.add(namaText);
    }
    public void Button(){
        
        saveButton = new JButton("Simpan");
        saveButton.setBounds(200,250,100,300);
        saveButton.setSize(100,50);
        this.add(saveButton);
    }
}
