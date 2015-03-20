/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.*;
import javax.swing.JButton;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class CategoryPanel extends javax.swing.JPanel {

    Controller controller;
    
    /**
     * Creates new form CategoryPanel
     */
    public CategoryPanel() {
        controller = Controller.getInstance();
        initComponents();
        resetAllStoreFonts();
    }
    
    public void makeBoldAndUnderlined(JButton label) {
        Font font = label.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.WEIGHT,TextAttribute.WEIGHT_BOLD);
        attributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        label.setFont(font.deriveFont(attributes));
    }
    
    public void resetAllStoreFontsExceptFeatured() {
        makeBoldAndUnderlined(kampanjBtn);
        fruitVegetablesBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        meatBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        breadBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        dairyEggBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        drinksBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        pantryBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        sweetsBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        meatBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        showAllBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
    }
    
    public void resetAllStoreFonts() {
        fruitVegetablesBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        meatBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        breadBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        dairyEggBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        drinksBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        pantryBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        sweetsBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        kampanjBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        meatBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        showAllBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
    }
    
    public void resetAllAccountFontsExceptSettings() {
        makeBoldAndUnderlined(accountSettingsBtn);
        favoritesBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        pastOrdersBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
    }
    
    public void resetAllAccountFonts() {
        accountSettingsBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        favoritesBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
        pastOrdersBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16));
    }
    
    public void setBuyStage(int stage) {
        if (stage == 1) {
            check1Icon.setVisible(false);
            check2Icon.setVisible(false);
            dot1Icon.setVisible(true);
            dot2Icon.setVisible(false);
            dot3Icon.setVisible(false);
        }
        if (stage == 2) {
            check1Icon.setVisible(true);
            check2Icon.setVisible(false);
            dot1Icon.setVisible(false);
            dot2Icon.setVisible(true);
            dot3Icon.setVisible(false);
        }
        if (stage == 3) {
            check1Icon.setVisible(true);
            check2Icon.setVisible(true);
            dot1Icon.setVisible(false);
            dot2Icon.setVisible(false);
            dot3Icon.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        storeView = new javax.swing.JPanel();
        kampanjBtn = new javax.swing.JButton();
        showAllBtn = new javax.swing.JButton();
        storeSeparator = new javax.swing.JSeparator();
        fruitVegetablesBtn = new javax.swing.JButton();
        breadBtn = new javax.swing.JButton();
        meatBtn = new javax.swing.JButton();
        dairyEggBtn = new javax.swing.JButton();
        pantryBtn = new javax.swing.JButton();
        drinksBtn = new javax.swing.JButton();
        sweetsBtn = new javax.swing.JButton();
        searchView = new javax.swing.JPanel();
        searchResultLabel = new javax.swing.JLabel();
        buyView = new javax.swing.JPanel();
        step1Label = new javax.swing.JLabel();
        step2Label = new javax.swing.JLabel();
        step2Label1 = new javax.swing.JLabel();
        check1Icon = new javax.swing.JLabel();
        check2Icon = new javax.swing.JLabel();
        dot1Icon = new javax.swing.JLabel();
        dot2Icon = new javax.swing.JLabel();
        dot3Icon = new javax.swing.JLabel();
        treeIcon = new javax.swing.JLabel();
        accountPanel = new javax.swing.JPanel();
        accountSettingsBtn = new javax.swing.JButton();
        favoritesBtn = new javax.swing.JButton();
        pastOrdersBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(50, 77, 91));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(220, 0));
        setLayout(new java.awt.CardLayout());

        storeView.setBackground(new java.awt.Color(50, 77, 91));
        storeView.setMinimumSize(new java.awt.Dimension(220, 0));
        storeView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kampanjBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        kampanjBtn.setForeground(new java.awt.Color(255, 255, 255));
        kampanjBtn.setText("Kampanjvaror");
        kampanjBtn.setAlignmentY(0.0F);
        kampanjBtn.setBorder(null);
        kampanjBtn.setBorderPainted(false);
        buttonGroup.add(kampanjBtn);
        kampanjBtn.setContentAreaFilled(false);
        kampanjBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kampanjBtn.setFocusPainted(false);
        kampanjBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        kampanjBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kampanjBtnActionPerformed(evt);
            }
        });
        storeView.add(kampanjBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, -1));

        showAllBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        showAllBtn.setForeground(new java.awt.Color(255, 255, 255));
        showAllBtn.setText("Visa alla varor");
        showAllBtn.setAlignmentY(0.0F);
        showAllBtn.setBorder(null);
        showAllBtn.setBorderPainted(false);
        buttonGroup.add(showAllBtn);
        showAllBtn.setContentAreaFilled(false);
        showAllBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showAllBtn.setFocusPainted(false);
        showAllBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        showAllBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        showAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllBtnActionPerformed(evt);
            }
        });
        storeView.add(showAllBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 38, -1, -1));

        storeSeparator.setBackground(new java.awt.Color(0, 0, 0));
        storeSeparator.setForeground(new java.awt.Color(255, 255, 255));
        storeView.add(storeSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 200, 10));

        fruitVegetablesBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        fruitVegetablesBtn.setForeground(new java.awt.Color(255, 255, 255));
        fruitVegetablesBtn.setText("Frukt & Grönt");
        fruitVegetablesBtn.setAlignmentY(0.0F);
        fruitVegetablesBtn.setBorder(null);
        fruitVegetablesBtn.setBorderPainted(false);
        buttonGroup.add(fruitVegetablesBtn);
        fruitVegetablesBtn.setContentAreaFilled(false);
        fruitVegetablesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fruitVegetablesBtn.setFocusPainted(false);
        fruitVegetablesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        fruitVegetablesBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        fruitVegetablesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitVegetablesBtnActionPerformed(evt);
            }
        });
        storeView.add(fruitVegetablesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 78, -1, -1));

        breadBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        breadBtn.setForeground(new java.awt.Color(255, 255, 255));
        breadBtn.setText("Bröd");
        breadBtn.setAlignmentY(0.0F);
        breadBtn.setBorder(null);
        breadBtn.setBorderPainted(false);
        buttonGroup.add(breadBtn);
        breadBtn.setContentAreaFilled(false);
        breadBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        breadBtn.setFocusPainted(false);
        breadBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        breadBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        breadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breadBtnActionPerformed(evt);
            }
        });
        storeView.add(breadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 100, -1, -1));

        meatBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        meatBtn.setForeground(new java.awt.Color(255, 255, 255));
        meatBtn.setText("Kött");
        meatBtn.setAlignmentY(0.0F);
        meatBtn.setBorder(null);
        meatBtn.setBorderPainted(false);
        buttonGroup.add(meatBtn);
        meatBtn.setContentAreaFilled(false);
        meatBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meatBtn.setFocusPainted(false);
        meatBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        meatBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        meatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatBtnActionPerformed(evt);
            }
        });
        storeView.add(meatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 122, -1, -1));

        dairyEggBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        dairyEggBtn.setForeground(new java.awt.Color(255, 255, 255));
        dairyEggBtn.setText("Mejeri & Ägg");
        dairyEggBtn.setAlignmentY(0.0F);
        dairyEggBtn.setBorder(null);
        dairyEggBtn.setBorderPainted(false);
        buttonGroup.add(dairyEggBtn);
        dairyEggBtn.setContentAreaFilled(false);
        dairyEggBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dairyEggBtn.setFocusPainted(false);
        dairyEggBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dairyEggBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        dairyEggBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dairyEggBtnActionPerformed(evt);
            }
        });
        storeView.add(dairyEggBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 144, -1, -1));

        pantryBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        pantryBtn.setForeground(new java.awt.Color(255, 255, 255));
        pantryBtn.setText("Skafferi");
        pantryBtn.setAlignmentY(0.0F);
        pantryBtn.setBorder(null);
        pantryBtn.setBorderPainted(false);
        buttonGroup.add(pantryBtn);
        pantryBtn.setContentAreaFilled(false);
        pantryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pantryBtn.setFocusPainted(false);
        pantryBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pantryBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pantryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantryBtnActionPerformed(evt);
            }
        });
        storeView.add(pantryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 166, -1, -1));

        drinksBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        drinksBtn.setForeground(new java.awt.Color(255, 255, 255));
        drinksBtn.setText("Drycker");
        drinksBtn.setAlignmentY(0.0F);
        drinksBtn.setBorder(null);
        drinksBtn.setBorderPainted(false);
        buttonGroup.add(drinksBtn);
        drinksBtn.setContentAreaFilled(false);
        drinksBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drinksBtn.setFocusPainted(false);
        drinksBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        drinksBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        drinksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksBtnActionPerformed(evt);
            }
        });
        storeView.add(drinksBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 188, -1, -1));

        sweetsBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        sweetsBtn.setForeground(new java.awt.Color(255, 255, 255));
        sweetsBtn.setText("Sötsaker");
        sweetsBtn.setAlignmentY(0.0F);
        sweetsBtn.setBorder(null);
        sweetsBtn.setBorderPainted(false);
        buttonGroup.add(sweetsBtn);
        sweetsBtn.setContentAreaFilled(false);
        sweetsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sweetsBtn.setFocusPainted(false);
        sweetsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        sweetsBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sweetsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetsBtnActionPerformed(evt);
            }
        });
        storeView.add(sweetsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 210, -1, -1));

        add(storeView, "store");

        searchView.setBackground(new java.awt.Color(50, 77, 91));
        searchView.setMinimumSize(new java.awt.Dimension(220, 0));
        searchView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchResultLabel.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        searchResultLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchResultLabel.setText("Sökresultat");
        searchView.add(searchResultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, 120, -1));

        add(searchView, "search");

        buyView.setBackground(new java.awt.Color(50, 77, 91));
        buyView.setMinimumSize(new java.awt.Dimension(220, 0));
        buyView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        step1Label.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        step1Label.setForeground(new java.awt.Color(255, 255, 255));
        step1Label.setText("Adress och betalning");
        buyView.add(step1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 14, 170, -1));

        step2Label.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        step2Label.setForeground(new java.awt.Color(255, 255, 255));
        step2Label.setText("Översikt");
        buyView.add(step2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 48, 150, -1));

        step2Label1.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        step2Label1.setForeground(new java.awt.Color(255, 255, 255));
        step2Label1.setText("Färdigt");
        buyView.add(step2Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 82, 150, -1));

        check1Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buy_guide_check.png"))); // NOI18N
        buyView.add(check1Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 9, -1, -1));

        check2Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buy_guide_check.png"))); // NOI18N
        buyView.add(check2Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 43, -1, -1));

        dot1Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buy_guide_dot.png"))); // NOI18N
        buyView.add(dot1Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 10, -1, -1));

        dot2Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buy_guide_dot.png"))); // NOI18N
        buyView.add(dot2Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 44, -1, -1));

        dot3Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buy_guide_dot.png"))); // NOI18N
        buyView.add(dot3Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 78, -1, -1));

        treeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buy_steps.png"))); // NOI18N
        buyView.add(treeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, -1, -1));

        add(buyView, "buy");

        accountPanel.setBackground(new java.awt.Color(50, 77, 91));
        accountPanel.setMinimumSize(new java.awt.Dimension(220, 0));
        accountPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountSettingsBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        accountSettingsBtn.setForeground(new java.awt.Color(255, 255, 255));
        accountSettingsBtn.setText("Ändra uppgifter");
        accountSettingsBtn.setAlignmentY(0.0F);
        accountSettingsBtn.setBorder(null);
        accountSettingsBtn.setBorderPainted(false);
        accountSettingsBtn.setContentAreaFilled(false);
        accountSettingsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountSettingsBtn.setFocusPainted(false);
        accountSettingsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accountSettingsBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        accountSettingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountSettingsBtnActionPerformed(evt);
            }
        });
        accountPanel.add(accountSettingsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, -1));

        favoritesBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        favoritesBtn.setForeground(new java.awt.Color(255, 255, 255));
        favoritesBtn.setText("Favoritvaror");
        favoritesBtn.setAlignmentY(0.0F);
        favoritesBtn.setBorder(null);
        favoritesBtn.setBorderPainted(false);
        favoritesBtn.setContentAreaFilled(false);
        favoritesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        favoritesBtn.setFocusPainted(false);
        favoritesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        favoritesBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        favoritesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritesBtnActionPerformed(evt);
            }
        });
        accountPanel.add(favoritesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 38, -1, -1));

        pastOrdersBtn.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        pastOrdersBtn.setForeground(new java.awt.Color(255, 255, 255));
        pastOrdersBtn.setText("Orderhistorik");
        pastOrdersBtn.setAlignmentY(0.0F);
        pastOrdersBtn.setBorder(null);
        pastOrdersBtn.setBorderPainted(false);
        pastOrdersBtn.setContentAreaFilled(false);
        pastOrdersBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pastOrdersBtn.setFocusPainted(false);
        pastOrdersBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pastOrdersBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pastOrdersBtn.setIconTextGap(0);
        pastOrdersBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pastOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastOrdersBtnActionPerformed(evt);
            }
        });
        accountPanel.add(pastOrdersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 62, 140, -1));

        logOutBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logOutBtn.setText("Logga ut");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        accountPanel.add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 120, 40));

        add(accountPanel, "account");
    }// </editor-fold>//GEN-END:initComponents

    private void kampanjBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kampanjBtnActionPerformed
        resetAllStoreFontsExceptFeatured();
        controller.hideBreadcrumbs();
        controller.showFeatured();
    }//GEN-LAST:event_kampanjBtnActionPerformed

    private void showAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllBtnActionPerformed
        resetAllStoreFonts();
        controller.showShopAllProducts();
        makeBoldAndUnderlined(showAllBtn);
        controller.updateBreadcrumbs("Butik","Alla produkter",null);
    }//GEN-LAST:event_showAllBtnActionPerformed

    private void fruitVegetablesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitVegetablesBtnActionPerformed
        resetAllStoreFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.CITRUS_FRUIT));
        list.addAll(Controller.db.getProducts(ProductCategory.EXOTIC_FRUIT));
        list.addAll(Controller.db.getProducts(ProductCategory.VEGETABLE_FRUIT));
        list.addAll(Controller.db.getProducts(ProductCategory.CABBAGE));
        list.addAll(Controller.db.getProducts(ProductCategory.MELONS));
        list.addAll(Controller.db.getProducts(ProductCategory.ROOT_VEGETABLE));
        list.addAll(Controller.db.getProducts(ProductCategory.FRUIT));
        list.addAll(Controller.db.getProducts(ProductCategory.HERB));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(fruitVegetablesBtn);
        controller.updateBreadcrumbs("Butik","Frukt & Grönt",null);
    }//GEN-LAST:event_fruitVegetablesBtnActionPerformed

    private void breadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breadBtnActionPerformed
        resetAllStoreFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.BREAD));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(breadBtn);
        controller.updateBreadcrumbs("Butik","Bröd",null);
    }//GEN-LAST:event_breadBtnActionPerformed

    private void meatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatBtnActionPerformed
        resetAllStoreFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.MEAT));
        list.addAll(Controller.db.getProducts(ProductCategory.FISH));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(meatBtn);
        controller.updateBreadcrumbs("Butik","Kött",null);
    }//GEN-LAST:event_meatBtnActionPerformed

    private void dairyEggBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dairyEggBtnActionPerformed
        resetAllStoreFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.DAIRIES));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(dairyEggBtn);
        controller.updateBreadcrumbs("Butik","Mejeri & Ägg",null);
    }//GEN-LAST:event_dairyEggBtnActionPerformed

    private void pantryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantryBtnActionPerformed
        resetAllStoreFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.FLOUR_SUGAR_SALT));
        list.addAll(Controller.db.getProducts(ProductCategory.PASTA));
        list.addAll(Controller.db.getProducts(ProductCategory.POTATO_RICE));
        list.addAll(Controller.db.getProducts(ProductCategory.NUTS_AND_SEEDS));
        list.addAll(Controller.db.getProducts(ProductCategory.POD));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(pantryBtn);
        controller.updateBreadcrumbs("Butik","Skafferi",null);
    }//GEN-LAST:event_pantryBtnActionPerformed

    private void drinksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksBtnActionPerformed
        resetAllStoreFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.COLD_DRINKS));
        list.addAll(Controller.db.getProducts(ProductCategory.HOT_DRINKS));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(drinksBtn);
        controller.updateBreadcrumbs("Butik","Drycker",null);
    }//GEN-LAST:event_drinksBtnActionPerformed

    private void sweetsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetsBtnActionPerformed
        resetAllStoreFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.SWEET));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(sweetsBtn);
        controller.updateBreadcrumbs("Butik","Sötsaker",null);
    }//GEN-LAST:event_sweetsBtnActionPerformed

    private void accountSettingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountSettingsBtnActionPerformed
        resetAllAccountFonts();
        makeBoldAndUnderlined(accountSettingsBtn);
        controller.showAccount();
    }//GEN-LAST:event_accountSettingsBtnActionPerformed

    private void favoritesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritesBtnActionPerformed
        resetAllAccountFonts();
        makeBoldAndUnderlined(favoritesBtn);
        controller.showFavorites();
    }//GEN-LAST:event_favoritesBtnActionPerformed

    private void pastOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastOrdersBtnActionPerformed
        resetAllAccountFonts();
        makeBoldAndUnderlined(pastOrdersBtn);
        controller.showPastOrders();
    }//GEN-LAST:event_pastOrdersBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        Controller.db.shutDown();
        controller.setIsLoggedIn(false);
        controller.toggleLoginBtn(false);
        controller.showFeatured();
    }//GEN-LAST:event_logOutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountPanel;
    private javax.swing.JButton accountSettingsBtn;
    private javax.swing.JButton breadBtn;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JPanel buyView;
    private javax.swing.JLabel check1Icon;
    private javax.swing.JLabel check2Icon;
    private javax.swing.JButton dairyEggBtn;
    private javax.swing.JLabel dot1Icon;
    private javax.swing.JLabel dot2Icon;
    private javax.swing.JLabel dot3Icon;
    private javax.swing.JButton drinksBtn;
    private javax.swing.JButton favoritesBtn;
    private javax.swing.JButton fruitVegetablesBtn;
    private javax.swing.JButton kampanjBtn;
    private javax.swing.JToggleButton logOutBtn;
    private javax.swing.JButton meatBtn;
    private javax.swing.JButton pantryBtn;
    private javax.swing.JButton pastOrdersBtn;
    private javax.swing.JLabel searchResultLabel;
    private javax.swing.JPanel searchView;
    private javax.swing.JButton showAllBtn;
    private javax.swing.JLabel step1Label;
    private javax.swing.JLabel step2Label;
    private javax.swing.JLabel step2Label1;
    private javax.swing.JSeparator storeSeparator;
    private javax.swing.JPanel storeView;
    private javax.swing.JButton sweetsBtn;
    private javax.swing.JLabel treeIcon;
    // End of variables declaration//GEN-END:variables
}
