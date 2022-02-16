
//New Employee Registration

package Interfaces;

import Codes.DBconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class newEmp extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    
    public newEmp() {
        initComponents();
         conn = DBconnect.connect();
      
    }

  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eemail = new javax.swing.JTextField();
        eaddress = new javax.swing.JTextField();
        emobile = new javax.swing.JTextField();
        ename = new javax.swing.JTextField();
        enic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(670, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(670, 760));
        jPanel1.setPreferredSize(new java.awt.Dimension(670, 760));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, 50));

        eemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eemail.setForeground(new java.awt.Color(102, 102, 102));
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
        jPanel1.add(eemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 300, 40));

        eaddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eaddress.setForeground(new java.awt.Color(102, 102, 102));
        eaddress.setText(" Enter employee address");
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
        jPanel1.add(eaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 300, 40));

        emobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emobile.setForeground(new java.awt.Color(102, 102, 102));
        emobile.setText(" Enter mobile number");
        emobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        emobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emobileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emobileFocusLost(evt);
            }
        });
        emobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emobileKeyTyped(evt);
            }
        });
        jPanel1.add(emobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 300, 40));

        ename.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ename.setForeground(new java.awt.Color(102, 102, 102));
        ename.setText(" Enter employee name");
        ename.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        ename.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                enameComponentAdded(evt);
            }
        });
        ename.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enameFocusLost(evt);
            }
        });
        ename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enameKeyTyped(evt);
            }
        });
        jPanel1.add(ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 300, 40));

        enic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enic.setForeground(new java.awt.Color(102, 102, 102));
        enic.setText(" Enter NIC");
        enic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        enic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enicFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enicFocusLost(evt);
            }
        });
        enic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enicKeyTyped(evt);
            }
        });
        jPanel1.add(enic, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 300, 40));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("New Employee");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 350, 70));

        insert.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        insert.setText("Register");
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
        });
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 160, 50));

        back.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 140, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Eda7O1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 670, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 160));

        setSize(new java.awt.Dimension(668, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        //go back to emp reg main page
               this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
      //insert
        String name = ename.getText();
        String nic = enic.getText();
        String address = eaddress.getText();
        int mobile = Integer.parseInt(emobile.getText());
        String email = eemail.getText();
        
        try {
            String sql = "INSERT INTO employee (empname,empnic,empaddress,empmobile,empemail)VALUES ('"+name+"','"+nic+"','"+address+"','"+mobile+"','"+email+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
           
            JOptionPane.showMessageDialog(null, "Employee Registration is Successful!!!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_insertActionPerformed

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
        //update customer details table with inserted data
        empreg e1 = new empreg();
        e1.tableload();
      
    }//GEN-LAST:event_insertMouseClicked

    private void enameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_enameComponentAdded
      //*************************************************  
    }//GEN-LAST:event_enameComponentAdded

    private void enameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enameFocusGained
        if(ename.getText().equals(" Enter employee name"))
        {
        ename.setText("");
        ename.setForeground(new Color(153,153,153));
        }
      
        
        
    }//GEN-LAST:event_enameFocusGained

    private void enameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enameFocusLost
       if(ename.getText().equals(""))
        {
        ename.setText(" Enter employee name");
        ename.setForeground(new Color(153,153,153));
        }


        
        
    }//GEN-LAST:event_enameFocusLost

    private void enameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enameKeyTyped
        
        	ename.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_enameKeyTyped

    private void enicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enicFocusGained
        if(enic.getText().equals(" Enter NIC"))
        {
        enic.setText("");
        enic.setForeground(new Color(153,153,153));
        }
      
        
        
    }//GEN-LAST:event_enicFocusGained

    private void enicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enicFocusLost
        	if(enic.getText().equals(""))
        {
        enic.setText(" Enter NIC");
        enic.setForeground(new Color(153,153,153));
        }

        
        
    }//GEN-LAST:event_enicFocusLost

    private void enicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enicKeyTyped
       
        	enic.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_enicKeyTyped

    private void eaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eaddressFocusGained
       if(eaddress.getText().equals(" Enter employee address"))
        {
        eaddress.setText("");
        eaddress.setForeground(new Color(153,153,153));
        }
      
        
        
    }//GEN-LAST:event_eaddressFocusGained

    private void eaddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eaddressFocusLost
       	if(eaddress.getText().equals(""))
        {
        eaddress.setText(" Enter employee address");
        eaddress.setForeground(new Color(153,153,153));
        }

        
        
    }//GEN-LAST:event_eaddressFocusLost

    private void eaddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eaddressKeyTyped
       
        	eaddress.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_eaddressKeyTyped

    private void emobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emobileFocusGained
      if(emobile.getText().equals(" Enter mobile number"))
        {
        emobile.setText("");
        emobile.setForeground(new Color(153,153,153));
        }
      
        
        
    }//GEN-LAST:event_emobileFocusGained

    private void emobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emobileFocusLost
        	if(emobile.getText().equals(""))
        {
        emobile.setText(" Enter mobile number");
        emobile.setForeground(new Color(153,153,153));
        }
              
    }//GEN-LAST:event_emobileFocusLost

    private void emobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emobileKeyTyped
        
        	emobile.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_emobileKeyTyped

    private void eemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eemailFocusGained
        if(eemail.getText().equals(" Enter email"))
        {
        eemail.setText("");
        eemail.setForeground(new Color(153,153,153));
        }     
        
    }//GEN-LAST:event_eemailFocusGained

    private void eemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eemailFocusLost
       	if(eemail.getText().equals(""))
        {
        eemail.setText(" Enter email");
        eemail.setForeground(new Color(153,153,153));
        }
             
    }//GEN-LAST:event_eemailFocusLost

    private void eemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eemailKeyTyped
        
        	eemail.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_eemailKeyTyped

    
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
            java.util.logging.Logger.getLogger(newEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField eaddress;
    private javax.swing.JTextField eemail;
    private javax.swing.JTextField emobile;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField enic;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
