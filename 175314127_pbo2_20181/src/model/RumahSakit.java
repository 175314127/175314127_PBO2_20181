/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class RumahSakit implements Serializable{
    private String nama,alamat;
 private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
 
    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public  void tambahPasien(Pasien pasien){
        getDaftarPasien().add(pasien);
    }
    public Pasien cariPasien(String noRM){
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNoRekamMedis() == noRM) {
                return daftarPasien.get(i);
            }
        }
        return null;
    }
    public void tambahPasienBaru(Pasien test){
        daftarPasien.add(test);
    }
    public  void simpanDaftarPasien(File file){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file,false);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());                
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public  void bacaDaftarPasien(File file){
        FileInputStream fis = null;
        String hasil = " ";
        Pasien temp = new Pasien();
        boolean nama = false;
        boolean alamat = false;
        int data;
        try {
            fis = new FileInputStream(file);
            while ((data= fis.read()) != -1) {
                if ((char)data != '\n') {
                    hasil += (char)data;
                }else{
                    temp.setAlamat(hasil);
                    alamat = true;
                    hasil = " ";
                    tambahPasien(temp);
                }               
            }
            System.out.println(hasil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
    }
    public void  simpanObjekRumahSakit(File file){
        ObjectOutputStream obj = null;
         FileOutputStream fos =null;
         
        try {
            fos = new FileOutputStream(file);
            obj = new ObjectOutputStream(fos);           
           obj.writeObject(this);
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public  void bacaObjekRumahSakit(File file){
        ObjectInputStream obj = null;
        FileInputStream fis =null;
        try {
            fis = new FileInputStream(file);
            obj = new ObjectInputStream(fis);
            
            RumahSakit rs = (RumahSakit)obj.readObject();
            this.setAlamat(rs.getNama());
            this.setNama(rs.getAlamat());
            this.setDaftarPasien(rs.getDaftarPasien());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
public  ArrayList<Pasien> getDaftarPasien(){
        return daftarPasien;
}
public void setDaftarPasien(ArrayList<Pasien> daftarPasien){
   this.daftarPasien = daftarPasien;
}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void tambahKlinik(Klinik klinik){
        
    }
}
