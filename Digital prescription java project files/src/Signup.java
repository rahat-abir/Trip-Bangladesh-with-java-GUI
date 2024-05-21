/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import project.InsertUpdateDelete;
/**
 *
 * @author rahat
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtphonenumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_date = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cb_month = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cb_year = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtpass1 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        txtpass2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        cb_gender = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 45)); // NOI18N
        jLabel1.setText("Sign Up");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 150, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("First name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 241, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Last name: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 241, -1, -1));
        getContentPane().add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 272, 210, -1));
        getContentPane().add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 272, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Username: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 294, -1, -1));
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 325, 210, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Phone number: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 294, -1, -1));
        getContentPane().add(txtphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 325, 210, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("Email: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 365, -1, -1));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 396, 210, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 365, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setText("Date of Birth: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 436, -1, -1));

        jLabel9.setText("Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 443, -1, -1));

        cb_date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(cb_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 440, -1, -1));

        jLabel10.setText("Month");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 443, -1, -1));

        cb_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        getContentPane().add(cb_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        jLabel11.setText("Year");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 443, -1, -1));

        cb_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2030", "2029", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981" }));
        getContentPane().add(cb_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("Password:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 480, -1, -1));
        getContentPane().add(txtpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 511, 210, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel13.setText("Confirm password: ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 539, -1, -1));
        getContentPane().add(txtpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 570, 210, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 101, -1));

        jLabel14.setText("Already have an account?? ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, -1, 24));

        jButton3.setText("log in");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, -1, -1));

        cb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "other" }));
        getContentPane().add(cb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 210, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main BG.png"))); // NOI18N
        jLabel15.setToolTipText("");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, -1, 880));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection con1;
    PreparedStatement insert;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtfirstname.setText("");
        txtlastname.setText("");
        txtpass1.setText("");
        txtpass2.setText("");
        txtphonenumber.setText("");
        txtusername.setText("");
        txtemail.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String firstname=txtfirstname.getText();
        String lastname=txtlastname.getText();
        String username=txtusername.getText();
        String email=txtemail.getText();
        String gender= cb_gender.getSelectedItem().toString();
        String date= cb_date.getSelectedItem().toString();
        String month= cb_month.getSelectedItem().toString();
        String year= cb_year.getSelectedItem().toString();
        String phonenumber=txtphonenumber.getText();
        String password1=txtpass1.getText();
        String password2=txtpass2.getText();
        if(firstname.equals("")||lastname.equals("")||username.equals("")||email.equals("")|| gender.equals("")||date.equals("")||month.equals("")|| year.equals("")|| phonenumber.equals("")||password1.equals("")||password2.equals("")){
            JOptionPane.showMessageDialog(null, "Every field must be filled");
        }else if(!password1.equals(password2)){
            JOptionPane.showMessageDialog(null,"both passwords are not same");
        }else{
            String Query;
            Query="insert into tbl_reg values('"+username+"','"+password1+"','"+firstname+"','"+lastname+"','"+phonenumber+"','"+email+"','"+gender+"','"+date+"','"+month+"','"+year+"')";
            InsertUpdateDelete.setData(Query, "Sign up Successfull, account created");
        }

        
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con1=DriverManager.getConnection("Jdbc:mysql://localhost/tbl_reg","root","");
//            insert= con1.prepareStatement("insert into tbl_reg(username,password,first_name,last_name,phone_number,Email,gender,date,month,year) values(?,?,?,?,?,?,?,?,?,?)");
//            insert.setString(1, username);
//            insert.setString(2, password1);
//            insert.setString(3, firstname);
//            insert.setString(4, lastname);
//            insert.setString(5, phonenumber);
//            insert.setString(6, email);
//            insert.setString(7, gender);
//            insert.setString(8, date);
//            insert.setString(9, month);
//            insert.setString(10, year);
//            insert.executeUpdate();
//            
//            JOptionPane.showMessageDialog(null, "Sign up SUCCESSFULL, data recorded");
//            
//            
//        }catch (ClassNotFoundException ex) {
//            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
//        }catch (SQLException ex) {
//            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_date;
    private javax.swing.JComboBox<String> cb_gender;
    private javax.swing.JComboBox<String> cb_month;
    private javax.swing.JComboBox<String> cb_year;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JPasswordField txtpass1;
    private javax.swing.JPasswordField txtpass2;
    private javax.swing.JTextField txtphonenumber;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}