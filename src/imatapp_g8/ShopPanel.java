/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import java.util.List;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class ShopPanel extends javax.swing.JPanel {
    
    // Custom variable declaration

    /**
     * Creates new form ShopPanel
     */
    public ShopPanel() {
        initComponents();
        fillGrid(MainWindow.db.getProducts(ProductCategory.NUTS_AND_SEEDS));
    }
    
    public void fillGrid(List<Product> items) {
        for (int i = 1; i < items.size(); i++) {
            productGrid.add(new ShopItem(items.get(i)));
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

        shopBannerIcon = new javax.swing.JLabel();
        mainTitle = new javax.swing.JLabel();
        lineIcon = new javax.swing.JLabel();
        productGrid = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(930, 32767));
        setMinimumSize(new java.awt.Dimension(930, 650));
        setPreferredSize(new java.awt.Dimension(930, 630));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shopBannerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banner.png"))); // NOI18N
        shopBannerIcon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        add(shopBannerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainTitle.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
        mainTitle.setText("Kampanjvaror");
        add(mainTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 208, -1, -1));

        lineIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/line.png"))); // NOI18N
        add(lineIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 232, -1, -1));

        productGrid.setBackground(new java.awt.Color(255, 255, 255));
        productGrid.setAlignmentX(0.0F);
        productGrid.setAlignmentY(0.0F);
        productGrid.setAutoscrolls(true);
        productGrid.setLayout(new java.awt.GridLayout(0, 5));
        add(productGrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 238, 910, 435));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lineIcon;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JPanel productGrid;
    private javax.swing.JLabel shopBannerIcon;
    // End of variables declaration//GEN-END:variables
}
