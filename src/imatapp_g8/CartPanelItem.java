/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import javax.swing.*;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class CartPanelItem extends javax.swing.JPanel {
    
    // Custom variable declaration
    Controller controller = Controller.getInstance();
    private Product product;
    private ShoppingItem currentItem;
    private ImageIcon icon;
    private String name;
    private double amount;
    private double price;
    private double totalPrice;
    private String unit;

    /**
     * Creates new form ShopItem
     */
    public CartPanelItem() {
        initComponents();
    }
    
    public CartPanelItem(ShoppingItem item) {
        product = item.getProduct();
        amount = item.getAmount();
        icon = Controller.db.getImageIcon(product,107,80);
        name = product.getName();
        price = product.getPrice();
        totalPrice = item.getTotal();
        unit = product.getUnit();
        currentItem = item;
        initComponents();
        if (product.getUnitSuffix().equals("förp") || product.getUnitSuffix().equals("st")) {
            spinner.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(1.0d), 1.0, null, Double.valueOf(1.0d)));
        } else {
            spinner.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(1.0d), 1.0, null, Double.valueOf(0.1d)));
        }
        spinner.setValue(amount);
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
        jPanel1 = new javax.swing.JPanel();
        totalPriceValueLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        amountLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        priceLabel2 = new javax.swing.JLabel();
        spinner = new javax.swing.JSpinner();
        changeAmountBtn = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        removeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(650, 100));
        setMinimumSize(new java.awt.Dimension(650, 100));
        setPreferredSize(new java.awt.Dimension(650, 100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLabel.setIcon(icon);
        iconLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        iconLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLabelMouseClicked(evt);
            }
        });
        add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 107, 80));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPriceValueLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        totalPriceValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPriceValueLabel.setText(Double.toString(totalPrice) + " kr");
        totalPriceValueLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalPriceValueLabelMouseClicked(evt);
            }
        });
        jPanel1.add(totalPriceValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 30, 60, -1));
        jPanel1.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 10));

        amountLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amountLabel.setText("Antal");
        jPanel1.add(amountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceLabel.setText("Pris");
        jPanel1.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        totalPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalPriceLabel.setText("Totalt");
        jPanel1.add(totalPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        priceLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        priceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLabel2.setText(Double.toString(price) + " " + unit);
        jPanel1.add(priceLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 30, -1, -1));

        spinner.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), null, null, Double.valueOf(1.0d)));
        jPanel1.add(spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, 40, -1));

        changeAmountBtn.setText("Ändra");
        changeAmountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAmountBtnActionPerformed(evt);
            }
        });
        jPanel1.add(changeAmountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 28, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 380, 60));

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel.setText(name);
        nameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, -1));

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
        add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 60, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void iconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLabelMouseClicked
        
    }//GEN-LAST:event_iconLabelMouseClicked

    private void totalPriceValueLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalPriceValueLabelMouseClicked
        controller.showDetails(product);
    }//GEN-LAST:event_totalPriceValueLabelMouseClicked

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        Controller.cart.removeItem(currentItem);
        CartPanel.update();
        controller.updateCartHeader();
    }//GEN-LAST:event_removeBtnActionPerformed

    private void changeAmountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAmountBtnActionPerformed
        currentItem.setAmount((double)spinner.getValue());
        totalPrice = currentItem.getTotal();
        totalPriceValueLabel.setText(Double.toString(totalPrice) + " kr");
        CartPanel.totalPriceLabel.setText("Totalsumma: " + Double.toString(Controller.cart.getTotal()) + " kr");
    }//GEN-LAST:event_changeAmountBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton changeAmountBtn;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceLabel2;
    private javax.swing.JButton removeBtn;
    private javax.swing.JSeparator separator;
    private javax.swing.JSpinner spinner;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JLabel totalPriceValueLabel;
    // End of variables declaration//GEN-END:variables
}
