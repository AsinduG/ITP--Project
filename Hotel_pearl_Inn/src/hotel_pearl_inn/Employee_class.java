
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
public class Employee_class {
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    //create a function to add a client
    public boolean addEmployee(String name,String Address, String email,String Tele, String exp, String Desg,String Dep, String Basicsal)
    {
        PreparedStatement st;
        String addQuery="INSERT INTO `employee`(`Name`, `Address`, `Email`, `Telephone`, `Experience`, `Designation`, `Department`, `BasicSalary`) VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            st=my_connection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, name);
            st.setString(2, Address);
            st.setString(3, email);
            st.setString(4, Tele);
            st.setString(5, exp);
            st.setString(6, Desg);
            st.setString(7, Dep);
            st.setString(8, Basicsal);
            
            
            return (st.executeUpdate() > 0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    //create a function to edit the selected client
    public boolean editEmployee(int empid,String name,String Address, String email,String Tele, String exp, String Desg,String Dep, String Basicsal)
    {
        PreparedStatement st;
        String editQuery="UPDATE `employee` SET `Name`=?,`Address`=?,`Email`=?,`Telephone`=?,`Experience`=?,`Designation`=?,`Department`=?,`BasicSalary`=? WHERE `EmpID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, name);
            st.setString(2, Address);
            st.setString(3, email);
            st.setString(4, Tele);
            st.setString(5, exp);
            st.setString(6, Desg);
            st.setString(7, Dep);
            st.setString(8, Basicsal);
            st.setInt(9, empid);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    //create a function to remove the selected client
     public boolean removeEmployee(int EmpID){
         PreparedStatement st;
         String deleteQuery="DELETE FROM `employee` WHERE `EmpID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, EmpID);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
     }
    //create a function to return a list of all client(Jtable)
    public void fillEmployeeJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery="SELECT * FROM `employee`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            rs= ps.executeQuery();
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            while(rs.next()){
                row = new Object[9];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                
                tablemodel.addRow(row);
                   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
