/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Post;
import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public class SortListController {
    
    private static SortListController instance;

    public static SortListController getInstance() {
        if(instance == null)
            instance = new SortListController();
        return instance;
    }

    private static void setInstance(SortListController instance) {
        SortListController.instance = instance;
    }
    
    private SortListController(){}
    
    public ArrayList<Post> DienTichNhoNhat(ArrayList<Post> list){
        for(int i =0;i<list.size()-1;i++)
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).getArea().equals("Chưa biết") && !list.get(j).getArea().equals("Chưa biết"))
                    this.Swap(list.get(i), list.get(j));
                else if(!list.get(i).getArea().equals("Chưa biết") && !list.get(j).getArea().equals("Chưa biết"))
                         if (Long.parseLong(list.get(i).getArea()) >Long.parseLong(list.get(j).getArea()))
                            this.Swap(list.get(i), list.get(j));
            }
        return list;
    }
    
    public ArrayList<Post> DienTichLonNhat(ArrayList<Post> list){
        for(int i =0;i<list.size()-1;i++)
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).getArea().equals("Chưa biết") && !list.get(j).getArea().equals("Chưa biết"))
                    this.Swap(list.get(i), list.get(j));
                else if(!list.get(i).getArea().equals("Chưa biết") && !list.get(j).getArea().equals("Chưa biết"))
                         if (Long.parseLong(list.get(i).getArea()) <Long.parseLong(list.get(j).getArea()))
                            this.Swap(list.get(i), list.get(j));
            }
        return list;
    }
    
     public ArrayList<Post> GiaThapNhat(ArrayList<Post> list){
        for(int i =0;i<list.size()-1;i++)
            for(int j=i+1;j<list.size();j++)
                    if ((list.get(i).getPrice()) > (list.get(j).getPrice()))
                         this.Swap(list.get(i), list.get(j));
            
        return list;
    }
    
    public ArrayList<Post> GiaCaoNhat(ArrayList<Post> list){
        for(int i =0;i<list.size()-1;i++)
            for(int j=i+1;j<list.size();j++)
                    if ((list.get(i).getPrice()) < (list.get(j).getPrice()))
                         this.Swap(list.get(i), list.get(j));
            
        return list;
    }
    
    
    
    public void Swap(Post p1,Post p2){
      Post p =new Post();
      
      p.setId_post(p1.getId_post());
      p.setTitle(p1.getTitle());
      p.setPrice(p1.getPrice());
      p.setArea(p1.getArea());
      p.setAdress_post(p1.getAdress_post());
      p.setContact(p1.getContact());
      p.setDetail(p1.getDetail());
      p.setDop_post(p1.getDop_post());
      p.setKind( p1.getKind());
      p.setStatus(p1.getStatus());
      p.setQuan(p1.getQuan());
      p.setId_user(p1.getId_user());
      p.setImg_cover(p1.getImg_cover());
      p.setImg1(p1.getImg1());
      p.setImg2(p1.getImg2());
      p.setImg3(p1.getImg3());
      p.setImg4(p1.getImg4());
      
      
      p1.setId_post(p2.getId_post());
      p1.setTitle(p2.getTitle());
      p1.setPrice(p2.getPrice());
      p1.setArea(p2.getArea());
      p1.setAdress_post(p2.getAdress_post());
      p1.setContact(p2.getContact());
      p1.setDetail(p2.getDetail());
      p1.setDop_post(p2.getDop_post());
      p1.setKind( p2.getKind());
      p1.setStatus(p2.getStatus());
      p1.setQuan(p2.getQuan());
      p1.setId_user(p2.getId_user());
      p1.setImg_cover(p2.getImg_cover());
      p1.setImg1(p2.getImg1());
      p1.setImg2(p2.getImg2());
      p1.setImg3(p2.getImg3());
      p1.setImg4(p2.getImg4());
      
      p2.setId_post(p.getId_post());
      p2.setTitle(p.getTitle());
      p2.setPrice(p.getPrice());
      p2.setArea(p.getArea());
      p2.setAdress_post(p.getAdress_post());
      p2.setContact(p.getContact());
      p2.setDetail(p.getDetail());
      p2.setDop_post(p.getDop_post());
      p2.setKind( p.getKind());
      p2.setStatus(p.getStatus());
      p2.setQuan(p.getQuan());
      p2.setId_user(p.getId_user());
      p2.setImg_cover(p.getImg_cover());
      p2.setImg1(p.getImg1());
      p2.setImg2(p.getImg2());
      p2.setImg3(p.getImg3());
      p2.setImg4(p.getImg4());
    }
}
