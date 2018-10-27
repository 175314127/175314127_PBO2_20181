/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class TestStream3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try {
            File file = new File("text.txt"); //membuat file tujuan
            String data = "Hello"; //isi file
            fos = new FileOutputStream(file); //object stream
            fos.write(data.getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestStream3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestStream3.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
        }

}
}
