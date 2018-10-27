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
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
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
    
    public void tambahPasien(Pasien pasien){
        daftarPasien.add(pasien);
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
        Pasien cari = this.cariPasien(test.getNama());
        if (cari == null) {
            daftarPasien.add(test);
        }
    }
    
    public void simpanDaftarPasien(File file)throws IOException{
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, false);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
}
    }
    
    public void bacaDaftarPasien(File file){
        FileInputStream fis = null;
        String hasil = " ";
        int data;
        boolean noRM = false;
        boolean nama = false;
        boolean alamat = false;
        Pasien temp = new Pasien();
        try {
            fis = new FileInputStream(file);
            while ((data = fis.read()) != -1) {
                if((char) data != '\n'){
                if ((char) data != '\t') {
                    hasil += (char) data;
                }else{
                    if (noRM == false) {
                        temp.setNoRekamMedis(hasil);
                        noRM = true;
                        hasil = " ";
                    }else if (nama == false){
                        temp.setNama(hasil);
                        nama = true;
                        hasil = " ";
                    }
                }
            }else{
                    temp.setAlamat(hasil);
                    alamat = true;
                    hasil = " ";
                    tambahPasienBaru(temp);
                    noRM = false;
                    nama = false;
                    alamat = false;
                    temp = new Pasien();
                    }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void simpanObjekRumahSakit(File file){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
