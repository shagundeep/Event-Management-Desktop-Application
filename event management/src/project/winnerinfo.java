/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import java.sql.*;
import static project.globalvariable.PASSWORD;
import static project.globalvariable.PATH;
import static project.globalvariable.PLACE;
import static project.globalvariable.USERNAME;

/**
 *
 * @author shagu
 */
public class winnerinfo extends javax.swing.JInternalFrame implements globalvariable {
    File myfile;

    /**
     * Creates new form winnerinfo
     */
    public winnerinfo() {
        initComponents();
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
                        eventtypebox.addItem(myresult.getString("eventtype"));
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        eventtypebox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        eventbox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Winner Details");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Name");

        jLabel2.setText("Father's Name");

        jLabel3.setText("Mother's Name");

        jLabel4.setText("College Name");

        jLabel5.setText("Gender");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        jLabel8.setText("Event Type");

        eventtypebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Event Type" }));
        eventtypebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventtypeboxActionPerformed(evt);
            }
        });

        jLabel6.setText("Event Won");

        eventbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Event Won" }));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Upload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Positon");

        jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel15.setText("Student ID");

        jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFormattedTextField4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(eventtypebox, javax.swing.GroupLayout.Alignment.LEADING, 0, 176, Short.MAX_VALUE)
                            .addComponent(eventbox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton1)))
                        .addGap(112, 112, 112))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(eventtypebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(eventbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(244, 244, 244))
        );

        jTabbedPane1.addTab("Personal Details", jPanel1);

        jLabel9.setText("Mobile Number");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setText("Email");

        jLabel11.setText("Amount Won");

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel12.setText("Address");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel13.setText("Paytm Number");

        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jFormattedTextField1)
                        .addComponent(jTextField5)
                        .addComponent(jFormattedTextField2)
                        .addComponent(jScrollPane1)
                        .addComponent(jFormattedTextField3)))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton3)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Contact Details", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser myfilechooser=new JFileChooser();
        //we are applying filter as we have to show only images file and not rest.
        myfilechooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if(f.isDirectory())
                { return true;}
                String extension=f.getName().substring(f.getName().lastIndexOf(".")+1);//we get the extension of all the files
                String allowed[]={"jpg","png","gif","jpeg","bmp"};
                //int count=0;
                for(String a:allowed)
                {
                    //count++;//loop works once only and get returns ;
                    if(a.equals(extension))
                    {
                        return true;
                    }
                }
                return false;// rest all files should not be shown.               
            }

            @Override
            public String getDescription() {
                return "All Picture Files";
            }
        });
        if(myfilechooser.showOpenDialog(rootPane)==JFileChooser.APPROVE_OPTION)
        {
            myfile=myfilechooser.getSelectedFile();
            try//there can be error in reading image.
            {
                Image showimg = ImageIO.read( new File(myfile.getAbsolutePath())).getScaledInstance( jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_AREA_AVERAGING);//to fit in that label fix size.
                jLabel7.setIcon(new ImageIcon(showimg));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Cannot read image");
            }
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eventtypeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventtypeboxActionPerformed
        // TODO add your handling code here:
        if(eventtypebox.getSelectedIndex()>0)//then only events should appear.
        {
            Connection myconnection;

            try {//for connection.
                myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);//if coonection is not made error should be handled so use try and catch
                try//for query.
                {
                    String a="select * from event_detail where etype=?";//column fetch according to event type.//particular event of that eventtype should come.
                    PreparedStatement mystatement =myconnection.prepareStatement(a);
                    mystatement.setString(1,eventtypebox.getSelectedItem().toString());
                    ResultSet myresult=mystatement.executeQuery();

                    if(myresult.next())//returns 0 if no event of that type exist.
                    {
                        eventbox.removeAllItems();
                        eventbox.addItem("Select Event");
                        do
                        {
                            eventbox.addItem(myresult.getString("ename"));//get value from the ename column in the database.
                        }while(myresult.next());//second time condition checked.
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "No Event Added ");
                        eventbox.removeAllItems();
                        eventbox.addItem("Select Event");
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
        else 
        {
            eventbox.removeAllItems();
            eventbox.addItem("Select Event");
        }
    }//GEN-LAST:event_eventtypeboxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boolean flag=true;
        String filename="";
//        if(myfile.length()<50000)//less than 50 kb
//        {
            if(myfile!=null)//when uploaded my file will not be null.
            {
                if(myfile.length()<50000)
                {
                    flag=true;
                filename=new java.util.Date().getTime()+myfile.getName();//adding timestamp to our filenam so that it becomes unique.
                int i;
                FileInputStream input=null;
                FileOutputStream output=null;
                try{
                    input=new FileInputStream(myfile);
                    output=new FileOutputStream("winnerimages\\"+filename);//writing the new  files in the 'SponsorImages' folder,int the project.
                    byte[] b=new byte[2048];//arrays of 2kb
                    while((i=input.read(b))!=-1)//we are reading files at 2kb per each iteration
                    {
                        output.write(b, 0, i);//copying from selected picture to sponsor images byte by byte.
                    }
                      
                }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error in file copying"+e.getMessage());
                }
                finally
                {
                    try
                    {
                        input.close();
                        output.close();
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Error in closing file");
                    }
                }
                }
                else
                {
                    flag=false;
                    JOptionPane.showMessageDialog(rootPane,"Image siz too big");
                }
            }
            else
            {
                //JOptionPane.showMessageDialog(rootPane,"No Image Uploaded");
                flag=true;
                filename="default.png";//it finds in our project.
                
            }
            //filename is set.
            //We have to insert it in database also.
            if(flag)
            {
            Connection myconnection;
        
        try {//for connection
            myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            try//for query
            {
               
                String a="insert into winner_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement mystatement=myconnection.prepareStatement(a);
                mystatement.setString(1,jFormattedTextField5.getText());
                mystatement.setString(2, jTextField1.getText());
                mystatement.setString(3, jTextField2.getText());
                mystatement.setString(4,jTextField3.getText());
                mystatement.setString(5, jTextField4.getText());
                if(jRadioButton1.isSelected())
                {
                  mystatement.setString(6,"Male");
                }
                else if(jRadioButton2.isSelected())
                {
                   mystatement.setString(6,"Female"); 
                }
                mystatement.setString(7,eventtypebox.getSelectedItem().toString());
                mystatement.setString(8,eventbox.getSelectedItem().toString());
                mystatement.setString(9,jFormattedTextField4.getText());
                mystatement.setString(10,filename);
                mystatement.setString(11,jFormattedTextField1.getText());
                mystatement.setString(12,jTextField5.getText());
                mystatement.setString(13,jFormattedTextField2.getText());
                mystatement.setString(14,jTextArea1.getText());
                mystatement.setString(15,jFormattedTextField3.getText());
                if(mystatement.executeUpdate()>0)
                 {
                  JOptionPane.showMessageDialog(rootPane, "Winner  Added Successfully ");
                  jTextField1.setText("");
                  jTextField2.setText("");
                  jTextField4.setText("");
                  jTextField5.setText("");
                  jTextArea1.setText("");
                  jFormattedTextField1.setText("");
                  jFormattedTextField2.setText("");
                  jFormattedTextField3.setText("");
                  jFormattedTextField4.setText("");
                  jFormattedTextField5.setText("");
                  buttonGroup1.clearSelection();
                  jTextField3.setText("");
                  eventtypebox.setSelectedIndex(0);
                  eventbox.setSelectedIndex(0);
                  jLabel7.setIcon(null);//to make image labe empty.
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
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> eventbox;
    private javax.swing.JComboBox<String> eventtypebox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
