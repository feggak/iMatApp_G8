/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

/**
 *
 * @author frellAn
 */
public class MainWindow extends javax.swing.JFrame {

    Controller controller;
    private static boolean isLoggedIn;
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/appicon.png")).getImage());
        controller = Controller.getInstance();
        initComponents();
        loginPopup.setVisible(false);
        breadcrumbs.setVisible(false);
        controller.updateCartHeader();
        cartDropdown.setVisible(false);
        cartDropdown.update();
        controller.changeCategoryView("store");
    }
    
    public static void setLoginBtnLabel(){
        if (getIsLoggedIn()){
            loginAndUserBtn.setText("Logga ut");
            accountBtn.setText("Mitt Konto");
        } else {
            loginAndUserBtn.setText("Logga in");
            accountBtn.setText("Registrera");
        }
    }
    public static void setIsLoggedIn(boolean b){
        isLoggedIn = b;
    }
    
    public static boolean getIsLoggedIn(){
        return isLoggedIn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        cartDropdown = new imatapp_g8.CartDropdown();
        loginPopup = new imatapp_g8.LoginPopup();
        topPanel = new javax.swing.JPanel();
        storeBtn = new javax.swing.JButton();
        recipeBtn = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        cartIcon = new javax.swing.JLabel();
        cartLabel = new javax.swing.JLabel();
        cartTotalLabel = new javax.swing.JLabel();
        arrowIcon = new javax.swing.JLabel();
        checkoutBtn = new javax.swing.JButton();
        cartBtn = new javax.swing.JButton();
        loginAndUserBtn = new javax.swing.JButton();
        accountBtn = new javax.swing.JButton();
        breadcrumbs = new imatapp_g8.Breadcrumbs();
        categoryPanel = new imatapp_g8.CategoryPanel();
        contentPanel = new javax.swing.JPanel();
        welcomePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iMat");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1156, 720));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(cartDropdown);
        cartDropdown.setBounds(874, 47, 276, 460);
        getContentPane().add(loginPopup);
        loginPopup.setBounds(670, 25, 290, 260);

        topPanel.setBackground(new java.awt.Color(226, 87, 76));
        topPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        topPanel.setPreferredSize(new java.awt.Dimension(1050, 47));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        storeBtn.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
        storeBtn.setForeground(new java.awt.Color(255, 255, 255));
        storeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon.png"))); // NOI18N
        storeBtn.setAlignmentY(0.0F);
        storeBtn.setContentAreaFilled(false);
        storeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        storeBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        storeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        storeBtn.setIconTextGap(0);
        storeBtn.setLabel("Butik");
        storeBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        storeBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        storeBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        storeBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        storeBtn.setRequestFocusEnabled(false);
        storeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon_rollover.png"))); // NOI18N
        storeBtn.setSelected(true);
        storeBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon_selected.png"))); // NOI18N
        storeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeBtnActionPerformed(evt);
            }
        });
        topPanel.add(storeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 46));

        recipeBtn.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
        recipeBtn.setForeground(new java.awt.Color(255, 255, 255));
        recipeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon.png"))); // NOI18N
        recipeBtn.setText("Recept");
        recipeBtn.setAlignmentY(0.0F);
        recipeBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        recipeBtn.setContentAreaFilled(false);
        recipeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recipeBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        recipeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        recipeBtn.setIconTextGap(0);
        recipeBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        recipeBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        recipeBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        recipeBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        recipeBtn.setRequestFocusEnabled(false);
        recipeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon_rollover.png"))); // NOI18N
        recipeBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon_selected.png"))); // NOI18N
        topPanel.add(recipeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 46));

        searchButton.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchButton.setAlignmentY(0.0F);
        searchButton.setBorder(null);
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        searchButton.setDefaultCapable(false);
        searchButton.setFocusPainted(false);
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton.setIconTextGap(0);
        searchButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        searchButton.setName(""); // NOI18N
        searchButton.setRequestFocusEnabled(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        topPanel.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 7, 32, 32));

        searchField.setText("Sök...");
        searchField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });
        topPanel.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 7, 370, 32));

        cartIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cart2.png"))); // NOI18N
        cartIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topPanel.add(cartIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 6, 33, 34));

        cartLabel.setFont(new java.awt.Font("Myriad Pro", 0, 13)); // NOI18N
        cartLabel.setForeground(new java.awt.Color(255, 255, 255));
        cartLabel.setText("Inga varor");
        cartLabel.setAlignmentY(0.0F);
        cartLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topPanel.add(cartLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(922, 7, 70, -1));

        cartTotalLabel.setFont(new java.awt.Font("Myriad Pro", 0, 13)); // NOI18N
        cartTotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        cartTotalLabel.setText(" ");
        cartTotalLabel.setAlignmentY(0.0F);
        cartTotalLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topPanel.add(cartTotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(922, 25, 70, -1));

        arrowIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow.png"))); // NOI18N
        arrowIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topPanel.add(arrowIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 29, 28));

        checkoutBtn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        checkoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        checkoutBtn.setText("Till kassan");
        checkoutBtn.setAlignmentY(0.0F);
        checkoutBtn.setBorder(null);
        checkoutBtn.setBorderPainted(false);
        checkoutBtn.setContentAreaFilled(false);
        checkoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkoutBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        checkoutBtn.setDefaultCapable(false);
        checkoutBtn.setFocusPainted(false);
        checkoutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        checkoutBtn.setIconTextGap(0);
        checkoutBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        checkoutBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        checkoutBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        checkoutBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        checkoutBtn.setRequestFocusEnabled(false);
        checkoutBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        checkoutBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        checkoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBtnActionPerformed(evt);
            }
        });
        topPanel.add(checkoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1028, 6, 118, 36));

        cartBtn.setFont(new java.awt.Font("Open Sans Semibold", 0, 20)); // NOI18N
        cartBtn.setForeground(new java.awt.Color(255, 255, 255));
        cartBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon.png"))); // NOI18N
        cartBtn.setAlignmentY(0.0F);
        cartBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        cartBtn.setContentAreaFilled(false);
        cartBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cartBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cartBtn.setIconTextGap(0);
        cartBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cartBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        cartBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        cartBtn.setPreferredSize(new java.awt.Dimension(150, 46));
        cartBtn.setRequestFocusEnabled(false);
        cartBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon_rollover.png"))); // NOI18N
        cartBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon_selected.png"))); // NOI18N
        cartBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        cartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBtnActionPerformed(evt);
            }
        });
        topPanel.add(cartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 0, 276, 46));

        loginAndUserBtn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        loginAndUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginAndUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        loginAndUserBtn.setText("Logga in");
        loginAndUserBtn.setAlignmentY(0.0F);
        loginAndUserBtn.setBorder(null);
        loginAndUserBtn.setBorderPainted(false);
        loginAndUserBtn.setContentAreaFilled(false);
        loginAndUserBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginAndUserBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        loginAndUserBtn.setDefaultCapable(false);
        loginAndUserBtn.setFocusPainted(false);
        loginAndUserBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginAndUserBtn.setIconTextGap(0);
        loginAndUserBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        loginAndUserBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        loginAndUserBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        loginAndUserBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        loginAndUserBtn.setRequestFocusEnabled(false);
        loginAndUserBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        loginAndUserBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        loginAndUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAndUserBtnActionPerformed(evt);
            }
        });
        topPanel.add(loginAndUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 6, 118, 36));

        accountBtn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        accountBtn.setForeground(new java.awt.Color(255, 255, 255));
        accountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        accountBtn.setText("Registrera");
        accountBtn.setAlignmentY(0.0F);
        accountBtn.setBorderPainted(false);
        accountBtn.setContentAreaFilled(false);
        accountBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        accountBtn.setDefaultCapable(false);
        accountBtn.setFocusPainted(false);
        accountBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        accountBtn.setIconTextGap(0);
        accountBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        accountBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        accountBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        accountBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        accountBtn.setRequestFocusEnabled(false);
        accountBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        accountBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        accountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBtnActionPerformed(evt);
            }
        });
        topPanel.add(accountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 6, 118, 36));

        getContentPane().add(topPanel);
        topPanel.setBounds(0, 0, 1150, 47);
        getContentPane().add(breadcrumbs);
        breadcrumbs.setBounds(220, 47, 930, 30);

        categoryPanel.setPreferredSize(new java.awt.Dimension(220, 550));
        getContentPane().add(categoryPanel);
        categoryPanel.setBounds(0, 47, 220, 681);

        contentPanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                contentPanelComponentAdded(evt);
            }
        });
        contentPanel.setLayout(new java.awt.BorderLayout());

        welcomePanel.setPreferredSize(new java.awt.Dimension(930, 630));
        welcomePanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Välkommen till iMat");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        welcomePanel.add(jLabel1);
        jLabel1.setBounds(180, 230, 570, 130);

        contentPanel.add(welcomePanel, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(contentPanel);
        contentPanel.setBounds(220, 47, 930, 680);

        menuBar.setBorder(null);

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Reset");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void storeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeBtnActionPerformed
        controller.showFeatured();
        categoryPanel.resetAllStoreFontsExceptFeatured();
        storeBtn.setSelected(true);
        recipeBtn.setSelected(false);
    }//GEN-LAST:event_storeBtnActionPerformed

    private void loginAndUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAndUserBtnActionPerformed
        if(isLoggedIn){
            Controller.db.shutDown();
            controller.setIsLoggedIn(false);
            controller.toggleLoginBtn(false);
            if (Controller.accountPanelVisible) {
                controller.showFeatured();
            }
            accountBtn.setText("Registrera");
        } else {
            if (!loginPopup.isVisible()) {
                loginPopup.setVisible(true);
            } else {
                loginPopup.setVisible(false);
            }
        }
    }//GEN-LAST:event_loginAndUserBtnActionPerformed

    private void cartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBtnActionPerformed
        if (!cartDropdown.isVisible()) {
            cartDropdown.setVisible(true);
        } else {
            cartDropdown.setVisible(false);
        }
    }//GEN-LAST:event_cartBtnActionPerformed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        searchField.setText("");
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        searchField.setText("Sök...");
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            categoryPanel.resetAllStoreFonts();
            controller.showShopSearch(searchField.getText());
            controller.updateBreadcrumbs("Sök",searchField.getText(),null);
        }
    }//GEN-LAST:event_searchFieldKeyPressed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        categoryPanel.resetAllStoreFonts();
        controller.showShopSearch(searchField.getText());
        controller.updateBreadcrumbs("Sök",searchField.getText(),null);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void checkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtnActionPerformed
        categoryPanel.resetAllStoreFonts();
        controller.showShoppingCartPanel();
    }//GEN-LAST:event_checkoutBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Controller.db.shutDown();
    }//GEN-LAST:event_formWindowClosing

    private void contentPanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_contentPanelComponentAdded
        loginPopup.setVisible(false);
        cartDropdown.setVisible(false);
    }//GEN-LAST:event_contentPanelComponentAdded

    private void accountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountBtnActionPerformed
        if (isLoggedIn) {
            controller.showAccount();
        } else {
            controller.showRegister();
        }
    }//GEN-LAST:event_accountBtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Controller.db.reset();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton accountBtn;
    private javax.swing.JLabel arrowIcon;
    protected static imatapp_g8.Breadcrumbs breadcrumbs;
    private javax.swing.JButton cartBtn;
    protected static imatapp_g8.CartDropdown cartDropdown;
    private javax.swing.JLabel cartIcon;
    protected static javax.swing.JLabel cartLabel;
    protected static javax.swing.JLabel cartTotalLabel;
    protected static imatapp_g8.CategoryPanel categoryPanel;
    private javax.swing.JButton checkoutBtn;
    protected static javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private static javax.swing.JButton loginAndUserBtn;
    protected static imatapp_g8.LoginPopup loginPopup;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton recipeBtn;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton storeBtn;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}
