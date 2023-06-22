
package library;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AdminLogin extends javax.swing.JFrame {

    public AdminLogin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminLogin = new javax.swing.JPanel();
        adminUserID = new javax.swing.JTextField();
        adminLogIn = new javax.swing.JButton();
        banner = new javax.swing.JLabel();
        adminPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(61, 140, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 800));

        adminLogin.setBackground(new java.awt.Color(86, 128, 213));
        adminLogin.setPreferredSize(new java.awt.Dimension(1080, 700));

        adminUserID.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        adminUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUserIDActionPerformed(evt);
            }
        });

        adminLogIn.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        adminLogIn.setText("Login");
        adminLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogInActionPerformed(evt);
            }
        });

        banner.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner.setText("Administrator Panel");

        adminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminLoginLayout = new javax.swing.GroupLayout(adminLogin);
        adminLogin.setLayout(adminLoginLayout);
        adminLoginLayout.setHorizontalGroup(
            adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLoginLayout.createSequentialGroup()
                .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminLoginLayout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(adminLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminLoginLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                            .addComponent(adminPassword))))
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminLoginLayout.createSequentialGroup()
                    .addGap(186, 186, 186)
                    .addComponent(adminUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(222, Short.MAX_VALUE)))
        );
        adminLoginLayout.setVerticalGroup(
            adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLoginLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addComponent(adminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(adminLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminLoginLayout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(adminUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUserIDActionPerformed
        
    }//GEN-LAST:event_adminUserIDActionPerformed

    private void adminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPasswordActionPerformed

    }//GEN-LAST:event_adminPasswordActionPerformed

    
    //Using the validator and Authenticator class to check the validity of the admin login inputs
    private void adminLogInActionPerformed(java.awt.event.ActionEvent evt) {
        
        boolean has_error = false;
        try{
            new Validator(adminUserID.getText(), adminPassword.getText());
        }catch (InvalidInput e){
            has_error = true;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            new Authenticator(adminUserID.getText(), adminPassword.getText(), 0);
        }
        catch (InvalidCredentials invalidCredentials) {
            has_error = true;
            JOptionPane.showMessageDialog(null, invalidCredentials.getMessage());
        }
        if(!has_error){
            setVisible(false);
            new AdminHomepage().setVisible(true);
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLogIn;
    private javax.swing.JPanel adminLogin;
    private javax.swing.JPasswordField adminPassword;
    private javax.swing.JTextField adminUserID;
    private javax.swing.JLabel banner;
    // End of variables declaration//GEN-END:variables
}
