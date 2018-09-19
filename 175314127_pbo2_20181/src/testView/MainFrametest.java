/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testView;

import javax.swing.JFrame;
import view.MainFrame;

/**
 *
 * @author admin
 */
public class MainFrametest {
    public static void main(String[] args) {
        MainFrame test = new MainFrame();
       test.setSize(500,500);
       test.setVisible(true);
       test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
