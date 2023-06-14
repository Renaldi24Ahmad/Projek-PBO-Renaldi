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
public class dataKriteria {
    private ArrayList <Integer> id_kriteria;
    private ArrayList <String> nama_kriteria;
    private ArrayList <String> bobot_kriteria;

    public dataKriteria(){
        id_kriteria = new ArrayList <Integer>();
        nama_kriteria = new ArrayList <String>();
        bobot_kriteria = new ArrayList <String>();
    };

    public void insertid_kriteria(Integer isi){
    this.id_kriteria.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_kriteria(){
        return this.id_kriteria;
    }
    
    public void insertnama_kriteria(String isi){
    this.nama_kriteria.add(isi);
    }
    
    public ArrayList <String> getRecordnama_kriteria(){
        return this.nama_kriteria;
    }

        public void insertbobot_kriteria(String isi){
    this.bobot_kriteria.add(isi);
    }
    
    public ArrayList <String> getRecordbobot_kriteria(){
        return this.bobot_kriteria;
    }
        
}
