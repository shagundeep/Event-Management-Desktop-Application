/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author shagu
 */
public class login extends javax.swing.JFrame implements globalvariable {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernamebox = new javax.swing.JTextField();
        passwordbox = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 51));
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 90, 100, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 51));
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(104, 150, 100, 22);
        getContentPane().add(usernamebox);
        usernamebox.setBounds(210, 90, 180, 30);

        passwordbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordboxKeyPressed(evt);
            }
        });
        getContentPane().add(passwordbox);
        passwordbox.setBounds(210, 150, 180, 30);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 230, 110, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginback.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 380);

        setSize(new java.awt.Dimension(503, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loginwork();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordboxKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
         loginwork();   
        }
    }//GEN-LAST:event_passwordboxKeyPressed
    private void loginwork(){// own method is made for login work so that it is not to be copied again and again.
         Connection myconnection;
        
        try {//for connection
            myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            try//for query
            {
               
                String a="select * from usertable where username=? and password=?";
                PreparedStatement mystatement=myconnection.prepareStatement(a);
                mystatement.setString(1, usernamebox.getText());
                mystatement.setString(2,passwordbox.getText());
                ResultSet myresult=mystatement.executeQuery();
                
                if(myresult.next())
                 {
                  if(myresult.getString("usertype").equals("admin"))
                  {
                      //admin can access all things.
                      parentframe obj=new parentframe();
                      obj.setVisible(true);
                  }
                  else if(myresult.getString("usertype").equals("employee"))
                  {
                      //at employee login, employee cannot access all things.
//                      parentframe2 obj=new parentframe2();
//                      obj.setVisible(true);
                  }
                  this.dispose();
                 }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Wrong Username or Password");
//                    usernamebox.setText(" ");
//                    passwordbox.setText(" ");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error in query " + e.getMessage());
            }
            finally
            {
                myconnection.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection"+e.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordbox;
    private javax.swing.JTextField usernamebox;
    // End of variables declaration//GEN-END:variables
}
