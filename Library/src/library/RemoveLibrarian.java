
package library;

import javax.swing.*;
import java.io.IOException;

public class RemoveLibrarian extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public RemoveLibrarian() {
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

        removeLibrarian = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        librarianName = new javax.swing.JTextField();
        librarianEmail1 = new javax.swing.JTextField();
        librarianID = new javax.swing.JTextField();
        librarianPhone = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        homeButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(61, 140, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 800));

        removeLibrarian.setBackground(new java.awt.Color(86, 128, 213));
        removeLibrarian.setPreferredSize(new java.awt.Dimension(1080, 700));

        banner.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner.setText("Remove Librarian");

        librarianName.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        librarianName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarianNameActionPerformed(evt);
            }
        });

        librarianEmail1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        librarianID.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        librarianID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarianIDActionPerformed(evt);
            }
        });

        librarianPhone.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        saveButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        homeButton1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        homeButton1.setText("Home");
        homeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Phone");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("User ID");

        javax.swing.GroupLayout removeLibrarianLayout = new javax.swing.GroupLayout(removeLibrarian);
        removeLibrarian.setLayout(removeLibrarianLayout);
        removeLibrarianLayout.setHorizontalGroup(
            removeLibrarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeLibrarianLayout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeLibrarianLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(removeLibrarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(removeLibrarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(librarianPhone)
                    .addComponent(librarianID)
                    .addComponent(librarianEmail1)
                    .addComponent(librarianName, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(356, 356, 356))
            .addGroup(removeLibrarianLayout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addGroup(removeLibrarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeButton1)
                    .addComponent(saveButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        removeLibrarianLayout.setVerticalGroup(
            removeLibrarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeLibrarianLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(removeLibrarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(librarianName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(removeLibrarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(librarianEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(removeLibrarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(librarianID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(removeLibrarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(librarianPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(120, 120, 120)
                .addComponent(saveButton)
                .addGap(34, 34, 34)
                .addComponent(homeButton1)
                .addGap(145, 145, 145))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removeLibrarian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removeLibrarian, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void librarianNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarianNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_librarianNameActionPerformed

    private void librarianIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarianIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_librarianIDActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        FileIO file = new FileIO();
        try {
            file.removeLibrarian(librarianID.getText(),librarianName.getText(), librarianEmail1.getText(), librarianPhone.getText());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Not found!");
        }
        JOptionPane.showMessageDialog(null, "Librarian Removed");
        setVisible(false);
        new AdminHomepage().setVisible(true);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void homeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminHomepage().setVisible(true);
    }//GEN-LAST:event_homeButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton homeButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField librarianEmail1;
    private javax.swing.JTextField librarianID;
    private javax.swing.JTextField librarianName;
    private javax.swing.JTextField librarianPhone;
    private javax.swing.JPanel removeLibrarian;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
