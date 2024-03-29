/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schoolattendancesystem;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
/**
 *
 * @author TIRTHANKAR KHAUND
 */
public class AttendancePage extends javax.swing.JFrame {

    /**
     * Creates new form AttendancePage
     */
    public AttendancePage() {
        initComponents();
        getContentPane().setBackground(Color.yellow);
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
        jLabel2 = new javax.swing.JLabel();
        txtStudId = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnDelTable = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        panelRes = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        taRes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cbAttendance = new javax.swing.JComboBox<>();
        btnShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("         Attendance Management ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Enter student id");

        btnUpdate.setBackground(new java.awt.Color(51, 0, 255));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(153, 0, 153));
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setText("Delete");
        btnDel.setBorder(null);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnDelTable.setBackground(new java.awt.Color(255, 51, 51));
        btnDelTable.setForeground(new java.awt.Color(255, 255, 255));
        btnDelTable.setText("Clear Data");
        btnDelTable.setBorder(null);
        btnDelTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelTableActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 204, 0));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.setBorder(null);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 0, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("←");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        panelRes.setBackground(new java.awt.Color(102, 102, 102));
        panelRes.setForeground(new java.awt.Color(0, 255, 51));

        taRes.setBackground(new java.awt.Color(102, 102, 102));
        taRes.setColumns(20);
        taRes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        taRes.setForeground(new java.awt.Color(51, 255, 0));
        taRes.setRows(5);
        taRes.setBorder(null);
        jScrollPane1.setViewportView(taRes);

        javax.swing.GroupLayout panelResLayout = new javax.swing.GroupLayout(panelRes);
        panelRes.setLayout(panelResLayout);
        panelResLayout.setHorizontalGroup(
            panelResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResLayout.createSequentialGroup()
                .addContainerGap(634, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelResLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        panelResLayout.setVerticalGroup(
            panelResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResLayout.createSequentialGroup()
                    .addContainerGap(32, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Attendance");

        cbAttendance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent" }));

        btnShow.setBackground(new java.awt.Color(255, 102, 0));
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("Show");
        btnShow.setBorder(null);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStudId, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(panelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(panelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelTableActionPerformed
        // TODO add your handling code here:
         if(txtStudId.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "All fields are empty!");
        }
        else{
        
            if(txtStudId.getText().length()!=7){
                JOptionPane.showMessageDialog(this, "Incorrect input!");
            }
            else{
              
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String db="jdbc:mysql://localhost:3306/attendancemanagement";
                    String username="root";
                    String password="Trishala@99";
                    Connection con=DriverManager.getConnection(db, username, password);
                    String query="truncate table login";
                    PreparedStatement pst=con.prepareStatement(query);
                    pst.executeQuery();
                    int count=pst.executeUpdate();
                     if(count>0){
                    JOptionPane.showMessageDialog(this, "Table delete successful!");
                    }else{
                    JOptionPane.showMessageDialog(this, "Table delete failed!");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AttendancePage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AttendancePage.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }
    }//GEN-LAST:event_btnDelTableActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtStudId.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        LandingPage obj=new LandingPage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(txtStudId.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "All fields are empty!");
        }
        else{
        
            if(txtStudId.getText().length()!=7){
                JOptionPane.showMessageDialog(this, "Incorrect input!");
            }
            else{
              
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String db="jdbc:mysql://localhost:3306/attendancemanagement";
                    String username="root";
                    String password="Trishala@99";
                    Connection con=DriverManager.getConnection(db, username, password);
                    String query="update login set attendance=? where studentid=?";
                    PreparedStatement pst=con.prepareStatement(query);
                    String s=cbAttendance.getSelectedItem().toString();
                    pst.setString(1, s);
                    pst.setString(2, txtStudId.getText());
                    int count=pst.executeUpdate();
                     if(count>0){
                    JOptionPane.showMessageDialog(this, "Update successful!");
                    }else{
                    JOptionPane.showMessageDialog(this, "Update failed!");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AttendancePage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AttendancePage.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
         if(txtStudId.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "All fields are empty!");
        }
        else{
        
            if(txtStudId.getText().length()!=7){
                JOptionPane.showMessageDialog(this, "Incorrect input!");
            }
            else{
              
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String db="jdbc:mysql://localhost:3306/attendancemanagement";
                    String username="root";
                    String password="Trishala@99";
                    Connection con=DriverManager.getConnection(db, username, password);
                    String query="delete from login where studentid=?";
                    PreparedStatement pst=con.prepareStatement(query);
                    pst.setString(1, txtStudId.getText());
                    int count=pst.executeUpdate();
                     if(count>0){
                    JOptionPane.showMessageDialog(this, "Delete successful!");
                    }else{
                    JOptionPane.showMessageDialog(this, "Delete failed!");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AttendancePage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AttendancePage.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            String db="jdbc:mysql://localhost:3306/attendancemanagement";
            String username="root";
            String password="Trishala@99";
            Connection con=DriverManager.getConnection(db, username, password);
            String query="select name, studentid, attendance from login";
            PreparedStatement pst=con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                String name=rs.getString("name");
                String id=rs.getString("studentid");
                String attendance=rs.getString("attendance");
                String res=" "+name+" "+id+" "+attendance+"\n";
                taRes.append(res);
              }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AttendancePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AttendancePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowActionPerformed

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
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendancePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDelTable;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbAttendance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelRes;
    private javax.swing.JTextArea taRes;
    private javax.swing.JTextField txtStudId;
    // End of variables declaration//GEN-END:variables
}
