

package Interfaces;

import java.awt.event.ActionEvent;
import Codes.DBconnect;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


public class feedback extends javax.swing.JFrame {

   Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public feedback() {
        initComponents();
        nonactive();
        //tableload();
        date();
        time();
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
   
 /*  public void tableload(){
       try{
       String sql = "select cname, mobile, fback from feedback";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) ftable.getModel();
            dtm.setRowCount(0);
       
             while(rs.next()){
              Vector v = new Vector();
              v.add(rs.getString("cname"));
              v.add(rs.getString("mobile"));
              v.add(rs.getString("fback"));
           
       
              dtm.addRow(v);
   
   }}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}
   
} */  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        com = new javax.swing.JButton();
        emplo = new javax.swing.JButton();
        bsum = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        navi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ftable = new javax.swing.JTable();
        vv = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(35, 31, 32));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        sidebar.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 280, 50));

        com.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        com.setText("Complaints");
        com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comActionPerformed(evt);
            }
        });
        sidebar.add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 280, 50));

        emplo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        emplo.setText("Employee Details");
        emplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emploActionPerformed(evt);
            }
        });
        sidebar.add(emplo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 280, 50));

        bsum.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        bsum.setText("Billing Summary");
        bsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsumActionPerformed(evt);
            }
        });
        sidebar.add(bsum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 280, 50));

        customer.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        customer.setText("Customer Details");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        sidebar.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 50));

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

        jPanel4.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 840));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/side-bar.png"))); // NOI18N
        navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naviMouseClicked(evt);
            }
        });
        jPanel4.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        ftable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ftable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null}
            },
            new String [] {
                "Customer Name", "Mobile Number/Email", "Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ftable);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 1090, 660));

        vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vvMouseClicked(evt);
            }
        });
        jPanel4.add(vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 1160, 820));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1530, 890));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1530, 840));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Mobile Number", "Feedback", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setHeaderValue("");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 1030, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1530, 840));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Customer Feedbacks");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 660, 70));

        date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 255));
        date.setText("jLabel2");
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 100, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        time.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        time.setForeground(new java.awt.Color(102, 102, 255));
        time.setText("jLabel2");
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 10, 100, 20));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 200, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grunge-illustration-hanging-light-bulbs-260nw-1161568426.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 130));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 970));

        setSize(new java.awt.Dimension(1518, 997));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naviMouseClicked
        navigationbar();
    }//GEN-LAST:event_naviMouseClicked

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        //go back admin home
        AdminHome a1 = new AdminHome();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comActionPerformed
        complaints1 s1 = new complaints1();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_comActionPerformed

    private void emploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emploActionPerformed
        empreg e1 = new empreg();
        e1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_emploActionPerformed

    private void bsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsumActionPerformed
        Bsummary m1 = new Bsummary();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsumActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        cusReg c2 = new cusReg();
        c2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customerActionPerformed

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
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsum;
    private javax.swing.JButton com;
    private javax.swing.JButton customer;
    private javax.swing.JLabel date;
    private javax.swing.JButton emplo;
    private javax.swing.JTable ftable;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel navi;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel time;
    private javax.swing.JLabel vv;
    // End of variables declaration//GEN-END:variables
}
