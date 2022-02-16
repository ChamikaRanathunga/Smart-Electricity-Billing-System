

package Interfaces;

import Codes.DBconnect;
import java.awt.Color;
import static java.awt.Color.blue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public final class empreg extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public empreg() {
        initComponents();
        nonactive();
         conn = DBconnect.connect();
       tableload();
       date();
       time();
       
    }//constructor

    //search box
    public void searchbox(){
        
        String srch = esearch.getText();
        
        try {
            String sql = "SELECT * FROM employee WHERE empname LIKE '%"+srch+"%' OR empid LIKE '%"+srch+"%' OR empnic LIKE '%"+srch+"%' OR empaddress LIKE '%"+srch+"%' OR empmobile LIKE '%"+srch+"%' OR empemail LIKE '%"+srch+"%' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            etable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //update
    public void update(){
        
       String eename = ename.getText();
       String eeid = empid.getText();
       String eenic = enic.getText();
       String eeaddress = eaddress.getText();
       String eeemail = eemail.getText();
       String eemobile = emobile.getText();
       
         try {
            String sql = "UPDATE employee SET empname='"+eename+"', empnic='"+eenic+"', empaddress='"+eeaddress+"', empmobile='"+eemobile+"', empemail='"+eeemail+"' WHERE empid='"+eeid+"' "; 
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
            String id = empid.getText();
            try {
                String sql = "DELETE FROM employee WHERE empid='"+id+"'";
                pst = conn.prepareStatement(sql);
                pst.execute();
               
                JOptionPane.showMessageDialog(null, "Data Successfully deleted!!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Delete Failed!!!");
            }
        }
    }
    
    //get table data
    public void tabledata(){
        
        int r = etable.getSelectedRow();
        String emname = etable.getValueAt(r, 0).toString();
        String emid = etable.getValueAt(r, 1).toString();
        String emnic = etable.getValueAt(r, 2).toString();
        String emaddress = etable.getValueAt(r, 3).toString();
        String emmobile = etable.getValueAt(r, 4).toString();
        String ememail = etable.getValueAt(r, 5).toString();
           
        ename.setText(" "+emname);
        ename.setForeground(Color.blue);
        empid.setText(emid);
        empid.setForeground(Color.blue);
        enic.setText(" "+emnic);
        enic.setForeground(Color.blue);
        eaddress.setText(" "+emaddress);
        eaddress.setForeground(Color.blue);
        emobile.setText(" "+emmobile);
        emobile.setForeground(Color.blue);
        eemail.setText(" "+ememail);
        eemail.setForeground(Color.blue);
    }
    
     //table load from database
    public void tableload(){
        
        try {           
            String sql = "SELECT empname, empid, empnic, empaddress, empmobile, empemail FROM employee";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) etable.getModel();
           dtm.setRowCount(0);

          while(rs.next()){
              Vector v = new Vector();
              v.add(rs.getString("empname"));
              v.add(rs.getString("empid"));
              v.add(rs.getString("empnic"));
              v.add(rs.getString("empaddress"));
              v.add(rs.getString("empmobile"));
              v.add(rs.getString("empemail"));
              dtm.addRow(v);
          }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //clear fields
    public void clear(){
        
        esearch.setText("");
        empid.setText("");
        ename.setText("");
        enic.setText("");
        eaddress.setText("");
        eemail.setText("");
        emobile.setText("");
    }
    
    //date
    public void date() {
        
      Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date.setText(s.format(d));
    }
    
    //time
   public void time() {
       
       new Timer(0, new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
              Date d = new Date();
              SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
              time.setText(s.format(d));
           }
       }).start();     
   }
 
    public void nonactive() {
       sidebar.setVisible(false);
       sidebar.setEnabled(false);
       vv.setVisible(false);
       vv.setEnabled(false);
       navi.setVisible(true);
       navi.setEnabled(true);      
   } 
    
   public void navigationbar() {
       
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
        eback = new javax.swing.JButton();
        f = new javax.swing.JButton();
        c = new javax.swing.JButton();
        d = new javax.swing.JButton();
        e = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        navi = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        enic = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        eaddress = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emobile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        etable = new javax.swing.JTable();
        eclear = new javax.swing.JButton();
        vv = new javax.swing.JLabel();
        addnew = new javax.swing.JButton();
        eupdate = new javax.swing.JButton();
        edelete = new javax.swing.JButton();
        eemail = new javax.swing.JTextField();
        esearch = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        empid = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 790));
        setSize(new java.awt.Dimension(1150, 790));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 790));
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

        f.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        f.setText("Feedbacks");
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        sidebar.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 280, 50));

        c.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        c.setText("Customer Details");
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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 180, -1));

        jPanel1.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 840));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/side-bar.png"))); // NOI18N
        navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naviMouseClicked(evt);
            }
        });
        jPanel1.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 60));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("NIC Number");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 160, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 230, 40));

        ename.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ename.setForeground(new java.awt.Color(102, 102, 255));
        ename.setText(" Enter Employee name");
        ename.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        ename.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enameFocusLost(evt);
            }
        });
        ename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enameActionPerformed(evt);
            }
        });
        ename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enameKeyTyped(evt);
            }
        });
        jPanel1.add(ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 280, 40));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Email");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 90, 40));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 230, 40));

        enic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enic.setForeground(new java.awt.Color(102, 102, 255));
        enic.setText(" Enter NIC number");
        enic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        enic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enicFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enicFocusLost(evt);
            }
        });
        enic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enicActionPerformed(evt);
            }
        });
        enic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enicKeyTyped(evt);
            }
        });
        jPanel1.add(enic, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 280, 40));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Mobile");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 40));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 230, 40));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Address");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 40));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 230, 40));

        eaddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eaddress.setForeground(new java.awt.Color(102, 102, 255));
        eaddress.setText(" Enter address");
        eaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        eaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eaddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                eaddressFocusLost(evt);
            }
        });
        eaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eaddressKeyTyped(evt);
            }
        });
        jPanel1.add(eaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 280, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel8.setText("Employee ID ");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 230, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 210, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Employee Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 230, 40));

        emobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emobile.setForeground(new java.awt.Color(102, 102, 255));
        emobile.setText(" Enter mobile number");
        emobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        emobile.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                emobileComponentAdded(evt);
            }
        });
        emobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emobileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emobileFocusLost(evt);
            }
        });
        emobile.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                emobileComponentShown(evt);
            }
        });
        emobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emobileActionPerformed(evt);
            }
        });
        emobile.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                emobilePropertyChange(evt);
            }
        });
        emobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emobileKeyTyped(evt);
            }
        });
        jPanel1.add(emobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 280, 40));

        etable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee Name", "Employee ID", "NIC", "Employee Address", "Mobile", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        etable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etableMouseClicked(evt);
            }
        });
        etable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                etableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(etable);
        if (etable.getColumnModel().getColumnCount() > 0) {
            etable.getColumnModel().getColumn(1).setPreferredWidth(5);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 870, 660));

        eclear.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        eclear.setText("Clear");
        eclear.setToolTipText("");
        eclear.setMaximumSize(new java.awt.Dimension(87, 33));
        eclear.setMinimumSize(new java.awt.Dimension(87, 33));
        eclear.setPreferredSize(new java.awt.Dimension(87, 33));
        eclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eclearActionPerformed(evt);
            }
        });
        jPanel1.add(eclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 320, 50));

        vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vvMouseClicked(evt);
            }
        });
        jPanel1.add(vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 1190, 870));

        addnew.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        addnew.setText("Register New");
        addnew.setMaximumSize(new java.awt.Dimension(87, 33));
        addnew.setMinimumSize(new java.awt.Dimension(87, 33));
        addnew.setPreferredSize(new java.awt.Dimension(87, 33));
        addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewActionPerformed(evt);
            }
        });
        jPanel1.add(addnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 400, 90));

        eupdate.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        eupdate.setText("Update Details");
        eupdate.setMaximumSize(new java.awt.Dimension(87, 33));
        eupdate.setMinimumSize(new java.awt.Dimension(87, 33));
        eupdate.setPreferredSize(new java.awt.Dimension(87, 33));
        eupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eupdateActionPerformed(evt);
            }
        });
        jPanel1.add(eupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 320, 50));

        edelete.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        edelete.setText("Remove Details");
        edelete.setMaximumSize(new java.awt.Dimension(87, 33));
        edelete.setMinimumSize(new java.awt.Dimension(87, 33));
        edelete.setPreferredSize(new java.awt.Dimension(87, 33));
        edelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edeleteActionPerformed(evt);
            }
        });
        jPanel1.add(edelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, 320, 50));

        eemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eemail.setForeground(new java.awt.Color(102, 102, 255));
        eemail.setText(" Enter email");
        eemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        eemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                eemailFocusLost(evt);
            }
        });
        eemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eemailKeyTyped(evt);
            }
        });
        jPanel1.add(eemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 280, 40));

        esearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        esearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esearchActionPerformed(evt);
            }
        });
        esearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                esearchKeyReleased(evt);
            }
        });
        jPanel1.add(esearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 80, 280, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empid.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jPanel4.add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 80, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 850));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1530, 840));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("EMPLOYEE DETAILS");
        jLabel6.setToolTipText("");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 570, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 90));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 255));
        date.setText("date");
        jPanel11.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        time.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        time.setForeground(new java.awt.Color(102, 102, 255));
        time.setText("time");
        jPanel11.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 20));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 230, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grunge-illustration-hanging-light-bulbs-260nw-1161568426.jpg"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 130));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 970));

        setSize(new java.awt.Dimension(1518, 997));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void esearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esearchActionPerformed
        
    }//GEN-LAST:event_esearchActionPerformed

    private void eclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eclearActionPerformed
        clear();       
    }//GEN-LAST:event_eclearActionPerformed

    private void esearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esearchKeyReleased
        //search box
        searchbox();   
    }//GEN-LAST:event_esearchKeyReleased

    private void addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewActionPerformed
      //employee registration form
       newEmp n1 = new newEmp();
       n1.setVisible(true);   
    }//GEN-LAST:event_addnewActionPerformed

    private void eupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eupdateActionPerformed
       update();
       tableload(); 
       clear();
       JOptionPane.showMessageDialog(null, "Data Updated Successfully!!!");      
    }//GEN-LAST:event_eupdateActionPerformed

    private void edeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edeleteActionPerformed
       delete();
       tableload();
       clear();      
    }//GEN-LAST:event_edeleteActionPerformed

    private void ebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebackActionPerformed
        //go back admin home 
         AdminHome a1 = new AdminHome();
            a1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_ebackActionPerformed

    private void etableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etableKeyReleased
        tabledata();
    }//GEN-LAST:event_etableKeyReleased

    private void etableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etableMouseClicked
        tabledata();
    }//GEN-LAST:event_etableMouseClicked

    private void enameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enameFocusGained
       
	if(ename.getText().equals(" Enter Employee name"))
        {
        ename.setText("");
        ename.setForeground(new Color(102,102,225));
        }    
    }//GEN-LAST:event_enameFocusGained

    private void enameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enameFocusLost
        if(ename.getText().equals(""))
        {
        ename.setText(" Enter Employee name");
        ename.setForeground(new Color(102,102,225));
        }
    }//GEN-LAST:event_enameFocusLost

    private void enameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enameKeyTyped
         ename.setForeground(blue);
    }//GEN-LAST:event_enameKeyTyped

    private void enicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enicFocusGained
      if(enic.getText().equals(" Enter NIC number"))
        {
        enic.setText("");
        enic.setForeground(new Color(102,102,225));
        }      
    }//GEN-LAST:event_enicFocusGained

    private void enicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enicActionPerformed
       
    }//GEN-LAST:event_enicActionPerformed

    private void enicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enicFocusLost
       
         if(enic.getText().equals(""))
        {
        enic.setText(" Enter NIC number");
        enic.setForeground(new Color(102,102,225));
        }
    }//GEN-LAST:event_enicFocusLost

    private void eaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eaddressFocusGained
   
        if(eaddress.getText().equals(" Enter address"))
        {
        eaddress.setText("");
        eaddress.setForeground(new Color(102,102,225));
        }      
    }//GEN-LAST:event_eaddressFocusGained

    private void eaddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eaddressFocusLost
        
        if(eaddress.getText().equals(""))
        {
        eaddress.setText(" Enter address");
        eaddress.setForeground(new Color(102,102,225));
        }
    }//GEN-LAST:event_eaddressFocusLost

    private void eemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eemailFocusGained
         if(eemail.getText().equals(" Enter email"))
        {
        eemail.setText("");
        eemail.setForeground(new Color(102,102,225));
        }
        
    }//GEN-LAST:event_eemailFocusGained

    private void eemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eemailFocusLost
          if(eemail.getText().equals(""))
        {
        eemail.setText(" Enter email");
        eemail.setForeground(new Color(102,102,225));
        }
    }//GEN-LAST:event_eemailFocusLost

    private void enameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enameActionPerformed
      
    }//GEN-LAST:event_enameActionPerformed

    private void eaddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eaddressKeyTyped
       eaddress.setForeground(blue);
    }//GEN-LAST:event_eaddressKeyTyped

    private void enicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enicKeyTyped
       enic.setForeground(blue);
    }//GEN-LAST:event_enicKeyTyped

    private void emobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emobileFocusGained
        if(emobile.getText().equals(" Enter mobile number"))
        {
        emobile.setText("");
        emobile.setForeground(new Color(102,102,225));
        }      
    }//GEN-LAST:event_emobileFocusGained

    private void emobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emobileFocusLost
          if(emobile.getText().equals(""))
        {
        emobile.setText(" Enter mobile number");
        emobile.setForeground(new Color(102,102,225));
        }
    }//GEN-LAST:event_emobileFocusLost

    private void emobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emobileKeyTyped
       
    }//GEN-LAST:event_emobileKeyTyped

    private void eemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eemailKeyTyped
        eemail.setForeground(blue);
    }//GEN-LAST:event_eemailKeyTyped

    private void naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naviMouseClicked
        navigationbar();
    }//GEN-LAST:event_naviMouseClicked

    private void vvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vvMouseClicked
        nonactive();
    }//GEN-LAST:event_vvMouseClicked

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        Bsummary m1 = new Bsummary();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        cusReg c1 = new cusReg();
        setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        complaints1 c2 = new complaints1();
        c2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        feedback s1 = new feedback();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fActionPerformed

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

    private void emobileComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_emobileComponentAdded
 
    }//GEN-LAST:event_emobileComponentAdded

    private void emobileComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_emobileComponentShown

    }//GEN-LAST:event_emobileComponentShown

    private void emobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emobileActionPerformed

    }//GEN-LAST:event_emobileActionPerformed

    private void emobilePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_emobilePropertyChange

    }//GEN-LAST:event_emobilePropertyChange

    
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
            java.util.logging.Logger.getLogger(empreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empreg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnew;
    private javax.swing.JButton c;
    private javax.swing.JButton d;
    private javax.swing.JLabel date;
    private javax.swing.JButton e;
    private javax.swing.JTextField eaddress;
    private javax.swing.JButton eback;
    private javax.swing.JButton eclear;
    private javax.swing.JButton edelete;
    private javax.swing.JTextField eemail;
    private javax.swing.JTextField emobile;
    private javax.swing.JLabel empid;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField enic;
    private javax.swing.JTextField esearch;
    private javax.swing.JTable etable;
    private javax.swing.JButton eupdate;
    private javax.swing.JButton f;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel time;
    private javax.swing.JLabel vv;
    // End of variables declaration//GEN-END:variables

    private static class TimerImpl extends Timer {

        public TimerImpl(int delay, ActionListener listener) {
            super(delay, listener);
        }
    }
}
