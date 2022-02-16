//admin - customer registration

package Interfaces;

import Codes.DBconnect;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class cusReg extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
        public cusReg() {
        initComponents();
        nonactive();
        conn = DBconnect.connect();
        tableload();
        date();
        time();      
    }//constructor
        
   
        
    //data retrieve to table
    public void tableload(){
        
        try{  
            String sql = "SELECT cusname, cid, cusaddress, cusmobile, cusemail FROM customerreg";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) ctable.getModel();
            dtm.setRowCount(0);

          while(rs.next()){
              Vector v = new Vector();
              v.add(rs.getString("cusname"));
              v.add(rs.getString("cid"));
              v.add(rs.getString("cusaddress"));
              v.add(rs.getString("cusmobile"));
              v.add(rs.getString("cusemail"));
       
              dtm.addRow(v);
            
        }} catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    }
    
    //select row
    public void tabledata(){
        int r = ctable.getSelectedRow();
        String csname = ctable.getValueAt(r, 0).toString();
        String csid = ctable.getValueAt(r, 1).toString();
        String csaddress = ctable.getValueAt(r, 2).toString();
        String csmobile = ctable.getValueAt(r, 3).toString();
        String csemail = ctable.getValueAt(r, 4).toString();
        
        idlabel.setText(csid);
        idlabel.setForeground(Color.blue);
        cname.setText(" "+csname);
        cname.setForeground(Color.blue);
        caddress.setText(" "+csaddress);
        caddress.setForeground(Color.blue);
        cmobile.setText(" "+csmobile);
        cmobile.setForeground(Color.blue);
        cemail.setText(" "+csemail); 
        cemail.setForeground(Color.blue);
    }
    
    //search boc
    public void searchbox() {
        String srch = searchtext.getText();
        
        try {
            String sql = "SELECT * FROM customerreg WHERE cusname LIKE '%"+srch+"%' OR cid LIKE '%"+srch+"%' OR cusaddress LIKE '%"+srch+"%' OR cusmobile LIKE '%"+srch+"%' OR cusemail LIKE '%"+srch+"%' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ctable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }       
    }
    
    //UPDATE
    public void updatetable() {
       String name = cname.getText();
       String id = idlabel.getText();
       String address = caddress.getText();
       String email = cemail.getText();
       String mobile = cmobile.getText().toString();
       
        try {
            String sql = "UPDATE customerreg SET cusname='"+name+"', cusaddress='"+address+"', cusmobile='"+mobile+"', cusemail='"+email+"' WHERE cid='"+id+"' "; 
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update Failed!!!");
        }
    }
    
    //delete 
    public void delete(){
        int check = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
        
        if (check == 0){
            String id = idlabel.getText();
            try {
                String sql = "DELETE FROM customerreg WHERE cid='"+id+"'";
                pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Successfully deleted!!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Delete Failed!!!");
            }
        }
    }
    
    //clear
    public void clear(){
        searchtext.setText("");
        idlabel.setText("");
        cname.setText("");
        caddress.setText("");
        cemail.setText("");
        cmobile.setText("");    
    }
    
    public void date(){
        
      java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date.setText(s.format(d));
    }
    
   public void time(){
       
       new Timer(0, new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
              java.util.Date d = new java.util.Date();
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
   
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        eback = new javax.swing.JButton();
        f = new javax.swing.JButton();
        c = new javax.swing.JButton();
        d = new javax.swing.JButton();
        e = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        navi = new javax.swing.JLabel();
        vv = new javax.swing.JLabel();
        cemail = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        caddress = new javax.swing.JTextField();
        cmobile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ctable = new javax.swing.JTable();
        cdelete = new javax.swing.JButton();
        cupdate = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cclear = new javax.swing.JButton();
        cnew = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        searchtext = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        idlabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 51));
        date.setText("date");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 80, 20));

        time.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 51));
        time.setText("time");
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 10, 90, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(245, 245, 245));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        f.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        f.setText("Feedbacks");
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        sidebar.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 280, 50));

        c.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        c.setText("Employee Details");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        sidebar.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 50));

        d.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        d.setText("Billing Summary");
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        sidebar.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 280, 50));

        e.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        e.setText("Complaints");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        sidebar.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 280, 50));

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 180, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        panel.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 840));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/side-bar.png"))); // NOI18N
        navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naviMouseClicked(evt);
            }
        });
        panel.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vvMouseClicked(evt);
            }
        });
        vv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vvKeyTyped(evt);
            }
        });
        panel.add(vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 1020, 810));

        cemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cemail.setForeground(new java.awt.Color(102, 102, 255));
        cemail.setText("  Enter customer email");
        cemail.setToolTipText("enter email");
        cemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        cemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cemailFocusLost(evt);
            }
        });
        cemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cemailActionPerformed(evt);
            }
        });
        cemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cemailKeyTyped(evt);
            }
        });
        panel.add(cemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 330, 40));

        cname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cname.setForeground(new java.awt.Color(102, 102, 255));
        cname.setText("  Enter customer name");
        cname.setToolTipText(" enter customer name");
        cname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        cname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cnameFocusLost(evt);
            }
        });
        cname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnameMouseClicked(evt);
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
        panel.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 330, 40));

        caddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        caddress.setForeground(new java.awt.Color(102, 102, 255));
        caddress.setText("  Enter customer address");
        caddress.setToolTipText(" enter customer address");
        caddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        caddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                caddressFocusLost(evt);
            }
        });
        caddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caddressActionPerformed(evt);
            }
        });
        caddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caddressKeyTyped(evt);
            }
        });
        panel.add(caddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 330, 40));

        cmobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmobile.setForeground(new java.awt.Color(102, 102, 255));
        cmobile.setText("  Enter mobile number");
        cmobile.setToolTipText("enter mobile number");
        cmobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        cmobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmobileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmobileFocusLost(evt);
            }
        });
        cmobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmobileKeyTyped(evt);
            }
        });
        panel.add(cmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 330, 40));

        ctable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer Name", "CustomerID", "Customer Address", "Mobile Number", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctableMouseClicked(evt);
            }
        });
        ctable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ctableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(ctable);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 850, 690));

        cdelete.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        cdelete.setText("Remove Details");
        cdelete.setMaximumSize(new java.awt.Dimension(87, 33));
        cdelete.setMinimumSize(new java.awt.Dimension(87, 33));
        cdelete.setPreferredSize(new java.awt.Dimension(87, 33));
        cdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdeleteActionPerformed(evt);
            }
        });
        panel.add(cdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 330, 50));

        cupdate.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        cupdate.setText("Update Details");
        cupdate.setMaximumSize(new java.awt.Dimension(87, 33));
        cupdate.setMinimumSize(new java.awt.Dimension(87, 33));
        cupdate.setPreferredSize(new java.awt.Dimension(87, 33));
        cupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupdateActionPerformed(evt);
            }
        });
        panel.add(cupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 330, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 220, 40));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Customer ID  ");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 170, 40));

        panel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 220, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Mobile ");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        panel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 220, 40));

        cclear.setBackground(new java.awt.Color(255, 255, 255));
        cclear.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        cclear.setText("Clear ");
        cclear.setMaximumSize(new java.awt.Dimension(87, 33));
        cclear.setMinimumSize(new java.awt.Dimension(87, 33));
        cclear.setPreferredSize(new java.awt.Dimension(87, 33));
        cclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cclearActionPerformed(evt);
            }
        });
        panel.add(cclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 150, 50));

        cnew.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        cnew.setText("Register Now");
        cnew.setMaximumSize(new java.awt.Dimension(87, 33));
        cnew.setMinimumSize(new java.awt.Dimension(87, 33));
        cnew.setPreferredSize(new java.awt.Dimension(87, 33));
        cnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnewActionPerformed(evt);
            }
        });
        panel.add(cnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 420, 80));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Email");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 220, 40));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 220, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel14.setText("Email");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 220, 40));

        panel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 220, 40));

        searchtext.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        searchtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextActionPerformed(evt);
            }
        });
        searchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtextKeyReleased(evt);
            }
        });
        panel.add(searchtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 50, 290, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grunge-illustration-hanging-light-bulbs-260nw-1161568426.jpg"))); // NOI18N
        panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 400, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Customer Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 220, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idlabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jPanel1.add(idlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, 40));

        panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 100, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Address");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        panel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1650, 900));

        jPanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1530, 880));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("CUSTOMER DETAILS");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 970));

        setSize(new java.awt.Dimension(1518, 997));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        
    }//GEN-LAST:event_cnameActionPerformed

    private void cclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cclearActionPerformed
        clear();
    }//GEN-LAST:event_cclearActionPerformed

    private void cdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdeleteActionPerformed
       delete();
       tableload();
       clear(); 
    }//GEN-LAST:event_cdeleteActionPerformed

    private void cnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnewActionPerformed
        //go to new customer registration form
        newCustomer n1 = new newCustomer();
        n1.setVisible(true);      
    }//GEN-LAST:event_cnewActionPerformed

    private void cupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cupdateActionPerformed
        
       updatetable();
       tableload(); 
       clear();
       JOptionPane.showMessageDialog(null, "Data Updated Successfully!!!");
    }//GEN-LAST:event_cupdateActionPerformed

    private void ctableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctableMouseClicked
        
        tabledata();
    }//GEN-LAST:event_ctableMouseClicked

    private void ctableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctableKeyReleased
        tabledata();
    }//GEN-LAST:event_ctableKeyReleased

    private void searchtextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtextKeyReleased
        searchbox();
    }//GEN-LAST:event_searchtextKeyReleased

    private void searchtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextActionPerformed
        
    }//GEN-LAST:event_searchtextActionPerformed

    private void ebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebackActionPerformed
        //go back admin home
        AdminHome a1 = new AdminHome();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ebackActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        feedback s1 = new feedback();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        empreg e1 = new empreg();
        e1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        Bsummary m1 = new Bsummary();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        complaints1 c2 = new complaints1();
        c2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eActionPerformed

    private void naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naviMouseClicked
        navigationbar();
    }//GEN-LAST:event_naviMouseClicked

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
      
    }//GEN-LAST:event_panelMouseClicked

    private void vvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vvMouseClicked
      nonactive();
    }//GEN-LAST:event_vvMouseClicked

    private void cnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnameFocusGained
          if(cname.getText().equals("  Enter customer name"))
        {
        cname.setText("");
        cname.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_cnameFocusGained

    private void cnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnameFocusLost
         if(cname.getText().equals(""))
        {
        cname.setText("  Enter customer name");
        cname.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_cnameFocusLost

    private void cnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnameKeyTyped
        cname.setForeground(blue);
    }//GEN-LAST:event_cnameKeyTyped

    private void caddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caddressFocusGained
         if(caddress.getText().equals("  Enter customer address"))
        {
        caddress.setText("");
        caddress.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_caddressFocusGained

    private void caddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caddressFocusLost
         if(caddress.getText().equals(""))
        {
        caddress.setText("  Enter customer address");
        caddress.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_caddressFocusLost

    private void caddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caddressKeyTyped
         caddress.setForeground(blue);
    }//GEN-LAST:event_caddressKeyTyped

    private void cmobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmobileFocusGained
         if(cmobile.getText().equals("  Enter mobile number"))
        {
        cmobile.setText("");
        cmobile.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_cmobileFocusGained

    private void cmobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmobileFocusLost
         if(cmobile.getText().equals(""))
        {
        cmobile.setText("  Enter mobile number");
        cmobile.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_cmobileFocusLost

    private void vvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vvKeyTyped
        
    }//GEN-LAST:event_vvKeyTyped

    private void cmobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmobileKeyTyped
           cmobile.setForeground(blue);
    }//GEN-LAST:event_cmobileKeyTyped

    private void cemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cemailFocusGained
       if(cemail.getText().equals("  Enter customer email"))
        {
        cemail.setText("");
        cemail.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_cemailFocusGained

    private void cemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cemailFocusLost
       if(cemail.getText().equals(""))
        {
        cemail.setText("  Enter customer email");
        cemail.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_cemailFocusLost

    private void cemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cemailKeyTyped
         cemail.setForeground(blue);
    }//GEN-LAST:event_cemailKeyTyped

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

    private void caddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caddressActionPerformed
       
    }//GEN-LAST:event_caddressActionPerformed

    private void cnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnameMouseClicked
       
    }//GEN-LAST:event_cnameMouseClicked

    private void cemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cemailActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(cusReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cusReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cusReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cusReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cusReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c;
    private javax.swing.JTextField caddress;
    private javax.swing.JButton cclear;
    private javax.swing.JButton cdelete;
    private javax.swing.JTextField cemail;
    private javax.swing.JTextField cmobile;
    private javax.swing.JTextField cname;
    private javax.swing.JButton cnew;
    private javax.swing.JTable ctable;
    private javax.swing.JButton cupdate;
    private javax.swing.JButton d;
    private javax.swing.JLabel date;
    private javax.swing.JButton e;
    private javax.swing.JButton eback;
    private javax.swing.JButton f;
    private javax.swing.JLabel idlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel navi;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField searchtext;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel time;
    private javax.swing.JLabel vv;
    // End of variables declaration//GEN-END:variables

    private Border LineBorder(Color black, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Border LineBorder(Color black, boolean b, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
