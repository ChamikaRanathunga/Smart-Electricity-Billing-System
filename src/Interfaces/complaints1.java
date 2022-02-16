//admin- complaints

package Interfaces;

import Codes.DBconnect;
import java.awt.Color;
import static java.awt.Color.blue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


public final class complaints1 extends javax.swing.JFrame {

     Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public complaints1() {
        initComponents();
        nonactive();
        conn = DBconnect.connect();
        tableload();
        date();
        time();
        navi.setVisible(true);
    }

        public void date(){
        
      Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date1.setText(s.format(d));
    }
    
   public void time(){
       
       new Timer(0, new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
              Date d = new Date();
              SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
              time1.setText(s.format(d));
           }
       }).start();
       
   }
   
     public void nonactive(){
       sidebar.setVisible(false);
       sidebar.setEnabled(false);
       vv.setVisible(false);
       vv.setEnabled(false);
       navi.setVisible(true);
       navi.setEnabled(true);
       
   } 
   public void navigationbar(){
       
     sidebar.setVisible(true);
       sidebar.setEnabled(true);
        vv.setVisible(true);
       vv.setEnabled(true);
       navi.setVisible(false);
       navi.setEnabled(false);
   } 
   
    public void tableload(){
        
        try{  
            String sql = "SELECT cname, area, complain FROM complain";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) cmtable.getModel();
            dtm.setRowCount(0);

          while(rs.next()){
              Vector v = new Vector();
              v.add(rs.getString("cname"));            
              v.add(rs.getString("area"));
              v.add(rs.getString("complain"));  
       
              dtm.addRow(v);
            
        }} catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    }
   
     public void tabledata(){
        int r = cmtable.getSelectedRow();
        String name = cmtable.getValueAt(r, 0).toString();
        String area = cmtable.getValueAt(r, 1).toString();
        String complain = cmtable.getValueAt(r, 2).toString();
        
        cname.setText(" "+name);
        cname.setForeground(Color.blue);
        carea.setText(" "+area);
        carea.setForeground(Color.blue);
        ccomplain.setText(" "+complain);
        ccomplain.setForeground(Color.blue);

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        eback = new javax.swing.JButton();
        feedb = new javax.swing.JButton();
        emp = new javax.swing.JButton();
        bsum = new javax.swing.JButton();
        adcus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cmtable = new javax.swing.JTable();
        cname = new javax.swing.JTextField();
        carea = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ccomplain = new javax.swing.JTextArea();
        cmadd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        navi = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vv = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        date1 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(35, 31, 32));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eback.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        eback.setText("Home");
        eback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebackActionPerformed(evt);
            }
        });
        sidebar.add(eback, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 280, 50));

        feedb.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        feedb.setText("Feedbacks");
        feedb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbActionPerformed(evt);
            }
        });
        sidebar.add(feedb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 280, 50));

        emp.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        emp.setText("Employee Details");
        emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empActionPerformed(evt);
            }
        });
        sidebar.add(emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 280, 50));

        bsum.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        bsum.setText("Billing Summary");
        bsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsumActionPerformed(evt);
            }
        });
        sidebar.add(bsum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 280, 50));

        adcus.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        adcus.setText("Customer Details");
        adcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcusActionPerformed(evt);
            }
        });
        sidebar.add(adcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        sidebar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 260, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        sidebar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, 260, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 170, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        jPanel1.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 840));

        clear.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 130, 50));

        cmtable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer Name", "Area", "Complain"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cmtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmtableMouseClicked(evt);
            }
        });
        cmtable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmtableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(cmtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 720, 660));

        cname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cname.setForeground(new java.awt.Color(102, 102, 255));
        cname.setText(" Enter customer name");
        cname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        cname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cnameFocusLost(evt);
            }
        });
        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });
        cname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnameKeyTyped(evt);
            }
        });
        jPanel1.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 340, 40));

        carea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        carea.setForeground(new java.awt.Color(102, 102, 255));
        carea.setText(" Area");
        carea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        carea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                careaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                careaFocusLost(evt);
            }
        });
        carea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                careaKeyTyped(evt);
            }
        });
        jPanel1.add(carea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 340, 40));

        ccomplain.setColumns(20);
        ccomplain.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ccomplain.setForeground(new java.awt.Color(102, 102, 255));
        ccomplain.setRows(5);
        ccomplain.setText(" Enter complain here");
        ccomplain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        ccomplain.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ccomplainFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ccomplainFocusLost(evt);
            }
        });
        ccomplain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccomplainKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(ccomplain);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 340, 240));

        cmadd.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        cmadd.setText("Add");
        cmadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmaddActionPerformed(evt);
            }
        });
        jPanel1.add(cmadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 130, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Complain");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 190, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 220, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Area");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 180, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Customer Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 190, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 220, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 220, 40));

        navi.setBackground(new java.awt.Color(0, 0, 0));
        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/side-bar.png"))); // NOI18N
        navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naviMouseClicked(evt);
            }
        });
        jPanel1.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 890));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1520, 840));

        vv.setBackground(new java.awt.Color(230, 230, 230));
        vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vvMouseClicked(evt);
            }
        });
        getContentPane().add(vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 1160, 820));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        date1.setForeground(new java.awt.Color(102, 102, 255));
        date1.setText("date");
        jPanel6.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        time1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        time1.setForeground(new java.awt.Color(102, 102, 255));
        time1.setText("time");
        jPanel6.add(time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 110, 40));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 290, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Customer Complaints");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 610, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grunge-illustration-hanging-light-bulbs-260nw-1161568426.jpg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 410, 130));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 140));

        setSize(new java.awt.Dimension(1518, 997));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmaddActionPerformed
        
         String name;
        String area;
        String complain;
        
        name = cname.getText();
        area = carea.getText();
        complain = ccomplain.getText();
      
        
        try {
            String sql = "INSERT INTO complain (cname,area,complain)VALUES ('"+name+"','"+area+"','"+complain+"')";
          
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Complain added Successfully!!!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
          tableload();  
    }//GEN-LAST:event_cmaddActionPerformed

    private void cnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnameFocusGained
        if(cname.getText().equals(" Enter customer name"))
        {
        cname.setText("");
        cname.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_cnameFocusGained

    private void cnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnameFocusLost
       
        if(cname.getText().equals(""))
        {
        cname.setText(" Enter customer name");
        cname.setForeground(new Color(102,102,255));
        }       
    }//GEN-LAST:event_cnameFocusLost

    private void cnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnameKeyTyped
        cname.setForeground(blue);       
    }//GEN-LAST:event_cnameKeyTyped

    private void careaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_careaFocusGained
        if(carea.getText().equals(" Area"))
        {
        carea.setText("");
        carea.setForeground(new Color(102,102,255));
        }      
    }//GEN-LAST:event_careaFocusGained

    private void careaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_careaFocusLost
      if(carea.getText().equals(""))
        {
        carea.setText(" Area");
        carea.setForeground(new Color(102,102,255));
        }        
    }//GEN-LAST:event_careaFocusLost

    private void careaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_careaKeyTyped
       
        carea.setForeground(blue);
      
    }//GEN-LAST:event_careaKeyTyped

    private void ccomplainFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ccomplainFocusGained
        if(ccomplain.getText().equals(" Enter complain here"))
        {
        ccomplain.setText("");
        ccomplain.setForeground(new Color(102,102,255));
        }      
    }//GEN-LAST:event_ccomplainFocusGained

    private void ccomplainFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ccomplainFocusLost
      
        if(ccomplain.getText().equals(""))
        {
        ccomplain.setText(" Enter complain here");
        ccomplain.setForeground(new Color(102,102,255));
        }       
    }//GEN-LAST:event_ccomplainFocusLost

    private void ccomplainKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccomplainKeyTyped
        ccomplain.setForeground(blue);        
    }//GEN-LAST:event_ccomplainKeyTyped

    private void naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naviMouseClicked
        navigationbar();
    }//GEN-LAST:event_naviMouseClicked

    private void ebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebackActionPerformed
        //go back admin home
        AdminHome a1 = new AdminHome();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ebackActionPerformed

    private void feedbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbActionPerformed
        feedback s1 = new feedback();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_feedbActionPerformed

    private void empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empActionPerformed
        empreg e1 = new empreg();
        e1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_empActionPerformed

    private void bsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsumActionPerformed
        Bsummary m1 = new Bsummary();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsumActionPerformed

    private void adcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcusActionPerformed
        cusReg c2 = new cusReg();
        c2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adcusActionPerformed

    private void vvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vvMouseClicked
       nonactive();
    }//GEN-LAST:event_vvMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      System.exit(0);        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Do you want to Log Out?");
        
        if (check == 0){
           Login l = new Login();
           l.setVisible(true);
           this.dispose();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void cmtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtableMouseClicked
       tabledata();
    }//GEN-LAST:event_cmtableMouseClicked

    private void cmtableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmtableKeyReleased
        tabledata();
    }//GEN-LAST:event_cmtableKeyReleased

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
      cname.setText("");
      carea.setText("");
      ccomplain.setText("");
    }//GEN-LAST:event_clearActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(complaints1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(complaints1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(complaints1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(complaints1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new complaints1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adcus;
    private javax.swing.JButton bsum;
    private javax.swing.JTextField carea;
    private javax.swing.JTextArea ccomplain;
    private javax.swing.JButton clear;
    private javax.swing.JButton cmadd;
    private javax.swing.JTable cmtable;
    private javax.swing.JTextField cname;
    private javax.swing.JLabel date1;
    private javax.swing.JButton eback;
    private javax.swing.JButton emp;
    private javax.swing.JButton feedb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel navi;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel vv;
    // End of variables declaration//GEN-END:variables
}
