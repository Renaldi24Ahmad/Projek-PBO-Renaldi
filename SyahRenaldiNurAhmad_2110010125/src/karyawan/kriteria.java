/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

/**
 *
 * @author Rnldi
 */
public class kriteria {
    private String id_kriteria;
    private int id_admin;
    private String nama_kriteria;
    private String bobot_kriteria;
    
    public kriteria (String id_kriteria, int id_admin, String nama_kriteria, String bobot_kriteria, String hasil){
        this.id_kriteria=id_kriteria;
        this.id_admin=id_admin;
        this.nama_kriteria=nama_kriteria;
        this.bobot_kriteria=bobot_kriteria;
    }
    public String getid_kriteria(){
        return id_kriteria;
    }
    
    public void setid_kriteria(String id_kriteria){
        this.id_kriteria=id_kriteria;
    }

    public int getid_admin(){
        return id_admin;
    }
    
    public void setid_admin(int id_admin){
        this.id_admin=id_admin;
    }
    
    public String getnama_kriteria(){
        return nama_kriteria;
    }
    
    public void setnama_kriteria(String nama_kriteria){
        this.nama_kriteria=nama_kriteria;
    }
    
    public String getbobot_kriteria(){
        return bobot_kriteria;
    }
    
    public void setbobot_kriteria(String bobot_kriteria){
        this.bobot_kriteria=bobot_kriteria;
    }
    
}
