/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBManager;
import Model.Post;
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
public class PostController {
    
   public ArrayList<Post> getPost(){
       
       ArrayList<Post> list = new ArrayList<>();
       Connection conn = DBManager.getConnection();
       
       
       try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM post");
            
            while(rs.next())
            {
                Post post= new Post();
                post.setId_post(rs.getInt("id_post"));
                post.setTitle(rs.getString("title"));
                post.setPrice(rs.getLong("price"));
                post.setArea(rs.getString("area"));
                post.setAdress_post(rs.getString("adress_post"));
                post.setKind(rs.getString("kind"));
                post.setContact(rs.getString("contact"));
                post.setDetail(rs.getString("detail"));
                post.setStatus(rs.getString("status"));
                post.setId_user(rs.getInt("id_user"));
                post.setImg_cover(rs.getBytes("img_cover"));
                post.setImg1(rs.getBytes("img1"));
                post.setImg2(rs.getBytes("img2"));
                post.setImg3(rs.getBytes("img3"));
                post.setImg4(rs.getBytes("img4"));
                
                Calendar time = Calendar.getInstance();
                time.setTime(rs.getDate("dop_post"));
                post.setDop_post(time);
                
                
                
                post.setQuan(rs.getString("quan"));
                
                list.add(post);
                
            }
            
      }catch (SQLException ex) {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
      }
       return list;
   } 
    
   
   public void insertPost(Post post){
        Connection conn = DBManager.getConnection();
        String sql = "INSERT INTO post(title,price,area,adress_post,kind,contact,detail,status,id_user,img_cover,img1,img2,img3,img4,dop_post,quan)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
          
       try {
           PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1,post.getTitle());
            ps.setFloat(2,post.getPrice());
            ps.setString(3,post.getArea());
            ps.setString(4,post.getAdress_post());
            ps.setString(5,post.getKind());
            ps.setString(6,post.getContact());
            ps.setString(7,post.getDetail());
            ps.setString(8,post.getStatus());
            ps.setInt(9,post.getId_user());
            ps.setBytes(10,post.getImg_cover());
            ps.setBytes(11,post.getImg1());
            ps.setBytes(12,post.getImg2());
            ps.setBytes(13,post.getImg3());
            ps.setBytes(14,post.getImg4());
            ps.setString(16,post.getQuan());
            
            Calendar date =  post.getDop_post();
            java.sql.Date sqlDate = new java.sql.Date(date.getTimeInMillis()); 
            ps.setDate(15, sqlDate);
            
            ps.executeUpdate();
           
       } catch (SQLException ex) {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public ArrayList<Post> getPostChoThueBySearchTitle(String inputString)
   {
       ArrayList<Post> list = new ArrayList<>();
       Connection conn = DBManager.getConnection();
       try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM post where kind = 'chothue' and title like N'%"+inputString +"%'");
            while(rs.next())
            {
                Post post = new Post();
                
                post.setId_post(rs.getInt("id_post"));
                post.setTitle(rs.getString("title"));
                post.setPrice(rs.getLong("price"));
                post.setArea(rs.getString("area"));
                post.setAdress_post(rs.getString("adress_post"));
                post.setKind(rs.getString("kind"));
                post.setContact(rs.getString("contact"));
                post.setDetail(rs.getString("detail"));
                post.setStatus(rs.getString("status"));
                post.setId_user(rs.getInt("id_user"));
                post.setImg_cover(rs.getBytes("img_cover"));
                post.setImg1(rs.getBytes("img1"));
                post.setImg2(rs.getBytes("img2"));
                post.setImg3(rs.getBytes("img3"));
                post.setImg4(rs.getBytes("img4"));
                
                Calendar time = Calendar.getInstance();
                time.setTime(rs.getDate("dop_post"));
                post.setDop_post(time);
                
                post.setQuan(rs.getString("quan"));
                
                list.add(post);
            }
       }catch(Exception ex)
       {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
   }
   

    
   
   public ArrayList<Post> getPostChoThue()  // không tìm , không lọc (Cho thuê)
   {
       ArrayList<Post> list = new ArrayList<>();
       Connection conn = DBManager.getConnection();
       try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM post where kind = 'chothue' ");
            while(rs.next())
            {
                Post post = new Post();
                
                post.setId_post(rs.getInt("id_post"));
                post.setTitle(rs.getString("title"));
                post.setPrice(rs.getLong("price"));
                post.setArea(rs.getString("area"));
                post.setAdress_post(rs.getString("adress_post"));
                post.setKind(rs.getString("kind"));
                post.setContact(rs.getString("contact"));
                post.setDetail(rs.getString("detail"));
                post.setStatus(rs.getString("status"));
                post.setId_user(rs.getInt("id_user"));
                post.setImg_cover(rs.getBytes("img_cover"));
                post.setImg1(rs.getBytes("img1"));
                post.setImg2(rs.getBytes("img2"));
                post.setImg3(rs.getBytes("img3"));
                post.setImg4(rs.getBytes("img4"));
                
                Calendar time = Calendar.getInstance();
                time.setTime(rs.getDate("dop_post"));
                post.setDop_post(time);
                
                post.setQuan(rs.getString("quan"));
                
                list.add(post);
            }
       }catch(Exception ex)
       {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
   }
   
   
   public ArrayList<Post> getPostCanThue()  //không tìm k lọc (Cần thuê)
   {
       ArrayList<Post> list = new ArrayList<>();
       Connection conn = DBManager.getConnection();
       try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM post where kind = 'canthue'");
            while(rs.next())
            {
                Post post = new Post();
                
                post.setId_post(rs.getInt("id_post"));
                post.setTitle(rs.getString("title"));
                post.setPrice(rs.getLong("price"));
                post.setArea(rs.getString("area"));
                post.setAdress_post(rs.getString("adress_post"));
                post.setKind(rs.getString("kind"));
                post.setContact(rs.getString("contact"));
                post.setDetail(rs.getString("detail"));
                post.setStatus(rs.getString("status"));
                post.setId_user(rs.getInt("id_user"));
                post.setImg_cover(rs.getBytes("img_cover"));
                post.setImg1(rs.getBytes("img1"));
                post.setImg2(rs.getBytes("img2"));
                post.setImg3(rs.getBytes("img3"));
                post.setImg4(rs.getBytes("img4"));
                
                Calendar time = Calendar.getInstance();
                time.setTime(rs.getDate("dop_post"));
                post.setDop_post(time);
                
                post.setQuan(rs.getString("quan"));
                
                list.add(post);
            }
       }catch(Exception ex)
       {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
   }
   
     public ArrayList<Post> getPostChoThueByKTimLoc(String quan)  //không tìm + lọc (Cho thuê)
   {
       ArrayList<Post> list = new ArrayList<>();
       Connection conn = DBManager.getConnection();
       try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM post where kind = 'chothue' and quan = N'"+quan+"'");
            while(rs.next())
            {
                Post post = new Post();
                
                post.setId_post(rs.getInt("id_post"));
                post.setTitle(rs.getString("title"));
                post.setPrice(rs.getLong("price"));
                post.setArea(rs.getString("area"));
                post.setAdress_post(rs.getString("adress_post"));
                post.setKind(rs.getString("kind"));
                post.setContact(rs.getString("contact"));
                post.setDetail(rs.getString("detail"));
                post.setStatus(rs.getString("status"));
                post.setId_user(rs.getInt("id_user"));
                post.setImg_cover(rs.getBytes("img_cover"));
                post.setImg1(rs.getBytes("img1"));
                post.setImg2(rs.getBytes("img2"));
                post.setImg3(rs.getBytes("img3"));
                post.setImg4(rs.getBytes("img4"));
                
                Calendar time = Calendar.getInstance();
                time.setTime(rs.getDate("dop_post"));
                post.setDop_post(time);
                
                post.setQuan(rs.getString("quan"));
                
                list.add(post);
            }
       }catch(Exception ex)
       {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
   }
     
        public ArrayList<Post> getPostCanThueByKTimLoc(String quan)  //không tìm + lọc (Cần thuê)
   {
       ArrayList<Post> list = new ArrayList<>();
       Connection conn = DBManager.getConnection();
       try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM post where kind = 'canthue' and quan = N'"+quan+"'");
            while(rs.next())
            {
                Post post = new Post();
                
                post.setId_post(rs.getInt("id_post"));
                post.setTitle(rs.getString("title"));
                post.setPrice(rs.getLong("price"));
                post.setArea(rs.getString("area"));
                post.setAdress_post(rs.getString("adress_post"));
                post.setKind(rs.getString("kind"));
                post.setContact(rs.getString("contact"));
                post.setDetail(rs.getString("detail"));
                post.setStatus(rs.getString("status"));
                post.setId_user(rs.getInt("id_user"));
                post.setImg_cover(rs.getBytes("img_cover"));
                post.setImg1(rs.getBytes("img1"));
                post.setImg2(rs.getBytes("img2"));
                post.setImg3(rs.getBytes("img3"));
                post.setImg4(rs.getBytes("img4"));
                
                Calendar time = Calendar.getInstance();
                time.setTime(rs.getDate("dop_post"));
                post.setDop_post(time);
                
                post.setQuan(rs.getString("quan"));
                
                list.add(post);
            }
       }catch(Exception ex)
       {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
   }
        
   public ArrayList<Post> getPostChoThueTimKLoc(String search)  //Tìm + Không lọc  (Cho thuê)
   {
       ArrayList<Post> list = new ArrayList<>();
       Connection conn = DBManager.getConnection();
       try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM post where kind = 'chothue' and title like N'%"+search +"%'");
            while(rs.next())
            {
                Post post = new Post();
                
                post.setId_post(rs.getInt("id_post"));
                post.setTitle(rs.getString("title"));
                post.setPrice(rs.getLong("price"));
                post.setArea(rs.getString("area"));
                post.setAdress_post(rs.getString("adress_post"));
                post.setKind(rs.getString("kind"));
                post.setContact(rs.getString("contact"));
                post.setDetail(rs.getString("detail"));
                post.setStatus(rs.getString("status"));
                post.setId_user(rs.getInt("id_user"));
                post.setImg_cover(rs.getBytes("img_cover"));
                post.setImg1(rs.getBytes("img1"));
                post.setImg2(rs.getBytes("img2"));
                post.setImg3(rs.getBytes("img3"));
                post.setImg4(rs.getBytes("img4"));
                
                Calendar time = Calendar.getInstance();
                time.setTime(rs.getDate("dop_post"));
                post.setDop_post(time);
                
                post.setQuan(rs.getString("quan"));
                
                list.add(post);
            }
       }catch(Exception ex)
       {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
   }
        
   
   public ArrayList<Post> getPostCanThueTimKLoc(String search)  //Tìm + Không lọc  (Cần thuê)
   {
       ArrayList<Post> list = new ArrayList<>();
       Connection conn = DBManager.getConnection();
       try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM post where kind = 'canthue' and title like N'%"+search +"%'");
            while(rs.next())
            {
                Post post = new Post();
                
                post.setId_post(rs.getInt("id_post"));
                post.setTitle(rs.getString("title"));
                post.setPrice(rs.getLong("price"));
                post.setArea(rs.getString("area"));
                post.setAdress_post(rs.getString("adress_post"));
                post.setKind(rs.getString("kind"));
                post.setContact(rs.getString("contact"));
                post.setDetail(rs.getString("detail"));
                post.setStatus(rs.getString("status"));
                post.setId_user(rs.getInt("id_user"));
                post.setImg_cover(rs.getBytes("img_cover"));
                post.setImg1(rs.getBytes("img1"));
                post.setImg2(rs.getBytes("img2"));
                post.setImg3(rs.getBytes("img3"));
                post.setImg4(rs.getBytes("img4"));
                
                Calendar time = Calendar.getInstance();
                time.setTime(rs.getDate("dop_post"));
                post.setDop_post(time);
                
                post.setQuan(rs.getString("quan"));
                
                list.add(post);
            }
       }catch(Exception ex)
       {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
   }
   
   public ArrayList<Post> getPostChoThueTimVaLoc(String search, String quan)  //Tìm và Lọc  (Cho thuê)
   {
       ArrayList<Post> list = new ArrayList<>();
       Connection conn = DBManager.getConnection();
       try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM post where kind = 'chothue' and title like N'%"+search +"%' and quan = N'" + quan + "'");
            while(rs.next())
            {
                Post post = new Post();
                
                post.setId_post(rs.getInt("id_post"));
                post.setTitle(rs.getString("title"));
                post.setPrice(rs.getLong("price"));
                post.setArea(rs.getString("area"));
                post.setAdress_post(rs.getString("adress_post"));
                post.setKind(rs.getString("kind"));
                post.setContact(rs.getString("contact"));
                post.setDetail(rs.getString("detail"));
                post.setStatus(rs.getString("status"));
                post.setId_user(rs.getInt("id_user"));
                post.setImg_cover(rs.getBytes("img_cover"));
                post.setImg1(rs.getBytes("img1"));
                post.setImg2(rs.getBytes("img2"));
                post.setImg3(rs.getBytes("img3"));
                post.setImg4(rs.getBytes("img4"));
                
                Calendar time = Calendar.getInstance();
                time.setTime(rs.getDate("dop_post"));
                post.setDop_post(time);
                
                post.setQuan(rs.getString("quan"));
                
                list.add(post);
            }
       }catch(Exception ex)
       {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
   }
   
    public ArrayList<Post> getPostCanThueTimVaLoc(String search, String quan)  //Tìm và Lọc  (Cần thuê)
   {
       ArrayList<Post> list = new ArrayList<>();
       Connection conn = DBManager.getConnection();
       try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM post where kind = 'canthue' and title like N'%"+search +"%' and quan = N'" + quan + "'");
            while(rs.next())
            {
                Post post = new Post();
                
                post.setId_post(rs.getInt("id_post"));
                post.setTitle(rs.getString("title"));
                post.setPrice(rs.getLong("price"));
                post.setArea(rs.getString("area"));
                post.setAdress_post(rs.getString("adress_post"));
                post.setKind(rs.getString("kind"));
                post.setContact(rs.getString("contact"));
                post.setDetail(rs.getString("detail"));
                post.setStatus(rs.getString("status"));
                post.setId_user(rs.getInt("id_user"));
                post.setImg_cover(rs.getBytes("img_cover"));
                post.setImg1(rs.getBytes("img1"));
                post.setImg2(rs.getBytes("img2"));
                post.setImg3(rs.getBytes("img3"));
                post.setImg4(rs.getBytes("img4"));
                
                Calendar time = Calendar.getInstance();
                time.setTime(rs.getDate("dop_post"));
                post.setDop_post(time);
                
                post.setQuan(rs.getString("quan"));
                
                list.add(post);
            }
       }catch(Exception ex)
       {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
   }
    
    
       public void updatePost(Post post){
        Connection conn = DBManager.getConnection();
        String sql = "UPDATE post set title = ?,price = ?,area = ?,adress_post = ?,kind = ?,contact = ?,detail = ?,status = ?,id_user = ?,img_cover = ?,img1 = ?,img2 = ?,img3 = ?,img4 = ?,dop_post = ?,quan = ? where id_post = "+post.getId_post();
               
        
          
       try {
           PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1,post.getTitle());
            ps.setLong(2,post.getPrice());
            ps.setString(3,post.getArea());
            ps.setString(4,post.getAdress_post());
            ps.setString(5,post.getKind());
            ps.setString(6,post.getContact());
            ps.setString(7,post.getDetail());
            ps.setString(8,post.getStatus());
            ps.setInt(9,post.getId_user());
            ps.setBytes(10,post.getImg_cover());
            ps.setBytes(11,post.getImg1());
            ps.setBytes(12,post.getImg2());
            ps.setBytes(13,post.getImg3());
            ps.setBytes(14,post.getImg4());
            ps.setString(16,post.getQuan());
            
            Calendar date =  post.getDop_post();
            java.sql.Date sqlDate = new java.sql.Date(date.getTimeInMillis()); 
            ps.setDate(15, sqlDate);
            
            ps.executeUpdate();
           
       } catch (SQLException ex) {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
       
   public void deletePost(Post post){
          Connection conn = DBManager.getConnection();
        String sql = "DELETE FROM post where id_post = ?";
        
          
       try {
           PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setInt(1,post.getId_post());
            
            
            ps.executeUpdate();
           
       } catch (SQLException ex) {
           Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
