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
public class dataLogin {
    private ArrayList <String> username;
    private ArrayList <String> password;

    public dataLogin(){
        username = new ArrayList <String>();
        password = new ArrayList <String>();
    };

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
