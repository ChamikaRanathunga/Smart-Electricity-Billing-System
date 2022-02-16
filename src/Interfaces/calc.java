package Interfaces;

import Codes.DBconnect;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class calc extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public calc() {
        initComponents();
        conn = DBconnect.connect();
        nonactive();
        date();
        time();
    }

   public void date() {

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date2.setText(s.format(d));
    }

    public void time() {

        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                time2.setText(s.format(d));
            }
        }).start();
    } 
    
    public void insertdata(){
        
         String cid = id.getText();
         String date = bdate.getText();
         
      try{   
         String sql = "insert into bill (billdate) values ('"+date+"') where cid = '"+cid+"'";
          pst = conn.prepareStatement(sql);
          pst.execute();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }}
    
      public void insertdata1(){
          
        String bunit = unit.getText();
        String bamount = amount.getText();
        String ccid = id.getText();
        
          try {
            String sql = "insert into bill (units, billamount) values ('"+bunit+"','"+bamount+"') where cid '"+ccid+"'";
          } catch (Exception e) {
              
          }}
        
      public void preading(){
          String cid = id.getText();
          try{
        String sql = "select from reading where cid = '"+cid+"'";
          
      }catch(Exception e){
          
      }}
      
      
      public void creading(){
       
          try {
              
          } catch (Exception e) {
              
          }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        eback = new javax.swing.JButton();
        c = new javax.swing.JButton();
        d = new javax.swing.JButton();
        e = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        view1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        view2 = new javax.swing.JButton();
        j11 = new javax.swing.JLabel();
        unit = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        done = new javax.swing.JButton();
        c2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        bdate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        navi = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        vv = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        date2 = new javax.swing.JLabel();
        time2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/light_bulbs_electricity_lighting_128854_1920x1200.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
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

        c.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        c.setText("Meter Readings");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        sidebar.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 280, 50));

        d.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        d.setText("Customer Details");
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        sidebar.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 50));

        e.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        e.setText("Complaints");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        sidebar.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 280, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        sidebar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 260, 50));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        sidebar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, 260, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 180, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        jPanel1.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 840));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Previous Meter Reading");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 310, 50));

        t1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(102, 102, 255));
        t1.setText(" Enter previous Meter Reading");
        t1.setBorder(null);
        t1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t1FocusLost(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 410, 50));

        view1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        view1.setText("Get Reading");
        view1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view1ActionPerformed(evt);
            }
        });
        jPanel1.add(view1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 240, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Bill Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 300, 50));

        t.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t.setForeground(new java.awt.Color(102, 102, 255));
        t.setText(" Enter current Meter Reading");
        t.setBorder(null);
        t.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFocusLost(evt);
            }
        });
        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });
        t.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tKeyTyped(evt);
            }
        });
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 410, 50));

        view2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        view2.setText("Get Reading");
        view2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view2ActionPerformed(evt);
            }
        });
        jPanel1.add(view2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 230, 240, 50));

        j11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        j11.setText("No of units(KWH)");
        jPanel1.add(j11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, 50));

        unit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unit.setBorder(null);
        unit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unitFocusLost(evt);
            }
        });
        unit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                unitMouseReleased(evt);
            }
        });
        unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitActionPerformed(evt);
            }
        });
        unit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unitKeyTyped(evt);
            }
        });
        jPanel1.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 410, 50));

        amount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        amount.setBorder(null);
        amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                amountFocusLost(evt);
            }
        });
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, 410, 50));

        done.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        done.setText("Done");
        done.setMaximumSize(new java.awt.Dimension(87, 33));
        done.setMinimumSize(new java.awt.Dimension(87, 33));
        done.setPreferredSize(new java.awt.Dimension(87, 33));
        done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneMouseClicked(evt);
            }
        });
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        done.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                doneKeyTyped(evt);
            }
        });
        jPanel1.add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 200, 50));

        c2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Select from here", "28", "29", "30", "31", "32" }));
        c2.setBorder(null);
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 410, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Bill Amount(LKR)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, -1, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Customer ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 180, 50));

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(102, 102, 255));
        id.setText(" Enter customer ID");
        id.setBorder(null);
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 410, 50));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("No of Days");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 50));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 320, 50));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 320, 50));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 320, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 320, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 320, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 320, 50));

        add.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        add.setText("Add");
        add.setMaximumSize(new java.awt.Dimension(87, 33));
        add.setMinimumSize(new java.awt.Dimension(87, 33));
        add.setPreferredSize(new java.awt.Dimension(87, 33));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 670, 190, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Current Meter Reading");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 300, 50));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 320, 50));

        bdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bdate.setForeground(new java.awt.Color(102, 102, 255));
        bdate.setText(" Enter Date");
        bdate.setBorder(null);
        bdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bdateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bdateFocusLost(evt);
            }
        });
        bdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bdateKeyTyped(evt);
            }
        });
        jPanel1.add(bdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 410, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Send Bills");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 530, 240, 100));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/side-bar.png"))); // NOI18N
        navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naviMouseClicked(evt);
            }
        });
        jPanel1.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1590, 930));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel14.setText("Bill Date");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 300, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1520, 840));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Electricity Bill Calculator");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 730, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vvMouseClicked(evt);
            }
        });
        jPanel2.add(vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 1140, 820));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        date2.setForeground(new java.awt.Color(102, 102, 255));
        date2.setText("date");
        jPanel3.add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 40));

        time2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        time2.setForeground(new java.awt.Color(102, 102, 255));
        time2.setText("time");
        jPanel3.add(time2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 120, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 270, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grunge-illustration-hanging-light-bulbs-260nw-1161568426.jpg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 390, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 130));

        setSize(new java.awt.Dimension(1518, 997));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
            
            
            double totbill = 0;
            //double days = Double.parseDouble(c2.getSelectedIndex());
            double PMR = Double.parseDouble(t1.getText());
            double CMR = Double.parseDouble(t.getText());
            
            double nounits = CMR-PMR;
            
            unit.setText(String.valueOf(nounits));
            unit.setForeground(Color.black);
            
            
            if(c2.getSelectedItem().equals("30")){
            
            if (nounits <= 60 ) {
                if((nounits >= 1)&&(nounits<=30)){
                    totbill = (2.5 * nounits) + 30.00;
                }
                
                else if((nounits >= 31)&&(nounits<=60)){
                    totbill = (30*2.50) + ((nounits -30)*4.85) + 60.00;
                }
                
            }
            
            
            else if (nounits >= 61){
                if((nounits>=61)&&(nounits<=90)){
                    totbill = (60*7.85)+((nounits-60)*10)+90.00;
                }
                
                else if((nounits>=91)&&(nounits<=120)){
                    totbill =(60*7.85)+ (30*10.00)+((nounits-90)*27.75)+480.00;
                }
                
                else if((nounits>=121)&&(nounits<=180)){
                    totbill =(60*7.85)+ (30*10.00)+(30*27.75)+((nounits-120)*32.00)+480.00;
                }
                else if(nounits>=181){
                    totbill =(60*7.85)+ (30*10.00)+(30*27.75)+(60*32.00)+((nounits-180)*45.00)+540.00;
                }
                
            }
                 
                amount.setText(String.valueOf(totbill));
                amount.setForeground(Color.black);
            
    }//GEN-LAST:event_doneActionPerformed
            else if(c2.getSelectedItem().equals("28")){
                if (nounits <= 60 ) {
                if((nounits >= 1)&&(nounits<=30)){
                    totbill = (3.5 * nounits) + 20.00;
                }
                
                else if((nounits >= 31)&&(nounits<=60)){
                    totbill = (35*2.50) + ((nounits -30)*4.85) + 62.00;
                }
                
            }
            
            
            else if (nounits >= 61){
                if((nounits>=61)&&(nounits<=90)){
                    totbill = (65*7.85)+((nounits-65)*10)+95.00;
                }
                
                else if((nounits>=91)&&(nounits<=120)){
                    totbill =(68*7.85)+ (32*10.00)+((nounits-90)*27.75)+485.00;
                }
                
                else if((nounits>=121)&&(nounits<=180)){
                    totbill =(68*7.85)+ (32*10.00)+(30*27.75)+((nounits-120)*32.00)+480.00;
                }
                else if(nounits>=181){
                    totbill =(68*7.85)+ (32*10.00)+(30*27.75)+(60*32.00)+((nounits-180)*45.00)+540.00;
                }
                
            }
                
                
                amount.setText(String.valueOf(totbill));
                amount.setForeground(Color.black);
                
            }
            else if(c2.getSelectedItem().equals("29")){
                if (nounits <= 60 ) {
                if((nounits >= 1)&&(nounits<=30)){
                    totbill = (3.5 * nounits) + 20.00;
                }
                
                else if((nounits >= 31)&&(nounits<=60)){
                    totbill = (35*2.50) + ((nounits -30)*4.85) + 62.00;
                }
                
            }
            
            
            
            else if (nounits >= 61){
                if((nounits>=61)&&(nounits<=90)){
                    totbill = (65*7.85)+((nounits-65)*10)+95.00;
                }
                
                else if((nounits>=91)&&(nounits<=120)){
                    totbill =(68*7.85)+ (32*10.00)+((nounits-90)*27.75)+485.00;
                }
                
                else if((nounits>=121)&&(nounits<=180)){
                    totbill =(68*7.85)+ (32*10.00)+(30*27.75)+((nounits-120)*32.00)+480.00;
                }
                else if(nounits>=181){
                    totbill =(68*7.85)+ (32*10.00)+(30*27.75)+(60*32.00)+((nounits-180)*45.00)+540.00;
                }
                
            }
                
                
                amount.setText(String.valueOf(totbill));
                amount.setForeground(Color.black);
                
            }
            else if(c2.getSelectedItem().equals("31")){
                if (nounits <= 60 ) {
                if((nounits >= 1)&&(nounits<=30)){
                    totbill = (3.5 * nounits) + 20.00;
                }
                
                else if((nounits >= 31)&&(nounits<=60)){
                    totbill = (35*2.50) + ((nounits -30)*4.85) + 62.00;
                }
                
            }
            
                        
            else if (nounits >= 61){
                if((nounits>=61)&&(nounits<=90)){
                    totbill = (65*7.85)+((nounits-65)*10)+95.00;
                }
                
                else if((nounits>=91)&&(nounits<=120)){
                    totbill =(68*7.85)+ (32*10.00)+((nounits-90)*27.75)+485.00;
                }
                
                else if((nounits>=121)&&(nounits<=180)){
                    totbill =(68*7.85)+ (32*10.00)+(30*27.75)+((nounits-120)*32.00)+480.00;
                }
                else if(nounits>=181){
                    totbill =(68*7.85)+ (32*10.00)+(30*27.75)+(60*32.00)+((nounits-180)*45.00)+540.00;
                }
                
            }
                
                
                amount.setText(String.valueOf(totbill));
                amount.setForeground(Color.black);
                
            }
            
            else if(c2.getSelectedItem().equals("32")){
                if (nounits <= 60 ) {
                if((nounits >= 1)&&(nounits<=30)){
                    totbill = (3.5 * nounits) + 20.00;
                }
                
                else if((nounits >= 31)&&(nounits<=60)){
                    totbill = (35*2.50) + ((nounits -30)*4.85) + 62.00;
                }
                
            }
            
            
                        else if (nounits >= 61){
                if((nounits>=61)&&(nounits<=90)){
                    totbill = (65*7.85)+((nounits-65)*10)+95.00;
                }
                
                else if((nounits>=91)&&(nounits<=120)){
                    totbill =(68*7.85)+ (32*10.00)+((nounits-90)*27.75)+485.00;
                }
                
                else if((nounits>=121)&&(nounits<=180)){
                    totbill =(68*7.85)+ (32*10.00)+(30*27.75)+((nounits-120)*32.00)+480.00;
                }
                else if(nounits>=181){
                    totbill =(68*7.85)+ (32*10.00)+(30*27.75)+(60*32.00)+((nounits-180)*45.00)+540.00;
                }
                
            }
                
                
               amount.setText(String.valueOf(totbill));
               amount.setForeground(Color.black);
            }}
            
    //insert data to the bill table
    
   
    
    
            
    private void unitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitKeyTyped
       
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_unitKeyTyped

    private void doneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doneKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_doneKeyTyped

    private void unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitActionPerformed

    private void view2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view2ActionPerformed

    private void view1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view1ActionPerformed
       
    }//GEN-LAST:event_view1ActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
       
	if(id.getText().equals(" Enter customer ID"))
        {
        id.setText("");
        id.setForeground(new Color(102,102,255));
        }
                
    }//GEN-LAST:event_idFocusGained

    private void idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusLost
       if(id.getText().equals(""))
        {
        id.setText(" Enter customer ID");
        id.setForeground(new Color(102,102,255));
        }

        
    }//GEN-LAST:event_idFocusLost

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
       
        id.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_idKeyTyped

    private void t1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t1FocusGained
       if(t1.getText().equals(" Enter previous Meter Reading"))
        {
        t1.setText("");
        t1.setForeground(new Color(102,102,255));
        }
      
        
    }//GEN-LAST:event_t1FocusGained

    private void t1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t1FocusLost
        if(t1.getText().equals(""))
        {
        t1.setText(" Enter previous Meter Reading");
        t1.setForeground(new Color(102,102,255));
        }       
    }//GEN-LAST:event_t1FocusLost

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
       
          t1.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_t1KeyTyped

    private void tFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFocusGained
       if(t.getText().equals(" Enter current Meter Reading"))
        {
        t.setText("");
        t.setForeground(new Color(102,102,255));
        }       
    }//GEN-LAST:event_tFocusGained

    private void tFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFocusLost
       if(t.getText().equals(""))
        {
        t.setText(" Enter current Meter Reading");
        t.setForeground(new Color(102,102,255));
        }
        
    }//GEN-LAST:event_tFocusLost

    private void tKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tKeyTyped
       
        t.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_tKeyTyped

    private void unitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unitFocusGained
      //******************
    }//GEN-LAST:event_unitFocusGained

    private void unitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unitFocusLost
       //***************** 
    }//GEN-LAST:event_unitFocusLost

    private void unitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unitMouseReleased
      //*******************
    }//GEN-LAST:event_unitMouseReleased

    private void amountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountFocusGained
       //***************************
    }//GEN-LAST:event_amountFocusGained

    private void amountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountFocusLost
      //**************************
    }//GEN-LAST:event_amountFocusLost

    private void bdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bdateFocusGained
       if(bdate.getText().equals("enter date"))
        {
        bdate.setText("");
        bdate.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_bdateFocusGained

    private void bdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bdateFocusLost
        if(bdate.getText().equals(""))
        {
        bdate.setText("enter date");
        bdate.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_bdateFocusLost

    private void bdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bdateKeyTyped
         bdate.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_bdateKeyTyped

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        insertdata1();
      
    }//GEN-LAST:event_addActionPerformed

    private void doneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneMouseClicked
        insertdata();
    }//GEN-LAST:event_doneMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SendBills1 s1 = new SendBills1();
        s1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naviMouseClicked
        navigationbar();
    }//GEN-LAST:event_naviMouseClicked

    private void ebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebackActionPerformed
        //go back EMPLOYEE home
       
    }//GEN-LAST:event_ebackActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
     
    }//GEN-LAST:event_cActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
       cusReg1 m1 = new cusReg1();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        complaints c2 = new complaints();
        c2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eActionPerformed

    private void vvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vvMouseClicked
        nonactive();
    }//GEN-LAST:event_vvMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int check = JOptionPane.showConfirmDialog(null, "Do you want to Log Out?");
        
        if (check == 0){
           Login l = new Login();
           l.setVisible(true);
           this.dispose();
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField bdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton c;
    private javax.swing.JComboBox c2;
    private javax.swing.JButton d;
    private javax.swing.JLabel date2;
    private javax.swing.JButton done;
    private javax.swing.JButton e;
    private javax.swing.JButton eback;
    private javax.swing.JTextField id;
    private javax.swing.JLabel j11;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel navi;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTextField t;
    private javax.swing.JTextField t1;
    private javax.swing.JLabel time2;
    private javax.swing.JTextField unit;
    private javax.swing.JButton view1;
    private javax.swing.JButton view2;
    private javax.swing.JLabel vv;
    // End of variables declaration//GEN-END:variables
}
