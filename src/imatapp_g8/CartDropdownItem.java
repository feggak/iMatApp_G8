/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import javax.swing.ImageIcon;
import se.chalmers.ait.dat215.project.*;


/**
 *
 * @author Michel
 */
public class CartDropdownItem extends javax.swing.JPanel {

    private ImageIcon icon;
    private String name;
    private double total;
    private double amount;
    private String unit;
    private ShoppingItem currentItem;
    Controller controller;
    
    /**
     * Creates new form ShoppingCartItem
     */
    public CartDropdownItem() {
        initComponents();
    }
    
    public CartDropdownItem(ShoppingItem item) {
        icon = Controller.db.getImageIcon(item.getProduct(),107, 80);
        name = item.getProduct().getName();
        total = item.getTotal();
        amount = item.getAmount();
        unit = item.getProduct().getUnitSuffix();
        currentItem = item;
        initComponents();
        if (item.getProduct().getUnitSuffix().equals("förp") || item.getProduct().getUnitSuffix().equals("st")) {
            unitLabel.setText(Integer.toString((int)amount) + " " + unit);
        }
        controller = Controller.getInstance();
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
        removeBtn = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        unitLabel = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(276, 100));
        setMinimumSize(new java.awt.Dimension(276, 100));
        setPreferredSize(new java.awt.Dimension(276, 100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLabel.setBackground(java.awt.Color.orange);
        iconLabel.setIcon(icon);
        iconLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iconLabel.setOpaque(true);
        add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 107, 80));

        removeBtn.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
        removeBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash_icon.png"))); // NOI18N
        removeBtn.setAlignmentY(0.0F);
        removeBtn.setBorder(null);
        removeBtn.setContentAreaFilled(false);
        removeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        removeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removeBtn.setIconTextGap(0);
        removeBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        removeBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        removeBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        removeBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        removeBtn.setRequestFocusEnabled(false);
        removeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/trash_icon_rollover.png"))); // NOI18N
        removeBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/trash_icon_selected.png"))); // NOI18N
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 61, 30, 30));

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel.setText(name);
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 12, 140, -1));

        priceLabel.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
        priceLabel.setText(Double.toString((Math.round(total*100.0)/100.0)) + " kr");
        add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 64, 100, -1));

        unitLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        unitLabel.setText(Double.toString((Math.round(amount*100.0)/100.0)) + " " + unit);
        add(unitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 38, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        Controller.cart.removeItem(currentItem);
        CartDropdown.update();
        controller.updateCartHeader();
    }//GEN-LAST:event_removeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel unitLabel;
    // End of variables declaration//GEN-END:variables
}
