/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
/**
 *
 * @author shagu
 */
public class updateeventdetail extends javax.swing.JInternalFrame implements globalvariable {

    /**
     * Creates new form eventdetail
     */
    public updateeventdetail() {
        initComponents();
        update.setEnabled(false);
        Connection myconnection;
        
        try {//for connection.
            myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);//if coonection is not made error should be handled so use try and catch
            try//for query.
            {
                String a="select * from event_type";//fetch all from that table.
                PreparedStatement mystatement =myconnection.prepareStatement(a);
                ResultSet myresult=mystatement.executeQuery();
                
                if(myresult.next())//returns 0 if not able to execute query
                {
                    //first time condition is checked so do-while.
                    do
                    {
                        etypebox.addItem(myresult.getString("eventtype"));
                }while(myresult.next());//second time condition checked.
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "No Event Type Added");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error in query " + e.getMessage());
            }
            finally
            {
                myconnection.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error in Connection"+e.getMessage());
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enamebox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        eorganiserbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edatebox = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        etimebox = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        etypebox = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        evenuebox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Update Event Detail");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Event Name:");

        jLabel2.setText("Event Organiser:");

        jLabel3.setText("Event Date:");

        jLabel4.setText("Event Time:");

        etimebox.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        etimebox.setName(""); // NOI18N

        jLabel5.setText("Event Type:");

        etypebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Event Type" }));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jButton2.setText("Fetch");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Event Venue:");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(evenuebox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enamebox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eorganiserbox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edatebox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etimebox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etypebox, javax.swing.GroupLayout.Alignment.LEADING, 0, 175, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(enamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eorganiserbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(edatebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(etimebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(etypebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(evenuebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if(etypebox.getSelectedIndex()>0)//the person should add an event in some event type only.So that select doesn't get feeded in the database.
        {
        Connection myconnection;
        
        try {//for connection
            myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            try//for query
            {
                //whatever updations we do should be set in the database.
               String a="update event_detail set eorganiser=?,edate=?,etime=?,etype=?,evenue=? where ename=?";//pid-primary key
                PreparedStatement mystatement =myconnection.prepareStatement(a);
                mystatement.setString(1, eorganiserbox.getText());
                SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                mystatement.setString(2,myformat.format(edatebox.getDate()));
                mystatement.setString(3, etimebox.getText());
                mystatement.setString(4, etypebox.getSelectedItem().toString());
                mystatement.setString(5,evenuebox.getText());
                mystatement.setString(6,enamebox.getText());
                
                if(mystatement.executeUpdate()>0)
                 {
                  JOptionPane.showMessageDialog(rootPane, "Updated Successfully ");
                  enamebox.setText("");
                  eorganiserbox.setText("");
                  etimebox.setText("");
                  edatebox.setDate(null);
                  etypebox.setSelectedIndex(0);              
                  evenuebox.setText("");
                  update.setEnabled(false);
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
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Choose Event Type");
        }

    }//GEN-LAST:event_updateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection myconnection;
        //details of registerd participant will be updated only.
        try {//for connection.
            myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);//if coonection is not made error should be handled so use try and catch
            try//for query.
            {
                String a="select * from event_detail where ename=?";//row with that particular id would come.
                PreparedStatement mystatement =myconnection.prepareStatement(a);
                mystatement.setString(1,enamebox.getText());
                ResultSet myresult=mystatement.executeQuery();
               // SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                
                if(myresult.next())//returns false if no rows there.
                {
                    eorganiserbox.setText(myresult.getString("eorganiser"));
                    edatebox.setDate(myresult.getDate("edate"));
                    etimebox.setText(myresult.getString("etime"));
                    etypebox.setSelectedItem(myresult.getString("etype"));//that type should be selected.
                    evenuebox.setText(myresult.getString("evenue"));
                    update.setEnabled(true);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Event Not Registered");
                    
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error in query " + e.getMessage());
            }
            finally
            {
                myconnection.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error in Connection"+e.getMessage());
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection myconnection;
        try
        {
         myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
         try
         {
             String a="delete from event_detail where ename=?";
             PreparedStatement mystatement=myconnection.prepareStatement(a);
             mystatement.setString(1,enamebox.getText());
            int answer= JOptionPane.showConfirmDialog(rootPane,"Do you really want to Delete?","Warning",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
             if(answer==JOptionPane.YES_OPTION)//No need to remember value ask from it only
             {
                 if(mystatement.executeUpdate()==1)
                 {
                     JOptionPane.showMessageDialog(rootPane, "Deleted Successfully");
                  enamebox.setText("");
                  eorganiserbox.setText("");
                  etimebox.setText("");
                  edatebox.setDate(null);
                  etypebox.setSelectedIndex(0);              
                  evenuebox.setText("");
                  
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(rootPane,"Event not registerd");
                 }
             }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(rootPane,"Error in Query"+e.getMessage());
         }
         finally
         {
             myconnection.close();
         }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error in Connection"+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser edatebox;
    private javax.swing.JTextField enamebox;
    private javax.swing.JTextField eorganiserbox;
    private javax.swing.JFormattedTextField etimebox;
    private javax.swing.JComboBox<String> etypebox;
    private javax.swing.JTextField evenuebox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
