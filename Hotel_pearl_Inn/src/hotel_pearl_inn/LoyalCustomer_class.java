package hotel_pearl_inn;

import hotel_pearl_inn.Employee_class;
import hotel_pearl_inn.MY_CONNECTION;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LoyalCustomer_class {
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    public boolean addLoyalCustomer(String name,String nic,String phone)
    {
        PreparedStatement st;
        String addQuery="INSERT INTO `loyalcustomer`(`name`, `nic`, `phone`) VALUES (?,?,?)";
        
        try {
            st=my_connection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, name);
            st.setString(2, nic);
            st.setString(3, phone);
            
            return (st.executeUpdate() > 0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(LoyalCustomer_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    //create a function to add a client
   
    
    //create a function to edit the selected client
    public boolean editLoyalCustomer(int id,String name ,String nic , String phone)
    {
        PreparedStatement st;
        String editQuery="UPDATE `loyalcustomer` SET `name`=?,`nic`=?,`phone`=? WHERE `id`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(editQuery);
            
             st.setString(1, name);
            st.setString(2, nic);
            st.setString(3, phone);
            st.setInt(4, id);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(LoyalCustomer_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    //create a function to remove the selected client
     public boolean removeLoyalCustomer(int id){
         PreparedStatement st;
         String deleteQuery="DELETE FROM `loyalcustomer` WHERE `id`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, id);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(LoyalCustomer_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
     }
    //create a function to return a list of all client(Jtable)
    public void fillSupplierJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery="SELECT * FROM `loyalcustomer`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            rs= ps.executeQuery();
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            while(rs.next()){
                row = new Object[4];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
               
                
                tablemodel.addRow(row);
                   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoyalCustomer_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
