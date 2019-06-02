/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MyPC
 */
public class Post {
    
    private int id_post;
    private String title;
    private long price;
    private String area;
    private String adress_post;
    private String kind;
    private String contact;
    private String detail;
    private String status;
    private int id_user;
    private byte[] img_cover;
    private byte[] img1;
    private byte[] img2;
    private byte[] img3;
    private byte[] img4;
    private Calendar dop_post;
    private String quan;

    public Post() {
    }

    
    
    public Post(int id_post, String title, long price, String area, String adress_post, String kind, String contact, String detail, String status, int id_user, byte[] img_cover, byte[] img1, byte[] img2, byte[] img3, byte[] img4, Calendar dop_post,String quan) {
        this.id_post = id_post;
        this.title = title;
        this.price = price;
        this.area = area;
        this.adress_post = adress_post;
        this.kind = kind;
        this.contact = contact;
        this.detail = detail;
        this.status = status;
        this.id_user = id_user;
        this.img_cover = img_cover;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.dop_post = dop_post;
        this.quan = quan;
    }

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAdress_post() {
        return adress_post;
    }

    public void setAdress_post(String adress_post) {
        this.adress_post = adress_post;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public byte[] getImg_cover() {
        return img_cover;
    }

    public void setImg_cover(byte[] img_cover) {
        this.img_cover = img_cover;
    }

    public byte[] getImg1() {
        return img1;
    }

    public void setImg1(byte[] img1) {
        this.img1 = img1;
    }

    public byte[] getImg2() {
        return img2;
    }

    public void setImg2(byte[] img2) {
        this.img2 = img2;
    }

    public byte[] getImg3() {
        return img3;
    }

    public void setImg3(byte[] img3) {
        this.img3 = img3;
    }

    public byte[] getImg4() {
        return img4;
    }

    public void setImg4(byte[] img4) {
        this.img4 = img4;
    }

    public Calendar getDop_post() {
        return dop_post;
    }

    public void setDop_post(Calendar dop_post) {
        this.dop_post = dop_post;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }
    

    
}
