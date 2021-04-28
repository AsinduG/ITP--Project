
package hotel_pearl_inn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Chathu_PC
 */
public class Guest_class {
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    //create a function to add a client
    public boolean addGuest(String name,String phone, String email,String dob , String loyalty, String description,String nic, String passport,String type)
    {
        PreparedStatement st;
        String addQuery="INSERT INTO `guest`(`name`, `phone`, `email`, `dob`, `loyalty`, `description`, `nic`, `passport`, `type`) VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            st=my_connection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, name);
            st.setString(2, phone);
            st.setString(3, email);
            st.setString(4, dob);
            st.setString(5, loyalty);
            st.setString(6, description);
            st.setString(7, nic);
            st.setString(8, passport);
            st.setString(9, type);
            
            
            return (st.executeUpdate() > 0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Guest_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    //create a function to edit the selected client
    public boolean editGuest(int guestID,String name,String phone, String email,String dob , String loyalty, String description,String nic, String passport,String type)
    {
        PreparedStatement st;
        String editQuery="UPDATE `guest` SET `name`=?,`phone`=?,`email`=?,`dob`=?,`loyalty`=?,`description`=?,`nic`=?,`passport`=?,`type`=? WHERE `guestID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(editQuery);
            
            
            st.setString(1, name);
            st.setString(2, phone);
            st.setString(3, email);
            st.setString(4, dob);
            st.setString(5, loyalty);
            st.setString(6, description);
            st.setString(7, nic);
            st.setString(8, passport);
            st.setString(9, type);
            st.setInt(10, guestID);
            
            
            return (st.executeUpdate() >0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Guest_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    //create a function to remove the selected client
     public boolean removeGuest(int guestID){
         PreparedStatement st;
         String deleteQuery="DELETE FROM `guest` WHERE `guestID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, guestID);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Guest_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
     }
    //create a function to return a list of all client(Jtable)
    public void fillGuestJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery="SELECT * FROM `guest`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            rs= ps.executeQuery();
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            while(rs.next()){
                row = new Object[10];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                row[9] = rs.getString(10);
                tablemodel.addRow(row);
                   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Guest_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
