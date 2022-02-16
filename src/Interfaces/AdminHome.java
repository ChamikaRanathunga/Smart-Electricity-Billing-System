

package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;

public class AdminHome extends javax.swing.JFrame {
    
    private static String t1;
    private static String t2;
    private static String t3;
    private static String t4;
    private static String t5;
    private static String t6;
    private static String t7;
    private static String t8;
    private static String t9;
    private static String t10;
    private static String t11;
    private static String t12;
    private static String t13;
    private static String t14;
    private static String body;

    public AdminHome() {
        initComponents();
       nonactive();
       settext();
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
   
   public void settext(){
                 
                 t1 = "OMEGA is to be a highly";
                 t2 = "\nsuccessfull consulting company"; 
                 t3 = "\ncompany in electric energy ";
                 t4 = "\nsector and to provid range of"; 
                 t5 = "\nservices in the electricity";
                 t6 = "\nfield .We deeply recognize the";
                 t7 = "\nneeds of our customers who are";
                 t8 = "\nconstantly searching for";
                 t9 = "\nlatest technologies and";
                 t10 = "\nwe are here to contribute";
                 t11 = "\ncontribute our customers with";
                 t12 = "\nthe best way to reduce the";
                 t13 = "\nelectricity wastage from monthly";
                 t14 = "\nbill.";
                 body = t1 + t2 + t3 + t4 + t5 + t6 + t7 + t8 + t9 + t10 + t11 + t12 + t13 + t14;
                 text.setText(body);
   }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        vv = new javax.swing.JLabel();
        cregbtn = new javax.swing.JButton();
        sidebar = new javax.swing.JPanel();
        lout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        eregbtn = new javax.swing.JButton();
        ccombtn = new javax.swing.JButton();
        billsummary = new javax.swing.JButton();
        feedback = new javax.swing.JButton();
        navi = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1150, 790));
        setResizable(false);
        setSize(new java.awt.Dimension(1150, 790));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1150, 790));
        jPanel1.setMinimumSize(new java.awt.Dimension(1150, 790));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vvMouseClicked(evt);
            }
        });
        jPanel3.add(vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 1140, 820));

        cregbtn.setBackground(new java.awt.Color(255, 255, 255));
        cregbtn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        cregbtn.setText("Customer Details");
        cregbtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cregbtnMouseMoved(evt);
            }
        });
        cregbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cregbtnMousePressed(evt);
            }
        });
        cregbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cregbtnActionPerformed(evt);
            }
        });
        cregbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cregbtnKeyReleased(evt);
            }
        });
        jPanel3.add(cregbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 630, 70));

        sidebar.setBackground(new java.awt.Color(35, 31, 32));
        sidebar.setForeground(new java.awt.Color(204, 204, 255));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lout.setText("Log Out");
        lout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loutActionPerformed(evt);
            }
        });
        sidebar.add(lout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 250, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        sidebar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, 250, 50));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Omega ");
        sidebar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 180, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        jPanel4.setBackground(new java.awt.Color(35, 31, 32));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(35, 31, 32));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        text.setBackground(new java.awt.Color(35, 31, 32));
        text.setColumns(20);
        text.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 153));
        text.setRows(5);
        text.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(text);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        sidebar.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 300, 350));

        jPanel3.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 340, 800));

        eregbtn.setBackground(new java.awt.Color(255, 255, 255));
        eregbtn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        eregbtn.setText("Employee Details");
        eregbtn.setToolTipText("");
        eregbtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                eregbtnMouseMoved(evt);
            }
        });
        eregbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eregbtnActionPerformed(evt);
            }
        });
        jPanel3.add(eregbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 630, 70));

        ccombtn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        ccombtn.setText("Customer Complaints");
        ccombtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccombtnActionPerformed(evt);
            }
        });
        jPanel3.add(ccombtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 630, 70));

        billsummary.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        billsummary.setText("Billing Summary");
        billsummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsummaryActionPerformed(evt);
            }
        });
        jPanel3.add(billsummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 630, 70));

        feedback.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        feedback.setText("Customer Feedbacks");
        feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackActionPerformed(evt);
            }
        });
        jPanel3.add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, 630, 70));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home-sidebar.png"))); // NOI18N
        navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naviMouseClicked(evt);
            }
        });
        jPanel3.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 60));

        v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IMG_20211019_211948.jpg"))); // NOI18N
        v.setText("jLabel1");
        v.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vMouseClicked(evt);
            }
        });
        jPanel3.add(v, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1570, 950));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 130, 1560, 820));

        date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 255));
        date.setText("date");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 110, 20));

        time.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        time.setForeground(new java.awt.Color(102, 102, 255));
        time.setText("time");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 10, 110, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 90));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Welcome to Smart Electricity");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1560, 960));

        setSize(new java.awt.Dimension(1518, 947));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cregbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cregbtnActionPerformed
        //go to customer registration page
        cusReg c1 = new cusReg();
        c1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cregbtnActionPerformed

    private void eregbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eregbtnActionPerformed
       //go to employee regisreation page
        empreg e1 = new empreg();
        e1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eregbtnActionPerformed

    private void ccombtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccombtnActionPerformed
       //complain page
      complaints1 c = new complaints1();
      c.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_ccombtnActionPerformed

    private void billsummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsummaryActionPerformed
        //show bill summary
        Bsummary b1 = new Bsummary();
        b1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_billsummaryActionPerformed

    private void feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackActionPerformed
       //customer feedback
        feedback f1 = new feedback();
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_feedbackActionPerformed

    private void naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naviMouseClicked
        navigationbar();
        
    }//GEN-LAST:event_naviMouseClicked

    private void vMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vMouseClicked
        
    }//GEN-LAST:event_vMouseClicked

    private void vvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vvMouseClicked
         nonactive();
    }//GEN-LAST:event_vvMouseClicked

    private void loutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loutActionPerformed
      
        int check = JOptionPane.showConfirmDialog(null, "Do you want to Log Out?");
        
        if (check == 0){
           Login l1 = new Login();
           l1.setVisible(true);
           this.dispose();
            }
        
    }//GEN-LAST:event_loutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cregbtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cregbtnMouseMoved
     
    }//GEN-LAST:event_cregbtnMouseMoved

    private void eregbtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eregbtnMouseMoved
      
    }//GEN-LAST:event_eregbtnMouseMoved

    private void cregbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cregbtnMousePressed
       
    }//GEN-LAST:event_cregbtnMousePressed

    private void cregbtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cregbtnKeyReleased
      
    }//GEN-LAST:event_cregbtnKeyReleased

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billsummary;
    private javax.swing.JButton ccombtn;
    private javax.swing.JButton cregbtn;
    private javax.swing.JLabel date;
    private javax.swing.JButton eregbtn;
    private javax.swing.JButton feedback;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lout;
    private javax.swing.JLabel navi;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTextArea text;
    private javax.swing.JLabel time;
    private javax.swing.JLabel v;
    private javax.swing.JLabel vv;
    // End of variables declaration//GEN-END:variables
}
