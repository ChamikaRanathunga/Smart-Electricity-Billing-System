//staff - customer registration

package Interfaces;

import Codes.DBconnect;
import Codes.round;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.gray;
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
import static javafx.scene.paint.Color.color;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.Border;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class cusReg1 extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
        public cusReg1() {
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
        idlabel.setForeground(blue);
        NAME.setText(" "+csname);
        NAME.setForeground(blue);
        ADDRESS.setText(" "+csaddress);
        ADDRESS.setForeground(blue);
        MOBILE.setText(" "+csmobile);
        MOBILE.setForeground(blue);
        EMAIL.setText(" "+csemail);
        EMAIL.setForeground(blue);
    }
    
    //search boc
    public void searchbox(){
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

        jPanel1 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        meter = new javax.swing.JButton();
        bill = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        com = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        EMAIL = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        MOBILE = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        NAME = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        ADDRESS = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        idlabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ctable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        updatet = new javax.swing.JButton();
        cnew = new javax.swing.JButton();
        searchtext = new javax.swing.JTextField();
        navi = new javax.swing.JLabel();
        vv = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(35, 31, 32));
        sidebar.setForeground(new java.awt.Color(51, 51, 51));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        sidebar.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 280, 50));

        meter.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        meter.setText("Meter Readings");
        meter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meterActionPerformed(evt);
            }
        });
        sidebar.add(meter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 50));

        bill.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        bill.setText("Billing Process");
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });
        sidebar.add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 280, 50));

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
        sidebar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jButton3.setText("Send Bills");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        sidebar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 280, 50));

        com.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        com.setText("Complaints");
        com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comActionPerformed(evt);
            }
        });
        sidebar.add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 280, 50));

        jPanel1.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 830));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EMAIL.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        EMAIL.setForeground(new java.awt.Color(102, 102, 255));
        EMAIL.setText("Email");
        EMAIL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel15.add(EMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 40));

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 320, 40));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MOBILE.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        MOBILE.setForeground(new java.awt.Color(102, 102, 255));
        MOBILE.setText("Mobile Number");
        MOBILE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel13.add(MOBILE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 40));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NAME.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        NAME.setForeground(new java.awt.Color(102, 102, 255));
        NAME.setText("Customer Name");
        NAME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel14.add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 40));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 320, 40));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ADDRESS.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ADDRESS.setForeground(new java.awt.Color(102, 102, 255));
        ADDRESS.setText("Customer Address");
        ADDRESS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel11.add(ADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 40));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 320, 40));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idlabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jPanel10.add(idlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, 40));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 90, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Mobile");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 150, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 220, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Customer Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 220, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 850, 650));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 210, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Email");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 220, 40));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setText("Customer ID  ");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 40));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 220, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Address");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 220, 40));

        updatet.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        updatet.setText("Refresh Table");
        updatet.setMaximumSize(new java.awt.Dimension(87, 33));
        updatet.setMinimumSize(new java.awt.Dimension(87, 33));
        updatet.setPreferredSize(new java.awt.Dimension(87, 33));
        updatet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatetActionPerformed(evt);
            }
        });
        jPanel1.add(updatet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, 310, 60));

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
        jPanel1.add(cnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 420, 80));

        searchtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        jPanel1.add(searchtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 50, 290, 50));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/side-bar.png"))); // NOI18N
        navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naviMouseClicked(evt);
            }
        });
        jPanel1.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        vv.setBackground(new java.awt.Color(51, 51, 51));
        vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vvMouseClicked(evt);
            }
        });
        jPanel1.add(vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 1160, 820));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1530, 890));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setText("jLabel1");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 290, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1520, 820));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("CUSTOMER DETAILS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 255));
        date.setText("date");
        jPanel5.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        time.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        time.setForeground(new java.awt.Color(102, 102, 255));
        time.setText("time");
        jPanel5.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 20));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 250, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grunge-illustration-hanging-light-bulbs-260nw-1161568426.jpg"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 240));

        setSize(new java.awt.Dimension(1518, 997));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updatetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatetActionPerformed
       tableload();
    }//GEN-LAST:event_updatetActionPerformed

    private void cnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnewActionPerformed
        //go to new customer registration form
        newCustomer1 n1 = new newCustomer1();
        n1.setVisible(true);
           
    }//GEN-LAST:event_cnewActionPerformed

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

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
       //go back admin home
        emphome a1 = new emphome();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void meterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meterActionPerformed
   
    }//GEN-LAST:event_meterActionPerformed

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        
    }//GEN-LAST:event_billActionPerformed

    private void naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naviMouseClicked
        navigationbar();
    }//GEN-LAST:event_naviMouseClicked

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SendBills s1 = new SendBills();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comActionPerformed
       complaints c1 = new complaints();
       c1.setvisible(true);
       this.dispose();
       
    }//GEN-LAST:event_comActionPerformed

    
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
            java.util.logging.Logger.getLogger(cusReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cusReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cusReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cusReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cusReg1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADDRESS;
    private javax.swing.JLabel EMAIL;
    private javax.swing.JLabel MOBILE;
    private javax.swing.JLabel NAME;
    private javax.swing.JButton bill;
    private javax.swing.JButton cnew;
    private javax.swing.JButton com;
    private javax.swing.JTable ctable;
    private javax.swing.JLabel date;
    private javax.swing.JButton home;
    private javax.swing.JLabel idlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton meter;
    private javax.swing.JLabel navi;
    private javax.swing.JTextField searchtext;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel time;
    private javax.swing.JButton updatet;
    private javax.swing.JLabel vv;
    // End of variables declaration//GEN-END:variables
}
