//Login 

package Interfaces;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.proteanit.sql.DbUtils;


public class Login extends javax.swing.JFrame {
	Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Login() {
        initComponents();
conn = DBconnect.connect();
  
    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logincombo = new javax.swing.JComboBox();
        pw = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login As");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, 40));

        logincombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logincombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select from here", "Administrator", "Staff" }));
        logincombo.setToolTipText("select the user category");
        logincombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logincomboActionPerformed(evt);
            }
        });
        jPanel1.add(logincombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 260, 40));

        pw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pw.setForeground(new java.awt.Color(153, 153, 153));
        pw.setToolTipText("enter password");
        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwKeyTyped(evt);
            }
        });
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 260, 40));

        loginbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 130, 50));

        exitbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 140, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 90));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Welcome to Smart Electricity Billing System");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 510, 30));

        un.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        un.setText(" Enter Username");
        un.setToolTipText("enter username");
        un.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unFocusLost(evt);
            }
        });
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        un.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unKeyTyped(evt);
            }
        });
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 260, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 720));

        setSize(new java.awt.Dimension(677, 726));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
  
	String s1 = "SELECT uname FROM login";
	String s2 = "SELECT pword FROM login";
	pst = conn.prepareStatement(sql);       

        String uname = un.getText();
        String password = pw.getText();
        String comboVariable = logincombo.getSelectedItem().toString();
        
       
        if(uname.equals(s1) && password.equals(s2)  && comboVariable == "Administrator"){
            //go to Admin HomePage
            AdminHome a1 = new AdminHome();
            a1.setVisible(true);
            this.dispose(); 
            
        }
        else if (uname.equals(s1) && password.equals(2) && comboVariable == "Staff"){
            // go to Staff Home page
         emphome e1 = new emphome();
         e1.setVisible(true);
         this.dispose();
            
        }
        
        else {
            //error message
             JOptionPane.showMessageDialog(null, "User Name, Password or Selected User type is invalid!!!");
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void logincomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logincomboActionPerformed
       
    }//GEN-LAST:event_logincomboActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
       
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void pwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyTyped
       pw.setForeground(new Color (0,0,0));
    }//GEN-LAST:event_pwKeyTyped

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
       
    }//GEN-LAST:event_pwActionPerformed

    private void unFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unFocusGained
       if(un.getText().equals(" Enter Username"))
        {
        un.setText("");
        un.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_unFocusGained

    private void unFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unFocusLost
         if(un.getText().equals(""))
        {
        un.setText(" Enter Username");
        un.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_unFocusLost

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        
    }//GEN-LAST:event_unActionPerformed

    private void unKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyTyped
       un.setForeground(new Color (0,0,0));
    }//GEN-LAST:event_unKeyTyped

    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JComboBox logincombo;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
