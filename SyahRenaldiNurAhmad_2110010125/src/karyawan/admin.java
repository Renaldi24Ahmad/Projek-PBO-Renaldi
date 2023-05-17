/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

/**
 *
 * @author Rnldi
 */
public class admin {
    private int id_admin;
    private String nama_admin;
    private String tgl_lahir;
    private String alamat;
    private String kota;
    private int tahun_gabung;
    private int nomor_hp;
    private String email;
    private String username;
    private String password;
    
    public admin (int id_admin, String nama_admin, String tgl_lahir, String alamat, String kota, int tahun_gabung, int nomor_hp, String email, String username, String password){
        this.id_admin=id_admin;
        this.nama_admin=nama_admin;
        this.tgl_lahir=tgl_lahir;
        this.alamat=alamat;
        this.kota=kota;
        this.tahun_gabung=tahun_gabung;
        this.nomor_hp=nomor_hp;
        this.email=email;
        this.username=username;
        this.password=password;
    }
    
    public int getid_admin(){
        return id_admin;
    }
    
    public void setid_admin(int id_admin){
        this.id_admin=id_admin;
    }
    
    public String getnama_admin(){
        return nama_admin;
    }
    
    public void setnama_admin(String nama_admin){
        this.nama_admin=nama_admin;
    }
    
    public String gettgl_lahir(){
        return tgl_lahir;
    }
    
    public void settgl_lahir(String tgl_lahir){
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
    
    public String getemail(){
        return email;
    }
    
    public void setemail(String email){
        this.email=email;
    }
    
    public String getusername(){
        return username;
    }
    
    public void setusername(String username){
        this.username=username;
    }
    
    public String getpassword(){
        return password;
    }
    
    public void setpassword(String password){
        this.password=password;
    }
}
