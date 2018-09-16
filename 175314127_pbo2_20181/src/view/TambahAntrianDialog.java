/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
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
private JTextField text;
private JComboBox tgl,bln,thn,Klinik;

   public TambahAntrianDialog(String judul) {
      this.setTitle(judul);
      init();
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
     
     judulLabel = new JLabel("tgl    :");
     judulLabel.setBounds(150, 250,500,50);
     judulLabel.setFont(new Font ("Arial",Font.BOLD,16));
     this.add(judulLabel);
    }
}
