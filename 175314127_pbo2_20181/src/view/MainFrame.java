/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author admin
 */
public final class MainFrame extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem TambahPasien,exit;
    
    public MainFrame()throws HeadlessException{
        init();
    }

    public void init(){
        menuBar = new JMenuBar();
        this.setTitle("Main Frame");
        
        fileMenu = new JMenu("File");
        exit = new JMenuItem("Exit");
        TambahPasien = new JMenuItem("Tambah Pasien");
        this.setJMenuBar(menuBar);
        fileMenu.add(TambahPasien);
        fileMenu.add(exit);
        menuBar.add(fileMenu);
        
        exit.addActionListener(this);
        TambahPasien.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            System.exit(0);
        }
        if (e.getSource() == TambahPasien) {
            TambahPasienBaruDialog test = new TambahPasienBaruDialog();
            test.TambahPasienBaruDialog("Pasien Baru");
            test.setSize(800,750);
            test.setVisible(true);
            test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }
}
