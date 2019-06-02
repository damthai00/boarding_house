/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PostController;
import Controller.SortListController;
import Model.CustomListPostPanel;
import Model.Post;
import Model.User;
import java.awt.Cursor;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author MyPC
 */
public class MainFrame extends javax.swing.JFrame {

    private User user_sudung = null;

    public User getUser_sudung() {
        return user_sudung;
    }
    public void setUser_sudung(User user_sudung) {
        this.user_sudung = user_sudung;
    }
  
    private MainFrame it;

    public MainFrame getIt() {
        return it;
    }

    public void setIt(MainFrame it) {
        this.it = it;
    }
    
     public MainFrame(MainFrame it) {
         this.it = it;
     }
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.DangNhap();
        this.loadListPostChoThue();
        this.loadTinCuaBan();
        this.load();
 
    }

    public void load(){
        ImageIcon icon = new ImageIcon("reload.png"); 
        
        this.bnrRefresh.setIcon(icon);
    }
    
    
    public void DangNhap(){
        if(user_sudung == null){
            panel_logined.setVisible(false);
            panel_login.setVisible(true);
        }
        else{
            panel_logined.setVisible(true);
            panel_login.setVisible(false);
            ImageIcon icon = new ImageIcon(new ImageIcon(user_sudung.getImg()).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));        
            this.lb_img_cover.setIcon(icon);
            this.lb_username.setText(user_sudung.getFullname());
        }  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_cho_thue = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_can_thue = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        lb_thongbao = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_tincuaban = new javax.swing.JList<>();
        txt_search = new javax.swing.JTextField();
        cbbLoc = new javax.swing.JComboBox<>();
        cbbSapXep = new javax.swing.JComboBox<>();
        panel_logined = new javax.swing.JPanel();
        lb_img_cover = new javax.swing.JLabel();
        lb_username = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        bnt_dangxuat = new javax.swing.JButton();
        panel_login = new javax.swing.JPanel();
        bnt_dangnhap = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bnt_dangbai = new javax.swing.JButton();
        lb_search = new javax.swing.JLabel();
        bnrRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        list_cho_thue.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                list_cho_thueMouseMoved(evt);
            }
        });
        list_cho_thue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_cho_thueMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_cho_thue);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cho thuê", jPanel1);

        list_can_thue.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                list_can_thueMouseMoved(evt);
            }
        });
        list_can_thue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_can_thueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list_can_thue);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cần thuê", jPanel2);

        lb_thongbao.setText("Ban phải đăng nhập để xem tin của mình!");

        list_tincuaban.setBackground(new java.awt.Color(240, 240, 240));
        list_tincuaban.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                list_tincuabanMouseMoved(evt);
            }
        });
        list_tincuaban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_tincuabanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(list_tincuaban);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(lb_thongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lb_thongbao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý tin đăng", jPanel3);

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
        });

        cbbLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Quận 1", "Quận 2", "Quận 3", "Quận 4", "Quận 5", "Quận 6", "Quận 7", "Quận 8", "Quận 9", "Quận 10", "Quận 11", "Quận 12", "Quận Thủ Đức", "Quận Bình Thạnh", "Quận Gò Vấp", "Quận Phú Nhuận", "Quận Tân Phú", "Quận Bình Tân", "Quận Tân Bình", "Huyện Nhà Bè", "Huyện Bình Chánh", "Huyện Hóc Môn", "Huyện Củ Chi", "Huyện Cần Giờ" }));
        cbbLoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbLocItemStateChanged(evt);
            }
        });
        cbbLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLocActionPerformed(evt);
            }
        });

        cbbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp Xếp theo", "Giá thấp nhất", "Giá cao nhất", "Diện tích nhỏ nhất", "Diện tích lớn nhất" }));
        cbbSapXep.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbSapXepItemStateChanged(evt);
            }
        });

        lb_img_cover.setText("Ảnh đại diện");
        lb_img_cover.setPreferredSize(new java.awt.Dimension(65, 65));

        lb_username.setBackground(new java.awt.Color(204, 51, 0));
        lb_username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_username.setText("Tên ");

        jButton2.setText("Chỉnh sửa");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        bnt_dangxuat.setText("Đăng xuất");
        bnt_dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnt_dangxuatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_loginedLayout = new javax.swing.GroupLayout(panel_logined);
        panel_logined.setLayout(panel_loginedLayout);
        panel_loginedLayout.setHorizontalGroup(
            panel_loginedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginedLayout.createSequentialGroup()
                .addComponent(lb_img_cover, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_loginedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_loginedLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnt_dangxuat)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_loginedLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(lb_username, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_loginedLayout.setVerticalGroup(
            panel_loginedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginedLayout.createSequentialGroup()
                .addGroup(panel_loginedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_loginedLayout.createSequentialGroup()
                        .addComponent(lb_username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_loginedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt_dangxuat)
                            .addComponent(jButton2))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(lb_img_cover, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_login.setPreferredSize(new java.awt.Dimension(250, 65));

        bnt_dangnhap.setText("Đăng nhập");
        bnt_dangnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnt_dangnhapMouseClicked(evt);
            }
        });

        jButton4.setText("Đăng kí");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_loginLayout = new javax.swing.GroupLayout(panel_login);
        panel_login.setLayout(panel_loginLayout);
        panel_loginLayout.setHorizontalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(bnt_dangnhap)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panel_loginLayout.setVerticalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt_dangnhap)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bnt_dangbai.setText("Đăng bài");
        bnt_dangbai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnt_dangbaiMouseClicked(evt);
            }
        });

        lb_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_search.setText("Search");
        lb_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_searchMouseEntered(evt);
            }
        });

        bnrRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnrRefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bnrRefresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bnt_dangbai, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_logined, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbLoc, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(cbbSapXep)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_logined, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_login, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bnt_dangbai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnrRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLocActionPerformed

    }//GEN-LAST:event_cbbLocActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        RegisterFrame lg = new RegisterFrame();
        lg.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void bnt_dangnhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_dangnhapMouseClicked
        LoginFrame lg = new LoginFrame(this);
        lg.setVisible(true);
    }//GEN-LAST:event_bnt_dangnhapMouseClicked

    private void bnt_dangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_dangxuatMouseClicked
        user_sudung = null;
        this.DangNhap();
        this.loadTinCuaBan();
    }//GEN-LAST:event_bnt_dangxuatMouseClicked

    private void bnt_dangbaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_dangbaiMouseClicked
        if(user_sudung == null)
            JOptionPane.showMessageDialog(null, "Bạn cần đăng nhập để đăng bài!");
        else{
            NewPostFrame np = new  NewPostFrame(user_sudung,this);
            np.setVisible(true);
        }
        
        
    }//GEN-LAST:event_bnt_dangbaiMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
     
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void list_tincuabanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_tincuabanMouseClicked
        Post post = this.list_tincuaban.getSelectedValue();
        InfoPostFrame ip = new InfoPostFrame(post,this);
        ip.setVisible(true);
    }//GEN-LAST:event_list_tincuabanMouseClicked

    private void list_cho_thueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_cho_thueMouseClicked
        Post post = this.list_cho_thue.getSelectedValue();
        InfoPostFrame ip = new InfoPostFrame(post,this);
        ip.setVisible(true);
    }//GEN-LAST:event_list_cho_thueMouseClicked

    private void list_can_thueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_can_thueMouseClicked
        Post post = this.list_can_thue.getSelectedValue();
        InfoPostFrame ip = new InfoPostFrame(post,this);
        ip.setVisible(true);
    }//GEN-LAST:event_list_can_thueMouseClicked

    private void list_cho_thueMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_cho_thueMouseMoved
        this.list_cho_thue.setCursor(new Cursor(Cursor.HAND_CURSOR));   
    }//GEN-LAST:event_list_cho_thueMouseMoved

    private void list_can_thueMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_can_thueMouseMoved
        this.list_can_thue.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
    }//GEN-LAST:event_list_can_thueMouseMoved

    private void list_tincuabanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_tincuabanMouseMoved
        this.list_tincuaban.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
    }//GEN-LAST:event_list_tincuabanMouseMoved

    private void lb_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_searchMouseClicked
        
        if(this.txt_search.getText().equals(""))
            return;
        else{
            String input = this.txt_search.getText();
            PostController pc = new PostController();
            ArrayList<Post> list = pc.getPost();
            ArrayList<Post> list2 = new ArrayList<>();

            for(int i=0;i<list.size();i++)
                if(list.get(i).getTitle().indexOf(input) >-1)
                    list2.add(list.get(i));
            this.loadListPost(this.ListCanThue(list2), this.list_can_thue);
            this.loadListPost(this.ListChoThue(list2), this.list_cho_thue);
            
            if(this.user_sudung != null)
                this.loadListPost(this.ListTinCuaBan(list2, user_sudung), this.list_tincuaban);
        }    
        
        
    }//GEN-LAST:event_lb_searchMouseClicked

    private void lb_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_searchMouseEntered
        this.lb_search.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
    }//GEN-LAST:event_lb_searchMouseEntered

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
       
    }//GEN-LAST:event_txt_searchKeyPressed

    private void cbbLocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbLocItemStateChanged
        this.XuLyTimKiem();
       
    }//GEN-LAST:event_cbbLocItemStateChanged

    private void bnrRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnrRefreshMouseClicked
       
     //   this.loadListPostChoThue();
       // this.loadTinCuaBan();
        this.txt_search.setText("");
        this.cbbLoc.setSelectedIndex(0);
        this.cbbSapXep.setSelectedIndex(0);
    }//GEN-LAST:event_bnrRefreshMouseClicked

    private void cbbSapXepItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbSapXepItemStateChanged
       this.XuLyTimKiem();
    }//GEN-LAST:event_cbbSapXepItemStateChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        RegisterFrame f = new RegisterFrame(this,this.user_sudung);
        f.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    public ArrayList<Post> ListChoThue(ArrayList<Post> list){
       
        PostController pc = new PostController();
        ArrayList<Post> list2 = new ArrayList<>();
        for(int i=0;i<list.size();i++)
            if(list.get(i).getKind().equals("chothue"))
                list2.add(list.get(i));
        return list2;
    }
    
     public ArrayList<Post> ListCanThue(ArrayList<Post> list){
       
        PostController pc = new PostController();
        ArrayList<Post> list2 = new ArrayList<>();
        for(int i=0;i<list.size();i++)
            if(list.get(i).getKind().equals("canthue"))
                list2.add(list.get(i));
        return list2;
    }
     
          public ArrayList<Post> ListTinCuaBan(ArrayList<Post> list,User user){
       
        PostController pc = new PostController();
        ArrayList<Post> list2 = new ArrayList<>();
        for(int i=0;i<list.size();i++)
            if(list.get(i).getId_user()==user.getId_user())
                list2.add(list.get(i));
        return list2;
    }
     
     
   public void XuLyTimKiem(){
         String loc = cbbLoc.getSelectedItem().toString();
        String searchString = this.txt_search.getText();
        ArrayList<Post> list_chothue = new ArrayList<>();
         ArrayList<Post> list_canthue= new ArrayList<>();
         
        if(searchString.equals("") && loc.equals("Tất cả")) //Không tìm + không lọc
        {
            list_chothue = new PostController().getPostChoThue();
            list_canthue = new PostController().getPostCanThue();
        }
        if(searchString.equals("") && !loc.equals("Tất cả")) //Không tìm  nhưng lọc
        {
            list_chothue = new PostController().getPostChoThueByKTimLoc(loc);
            list_canthue = new PostController().getPostCanThueByKTimLoc(loc);
        }
        
        if(!searchString.equals("") && loc.equals("Tất cả")) //Tìm + không lọc
        {
            list_chothue = new PostController().getPostChoThueTimKLoc(searchString);
            list_canthue = new PostController().getPostCanThueTimKLoc(searchString);
        }

        if(!searchString.equals("") && !loc.equals("Tất cả")) //Tìm Và lọc
        {
            list_chothue = new PostController().getPostChoThueTimVaLoc(searchString, loc);
            list_canthue = new PostController().getPostCanThueTimVaLoc(searchString, loc);
        }
        
        //kiểm tra sắp xếp
        
        if(this.cbbSapXep.getSelectedIndex() == 1)
        {
            list_chothue = SortListController.getInstance().GiaThapNhat(list_chothue);
            list_canthue = SortListController.getInstance().GiaThapNhat(list_canthue);
        }
        if(this.cbbSapXep.getSelectedIndex() == 2)
        {
            list_chothue = SortListController.getInstance().GiaCaoNhat(list_chothue);
            list_canthue = SortListController.getInstance().GiaCaoNhat(list_canthue);
        }
         if(this.cbbSapXep.getSelectedIndex() == 3)
        {
            list_chothue = SortListController.getInstance().DienTichNhoNhat(list_chothue);
            list_canthue = SortListController.getInstance().DienTichNhoNhat(list_canthue);
        }
           if(this.cbbSapXep.getSelectedIndex() == 4)
        {
            list_chothue = SortListController.getInstance().DienTichLonNhat(list_chothue);
            list_canthue = SortListController.getInstance().DienTichLonNhat(list_canthue);
        }
        
        this.loadListPost(list_canthue, list_can_thue);
        this.loadListPost(list_chothue, list_cho_thue);
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    
    public void loadListPostChoThue(){
        PostController pc = new PostController();
        ArrayList<Post> list = pc.getPost();
        DefaultListModel dm_chothue= new DefaultListModel();
        DefaultListModel dm_canthue = new DefaultListModel();
        dm_chothue.clear();
        dm_canthue.clear();
        ArrayList<Post> listChoThue = new ArrayList<>();
        ArrayList<Post> listCanThue = new ArrayList<>();
        
        for(int i =0;i<list.size();i++){
            if(list.get(i).getKind().equals("chothue"))
                listChoThue.add(list.get(i));
            else
                    listCanThue.add(list.get(i));
        }
        
        //load cho thuê
        for(int i =0;i<listChoThue.size();i++)
        {
            dm_chothue.addElement(listChoThue.get(i));
        }
        this.list_cho_thue.setCellRenderer(new CustomListPostPanel());
        this.list_cho_thue.setModel(dm_chothue);
        
        //load cần thuê
        for(int i =0;i<listCanThue.size();i++)
        {
            dm_canthue.addElement(listCanThue.get(i));
        }
        this.list_can_thue.setCellRenderer(new CustomListPostPanel());
        this.list_can_thue.setModel(dm_canthue);
        
    }
    
    public void loadListPost(ArrayList<Post> list, JList listView){
        DefaultListModel dm  = new DefaultListModel();
        dm.clear();
        for(int i =0;i<list.size();i++)
            dm.addElement(list.get(i));
        listView.setCellRenderer(new CustomListPostPanel());
        listView.setModel(dm);
    }
    
    public void loadTinCuaBan(){
        if(user_sudung==null)
        {
            this.lb_thongbao.setVisible(true);
            this.list_tincuaban.setVisible(false);
        }
        else{
            this.lb_thongbao.setVisible(false);
            this.list_tincuaban.setVisible(true);
            PostController pc = new PostController();
            ArrayList<Post> list = pc.getPost();
            ArrayList<Post> list_tin = new ArrayList<>();
            
            for(int i =0;i<list.size();i++)
                if(list.get(i).getId_user() == this.user_sudung.getId_user())
                    list_tin.add(list.get(i));
            
            DefaultListModel dm= new DefaultListModel();
            dm.clear();
            
            for(int i =0;i<list_tin.size();i++)
            {
                dm.addElement(list_tin.get(i));
            }
            this.list_tincuaban.setCellRenderer(new CustomListPostPanel());
            this.list_tincuaban.setModel(dm);
        }
    }
    
    
    public void loadPostCanThueByList(ArrayList<Post> list){
        DefaultListModel dm = new DefaultListModel();
        dm.clear();
        for(int i=0;i<list.size();i++)
        {
            dm.addElement(list.get(i));
        }
        this.list_can_thue.setCellRenderer(new CustomListPostPanel());
        this.list_can_thue.setModel(dm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnrRefresh;
    private javax.swing.JButton bnt_dangbai;
    private javax.swing.JButton bnt_dangnhap;
    private javax.swing.JButton bnt_dangxuat;
    private javax.swing.JComboBox<String> cbbLoc;
    private javax.swing.JComboBox<String> cbbSapXep;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb_img_cover;
    private javax.swing.JLabel lb_search;
    private javax.swing.JLabel lb_thongbao;
    private javax.swing.JLabel lb_username;
    private javax.swing.JList<Post> list_can_thue;
    private javax.swing.JList<Post> list_cho_thue;
    private javax.swing.JList<Post> list_tincuaban;
    private javax.swing.JPanel panel_login;
    private javax.swing.JPanel panel_logined;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}