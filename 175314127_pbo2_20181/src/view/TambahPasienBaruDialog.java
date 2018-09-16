/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.time.Year;
import javax.swing.ComboBoxModel;
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
public class TambahPasienBaruDialog extends JDialog{
    private JLabel judulLabel;
  private JTextField isiText;   
  private JComboBox tgl,bln,thn;
  private JButton simpan;
  
 public TambahPasienBaruDialog (String judul){
     this.setTitle(judul); 
     init();
     text();
     box();
 }
 public void init(){
     this.setLayout(null);
     
     judulLabel = new JLabel("Pasien Baru");
     judulLabel.setBounds(350, 50, 1000, 50);
     judulLabel.setFont(new Font("Arial",Font.BOLD,30));
     this.add(judulLabel);
     
     judulLabel = new JLabel("Nama    :");
     judulLabel.setBounds(150, 200,500,50);
     judulLabel.setFont(new Font ("Arial",Font.BOLD,16));
     this.add(judulLabel);
     
     judulLabel= new JLabel("Alamat  :");
     judulLabel.setBounds(150, 250,500,50);
     judulLabel.setFont(new Font ("Arial",Font.BOLD,16));
     this.add(judulLabel);        
         
     judulLabel = new JLabel("Tanggal Lahir :");
     judulLabel.setBounds(150,300,500,50);
     judulLabel.setFont(new Font("Arial",Font.BOLD,16));
     this.add(judulLabel);
     
     judulLabel = new JLabel("bulan :");
     judulLabel.setBounds(340,300,500,50);
     judulLabel.setFont(new Font("Arial",Font.BOLD,16));
     this.add(judulLabel);
     
     judulLabel = new JLabel("Tahun :");
     judulLabel.setBounds(530,300,500,50);
     judulLabel.setFont(new Font("Arial",Font.BOLD,16));
     this.add(judulLabel);
     
     simpan = new JButton("Simpan");
     simpan.setBounds(600,300,500,50);
     this.add(simpan);
 }
 public void text(){
     isiText = new JTextField();
     isiText.setBounds(230,214,100,50);
     isiText.setSize(300, 25);
     this.add(isiText);
     
     isiText = new JTextField();
     isiText.setBounds(230,260,100,50);
     isiText.setSize(300, 25);
     this.add(isiText);
 }
 public void box(){
     tgl = new JComboBox(); 
     tgl.setBounds(270,312,100,50);
     tgl.setSize(50,25);
     for (int i = 1; i < 32; i++) {
         tgl.addItem(i);
     }
     this.add(tgl);
     
     bln = new JComboBox();
     bln.setBounds(400,312,100,50);
     bln.setSize(100,25);
     bln.setModel(new DefaultComboBoxModel(new String [] {"Januari","Febuari",
     "Maret","April","Mei","Juni","Juli","Agustus","September","Oktober",
     "November","Desember"}));
         this.add(bln);
     
     thn = new JComboBox ();
     thn.setBounds(600,312,100,50);
     thn.setSize(60,25);
     for (int i = 1990; i < 2019; i++) {
         thn.addItem(i);
     }
     this.add(thn);
 }
}
