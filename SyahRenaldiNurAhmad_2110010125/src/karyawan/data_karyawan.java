/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

/**
 *
 * @author Rnldi
 */
public class data_karyawan {
    private int nik;
    private int id_admin;
    private String nama_karyawan;
    private int tgl_lahir;
    private String alamat;
    private String kota;
    private int divisi;
    private String jabatan;
    private int tahun_gabung;
    private int nomor_hp;       
    
    public data_karyawan (int nik, int id_admin, String nama_karyawan, int tgl_lahir, String alamat, String kota, int divisi, String jabatan, int tahun_gabung, int nomor_hp){
        this.nik=nik;
        this.id_admin=id_admin;
        this.nama_karyawan=nama_karyawan;
        this.tgl_lahir=tgl_lahir;
        this.alamat=alamat;
        this.kota=kota;
        this.divisi=divisi;
        this.jabatan=jabatan;
        this.tahun_gabung=tahun_gabung;
        this.nomor_hp=nomor_hp;
    }
    public int getnik(){
        return nik;
    }
    
    public void setnik(int nik){
        this.nik=nik;
    }

    public int getid_admin(){
        return id_admin;
    }
    
    public void setid_admin(int id_admin){
        this.id_admin=id_admin;
    }
    
    public String getnama_karyawan(){
        return nama_karyawan;
    }
    
    public void setnama_karyawan(String nama_karyawan){
        this.nama_karyawan=nama_karyawan;
    }
    
    public int gettgl_lahir(){
        return tgl_lahir;
    }
    
    public void settgl_lahir(int tgl_lahir){
        this.tgl_lahir=tgl_lahir;
    }
    
    public String getalamat(){
        return alamat;
    }
    
    public void setalamat(String alamat){
        this.alamat=alamat;
    }
    
    public String getkota(){
        return kota;
    }
    
    public void setkota(String kota){
        this.kota=kota;
    }

    public int getdivisi(){
        return divisi;
    }
    
    public void setdivisie(int divisi){
        this.divisi=divisi;
    }
    
    public String getjabatan(){
        return jabatan;
    }
    
    public void setjabatan(String jabatan){
        this.jabatan=jabatan;
    }
    
    public int gettahun_gabung(){
        return tahun_gabung;
    }
    
    public void settahun_gabung(int tahun_gabung){
        this.tahun_gabung=tahun_gabung;
    }
    
    public int getnomor_hp(){
        return nomor_hp;
    }
    
    public void setnomor_hp(int nomor_hp){
        this.nomor_hp=nomor_hp;
    }
      
}
