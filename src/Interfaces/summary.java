
package Interfaces;

import Codes.DBconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class summary extends javax.swing.JFrame {
         Bsummary b = new Bsummary();
         Connection conn = null;
         PreparedStatement pst = null;
        
        
    public summary() {
        initComponents();
        conn = DBconnect.connect();
       
    }
    

 public void update(){
        
       String id;        
       String unit;      
       String amount;      
       String date;
               
        amount = amount1.getText();
        unit = un.getText();
        id = ID.getText();
        date = date1.getText();
       
        try {
            String sql = "UPDATE bill SET billamount ='"+amount+"', units ='"+unit+"', billdate ='"+date+"' WHERE cid ='"+id+"' "; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Added Successfully!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update Failed!!!");
        }
    } 
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date1 = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        amount1 = new javax.swing.JTextField();
        done = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        un = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer ID ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 180, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bill Amount");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Issue Date\n");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, 60));

        date1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date1.setForeground(new java.awt.Color(153, 153, 153));
        date1.setText(" Bill issue date");
        date1.setToolTipText("");
        date1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        date1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                date1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                date1FocusLost(evt);
            }
        });
        date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1ActionPerformed(evt);
            }
        });
        date1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                date1KeyTyped(evt);
            }
        });
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 290, 40));

        ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(153, 153, 153));
        ID.setText(" Enter Customer ID");
        ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDFocusLost(evt);
            }
        });
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDKeyTyped(evt);
            }
        });
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 290, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Units");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, 40));

        amount1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amount1.setForeground(new java.awt.Color(153, 153, 153));
        amount1.setText(" Bill amount");
        amount1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        amount1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amount1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                amount1FocusLost(evt);
            }
        });
        amount1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amount1KeyTyped(evt);
            }
        });
        jPanel1.add(amount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 290, 40));

        done.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        jPanel1.add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 130, 50));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Update Bill Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 410, 70));

        back.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 120, 50));

        un.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        un.setForeground(new java.awt.Color(153, 153, 153));
        un.setText(" Number of units (kW/h)");
        un.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
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
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 290, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Eda7O1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 670, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 670, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 140));

        setSize(new java.awt.Dimension(668, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1ActionPerformed
       
    }//GEN-LAST:event_date1ActionPerformed

    private void IDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDFocusGained
       
	if(ID.getText().equals(" Enter Customer ID"))
        {
        ID.setText("");
        ID.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_IDFocusGained

    private void IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDFocusLost
        if(ID.getText().equals(""))
        {
        ID.setText(" Enter Customer ID");
        ID.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_IDFocusLost

    private void IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyTyped
        ID.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_IDKeyTyped

    private void amount1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amount1FocusGained
        
	if(amount1.getText().equals(" Bill amount"))
        {
        amount1.setText("");
        amount1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_amount1FocusGained

    private void amount1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amount1FocusLost
       if(amount1.getText().equals(""))
        {
        amount1.setText(" Bill amount");
        amount1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_amount1FocusLost

    private void amount1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amount1KeyTyped
        amount1.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_amount1KeyTyped

    private void date1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_date1FocusGained
       
	if(date1.getText().equals(" Bill issue date"))
        {
        date1.setText("");
        date1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_date1FocusGained

    private void date1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_date1FocusLost
       if(date1.getText().equals(""))
        {
        date1.setText(" Bill issue date");
        date1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_date1FocusLost

    private void date1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date1KeyTyped
        date1.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_date1KeyTyped

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
      
    }//GEN-LAST:event_IDActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
    update();
    b.tableload();
    }//GEN-LAST:event_doneActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
      
        b.tableload();
    }//GEN-LAST:event_backActionPerformed

    private void unFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unFocusGained
        if(un.getText().equals(" Number of units (kW/h)"))
        {
        un.setText("");
        un.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_unFocusGained

    private void unFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unFocusLost
        if(un.getText().equals(""))
        {
        un.setText(" Number of units (kW/h)");
        un.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_unFocusLost

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
       
    }//GEN-LAST:event_unActionPerformed

    private void unKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyTyped
        un.setForeground(new Color(0,0,0));
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
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new summary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField amount1;
    private javax.swing.JButton back;
    private javax.swing.JTextField date1;
    private javax.swing.JButton done;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
