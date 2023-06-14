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
public class dataLaporan {
    private ArrayList <Integer> id_laporan;
    private ArrayList <Integer> periode;
    private ArrayList <String> hasil;

    public dataLaporan(){
        id_laporan = new ArrayList <Integer>();
        periode = new ArrayList <Integer>();
        hasil = new ArrayList <String>();
    };

    public void insertid_laporan(Integer isi){
    this.id_laporan.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_laporan(){
        return this.id_laporan;
    }
    
    public void insertperiode(Integer isi){
    this.periode.add(isi);
    }
    
    public ArrayList <Integer> getRecordperiode(){
        return this.periode;
    }

        public void inserthasil(String isi){
    this.hasil.add(isi);
    }
    
    public ArrayList <String> getRecordhasil(){
        return this.hasil;
    }
        
}
