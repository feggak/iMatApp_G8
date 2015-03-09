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
public class CartPanel extends javax.swing.JPanel {
    
    // Custom variable declaration
    static Controller controller;
    private double totalPrice;
    
    /**
     * Creates new form ShopPanel
     */
    public CartPanel() {
        controller = Controller.getInstance();
        totalPrice = controller.cart.getTotal();
        initComponents();
        List<ShoppingItem> tempList;
        tempList = Controller.cart.getItems();
        for (ShoppingItem item : tempList) {
            itemsGrid.add(new CartPanelItem(item));
        }
    }
    
    public static void update() {
        if (Controller.cart.getItems().size() < 5) {
        itemsGrid.removeAll();
        itemsGrid.repaint();
            for (int i = 0; i < Controller.cart.getItems().size(); i++) {
                itemsGrid.add(new CartPanelItem(Controller.cart.getItems().get(i)));
            }
        itemsGrid.revalidate();
        }
        totalPriceLabel.setText("Totalsumma: " + Double.toString(Controller.cart.getTotal()) + " kr");
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
        itemGridScrollPane = new javax.swing.JScrollPane();
        itemsGrid = new javax.swing.JPanel();
        checkoutBtn = new javax.swing.JButton();
        shippingPriceLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        shippingHeaderLabel = new javax.swing.JLabel();
        shippingOptionsPanel = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        productsPriceLabel = new javax.swing.JLabel();
        productsTaxPriceLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(930, 32767));
        setMinimumSize(new java.awt.Dimension(930, 630));
        setPreferredSize(new java.awt.Dimension(930, 630));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemGridScrollPane.setBorder(null);
        itemGridScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        itemsGrid.setBackground(new java.awt.Color(255, 255, 255));
        itemsGrid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        itemsGrid.setAlignmentX(0.0F);
        itemsGrid.setAlignmentY(0.0F);
        itemsGrid.setMaximumSize(new java.awt.Dimension(920, 590));
        itemsGrid.setLayout(new java.awt.GridLayout(0, 1));
        itemGridScrollPane.setViewportView(itemsGrid);

        add(itemGridScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 660, 570));

        checkoutBtn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        checkoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        checkoutBtn.setText("Köp");
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
        add(checkoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, -1, -1));

        shippingPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        shippingPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        shippingPriceLabel.setText("Fraktkostnad: " + Double.toString(totalPrice/30) + " kr"
        );
        add(shippingPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 515, 180, -1));

        totalPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        totalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPriceLabel.setText("Totalsumma: " + Double.toString((Math.round(totalPrice*100.0)/100.0)) + " kr"
        );
        add(totalPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 540, 230, -1));

        headerLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        headerLabel.setText("Välj fraktsätt:");
        add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 14, -1, -1));

        shippingHeaderLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        shippingHeaderLabel.setText("Produkter i kundvagnen:");
        add(shippingHeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        shippingOptionsPanel.setBackground(new java.awt.Color(255, 255, 255));
        shippingOptionsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        shippingOptionsPanel.setLayout(new java.awt.GridLayout(3, 1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton1.setText("Hämta på lagret");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30)));
        shippingOptionsPanel.add(jRadioButton1);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton2.setText("Normalfrakt");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30)));
        shippingOptionsPanel.add(jRadioButton2);

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton3.setText("Expressfrakt");
        jRadioButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30)));
        shippingOptionsPanel.add(jRadioButton3);

        add(shippingOptionsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 44, 230, 400));

        productsPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        productsPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productsPriceLabel.setText("Produktkostnad: " + Double.toString((Math.round(totalPrice*88.0)/100.0)) + " kr"
        );
        add(productsPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 457, 200, -1));

        productsTaxPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        productsTaxPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productsTaxPriceLabel.setText("Moms: " + Double.toString((Math.round(totalPrice*12.0)/100.0)) + " kr"
        );
        add(productsTaxPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 486, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkoutBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton checkoutBtn;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane itemGridScrollPane;
    private static javax.swing.JPanel itemsGrid;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    protected static javax.swing.JLabel productsPriceLabel;
    protected static javax.swing.JLabel productsTaxPriceLabel;
    private javax.swing.JLabel shippingHeaderLabel;
    private javax.swing.JPanel shippingOptionsPanel;
    protected static javax.swing.JLabel shippingPriceLabel;
    protected static javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
