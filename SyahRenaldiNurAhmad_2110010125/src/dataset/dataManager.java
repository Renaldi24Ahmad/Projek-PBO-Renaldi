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
public class dataManager {
    private ArrayList <Integer> id_manager;
    private ArrayList <String> nama_manager;
    private ArrayList <Integer> tgl_lahir;
    private ArrayList <String> alamat;
    private ArrayList <String> kota;
    private ArrayList <Integer> tahun_gabung;
    private ArrayList <Integer> nomor_hp;
    private ArrayList <String> email;
    private ArrayList <String> username;
    private ArrayList <String> password;

    public dataManager(){
        id_manager = new ArrayList <Integer>();
        nama_manager = new ArrayList <String>();
        tgl_lahir = new ArrayList <Integer>();
        alamat = new ArrayList <String>();
        kota = new ArrayList <String>();
        tahun_gabung = new ArrayList <Integer>();
        nomor_hp = new ArrayList <Integer>();
        email = new ArrayList <String>();
        username = new ArrayList <String>();
        password = new ArrayList <String>();
    };

    public void insertid_manager(Integer isi){
    this.id_manager.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_manager(){
        return this.id_manager;
    }
    
    public void insertnama_manager(String isi){
    this.nama_manager.add(isi);
    }
    
    public ArrayList <String> getRecordnama_manager(){
        return this.nama_manager;
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

        public void insertemail(String isi){
    this.email.add(isi);
    }
    
    public ArrayList <String> getRecordemail(){
        return this.email;
    }

    public void insertusername(String isi){
    this.username.add(isi);
    }
    
    public ArrayList <String> getRecordusername(){
        return this.username;
    }
    
    public void insertpassword(String isi){
    this.password.add(isi);
    }
    
    public ArrayList <String> getRecordpassword(){
        return this.password;
    }
        
}
