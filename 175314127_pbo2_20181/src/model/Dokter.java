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
public class Dokter {
    /**
     * Deklarasi variabel noPegawai, nama, alamat bertipe String dan 
     * TanggalLahir bertipe int (Interger) lalu senua variabel bersifat private
     */
    private String noPegawai;
    private String nama;
    private String alamat;
    private int TanggalLahir;

    /**
     * Terdapat Getter getNoPegawai bertipe String yang berfungsi mengembalikan
     * nilai objek yang sudah berisi variable noPegawai
     * @return 
     */
    public String getNoPegawai() {
        return noPegawai;
    }

    /**
     * Method Setter yang memberikan nilai pada variable noPegawai
     * @param noPegawai 
     */
    public void setNoPegawai(String noPegawai) {
        this.noPegawai = noPegawai;
    }

    /**
     * Terdapat Getter getNama bertipe String yang berfungsi mengembalikan 
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

    /**
     * Terdapat Getter getAlamat bertipe String yang berfungsi mengembalikan 
     * nilai objek yang sudah berisi variable alamat
     * @return 
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Method Setter yang memberikan nilai pada variable alamat
     * @param alamat 
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * Terdapat Getter getTanggalLahir bertipe String yang berfungsi 
     * mengembalikan nilai objek yang sudah berisi variable TanggalLahir
     * @return 
     */
    public int getTanggalLahir() {
        return TanggalLahir;
    }

    /**
     * Method Setter yang memberikan nilai pada variable TanggalLahir
     * Terdapat throws Exception yang akan berjalan jika Program terdajadi kesalahan
     * throw new berfungsi untuk membuat instance baru dari Exception
     * @param TanggalLahir
     * @throws Exception 
     */
    public void setTanggalLahir(int TanggalLahir) throws Exception {
        if (TanggalLahir > 0) {
            if (TanggalLahir < 32) {
                this.TanggalLahir = TanggalLahir;
            }else{
                System.out.println("Tanggal Lahir tidak wajar");
            }
        }else{
            System.out.println("Tanggal Lahir tidak boleh nol");
        }
    }
    
    
}
