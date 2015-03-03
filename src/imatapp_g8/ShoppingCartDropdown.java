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
public class ShoppingCartDropdown extends javax.swing.JPanel {

    static Controller controller;
    static ShoppingCart shoppingCart;
    
    /**
     * Creates new form ShoppingCart
     */
    public ShoppingCartDropdown() {
        initComponents();
        controller = Controller.getInstance();
        shoppingCart = controller.getShoppingCart();
    }
    
    public void update() {
        List<ShoppingItem> tempList = new ArrayList<>();
        tempList = controller.getShoppingCart().getItems();
        for (int i = 1; i < tempList.size(); i++) {
            itemsPanel.add(new ShoppingCartItem(tempList.get(i)));
        }
        // itemsPanel.add(new ShoppingCartItem());
        itemsPanel.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        itemsPanel = new javax.swing.JPanel();
        summaryPanel = new javax.swing.JPanel();
        checkoutBtn = new javax.swing.JButton();
        totalPriceLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(276, 400));
        setMinimumSize(new java.awt.Dimension(276, 0));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        itemsPanel.setBackground(new java.awt.Color(255, 255, 255));
        itemsPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        itemsPanel.setMinimumSize(new java.awt.Dimension(276, 0));
        itemsPanel.setPreferredSize(new java.awt.Dimension(276, 400));
        itemsPanel.setLayout(new java.awt.GridLayout(0, 1));
        add(itemsPanel);

        summaryPanel.setBackground(new java.awt.Color(50, 70, 91));
        summaryPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        summaryPanel.setPreferredSize(new java.awt.Dimension(276, 60));

        checkoutBtn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        checkoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        checkoutBtn.setText("Till kassan");
        checkoutBtn.setAlignmentY(0.0F);
        checkoutBtn.setBorder(null);
        checkoutBtn.setBorderPainted(false);
        checkoutBtn.setContentAreaFilled(false);
        checkoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        totalPriceLabel.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        totalPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalPriceLabel.setText("Totalpris: 200 kr");

        javax.swing.GroupLayout summaryPanelLayout = new javax.swing.GroupLayout(summaryPanel);
        summaryPanel.setLayout(summaryPanelLayout);
        summaryPanelLayout.setHorizontalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(checkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        summaryPanelLayout.setVerticalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPriceLabel))
                .addContainerGap())
        );

        add(summaryPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtnActionPerformed
        update();
    }//GEN-LAST:event_checkoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkoutBtn;
    private static javax.swing.JPanel itemsPanel;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
