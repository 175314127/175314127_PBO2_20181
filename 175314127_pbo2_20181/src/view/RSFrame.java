/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class RSFrame extends JFrame implements ActionListener{
private JMenuBar MenuBar;
private JMenu fileMenu;
private JMenuItem exit,MenuItem;
private JLabel judul,nama,noRKm,alamat;
private JTextField namaText;
private JButton save;

public RSFrame(){
    init();
}
public void init(){
    this.setLayout(null);
    
    MenuBar = new JMenuBar();
    fileMenu = new JMenu("File");
    exit = new JMenuItem("Exit");
    MenuItem = new JMenuItem("New");
    
    this.add(MenuBar);
    this.add(exit);
    this.add(fileMenu);
    this.add(MenuItem);
    this.setJMenuBar(MenuBar);
    exit.addActionListener(this);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
