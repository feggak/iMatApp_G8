/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class PastOrdersPanel extends javax.swing.JPanel {

    private List<ShoppingItem> items = new ArrayList<>();
    /**
     * Creates new form ShopPanel
     */
    public PastOrdersPanel() {
        initComponents();
        fillOrdersTable();
    }
    
    private void fillOrdersTable() {
        String[] columnNames = {"Nr","Datum"};
        Object[][] data = new Object[Controller.db.getOrders().size()][2];
        for (int i = 0; i < Controller.db.getOrders().size(); i++) {
            Order order = Controller.db.getOrders().get(i);
            data [i][0] = order.getOrderNumber();
            data [i][1] = order.getDate();
        }
        TableModel model = new DefaultTableModel(data,columnNames);
        ordersTable.setModel(model);
    }
    
    private void fillItemsTable(int nr) {
        for (int i = 0; i < Controller.db.getOrders().size(); i++) {
            if (Controller.db.getOrders().get(i).getOrderNumber() == nr) {
                items = Controller.db.getOrders().get(i).getItems();
            }
        }
        String[] columnNames = {"Produktnamn","Antal","Pris"};
        Object[][] data = new Object[items.size()][3];
        for (int i = 0; i < items.size(); i++) {
            ShoppingItem item = items.get(i);
            data [i][0] = item.getProduct().getName();
            data [i][1] = Double.toString(Math.round((item.getAmount()*100.0)/100.0)) + " " + item.getProduct().getUnitSuffix();
            data [i][2] = item.getTotal() + " kr";
        }
        TableModel model = new DefaultTableModel(data,columnNames);
        itemsTable.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        addListToCartBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(930, 32767));
        setMinimumSize(new java.awt.Dimension(930, 630));
        setPreferredSize(new java.awt.Dimension(930, 630));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainTitle.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
        mainTitle.setText("Orderhistorik");
        add(mainTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 33, 918, 10));

        jScrollPane2.setBorder(null);

        ordersTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ordersTable.setIntercellSpacing(new java.awt.Dimension(1, 3));
        ordersTable.setRowHeight(30);
        ordersTable.setShowVerticalLines(false);
        ordersTable.getTableHeader().setReorderingAllowed(false);
        ordersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ordersTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 450, 570));

        jScrollPane3.setBorder(null);

        itemsTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produktnamn", "Antal", "Pris"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemsTable.setIntercellSpacing(new java.awt.Dimension(1, 3));
        itemsTable.setRowHeight(30);
        itemsTable.setShowVerticalLines(false);
        itemsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(itemsTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 44, -1, 520));

        addListToCartBtn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        addListToCartBtn.setForeground(new java.awt.Color(255, 255, 255));
        addListToCartBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        addListToCartBtn.setText("Lägg till");
        addListToCartBtn.setAlignmentY(0.0F);
        addListToCartBtn.setBorderPainted(false);
        addListToCartBtn.setContentAreaFilled(false);
        addListToCartBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addListToCartBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        addListToCartBtn.setDefaultCapable(false);
        addListToCartBtn.setFocusPainted(false);
        addListToCartBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addListToCartBtn.setIconTextGap(0);
        addListToCartBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        addListToCartBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        addListToCartBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        addListToCartBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        addListToCartBtn.setRequestFocusEnabled(false);
        addListToCartBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        addListToCartBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        addListToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addListToCartBtnActionPerformed(evt);
            }
        });
        add(addListToCartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 118, 36));
    }// </editor-fold>//GEN-END:initComponents

    private void ordersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersTableMouseClicked
        if (ordersTable.getValueAt(ordersTable.getSelectedRow(),0) != null) {
            fillItemsTable((int)ordersTable.getValueAt(ordersTable.getSelectedRow(),0));
        }
    }//GEN-LAST:event_ordersTableMouseClicked

    private void addListToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addListToCartBtnActionPerformed
        for (int i = 0; i < items.size(); i++) {
            Controller.cart.addItem(items.get(i));
        }
        CartDropdown.update();
        Controller.updateCartHeader();
    }//GEN-LAST:event_addListToCartBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton addListToCartBtn;
    private javax.swing.JTable itemsTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JTable ordersTable;
    // End of variables declaration//GEN-END:variables
}
