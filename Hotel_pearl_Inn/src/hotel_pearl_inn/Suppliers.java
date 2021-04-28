/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_pearl_inn;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chathu_PC
 */
public class Suppliers extends javax.swing.JFrame {

    Supplier_class s = new Supplier_class();
    public Suppliers() {
        initComponents();
        
         //populate the jtable
        s.fillSupplierJTable(jTable1);
     
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldsupname = new javax.swing.JTextField();
        jTextFieldsuptype = new javax.swing.JTextField();
        jTextFieldphno = new javax.swing.JTextField();
        jTextFieldcity = new javax.swing.JTextField();
        jButtonadd = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jButtonref = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldsupid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Supplier Management");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Supplier Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Supplier Type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phone Number");

        jLabel5.setText("City");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Supplier Name", "Supplier Typel", "Phone Number", "City"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}

    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jButtonadd.setBackground(new java.awt.Color(102, 102, 255));
    jButtonadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonadd.setText("Add");
    jButtonadd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonaddActionPerformed(evt);
        }
    });

    jButtonupdate.setBackground(new java.awt.Color(102, 102, 255));
    jButtonupdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonupdate.setText("Update");
    jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonupdateActionPerformed(evt);
        }
    });

    jButtondelete.setBackground(new java.awt.Color(102, 102, 255));
    jButtondelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtondelete.setText("Delete");
    jButtondelete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtondeleteActionPerformed(evt);
        }
    });

    jButtonclear.setBackground(new java.awt.Color(102, 102, 255));
    jButtonclear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonclear.setText("Clear Fields");
    jButtonclear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonclearActionPerformed(evt);
        }
    });

    jButtonref.setBackground(new java.awt.Color(102, 102, 255));
    jButtonref.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonref.setText("Refresh");
    jButtonref.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonrefActionPerformed(evt);
        }
    });

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel6.setText("ID");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(148, 148, 148)
                    .addComponent(jButtonupdate)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtondelete)
                    .addGap(90, 90, 90))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldphno, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldsupname, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldsupid, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(315, 315, 315)
                                        .addComponent(jTextFieldsuptype, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldcity, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel6)
                                .addComponent(jLabel3))
                            .addGap(0, 2, Short.MAX_VALUE)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(162, 162, 162)
            .addComponent(jButtonref, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(55, 55, 55))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(487, 487, 487)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(jLabel1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldsupid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel2)
                            .addGap(54, 54, 54))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldsupname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldsuptype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(46, 46, 46)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldphno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(50, 50, 50)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(76, 76, 76)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jButtonref, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(25, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
       //get data from the fields
        String supname= jTextFieldsupname.getText();
        String suptype= jTextFieldsuptype.getText();
        String phno= jTextFieldphno.getText();
        String city= jTextFieldcity.getText();
        
        if(supname.trim().equals("")|| suptype.trim().equals("")|| phno.trim().equals("")|| city.trim().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Required Fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            }else{
                if(s.addSupplier( supname, suptype, phno, city )){
                JOptionPane.showMessageDialog(rootPane, "New Supplier Added Successfully", "Add Supplier", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Supplier not Added", "Add Supplier Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    
        
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
       //get data from the fields
        int supid = 0;
        String supname= jTextFieldsupname.getText();
        String suptype= jTextFieldsuptype.getText();
        String phno= jTextFieldphno.getText();
        String city= jTextFieldcity.getText();
        
        if(supname.trim().equals("")|| suptype.trim().equals("")|| phno.trim().equals("")|| city.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "All Fields are Required", "Empty Fields", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                supid = Integer.valueOf(jTextFieldsupid.getText()); 
            }catch(NumberFormatException ex ){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"- Enter the Employee ID(number)","Employee ID Error ", JOptionPane.WARNING_MESSAGE);
            }
        }
            if(s.editSupplier( supid, supname , suptype ,  phno, city)){
            JOptionPane.showMessageDialog(rootPane, "Supplier Updateded Successfully", "Updateded Supplier", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Supplier not Updateded", "Updateded Supplier Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //get the jtable model
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        //get the selected raw indexes
        int rIndex = jTable1.getSelectedRow();
        
        //display data
        jTextFieldsupid.setText(model.getValueAt(rIndex, 0).toString());
        jTextFieldsupname.setText(model.getValueAt(rIndex, 1).toString());
        jTextFieldsuptype.setText(model.getValueAt(rIndex, 2).toString());
        jTextFieldphno.setText(model.getValueAt(rIndex, 3).toString());
        jTextFieldcity.setText(model.getValueAt(rIndex, 4).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        // delete the selected client
        try{
               int supid = Integer.valueOf(jTextFieldsupid.getText()); 
               
               if(s.removeSupplier(supid)){
                    JOptionPane.showMessageDialog(rootPane, "Supplier Removed Successfully", "Remove Supplier", JOptionPane.INFORMATION_MESSAGE);
               }else{
                    JOptionPane.showMessageDialog(rootPane, "Supplier not Remved", "Removed Supplier Error", JOptionPane.ERROR_MESSAGE);
            
        }
            }catch(NumberFormatException ex ){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"- Enter the Supplier ID(number)","Supplier ID Error ", JOptionPane.WARNING_MESSAGE);
            }
       
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
         // remove text from all the jtextboxes
        jTextFieldsupid.setText("");
        jTextFieldsupname.setText("");
        jTextFieldsuptype.setText("");
        jTextFieldphno.setText("");        
        jTextFieldcity.setText("");   
        
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtonrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrefActionPerformed
           //clear the jtable first
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"supid", "supname", "suptype", "phno", "city"} ));
        
        //populate the jtable
        s.fillSupplierJTable(jTable1);
    }//GEN-LAST:event_jButtonrefActionPerformed

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
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonref;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldcity;
    private javax.swing.JTextField jTextFieldphno;
    private javax.swing.JTextField jTextFieldsupid;
    private javax.swing.JTextField jTextFieldsupname;
    private javax.swing.JTextField jTextFieldsuptype;
    // End of variables declaration//GEN-END:variables

   
}