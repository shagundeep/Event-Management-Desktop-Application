
package project;
import java.sql.*;
import javax.swing.*;

public class mainwork implements globalvariable {

   
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Error in applying theme");
        }
        Connection myconnection;
        try
        {
            myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
        
        try//for query
            {
               
                String a="select * from usertable";
                PreparedStatement mystatement=myconnection.prepareStatement(a);
                ResultSet myresult=mystatement.executeQuery();
                if(myresult.next())//true if there is something in the usertable.
                {
                    login obj=new login();
                    obj.setVisible(true);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Running software first time,register admin");
                    createadmin obj=new createadmin();
                    obj.setVisible(true);                
                }                       
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error in query " + e.getMessage());
            }
            finally
            {
                myconnection.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in Connection"+e.getMessage());
        }
    }
    
}
