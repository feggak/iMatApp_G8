/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import se.chalmers.ait.dat215.project.*;


/**
 *
 * @author Michel
 */
public class ShoppingCartItem extends javax.swing.JPanel {

    /**
     * Creates new form ShoppingCartItem
     */
    public ShoppingCartItem() {
        initComponents();
    }
    
    public ShoppingCartItem(ShoppingItem item) {
        initComponents();
        iconLabel.setIcon(Controller.db.getImageIcon(item.getProduct(), 80, 80));
        priceLabel.setText("" + item.getProduct().getPrice());
        nameLabel.setText(item.getProduct().getName());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconLabel = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(276, 100));
        setMinimumSize(new java.awt.Dimension(276, 100));
        setPreferredSize(new java.awt.Dimension(276, 100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLabel.setBackground(java.awt.Color.orange);
        iconLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iconLabel.setOpaque(true);
        add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 80));

        removeButton.setText("Ta Bort");
        add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nameLabel.setText("Mjölk");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 160, -1));

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        priceLabel.setText("20 kr");
        add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
