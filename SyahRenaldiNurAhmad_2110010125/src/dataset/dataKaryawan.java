/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author Rnldi
 */
public class dataKaryawan {
    private ArrayList <Integer> nik;
    private ArrayList <String> nama_karyawan;
    private ArrayList <Integer> tgl_lahir;
    private ArrayList <String> alamat;
    private ArrayList <String> kota;
    private ArrayList <String> divisi;
    private ArrayList <String> jabatan;
    private ArrayList <Integer> tahun_gabung;
    private ArrayList <Integer> nomor_hp;

    public dataKaryawan(){
        nik = new ArrayList <Integer>();
        nama_karyawan = new ArrayList <String>();
        tgl_lahir = new ArrayList <Integer>();
        alamat = new ArrayList <String>();
        kota = new ArrayList <String>();
        divisi = new ArrayList <String>();
        jabatan = new ArrayList <String>();
        tahun_gabung = new ArrayList <Integer>();
        nomor_hp = new ArrayList <Integer>();
    };

    public void insertnik(Integer isi){
    this.nik.add(isi);
    }
    
    public ArrayList <Integer> getRecordnik(){
        return this.nik;
    }
    
    public void insertnama_karyawan(String isi){
    this.nama_karyawan.add(isi);
    }
    
    public ArrayList <String> getRecordnama_karywan(){
        return this.nama_karyawan;
    }

        public void inserttgl_lahir(Integer isi){
    this.tgl_lahir.add(isi);
    }
    
    public ArrayList <Integer> getRecordtgl_lahir(){
        return this.tgl_lahir;
    }    
    
    public void insertalamat(String isi){
    this.alamat.add(isi);
    }
    
    public ArrayList <String> getRecordalamat(){
        return this.alamat;
    }    
    
    public void insertkota(String isi){
    this.kota.add(isi);
    }    
    
    public ArrayList <String> getRecordkota(){
        return this.kota;
    }    
    
    public void insertdivisi(String isi){
    this.divisi.add(isi);
    }
    
    public ArrayList <String> getRecorddivisi(){
        return this.divisi;
    } 
    
    public void insertjabatan(String isi){
    this.jabatan.add(isi);
    }
    
    public ArrayList <String> getRecordjabatan(){
        return this.jabatan;
    }

        public void inserttahun_gabung(Integer isi){
    this.tahun_gabung.add(isi);
    }
    
    public ArrayList <Integer> getRecordtahun_gabung(){
        return this.tahun_gabung;
    }

    public void insertnomor_hp(Integer isi){
    this.nomor_hp.add(isi);
    }
    
    public ArrayList <Integer> getRecordnomor_hp(){
        return this.nomor_hp;
    }
        
}
