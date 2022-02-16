

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

public class emphome_1 extends javax.swing.JFrame {
     
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
    
    public emphome_1() {
        initComponents();
        nonactive();
     settext();
        date();
        time();
    }
    
    //date
    public void date(){    
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date.setText(s.format(d));
    }
        
    //time
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

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        creg = new javax.swing.JButton();
        calc = new javax.swing.JButton();
        complains = new javax.swing.JButton();
        mreading = new javax.swing.JButton();
        send = new javax.swing.JButton();
        sidebar = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        navi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vv = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/home.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1150, 790));
        setMinimumSize(new java.awt.Dimension(1150, 790));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creg.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        creg.setText("Customer Details");
        creg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cregActionPerformed(evt);
            }
        });
        jPanel1.add(creg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 750, 70));

        calc.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        calc.setText("Billing Process");
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });
        jPanel1.add(calc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 750, 70));

        complains.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        complains.setText("Customer Complaints");
        complains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complainsActionPerformed(evt);
            }
        });
        jPanel1.add(complains, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, 750, 70));

        mreading.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        mreading.setText("Meter Readings");
        mreading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mreadingActionPerformed(evt);
            }
        });
        jPanel1.add(mreading, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 750, 70));

        send.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        send.setText("Send Bills");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel1.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 750, 70));

        sidebar.setBackground(new java.awt.Color(35, 31, 32));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        sidebar.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 700, 220, 50));

        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        sidebar.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 220, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 180, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed.jpg"))); // NOI18N
        sidebar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Omega");
        sidebar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 140, 50));

        text.setBackground(new java.awt.Color(35, 32, 31));
        text.setColumns(20);
        text.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 153));
        text.setRows(5);
        text.setBorder(null);
        jScrollPane1.setViewportView(text);

        sidebar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 270, 300));

        jPanel1.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 820));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home-sidebar.png"))); // NOI18N
        navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naviMouseClicked(evt);
            }
        });
        jPanel1.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IMG_20211019_211948.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 940));

        vv.setText("jLabel5");
        vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vvMouseClicked(evt);
            }
        });
        jPanel1.add(vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1270, 830));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1500, 820));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Welcome to Smart Electricity");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 880, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 90));

        date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 255));
        date.setText("date");
        jPanel4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 110, 20));

        time.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        time.setForeground(new java.awt.Color(102, 102, 255));
        time.setText("time");
        jPanel4.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 10, 110, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 950));

        setSize(new java.awt.Dimension(1518, 947));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void complainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complainsActionPerformed
       //complains
        complaints c1 = new complaints();
        c1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_complainsActionPerformed

    private void cregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cregActionPerformed
       //go to customer registration page
        cusReg1 c1 = new cusReg1();
        c1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cregActionPerformed

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
       //bill calculation page
     
    }//GEN-LAST:event_calcActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
       //bill send to the customers
        SendBills s1 = new SendBills();
        s1.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_sendActionPerformed

    private void mreadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mreadingActionPerformed
        //check meter readings
       
    }//GEN-LAST:event_mreadingActionPerformed

    private void naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naviMouseClicked
       navigationbar();        
    }//GEN-LAST:event_naviMouseClicked

    private void vvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vvMouseClicked
       nonactive();
    }//GEN-LAST:event_vvMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);      
    }//GEN-LAST:event_exitActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       /* int check = JOptionPane.showConfirmDialog(null, "Do you want to Log Out?");
       
        if (check == 0){
           Login a = new Login();
           a.setVisible(true);
           this.dispose();
            } */
    }//GEN-LAST:event_logoutActionPerformed

    
    
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
    private javax.swing.JButton calc;
    private javax.swing.JButton complains;
    private javax.swing.JButton creg;
    private javax.swing.JLabel date;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton mreading;
    private javax.swing.JLabel navi;
    private javax.swing.JButton send;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTextArea text;
    private javax.swing.JLabel time;
    private javax.swing.JLabel vv;
    // End of variables declaration//GEN-END:variables
}
