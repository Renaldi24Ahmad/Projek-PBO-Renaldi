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
    private String id_laporan;
    private int id_admin;
    private String id_manager;
    private String periode;
    private String hasil;      
    
    public laporan (String id_laporan, int id_admin, String id_manager, String periode, String hasil){
        this.id_laporan=id_laporan;
        this.id_admin=id_admin;
        this.id_manager=id_manager;
        this.periode=periode;
        this.hasil=hasil;
    }
    public String getid_laporanl(){
        return id_laporan;
    }
    
    public void setid_laporan(String id_laporan){
        this.id_laporan=id_laporan;
    }

    public int getid_admin(){
        return id_admin;
    }
    
    public void setid_admin(int id_admin){
        this.id_admin=id_admin;
    }
    
    public String getid_manager(){
        return id_manager;
    }
    
    public void setid_manager(String id_manager){
        this.id_manager=id_manager;
    }
    
    public String getperiode(){
        return periode;
    }
    
    public void setperioder(String periode){
        this.periode=periode;
    }
    
    public String gethasil(){
        return hasil;
    }
    
    public void sethasil(String hasil){
        this.hasil=hasil;
    }
    
}
