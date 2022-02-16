//bill calculation interface

package Interfaces;

import Codes.DBconnect;
import Codes.mailsend;
import Codes.sendSMS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.teknikindustries.bulksms.SMS;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SendBills1 extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private static String cusid;
    private static String t1;
    private static String t2;
    private static String t3;
    private static String t4;
    private static String t5;
    private static String t6;
    private static String t7;
    private static String t8;
    private static String emailbody;

    public SendBills1() {
        initComponents();
        conn = DBconnect.connect();
        date();
        time();
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        slabel = new javax.swing.JTextArea();
        sbilltype = new javax.swing.JComboBox();
        scid = new javax.swing.JTextField();
        sok = new javax.swing.JButton();
        smessage = new javax.swing.JButton();
        semail = new javax.swing.JButton();
        sback = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        contact = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 57)); // NOI18N
        jLabel2.setText("Send Bills");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 350, 70));

        date.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 255));
        date.setText("date");
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 140, 30));

        time.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        time.setForeground(new java.awt.Color(102, 102, 255));
        time.setText("time");
        jPanel2.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, 140, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Capture.PNG"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 90));

        jPanel3.setBackground(new java.awt.Color(246, 246, 246));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        slabel.setColumns(20);
        slabel.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N
        slabel.setRows(5);
        slabel.setBorder(null);
        jScrollPane2.setViewportView(slabel);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 400, 410));

        sbilltype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sbilltype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Bill send as", "Email", "Mobile" }));
        sbilltype.setBorder(null);
        sbilltype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbilltypeActionPerformed(evt);
            }
        });
        jPanel3.add(sbilltype, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 360, 50));

        scid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scid.setForeground(new java.awt.Color(102, 102, 255));
        scid.setText(" Enter customer ID");
        scid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        scid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                scidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                scidFocusLost(evt);
            }
        });
        scid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scidActionPerformed(evt);
            }
        });
        scid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scidKeyTyped(evt);
            }
        });
        jPanel3.add(scid, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 360, 50));

        sok.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        sok.setText("Done");
        sok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokActionPerformed(evt);
            }
        });
        jPanel3.add(sok, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 120, 50));

        smessage.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        smessage.setText("Send SMS");
        smessage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        smessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                smessageMousePressed(evt);
            }
        });
        smessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smessageActionPerformed(evt);
            }
        });
        jPanel3.add(smessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 430, 60));

        semail.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        semail.setText("Send Email");
        semail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semailActionPerformed(evt);
            }
        });
        jPanel3.add(semail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 430, 60));

        sback.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        sback.setText("Back");
        sback.setMaximumSize(new java.awt.Dimension(87, 33));
        sback.setMinimumSize(new java.awt.Dimension(87, 33));
        sback.setPreferredSize(new java.awt.Dimension(87, 33));
        sback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbackActionPerformed(evt);
            }
        });
        jPanel3.add(sback, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 710, 180, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Bill Type          :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 190, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Mobile Number/Email");
        jLabel4.setToolTipText("Enter customer mobile number");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 50));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 300, 50));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 240, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Customer ID    :");
        jLabel3.setToolTipText("Enter Customer ID");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 240, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contact.setForeground(new java.awt.Color(102, 102, 255));
        contact.setText("user Email/Mobile");
        contact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactFocusLost(evt);
            }
        });
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactKeyTyped(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 340, 50));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 360, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1530, 890));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1530, 830));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 300, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grunge-illustration-hanging-light-bulbs-260nw-1161568426.jpg"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, -1, 140));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1540, 970));

        setSize(new java.awt.Dimension(1518, 997));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbackActionPerformed
        //back         
        this.dispose();
    }//GEN-LAST:event_sbackActionPerformed

    private void sokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokActionPerformed
        
        ResultSet rs = null;
        String billRT = sbilltype.getSelectedItem().toString();
        String id = scid.getText();
        
        try {
            //if user select "Email"
            if (billRT == "Email") {
                rs = DBconnect.search("select c.cid, c.cusemail,c.cusname, b.billamount, b.units, b.billdate from customerreg c inner join bill b on c.cid = b.cid where c.cid = '" + id + "'");
                
                if (rs.next()) {
                    contact.setText(rs.getString("cusemail"));
                    cusid = rs.getString("c.cid");
                    //Email body
                    t1 = "Dear Sir/Madam,";
                    t2 = "\nHere is your Monthly Electricity Bill.";
                    t3 = "\nCustomer ID      :" + id;
                    t4 = "\nCustomer Name    :" + rs.getString("c.cusname");
                    t5 = "\nUnits            :" + rs.getString("b.units");
                    t6 = "\nBill Amount      :Rs." + rs.getString("b.billamount");
                    t7 = "\nIssue Date       :" + rs.getString("b.billdate");
                    t8 = "\nHave a nice day! \nThank You.";
                    emailbody = t1 + t2+ t3+ t4+ t5+ t6+ t7+ t8;
                    slabel.setText(emailbody);
                    System.out.println("ID identified.................!!!!!!!!!");
                    } 
                else {
                    JOptionPane.showMessageDialog(this, "Invalid ID!!!");
                    }
                
                //if user select "mobile"
                } else if (billRT == "Mobile") {
                rs = DBconnect.search("select cusmobile from customerreg where cid = '" + id + "'");
                
                if (rs.next()) {
                    contact.setText(rs.getString("cusmobile"));
                    } 
                else {
                    JOptionPane.showMessageDialog(this, "Invalid ID!!!");
                    }
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_sokActionPerformed

    private void smessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smessageActionPerformed

        sendSMS s1 = new sendSMS();
        s1.SMS("+94711731332", "hi");
        System.out.println("message sent");

    }//GEN-LAST:event_smessageActionPerformed

    private void semailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semailActionPerformed
        //get data from database to send email
        try {
            ResultSet rs = DBconnect.search("select c.cid, c.cusemail,c.cusname, b.billamount, b.units, b.billdate from customerreg c inner join bill b on c.cid = b.cid where c.cid = '" + scid.getText() + "'");
            if(rs.next()){
            new mailsend(rs.getString("c.cid"), rs.getString("c.cusname"), rs.getString("b.units"), rs.getString("b.billamount"), rs.getString("b.billdate"));
            mailsend.sendMail(rs.getString("c.cusemail"));
            System.out.println("Mail sent");
            }else{
                JOptionPane.showMessageDialog(this, "Invalid Customer ID");
            }
        } catch (Exception e) {
            e.printStackTrace();
                    
        }      
    }//GEN-LAST:event_semailActionPerformed

    private void sbilltypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbilltypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbilltypeActionPerformed

    private void scidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scidFocusGained
       
        if(scid.getText().equals(" Enter customer ID"))
        {
        scid.setText("");
        scid.setForeground(new Color(153,153,153));
        }
      

        
    }//GEN-LAST:event_scidFocusGained

    private void scidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scidFocusLost
        if(scid.getText().equals(""))
        {
        scid.setText(" Enter customer ID");
        scid.setForeground(new Color(153,153,153));
        }

        
        
    }//GEN-LAST:event_scidFocusLost

    private void scidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scidKeyTyped
      
        scid.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_scidKeyTyped

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
       if(contact.getText().equals("user Email/Mobile"))
        {
        contact.setText("");
        contact.setForeground(new Color(153,153,153));
        }
      
        
    }//GEN-LAST:event_contactFocusGained

    private void contactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusLost
        if(contact.getText().equals(""))
        {
        contact.setText("user Email/Mobile");
        contact.setForeground(new Color(153,153,153));
        }

        
    }//GEN-LAST:event_contactFocusLost

    private void smessageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smessageMousePressed
       smessage.setForeground(new Color(155,155,255));
    }//GEN-LAST:event_smessageMousePressed

    private void scidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scidActionPerformed

    private void contactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyTyped
       contact.setForeground(new Color(155,155,255));
    }//GEN-LAST:event_contactKeyTyped

    
    
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
            java.util.logging.Logger.getLogger(SendBills1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendBills1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendBills1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendBills1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendBills1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contact;
    private javax.swing.JLabel date;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton sback;
    private javax.swing.JComboBox sbilltype;
    private javax.swing.JTextField scid;
    private javax.swing.JButton semail;
    private javax.swing.JTextArea slabel;
    private javax.swing.JButton smessage;
    private javax.swing.JButton sok;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
