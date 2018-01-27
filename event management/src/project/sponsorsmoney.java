/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static project.globalvariable.PASSWORD;
import static project.globalvariable.PATH;
import static project.globalvariable.PLACE;
import static project.globalvariable.USERNAME;

/**
 *
 * @author shagu
 */
public class sponsorsmoney extends javax.swing.JInternalFrame {

    /**
     * Creates new form sponsorsmoney
     */
    public sponsorsmoney() {
        initComponents();
        jFormattedTextField1.setEditable(false);
        Connection myconnection;
        
        try {//for connection.
            myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);//if coonection is not made error should be handled so use try and catch
            try//for query.
            {
                String a="select * from sponsor_detail";//fetch all from that table.
                PreparedStatement mystatement =myconnection.prepareStatement(a);
                DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
                ResultSet myresult=mystatement.executeQuery();
                int x,sum=0;
                              
                if(myresult.next())//returns 0 if not able to execute query
                {
                    //first time condition is checked so do-while.
                    do
                    {
                        //we are getting it and putting it into variables.
                        String  cname,mname,address,contact,email,amount,event;
                        cname=myresult.getString("companyname");
                        mname=myresult.getString("managername");
                        address=myresult.getString("address");
                        contact=myresult.getString("contact");
                        email=myresult.getString("email");
                        amount=myresult.getString("amount");
                        event=myresult.getString("eventname");
                        mymodel.addRow(new Object[]{cname,mname,address,contact,email,amount,event});
                      //it is in loop first row first array,for every row new array is made.
                        
                }while(myresult.next());//second time condition checked.
                    for(x=0;x<mymodel.getRowCount();x++)
                    {
                        sum=sum+Integer.parseInt(mymodel.getValueAt(x,5).toString());
                    }
                    jFormattedTextField1.setText(String.valueOf(sum));
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "No Sponsor Added");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Sponsor Money");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company Name", "Manager Name", "Address", "Contact", "Email", "Amount", "Event"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Amount");

        jButton1.setText("Print With Logo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField1.setText("0");

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(658, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        sponsorfinal obj=new sponsorfinal();
        parentframe.jDesktopPane1.add(obj);
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MessageFormat myheader=new MessageFormat("List of Sponsors");
        MessageFormat myfooter=new MessageFormat("Page{0}");
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH, myheader, myfooter);
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error in Printing");
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}