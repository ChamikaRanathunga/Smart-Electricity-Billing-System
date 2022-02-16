

package Interfaces;

import Codes.DBconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Interfaces.cusReg1;

public class newCustomer1 extends javax.swing.JFrame {

     Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    
    public newCustomer1() {
        initComponents();
         conn = DBconnect.connect();
        
        
    }
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        caddress = new javax.swing.JTextField();
        cmobile = new javax.swing.JTextField();
        cemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        cinsert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 180, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 210, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 200, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 180, 40));

        cname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cname.setForeground(new java.awt.Color(102, 102, 102));
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
        jPanel1.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 300, 40));

        caddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        caddress.setForeground(new java.awt.Color(102, 102, 102));
        caddress.setText(" Enter customer address");
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
        jPanel1.add(caddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 300, 40));

        cmobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmobile.setForeground(new java.awt.Color(102, 102, 102));
        cmobile.setText(" Enter mobile number");
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
        jPanel1.add(cmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 300, 40));

        cemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cemail.setForeground(new java.awt.Color(102, 102, 102));
        cemail.setText(" Enter email");
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
        jPanel1.add(cemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 300, 40));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("New Customer");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 330, 80));

        back.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 140, 50));

        cinsert.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        cinsert.setText("Register");
        cinsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cinsertMouseClicked(evt);
            }
        });
        cinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinsertActionPerformed(evt);
            }
        });
        jPanel1.add(cinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Eda7O1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 720, 550));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 620));

        setSize(new java.awt.Dimension(668, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void cinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinsertActionPerformed
        
        String name;
        String address;
        int mobile;
        String email;
        
        name = cname.getText();
        address = caddress.getText();
        email = cemail.getText();
        mobile = Integer.parseInt(cmobile.getText());
        
        try {
            String sql = "INSERT INTO customerreg (cusname,cusaddress,cusmobile,cusemail)VALUES ('"+name+"','"+address+"','"+mobile+"','"+email+"')";
          
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Customer Registration is Successful!!!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        cusReg1 c1 = new cusReg1();
        c1.tableload();
        
        
    }//GEN-LAST:event_cinsertActionPerformed

    private void cinsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cinsertMouseClicked
        cusReg1 c1 = new cusReg1();
        c1.tableload();
    }//GEN-LAST:event_cinsertMouseClicked

    private void cnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnameFocusGained
        
         if(cname.getText().equals(" Enter customer name"))
        {
        cname.setText("");
        cname.setForeground(new Color(102,102,102));
        }
        
    }//GEN-LAST:event_cnameFocusGained

    private void cnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnameFocusLost
         if(cname.getText().equals(""))
        {
        cname.setText(" Enter customer name");
        cname.setForeground(new Color(102,102,102));
        }
        
        
    }//GEN-LAST:event_cnameFocusLost

    private void cnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnameKeyTyped
       
        cname.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_cnameKeyTyped

    private void caddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caddressFocusGained
        
         if(caddress.getText().equals(" Enter customer address"))
        {
        caddress.setText("");
        caddress.setForeground(new Color(102,102,102));
        }
        
    }//GEN-LAST:event_caddressFocusGained

    private void caddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caddressFocusLost
         if(caddress.getText().equals(""))
        {
        caddress.setText(" Enter customer address");
        caddress.setForeground(new Color(102,102,102));
        }
        
        
    }//GEN-LAST:event_caddressFocusLost

    private void caddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caddressKeyTyped
        
         caddress.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_caddressKeyTyped

    private void cmobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmobileFocusGained
       
         if(cmobile.getText().equals(" Enter mobile number"))
        {
        cmobile.setText("");
        cmobile.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_cmobileFocusGained

    private void cmobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmobileFocusLost
       if(cmobile.getText().equals(""))
        {
        cmobile.setText(" Enter mobile number");
        cmobile.setForeground(new Color(102,102,102));
        }
        
    }//GEN-LAST:event_cmobileFocusLost

    private void cmobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmobileKeyTyped
       
         cmobile.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_cmobileKeyTyped

    private void cemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cemailFocusGained
         if(cemail.getText().equals(" Enter email"))
        {
        cemail.setText("");
        cemail.setForeground(new Color(102,102,102));
        }
       
    }//GEN-LAST:event_cemailFocusGained

    private void cemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cemailFocusLost
        if(cemail.getText().equals(""))
        {
        cemail.setText(" Enter email");
        cemail.setForeground(new Color(102,102,102));
        }
       
    }//GEN-LAST:event_cemailFocusLost

    private void cemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cemailKeyTyped
      
         cemail.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_cemailKeyTyped

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
      
    }//GEN-LAST:event_cnameActionPerformed

    private void caddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caddressActionPerformed

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
            java.util.logging.Logger.getLogger(newCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newCustomer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField caddress;
    private javax.swing.JTextField cemail;
    private javax.swing.JButton cinsert;
    private javax.swing.JTextField cmobile;
    private javax.swing.JTextField cname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
