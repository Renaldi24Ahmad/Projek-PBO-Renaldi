/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

/**
 *
 * @author Rnldi
 */
public class login {
    private int id_manager;
    private int id_admin;
    private String username;
    private String password;
    
    public login (int id_manager, int id_admin, String username, String password){
        this.id_manager=id_manager;
        this.id_admin=id_admin;
        this.username=username;
        this.password=password;
    }
    
    public int getid_manager(){
        return id_manager;
    }
    
    public void setid_manager(int id_manager){
        this.id_manager=id_manager;
    }
    
    public int getid_admin(){
        return id_admin;
    }
    
    public void setid_admin(int id_admin){
        this.id_admin=id_admin;
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
