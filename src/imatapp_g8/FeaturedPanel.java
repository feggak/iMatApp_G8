/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class FeaturedPanel extends javax.swing.JPanel {
    
    // Custom variable declaration
    private List<Product> featuredProducts;
    Controller controller;
    
    /**
     * Creates new form ShopPanel
     */
    public FeaturedPanel() {
        initComponents();
        controller = Controller.getInstance();
        featuredProducts = getRandomFeaturedProducts();
        fillGrid(featuredProducts);
    }
    
    public void fillGrid(List<Product> items) {
        for (int i = 1; i < items.size(); i++) {
            if (items.get(i) != null) {
                productGrid.add(new ShopItem(items.get(i)));
            }
        }
    }
    
    public List<Product> getRandomFeaturedProducts() {
        List<Product> tempList = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            int number = (int) Math.ceil(Math.random()*148);
            if (Controller.db.getProduct(number) != null) {
                tempList.add(Controller.db.getProduct(number));
            }
        }
        return tempList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shopBannerIcon = new javax.swing.JLabel();
        mainTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        productGrid = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(930, 32767));
        setMinimumSize(new java.awt.Dimension(930, 650));
        setPreferredSize(new java.awt.Dimension(930, 630));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shopBannerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banner2.png"))); // NOI18N
        shopBannerIcon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        shopBannerIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shopBannerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopBannerIconMouseClicked(evt);
            }
        });
        add(shopBannerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 250));

        mainTitle.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
        mainTitle.setText("Kampanjvaror");
        add(mainTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 258, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 282, 918, 10));

        productGrid.setBackground(new java.awt.Color(255, 255, 255));
        productGrid.setAlignmentX(0.0F);
        productGrid.setAlignmentY(0.0F);
        productGrid.setAutoscrolls(true);
        productGrid.setLayout(new java.awt.GridLayout(0, 5));
        add(productGrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 293, 910, 375));
    }// </editor-fold>//GEN-END:initComponents

    private void shopBannerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopBannerIconMouseClicked
        controller.updateBreadcrumbs("Butik","Kampanjvaror","Fanta burk");
        controller.showDetails(Controller.db.getProduct(35));
    }//GEN-LAST:event_shopBannerIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JPanel productGrid;
    private javax.swing.JLabel shopBannerIcon;
    // End of variables declaration//GEN-END:variables
}
