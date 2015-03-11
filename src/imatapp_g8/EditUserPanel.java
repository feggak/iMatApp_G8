/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import static imatapp_g8.MainWindow.contentPanel;
import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.User;

/**
 *
 * @author rasmusdavidsson
 */
public class EditUserPanel extends javax.swing.JPanel implements java.beans.Customizer {

    private Object bean;
    Controller controller;
    Customer customer;
    User user;

    /**
     * Creates new customizer EditUserPanel
     */
    public EditUserPanel() {
        initComponents();
        controller = Controller.getInstance();
        customer = Controller.db.getCustomer();
        user = Controller.db.getUser();
        setAllValues();
    }

    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editNameLabel = new javax.swing.JLabel();
        editLastNameLabel = new javax.swing.JLabel();
        editEmailLabel = new javax.swing.JLabel();
        editUsernameLabel = new javax.swing.JLabel();
        editPassWLabel = new javax.swing.JLabel();
        editAddressLabel = new javax.swing.JLabel();
        editVerifyPWLabel = new javax.swing.JLabel();
        editPostalCodeLabel = new javax.swing.JLabel();
        editOrtLabel = new javax.swing.JLabel();
        editMobilePhoneNbr = new javax.swing.JLabel();
        editPhoneNbr = new javax.swing.JLabel();
        editPwField = new javax.swing.JPasswordField();
        editVerifyPwField = new javax.swing.JPasswordField();
        editUsernameField = new javax.swing.JTextField();
        editEmailField = new javax.swing.JTextField();
        editNameField = new javax.swing.JTextField();
        editLastNameField = new javax.swing.JTextField();
        editPostalCodeField = new javax.swing.JTextField();
        editPhoneNbrField = new javax.swing.JTextField();
        editAddressField = new javax.swing.JTextField();
        editMobileNbrField = new javax.swing.JTextField();
        editOrtField = new javax.swing.JTextField();
        modifyBtn = new javax.swing.JToggleButton();

        setMaximumSize(new java.awt.Dimension(930, 630));
        setMinimumSize(new java.awt.Dimension(930, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(930, 630));
        setLayout(null);

        editNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editNameLabel.setText("Namn: *");
        editNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(editNameLabel);
        editNameLabel.setBounds(335, 125, 80, 16);

        editLastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editLastNameLabel.setText("Efternamn: *");
        add(editLastNameLabel);
        editLastNameLabel.setBounds(305, 155, 110, 16);

        editEmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editEmailLabel.setText("E-post: *");
        editEmailLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(editEmailLabel);
        editEmailLabel.setBounds(335, 185, 80, 16);

        editUsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editUsernameLabel.setText("Användarnamn: *");
        add(editUsernameLabel);
        editUsernameLabel.setBounds(305, 215, 110, 16);

        editPassWLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editPassWLabel.setText("Lösenord: *");
        editPassWLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(editPassWLabel);
        editPassWLabel.setBounds(335, 245, 80, 16);

        editAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editAddressLabel.setText("Address: *");
        editAddressLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(editAddressLabel);
        editAddressLabel.setBounds(335, 305, 80, 16);

        editVerifyPWLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editVerifyPWLabel.setText("Bekräfta Lösenord: *");
        add(editVerifyPWLabel);
        editVerifyPWLabel.setBounds(275, 275, 140, 16);

        editPostalCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editPostalCodeLabel.setText("Postkod: *");
        add(editPostalCodeLabel);
        editPostalCodeLabel.setBounds(305, 335, 110, 16);

        editOrtLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editOrtLabel.setText("Ort:");
        editOrtLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(editOrtLabel);
        editOrtLabel.setBounds(335, 373, 80, 16);

        editMobilePhoneNbr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editMobilePhoneNbr.setText("Mobilnummer:");
        editMobilePhoneNbr.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(editMobilePhoneNbr);
        editMobilePhoneNbr.setBounds(305, 407, 110, 16);

        editPhoneNbr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editPhoneNbr.setText("Telefonummer:");
        editPhoneNbr.setToolTipText("");
        add(editPhoneNbr);
        editPhoneNbr.setBounds(305, 441, 110, 16);
        add(editPwField);
        editPwField.setBounds(425, 235, 180, 28);
        add(editVerifyPwField);
        editVerifyPwField.setBounds(425, 265, 180, 28);
        add(editUsernameField);
        editUsernameField.setBounds(425, 205, 180, 28);
        add(editEmailField);
        editEmailField.setBounds(425, 175, 180, 28);
        add(editNameField);
        editNameField.setBounds(425, 115, 180, 28);
        add(editLastNameField);
        editLastNameField.setBounds(425, 145, 180, 28);
        add(editPostalCodeField);
        editPostalCodeField.setBounds(425, 325, 180, 28);
        add(editPhoneNbrField);
        editPhoneNbrField.setBounds(425, 431, 180, 28);
        add(editAddressField);
        editAddressField.setBounds(425, 295, 180, 28);
        add(editMobileNbrField);
        editMobileNbrField.setBounds(425, 397, 180, 28);
        add(editOrtField);
        editOrtField.setBounds(425, 363, 180, 28);

        modifyBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modifyBtn.setText("Spara");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });
        add(modifyBtn);
        modifyBtn.setBounds(740, 550, 110, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void setAllValues(){
        editNameField.setText(customer.getFirstName());
        editLastNameField.setText(customer.getLastName());
        editEmailField.setText(customer.getEmail());
        editUsernameField.setText(user.getUserName());
        editPwField.setText(user.getPassword());
        editVerifyPwField.setText(user.getPassword());
        editAddressField.setText(customer.getAddress());
        editPostalCodeField.setText(customer.getPostCode());
        editMobileNbrField.setText(customer.getMobilePhoneNumber());
        editPhoneNbrField.setText(customer.getPhoneNumber());
        editOrtField.setText(customer.getPostAddress());
    }
    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed

            customer.setAddress(editAddressField.getText());
            customer.setEmail(editEmailField.getText());
            customer.setFirstName(editNameField.getText());
            customer.setLastName(editLastNameField.getText());
            customer.setMobilePhoneNumber(editMobileNbrField.getText());
            customer.setPhoneNumber(editPhoneNbrField.getText());
            customer.setPostAddress(editOrtField.getText());
            customer.setPostCode(editPostalCodeField.getText());
            user.setPassword(String.valueOf(editPwField.getPassword()));
            user.setUserName(editUsernameField.getText());
            contentPanel.removeAll();
            contentPanel.add(new MyPagePanel());
            contentPanel.revalidate();
            controller.toggleLoginOrNameBtn(true);
            controller.toggleLogoutBtn();
        
    }//GEN-LAST:event_modifyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField editAddressField;
    private javax.swing.JLabel editAddressLabel;
    private javax.swing.JTextField editEmailField;
    private javax.swing.JLabel editEmailLabel;
    private javax.swing.JTextField editLastNameField;
    private javax.swing.JLabel editLastNameLabel;
    private javax.swing.JTextField editMobileNbrField;
    private javax.swing.JLabel editMobilePhoneNbr;
    private javax.swing.JTextField editNameField;
    private javax.swing.JLabel editNameLabel;
    private javax.swing.JTextField editOrtField;
    private javax.swing.JLabel editOrtLabel;
    private javax.swing.JLabel editPassWLabel;
    private javax.swing.JLabel editPhoneNbr;
    private javax.swing.JTextField editPhoneNbrField;
    private javax.swing.JTextField editPostalCodeField;
    private javax.swing.JLabel editPostalCodeLabel;
    private javax.swing.JPasswordField editPwField;
    private javax.swing.JTextField editUsernameField;
    private javax.swing.JLabel editUsernameLabel;
    private javax.swing.JLabel editVerifyPWLabel;
    private javax.swing.JPasswordField editVerifyPwField;
    private javax.swing.JToggleButton modifyBtn;
    // End of variables declaration//GEN-END:variables
}