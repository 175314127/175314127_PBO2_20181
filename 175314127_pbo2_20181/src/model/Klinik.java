/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alexander Adam
 */
public class Klinik {
    /**\
     * Deklarasi variabel idKlinik,nama bertipe String dan bersifat private
     */
    private String idKlinik;
    private String nama;

    /**
     * Terdapat Getter getIdKlinik bertipe String yang berfungsi mengembalikan
     * nilai objek yang sudah berisi variable idKlinik
     * @return 
     */
    public String getIdKlinik() {
        return idKlinik;
    }
/**
 * Method Setter yang memberikan nilai pada variable idKlinik
 * @param idKlinik 
 */
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    /**
     * Terdapat Getter getNama bertipe double yang berfungsi mengembalikan 
     * nilai objek yang sudah berisi variable nama
     * @return 
     */
    public String getNama() {
        return nama;
    }

    /**
     * Method Setter yang memberikan nilai pada variable nama
     * @param nama 
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
