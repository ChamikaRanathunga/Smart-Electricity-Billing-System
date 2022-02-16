package Interfaces;

import Codes.DBconnect;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Bsummary extends javax.swing.JFrame {
   
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    
    public Bsummary() {
        initComponents();
        nonactive();
        conn = DBconnect.connect();
        tableload();
         date();
         time();
    }

    public void tableload() {
        try {
            ResultSet rs = DBconnect.search("select c.cid, c.cusemail,c.cusname, b.billid,b.billamount, b.units, b.billdate from customerreg c inner join bill b on c.cid = b.cid ");
            DefaultTableModel dtm  = (DefaultTableModel)btable.getModel();
            dtm.setRowCount(0);
            
            while (rs.next()) {                
                Vector v = new Vector();
                v.add(rs.getString("c.cusname"));
                v.add(rs.getString("c.cid"));
                v.add(rs.getString("b.billid"));
                v.add(rs.getString("b.units"));
                v.add(rs.getString("b.billamount"));
                v.add(rs.getString("b.billdate"));
                
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
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
    
        public void delete(){
        
        int check = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
        
        if (check == 0){
             int r = btable.getSelectedRow();
           String id = btable.getValueAt(r, 1).toString();
            try {
                String sql = "DELETE FROM bill WHERE cid='"+id+"'";
                pst = conn.prepareStatement(sql);
                pst.execute();
               
                JOptionPane.showMessageDialog(null, "Data Successfully deleted!!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Delete Failed!!!");
            }
        }
    }
    
        public void update(){   
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
        jPanel2 = new javax.swing.JPanel();
        vv = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        adhome = new javax.swing.JButton();
        feedb = new javax.swing.JButton();
        emp = new javax.swing.JButton();
        com = new javax.swing.JButton();
        cus = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btable = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        navi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vvMouseClicked(evt);
            }
        });
        jPanel2.add(vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 1160, 820));

        sidebar.setBackground(new java.awt.Color(35, 31, 32));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adhome.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        adhome.setText("Home");
        adhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adhomeActionPerformed(evt);
            }
        });
        sidebar.add(adhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 280, 50));

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

        com.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        com.setText("Complaints");
        com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comActionPerformed(evt);
            }
        });
        sidebar.add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 280, 50));

        cus.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        cus.setText("Customer Details");
        cus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusActionPerformed(evt);
            }
        });
        sidebar.add(cus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 50));

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 180, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        jPanel2.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 840));

        btable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer Name", "Customer ID", "Bill ID", "Units", "Bill Amount", "Issue Date", "Payment Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(btable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 1020, 720));

        delete.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        delete.setText("Delete Record");
        delete.setMaximumSize(new java.awt.Dimension(87, 33));
        delete.setMinimumSize(new java.awt.Dimension(87, 33));
        delete.setPreferredSize(new java.awt.Dimension(87, 33));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 200, 230, 60));

        update.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        update.setText("Update Table");
        update.setMaximumSize(new java.awt.Dimension(87, 33));
        update.setMinimumSize(new java.awt.Dimension(87, 33));
        update.setPreferredSize(new java.awt.Dimension(87, 33));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 360, 230, 60));

        edit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        edit.setText("Edit Details");
        edit.setMaximumSize(new java.awt.Dimension(87, 33));
        edit.setMinimumSize(new java.awt.Dimension(87, 33));
        edit.setPreferredSize(new java.awt.Dimension(87, 33));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel2.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 280, 230, 60));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/side-bar.png"))); // NOI18N
        navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naviMouseClicked(evt);
            }
        });
        jPanel2.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 920));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1530, 840));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Billing Process Records");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 830, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 90));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        time.setForeground(new java.awt.Color(102, 102, 255));
        time.setText("jLabel2");
        jPanel4.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 120, 40));

        date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 255));
        date.setText("jLabel2");
        jPanel4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 260, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grunge-illustration-hanging-light-bulbs-260nw-1161568426.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1518, 997));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        tableload();
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        delete();
    }//GEN-LAST:event_deleteActionPerformed

    private void naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naviMouseClicked
        navigationbar();

    }//GEN-LAST:event_naviMouseClicked

    private void adhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adhomeActionPerformed
        //go back admin home
        AdminHome a1 = new AdminHome();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adhomeActionPerformed

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

    private void comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comActionPerformed
       complaints1 m1 = new complaints1();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_comActionPerformed

    private void cusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusActionPerformed
        cusReg c2 = new cusReg();
        c2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cusActionPerformed

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

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        summary s = new summary();
        s.setVisible(true);
    }//GEN-LAST:event_editActionPerformed
    
    
    
    
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
            java.util.logging.Logger.getLogger(Bsummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bsummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bsummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bsummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bsummary().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adhome;
    private javax.swing.JTable btable;
    private javax.swing.JButton com;
    private javax.swing.JButton cus;
    private javax.swing.JLabel date;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton emp;
    private javax.swing.JButton feedb;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel navi;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel time;
    private javax.swing.JButton update;
    private javax.swing.JLabel vv;
    // End of variables declaration//GEN-END:variables
}
