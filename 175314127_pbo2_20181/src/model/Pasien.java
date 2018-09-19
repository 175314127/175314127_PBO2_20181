/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ArrayList;
import static model.Pasien.daftarPasienKlinik;

/**
 *
 * @author Alexander Adam
 */
public class Pasien {

    /**
     * Deklarasi variabel noRekammedis,nama,alamat,tempatLahir dengan tipe
     * String dan TanggalLahir,BulanLahir,TahunLahir bertipe interger dan semua
     * variabel bersifat private
     */
    private String noRekamMedis, nik;
    private String nama, alamat;
    private String TempatLahir;
    private int TanggalLahir;
    private int BulanLahir;
    private int TahunLahir;
    
    
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

   

    public Pasien(String nm, String alamat, String TL, int tglLahir, int blnLahir, int thnLahir, String noRKM) {
        this.nama = nm;
        this.alamat = alamat;
        this.TempatLahir = TL;
        this.TanggalLahir = tglLahir;
        this.BulanLahir = blnLahir;
        this.TahunLahir = thnLahir;
        this.noRekamMedis = noRKM;
    }

    public Pasien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * Terdapat Getter getNoRekamMedis bertipe String yang berfungsi
     * mengembalikan nilai objek yang sudah berisi variable noRekamMedis
     *
     * @return
     */
    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    /**
     * Method Setter yang memberikan nilai pada variable noRekamMedis
     *
     * @param noRekamMedis
     */
    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    /**
     * Terdapat Getter getNama bertipe String yang berfungsi mengembalikan nilai
     * objek yang sudah berisi variable nama
     *
     * @return
     */
    public String getNama() {
        return nama;
    }

    /**
     * Method Setter yang memberikan nilai pada variable nama
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Terdapat Getter getAlamat bertipe String yang berfungsi mengembalikan
     * nilai objek yang sudah berisi variable alamat
     *
     * @return
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Method Setter yang memberikan nilai pada variable alamat
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * Terdapat Getter getTempatLahir bertipe String yang berfungsi
     * mengembalikan nilai objek yang sudah berisi variable tempatLahir
     *
     * @return
     */
    public String getTempatLahir() {
        return TempatLahir;
    }

    /**
     * Method Setter yang memberikan nilai pada variable TempatLahir
     *
     * @param TempatLahir
     */
    public void setTempatLahir(String TempatLahir) {
        this.TempatLahir = TempatLahir;
    }

    /**
     * Terdapat Getter getTanggalLahir bertipe Int yang berfungsi mengembalikan
     * nilai objek yang sudah berisi variable TanggalLahir
     *
     * @return
     */
    public int getTanggalLahir() {
        return TanggalLahir;
    }

    /**
     * Method Setter yang memberikan nilai pada variable TanggalLahir Terdapat
     * throws Exception yang akan berjalan jika Program terdajadi kesalahan
     * throw new berfungsi untuk membuat instance baru dari Exception
     *
     * @param TanggalLahir
     * @throws Exception
     */
    public void setTanggalLahir(int TanggalLahir) throws Exception {
        if (TanggalLahir > 0) {
            if (TanggalLahir < 32) {
                this.TanggalLahir = TanggalLahir;
            } else {
                throw new Exception("Tanggal Lahir tidak wajar");
            }
        } else {
            throw new Exception("Tanggal Lahir tidak boleh nol");
        }
    }

    /**
     * Terdapat Getter getBulanLahir bertipe int yang berfungsi mengembalikan
     * nilai objek yang sudah berisi variable BullanLahir
     *
     * @return
     */
    public int getBulanLahir() {
        return BulanLahir;
    }

    /**
     * Method Setter yang memberikan nilai pada variable BulanLahir Terdapat
     * throws Exception yang akan berjalan jika Program terdajadi kesalahan
     * throw new berfungsi untuk membuat instance baru dari Exception
     *
     * @param BulanLahir
     * @throws Exception
     */
    public void setBulanLahir(int BulanLahir) throws Exception {
        if (BulanLahir > 0) {
            if (BulanLahir <= 12) {
                this.BulanLahir = BulanLahir;
            } else {
                throw new Exception("Bulan Lahir tidak wajar");
            }
        } else {
            throw new Exception("Bulan Lahir tidak boleh nol");
        }
    }

    /**
     * Terdapat Getter getTahunLahir bertipe int yang berfungsi mengembalikan
     * nilai objek yang sudah berisi variable TahunLahir
     *
     * @return
     */
    public int getTahunLahir() {
        return TahunLahir;
    }

    /**
     * Method Setter yang memberikan nilai pada variable TahunLahir Terdapat
     * throws Exception yang akan berjalan jika Program terdajadi kesalahan
     * throw new berfungsi untuk membuat instance baru dari Exception
     *
     * @param TahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int TahunLahir) throws Exception {
        if (TahunLahir > 0) {
            this.TahunLahir = TahunLahir;
        } else {
            throw new Exception("Tahun Lahir tidak boleh nol");
        }
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }

    public static Pasien cariPasien(String string) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).noRekamMedis == string) {
                return daftarPasienKlinik.get(i);
            }

        }
        return null;
    }
}
