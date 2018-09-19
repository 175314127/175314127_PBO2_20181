/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testView;

import javax.swing.JDialog;
import view.RSFrame;

/**
 *
 * @author admin
 */
public class MainRSFRame {
    public static void main(String[] args) {
        RSFrame test = new RSFrame();
        test.setSize(500,500);
        test.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        test.setVisible(true);
    }
 
}
