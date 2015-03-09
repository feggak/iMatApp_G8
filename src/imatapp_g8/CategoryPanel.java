/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

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
        initComponents();
        resetAllFonts();
        controller = Controller.getInstance();
    }
    
    public void changeContent(String view) {
        if (view.equals("store")) {
            // search
            searchResultLabel.setVisible(false);
            // store view
            kampanjBtn.setVisible(true);
            showAllBtn.setVisible(true);
            fruitVegetablesBtn.setVisible(true);
            breadBtn.setVisible(true);
            meatBtn.setVisible(true);
            dairyEggBtn.setVisible(true);
            drinksBtn.setVisible(true);
            pantryBtn.setVisible(true);
            sweetsBtn.setVisible(true);
            // SEPARATOR
            separator.setVisible(true);
        }
        if (view.equals("buy")) {
            // search
            searchResultLabel.setVisible(false);
            // store view
            kampanjBtn.setVisible(false);
            showAllBtn.setVisible(false);
            fruitVegetablesBtn.setVisible(false);
            breadBtn.setVisible(false);
            meatBtn.setVisible(false);
            dairyEggBtn.setVisible(false);
            drinksBtn.setVisible(false);
            pantryBtn.setVisible(false);
            sweetsBtn.setVisible(false);
            // SEPARATOR
            separator.setVisible(false);
        }
        if (view.equals("search")) {
            // search
            searchResultLabel.setVisible(true);
            // store view
            kampanjBtn.setVisible(false);
            showAllBtn.setVisible(false);
            fruitVegetablesBtn.setVisible(false);
            breadBtn.setVisible(false);
            meatBtn.setVisible(false);
            dairyEggBtn.setVisible(false);
            drinksBtn.setVisible(false);
            pantryBtn.setVisible(false);
            sweetsBtn.setVisible(false);
            // SEPARATOR
            separator.setVisible(false);
        }
        repaint();
    }
    
    public void makeBoldAndUnderlined(JButton label) {
        Font font = label.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.WEIGHT,TextAttribute.WEIGHT_BOLD);
        attributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        label.setFont(font.deriveFont(attributes));
    }
    
    public void resetAllFontsExceptStart() {
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
    
    public void resetAllFonts() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        searchResultLabel = new javax.swing.JLabel();
        kampanjBtn = new javax.swing.JButton();
        showAllBtn = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        fruitVegetablesBtn = new javax.swing.JButton();
        breadBtn = new javax.swing.JButton();
        meatBtn = new javax.swing.JButton();
        dairyEggBtn = new javax.swing.JButton();
        pantryBtn = new javax.swing.JButton();
        drinksBtn = new javax.swing.JButton();
        sweetsBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(50, 77, 91));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(220, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchResultLabel.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        searchResultLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchResultLabel.setText("Sökresultat");
        add(searchResultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, 120, -1));

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
        add(kampanjBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, -1));

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
        add(showAllBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 38, -1, -1));

        separator.setBackground(new java.awt.Color(0, 0, 0));
        separator.setForeground(new java.awt.Color(255, 255, 255));
        add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 200, 10));

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
        add(fruitVegetablesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 78, -1, -1));

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
        add(breadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 100, -1, -1));

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
        add(meatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 122, -1, -1));

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
        add(dairyEggBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 144, -1, -1));

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
        add(pantryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 166, -1, -1));

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
        add(drinksBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 188, -1, -1));

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
        add(sweetsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fruitVegetablesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitVegetablesBtnActionPerformed
        resetAllFonts();
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

    private void showAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllBtnActionPerformed
        resetAllFonts();
        controller.showShopAllProducts();
        makeBoldAndUnderlined(showAllBtn);
        controller.updateBreadcrumbs("Butik","Alla produkter",null);
    }//GEN-LAST:event_showAllBtnActionPerformed

    private void kampanjBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kampanjBtnActionPerformed
        resetAllFonts();
        controller.hideBreadcrumbs();
        controller.showFeatured();
        makeBoldAndUnderlined(kampanjBtn);
    }//GEN-LAST:event_kampanjBtnActionPerformed

    private void breadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breadBtnActionPerformed
        resetAllFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.BREAD));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(breadBtn);
        controller.updateBreadcrumbs("Butik","Bröd",null);
    }//GEN-LAST:event_breadBtnActionPerformed

    private void meatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatBtnActionPerformed
        resetAllFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.MEAT));
        list.addAll(Controller.db.getProducts(ProductCategory.FISH));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(meatBtn);
        controller.updateBreadcrumbs("Butik","Kött",null);
    }//GEN-LAST:event_meatBtnActionPerformed

    private void dairyEggBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dairyEggBtnActionPerformed
        resetAllFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.DAIRIES));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(dairyEggBtn);
        controller.updateBreadcrumbs("Butik","Mejeri & Ägg",null);
    }//GEN-LAST:event_dairyEggBtnActionPerformed

    private void pantryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantryBtnActionPerformed
        resetAllFonts();
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
        resetAllFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.COLD_DRINKS));
        list.addAll(Controller.db.getProducts(ProductCategory.HOT_DRINKS));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(drinksBtn);
        controller.updateBreadcrumbs("Butik","Drycker",null);
    }//GEN-LAST:event_drinksBtnActionPerformed

    private void sweetsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetsBtnActionPerformed
        resetAllFonts();
        List<Product> list = new ArrayList<>();
        list.addAll(Controller.db.getProducts(ProductCategory.SWEET));
        controller.showShopCategory(list);
        makeBoldAndUnderlined(sweetsBtn);
        controller.updateBreadcrumbs("Butik","Sötsaker",null);
    }//GEN-LAST:event_sweetsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton breadBtn;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton dairyEggBtn;
    private javax.swing.JButton drinksBtn;
    private javax.swing.JButton fruitVegetablesBtn;
    private javax.swing.JButton kampanjBtn;
    private javax.swing.JButton meatBtn;
    private javax.swing.JButton pantryBtn;
    private javax.swing.JLabel searchResultLabel;
    private javax.swing.JSeparator separator;
    private javax.swing.JButton showAllBtn;
    private javax.swing.JButton sweetsBtn;
    // End of variables declaration//GEN-END:variables
}
