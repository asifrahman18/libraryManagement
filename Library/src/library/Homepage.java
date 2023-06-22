package library;

/**
 * @author a184
 */
public class Homepage extends javax.swing.JFrame {

    public Homepage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homepage = new javax.swing.JPanel();
        librarian = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        banner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(61, 140, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 800));

        homepage.setBackground(new java.awt.Color(86, 128, 213));
        homepage.setPreferredSize(new java.awt.Dimension(1080, 700));

        librarian.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        librarian.setText("Librarian");
        librarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                librarianMouseClicked(evt);
            }
        });

        admin.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        admin.setText("Administrator");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        banner.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner.setText("Welcome To The Library");

        javax.swing.GroupLayout homepageLayout = new javax.swing.GroupLayout(homepage);
        homepage.setLayout(homepageLayout);
        homepageLayout.setHorizontalGroup(
                homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homepageLayout.createSequentialGroup()
                                .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(homepageLayout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(homepageLayout.createSequentialGroup()
                                                .addGap(387, 387, 387)
                                                .addComponent(librarian, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(145, Short.MAX_VALUE))
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(homepageLayout.createSequentialGroup()
                                        .addGap(386, 386, 386)
                                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(409, Short.MAX_VALUE)))
        );
        homepageLayout.setVerticalGroup(
                homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homepageLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                                .addComponent(librarian, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homepageLayout.createSequentialGroup()
                                        .addContainerGap(368, Short.MAX_VALUE)
                                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(257, 257, 257)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(homepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(homepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void librarianMouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        new LibrarianLogin().setVisible(true);
    }

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new AdminLogin().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JLabel banner;
    private javax.swing.JPanel homepage;
    private javax.swing.JButton librarian;
    // End of variables declaration//GEN-END:variables
}
