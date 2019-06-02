/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MyPC
 */
public class User {
    
        private int id_user;
        private String username;
        private String password;
        private String fullname;
        private String adress_user;
        private String phone;
        private String email;
        private byte[] img;
        private Calendar dop_user;

    public User() {
    }

        
        
    public User(int id_user, String username, String password, String fullname, String adress_user, String phone, String email,byte[] img ,Calendar dop_user) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.adress_user = adress_user;
        this.phone = phone;
        this.email = email;
        this.img = img;
        this.dop_user = dop_user;
        
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAdress_user() {
        return adress_user;
    }

    public void setAdress_user(String adress_user) {
        this.adress_user = adress_user;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    
    
    
    public Calendar getDop_user() {
        return dop_user;
    }

    public void setDop_user(Calendar dop_user) {
        this.dop_user = dop_user;
    }
        
            
}
