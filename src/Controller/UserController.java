/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBManager;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class UserController {
    
    public ArrayList<User> getUser(){
    Connection conn = DBManager.getConnection();
    ArrayList<User> list = new ArrayList<>();
    
    
   
        try {
           Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users");
            if(rs.wasNull())
                return list;
            else{
            while(rs.next())
            {
                   User user = new User();
                   user.setId_user(rs.getInt("id_user"));
                   user.setUsername(rs.getString("username"));
                   user.setPassword(rs.getString("password"));
                   user.setFullname(rs.getString("fullname"));
                   user.setAdress_user(rs.getString("adress_user"));
                   user.setPhone(rs.getString("phone"));
                   user.setEmail(rs.getString("email"));
                   
                    Calendar time = Calendar.getInstance();
                    time.setTime(rs.getDate("dop_user"));
                   user.setDop_user(time);
                   
                   user.setImg(rs.getBytes("img"));
                   
                   list.add(user);
            }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           
    return list;
    }
    
    
    
    public void insertUser(User user){
        
        Connection conn = DBManager.getConnection();
        String sql = "INSERT INTO users(username,password,fullname,adress_user,phone,email,dop_user,img) VALUES(?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getFullname());
            ps.setString(4,user.getAdress_user());
            ps.setString(5, user.getPhone());
            ps.setString(6,user.getEmail());
            
            Calendar date =  user.getDop_user();
            java.sql.Date sqlDate = new java.sql.Date(date.getTimeInMillis()); 
            ps.setDate(7,sqlDate);
            ps.setBytes(8, user.getImg());
            
              ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void UpdateUser(User user){
        
        Connection conn = DBManager.getConnection();
        String sql = "UPDATE  users set password = ?,fullname = ?,adress_user = ?,phone = ?,email = ?,img= ? where id_user = ? ";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
   
            ps.setString(1,user.getPassword());
            ps.setString(2,user.getFullname());
            ps.setString(3,user.getAdress_user());
            ps.setString(4, user.getPhone());
            ps.setString(5,user.getEmail());
            
            ps.setBytes(6, user.getImg());
            
            ps.setInt(7,user.getId_user());
            
              ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
