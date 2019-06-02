/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ConvertMoneyVN;
import Controller.UserController;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author MyPC
 */
public class CustomListPostPanel extends javax.swing.JPanel implements ListCellRenderer<Post> {

    /**
     * Creates new form CustomListPostPanel
     */
    public CustomListPostPanel() {
        initComponents();
    }

     @Override
    public Component getListCellRendererComponent(JList<? extends Post> list, Post value, int index, boolean isSelected, boolean cellHasFocus) {
        
        ImageIcon icon = new ImageIcon(new ImageIcon(value.getImg_cover()).getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH));        
        this.img_cover.setIcon(icon);
        this.img_cover.setText(null);
        this.title.setText(value.getTitle());
        
        String priceString = ConvertMoneyVN.getInstance().LongToMoney(value.getPrice());
        this.price.setText(priceString + "/Tháng");
        
        UserController uc = new UserController();
        ArrayList<User> list_user = uc.getUser();
        String Name = "";
        for(int i=0;i<list_user.size();i++)
            if(list_user.get(i).getId_user() == value.getId_user())
            {
                Name = list_user.get(i).getFullname();
                break;
            }
        
        this.user.setText(Name);
        
        Calendar now = Calendar.getInstance();
        Calendar time = value.getDop_post();
        
        int ngay = now.get(Calendar.DAY_OF_YEAR);
        int ngay_post = time.get(Calendar.DAY_OF_YEAR);
        int chenhlech = ngay - ngay_post;
         if(ngay == ngay_post)
            this.time.setText("Hôm nay");
         else
             this.time.setText(String.valueOf(chenhlech) + " ngày trước");
        this.adress.setText(value.getQuan());
        
        this.lbArea.setText(value.getArea());
        
        return this;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img_cover = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        adress = new javax.swing.JLabel();
        lbArea = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(600, 125));

        img_cover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_cover.setText("Ảnh đại diện");

        title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title.setText("Tiêu đề");

        price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(204, 0, 0));
        price.setText("1500000");

        user.setForeground(new java.awt.Color(102, 102, 102));
        user.setText("Người đăng");

        time.setForeground(new java.awt.Color(102, 102, 102));
        time.setText("Thời gian");

        adress.setForeground(new java.awt.Color(102, 102, 102));
        adress.setText("Địa điểm");

        lbArea.setText("diện tích");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img_cover, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_cover, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbArea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adress;
    private javax.swing.JLabel img_cover;
    private javax.swing.JLabel lbArea;
    private javax.swing.JLabel price;
    private javax.swing.JLabel time;
    private javax.swing.JLabel title;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

   
}
