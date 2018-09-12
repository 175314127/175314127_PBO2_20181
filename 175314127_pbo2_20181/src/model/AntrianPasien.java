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
public class AntrianPasien {
    /**
     * Deklarasi variabel TanggalAntrian, BulanAntrian, TahunAntrian dengan
     * tipe  int (Interger)
     * Asosiasi variable klinik ke class Klinik
     * Asosiasi variabel daftarPasien ke class Pasien dengan Array
     * dan semua variabel bersifat private
     */
    private int TanggalAntrian;
    private int BulanAntrian;
    private int TahunAntrian;
    private Klinik klinik;
    private Pasien daftarPasienAntri[];

    /**
     * Terdapat Getter getTanggalAntrian bertipe int yang berfungsi mengembalikan nilai 
     * objek yang sudah berisi variable TanggalAntrian
     * @return 
     */
    public int getTanggalAntrian() {
        return TanggalAntrian;
    }

    /**
     * Method Setter yang memberikan nilai pada variable TanggalAntrian
     * Terdapat throws Exception yang akan berjalan jika Program terdajadi kesalahan
     * throw new berfungsi untuk membuat instance baru dari Exception
     * @param TanggalAntrian
     * @throws Exception 
     */
    public void setTanggalAntrian(int TanggalAntrian) throws Exception{
        if (TanggalAntrian > 0 ) {
            if (TanggalAntrian < 32) {
                this.TanggalAntrian = TanggalAntrian;
            }else{
                throw new Exception("Tanggal Antrian tidak Sesuai");
            }
        }else{
            throw new Exception("Tanggal Antrian tidak boleh nol");
        }
    }

    /**
     * Terdapat Getter getBulanAntrian bertipe int yang berfungsi mengembalikan
     * nilai objek yang sudah berisi variable BulanAntrian
     * @return 
     */
    public int getBulanAntrian() {
        return BulanAntrian;
    }

    /**
     * Method Setter yang memberikan nilai pada variable BulanAntrian
     * Terdapat throws Exception yang akan berjalan jika Program terdajadi kesalahan
     * throw new berfungsi untuk membuat instance baru dari Exception
     * @param BulanAntrian
     * @throws Exception 
     */
    public void setBulanAntrian(int BulanAntrian)throws Exception {
        if (BulanAntrian > 0) {
            if (BulanAntrian < 13) {
                this.BulanAntrian = BulanAntrian;
            }else  {
                throw new Exception("Bulan Antrian tidak wajar");
            }
        }else{
            throw new Exception("Bulan Antrian tidak boleh nol");
        }
    }

    /**
     * Terdapat Getter getTahunAntrian bertipe int yang berfungsi mengembalikan
     * nilai objek yang sudah berisi variable TahunAntrian
     * @return 
     */
    public int getTahunAntrian() {
        return TahunAntrian;
    }

    /**
     * Method Setter yang memberikan nilai pada variable TahunAntrian
     * Terdapat throws Exception yang akan berjalan jika Program terdajadi kesalahan
     * throw new berfungsi untuk membuat instance baru dari Exception
     * @param TahunAntrian
     * @throws Exception 
     */
    public void setTahunAntrian(int TahunAntrian)throws Exception {
        if (TahunAntrian > 0 ) {
            this.TahunAntrian = TahunAntrian;
        }else{
            throw new Exception("tahun tidak boleh nol");
        }
    }

    /**
     * Terdapat Getter getKlinik bertipe class Klinik yang berfungsi 
     * mengembalikan nilai objek yang sudah berisi variable klinik
     * @return 
     */
    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }
/**
 * Terdapat Getter getDaftarPasien bertipe class Pasien dengan array yang 
 * berfungsi mengembalikan nilai objek yang sudah berisi variable daftarPasien
 * @return 
 */
    public Pasien[] getDaftarPasien() {
        return daftarPasienAntri;
    }
    
/**
 * Method Setter yang memberikan nilai pada variable DaftarPasien
 * @param daftarPasien 
 */
    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasienAntri = daftarPasien;
    }
    public void mendaftar (Pasien[] pasien){
        this.daftarPasienAntri = pasien;
    }
    
}
