/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class TambahAntrianDialog extends JDialog{
private JLabel judulLabel;
private JTextField no,alamat,nama;
private JComboBox tgl,bln,thn,Klinik;
private JButton save;

   public TambahAntrianDialog(String judul) {
      this.setTitle(judul);
      init();
      text();
      box();
    }
    public void init(){
        this.setLayout(null);
        
        judulLabel = new JLabel("Tambah Antrian");
     judulLabel.setBounds(300, 50, 1000, 50);
     judulLabel.setFont(new Font("Arial",Font.BOLD,30));
     this.add(judulLabel);
     
     judulLabel = new JLabel("No RM    :");
     judulLabel.setBounds(150, 200,500,50);
     judulLabel.setFont(new Font ("Arial",Font.BOLD,16));
     this.add(judulLabel);
     
     judulLabel = new JLabel("Nama      :");
     judulLabel.setBounds(400, 200,500,50);
     judulLabel.setFont(new Font ("Arial",Font.BOLD,16));
     this.add(judulLabel);
     
     judulLabel = new JLabel("Alamat    :");
     judulLabel.setBounds(400, 250,500,50);
     judulLabel.setFont(new Font ("Arial",Font.BOLD,16));
     this.add(judulLabel);
     
     judulLabel = new JLabel("tanggal  :");
     judulLabel.setBounds(150, 250,500,50);
     judulLabel.setFont(new Font ("Arial",Font.BOLD,16));
     this.add(judulLabel);
     
     judulLabel = new JLabel("Bulan    :");
     judulLabel.setBounds(150, 300,500,50);
     judulLabel.setFont(new Font ("Arial",Font.BOLD,16));
     this.add(judulLabel);
     
     judulLabel = new JLabel("Tahun   :");
     judulLabel.setBounds(150, 350,500,50);
     judulLabel.setFont(new Font ("Arial",Font.BOLD,16));
     this.add(judulLabel);
     
     judulLabel = new JLabel("Klinik    :");
     judulLabel.setBounds(150, 400,500,50);
     judulLabel.setFont(new Font ("Arial",Font.BOLD,16));
     this.add(judulLabel);
     
     save = new JButton("Simpan");
     save.setBounds(300,400,100,50);
     save.setSize(100,50);
     this.add(save);
    }
    public void text(){
        no = new JTextField();
     no.setBounds(230,214,100,50);
     no.setSize(100, 25);
     this.add(no);
     
     nama = new JTextField();
     nama.setBounds(480,214,100,50);
     nama.setSize(200, 25);
     this.add(nama);
     
      alamat = new JTextField();
     alamat.setBounds(480,265,100,50);
     alamat.setSize(200, 25);
     this.add(alamat);
    }
    public void box (){
        tgl = new JComboBox();
        tgl.setBounds(230,265,100,50);
        tgl.setSize(50,25);
        for (int i = 1; i < 32; i++) {
            tgl.addItem(i);
        }
        this.add(tgl);
        
        bln = new JComboBox();
        bln.setBounds(230,313,100,50);
        bln.setSize(100,25);
        bln.setModel(new DefaultComboBoxModel (new String []{"Januari","Febuari",
        "Maret","April","Mei","Juni","Juli","Agustus","September","Oktober",
        "November","Desember"}));
        this.add(bln);
        
        thn = new JComboBox();
        thn.setBounds(230,365,100,50);
        thn.setSize(60,25);
        for (int i = 1990; i < 2019; i++) {
            thn.addItem(i);
        }
        this.add(thn);
        
        Klinik = new JComboBox();
        Klinik.setBounds(230,413,100,50);
        Klinik.setSize(100,25);
        Klinik.setModel(new DefaultComboBoxModel(new String[] {"Klinik Mars","Klinik Bumi",
        "Klinik Pluto","Klinik Venus"}));
        this.add(Klinik);
    }
}
