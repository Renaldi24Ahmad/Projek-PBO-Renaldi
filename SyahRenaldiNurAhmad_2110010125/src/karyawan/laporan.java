/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

/**
 *
 * @author Rnldi
 */
public class laporan {
    private int id_laporan;
    private int id_admin;
    private int id_manager;
    private int periode;
    private String hasil;      
    
    public laporan (int id_laporan, int id_admin, int id_manager, int periode, String hasil){
        this.id_laporan=id_laporan;
        this.id_admin=id_admin;
        this.id_manager=id_manager;
        this.periode=periode;
        this.hasil=hasil;
    }
    public int getid_laporanl(){
        return id_laporan;
    }
    
    public void setid_laporan(int id_laporan){
        this.id_laporan=id_laporan;
    }

    public int getid_admin(){
        return id_admin;
    }
    
    public void setid_admin(int id_admin){
        this.id_admin=id_admin;
    }
    
    public int getid_manager(){
        return id_manager;
    }
    
    public void setid_manager(int id_manager){
        this.id_manager=id_manager;
    }
    
    public int getperiode(){
        return periode;
    }
    
    public void setperioder(int periode){
        this.periode=periode;
    }
    
    public String gethasil(){
        return hasil;
    }
    
    public void sethasil(String hasil){
        this.hasil=hasil;
    }
    
}
