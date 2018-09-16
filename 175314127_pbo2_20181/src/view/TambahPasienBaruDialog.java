/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
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
  private JComboBox tgl ,bln,thn;
  
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
     
 }
}
