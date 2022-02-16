//employee home - complaints

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


public final class complaints extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public complaints() {
        initComponents();
        nonactive();
        conn = DBconnect.connect();
        tableload();
        date();
        time();
    }

        public void date(){
        
      Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date.setText(s.format(d));
    }
    
   public void time(){
       
       new Timer(0, new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
              Date d = new Date();
              SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
              time.setText(s.format(d));
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
        sendbill = new javax.swing.JButton();
        mread = new javax.swing.JButton();
        calc = new javax.swing.JButton();
        empcus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cmtable = new javax.swing.JTable();
        cname = new javax.swing.JTextField();
        carea = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ccomplain = new javax.swing.JTextArea();
        cmadd = new javax.swing.JButton();
        navi = new javax.swing.JLabel();
        vv = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 790));
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
        sidebar.add(eback, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 280, 50));

        sendbill.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        sendbill.setText("Send Bills");
        sendbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbillActionPerformed(evt);
            }
        });
        sidebar.add(sendbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 280, 50));

        mread.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        mread.setText("Meter Readings");
        mread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mreadActionPerformed(evt);
            }
        });
        sidebar.add(mread, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 280, 50));

        calc.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        calc.setText("Billing Process");
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });
        sidebar.add(calc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 280, 50));

        empcus.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        empcus.setText("Customer Details");
        empcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empcusActionPerformed(evt);
            }
        });
        sidebar.add(empcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 280, 50));

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 180, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        jPanel1.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 340, 840));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Customer Name");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 220, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Area");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Complain");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 220, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 790, 620));

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
        jPanel1.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 340, 40));

        carea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        carea.setForeground(new java.awt.Color(102, 102, 255));
        carea.setText(" Area");
        carea.setToolTipText("");
        carea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        carea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                careaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                careaFocusLost(evt);
            }
        });
        carea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                careaActionPerformed(evt);
            }
        });
        carea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                careaKeyTyped(evt);
            }
        });
        jPanel1.add(carea, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 340, 40));

        clear.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 130, 50));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 340, 250));

        cmadd.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        cmadd.setText("Add");
        cmadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmaddActionPerformed(evt);
            }
        });
        jPanel1.add(cmadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 130, 50));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/side-bar.png"))); // NOI18N
        navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naviMouseClicked(evt);
            }
        });
        jPanel1.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vvMouseClicked(evt);
            }
        });
        jPanel1.add(vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 1080, 820));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1600, 910));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, 1530, 840));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 90));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Customer Complaints");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 620, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 255));
        date.setText("date");
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        time.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        time.setForeground(new java.awt.Color(102, 102, 255));
        time.setText("time");
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 110, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 260, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grunge-illustration-hanging-light-bulbs-260nw-1161568426.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 130));

        setSize(new java.awt.Dimension(1518, 947));
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

    private void careaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_careaActionPerformed
        
    }//GEN-LAST:event_careaActionPerformed

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

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
       
    }//GEN-LAST:event_cnameActionPerformed

    private void naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naviMouseClicked
        navigationbar();

    }//GEN-LAST:event_naviMouseClicked

    private void ebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebackActionPerformed
        //go back admin home
        emphome a1 = new emphome();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ebackActionPerformed

    private void sendbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbillActionPerformed
        SendBills s1 = new SendBills();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sendbillActionPerformed

    private void mreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mreadActionPerformed
      
    }//GEN-LAST:event_mreadActionPerformed

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        calc m1 = new calc();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_calcActionPerformed

    private void empcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empcusActionPerformed
        cusReg1 c2 = new cusReg1();
        c2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_empcusActionPerformed

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
            java.util.logging.Logger.getLogger(complaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(complaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(complaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(complaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new complaints().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calc;
    private javax.swing.JTextField carea;
    private javax.swing.JTextArea ccomplain;
    private javax.swing.JButton clear;
    private javax.swing.JButton cmadd;
    private javax.swing.JTable cmtable;
    private javax.swing.JTextField cname;
    private javax.swing.JLabel date;
    private javax.swing.JButton eback;
    private javax.swing.JButton empcus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mread;
    private javax.swing.JLabel navi;
    private javax.swing.JButton sendbill;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel time;
    private javax.swing.JLabel vv;
    // End of variables declaration//GEN-END:variables

    void setvisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
