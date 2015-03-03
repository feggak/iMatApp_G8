/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

/**
 *
 * @author rasmusdavidsson
 */
import se.chalmers.ait.dat215.project.*;
public class MyPagePanel extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    Controller controller;
    Customer customer;
    User user;
    IMatDataHandler handler;
    /**
     * Creates new customizer MyPagePanel
     */
    public MyPagePanel() {
        initComponents();
        controller = Controller.getInstance();
        handler = IMatDataHandler.getInstance();
        customer = handler.getCustomer();
        user = handler.getUser();
        myPagenameLabel.setText(customer.getFirstName());
        myPageaddressLabel.setText(customer.getAddress());
        myPagemailLabel.setText(customer.getEmail());
        myPagelastnameLabel.setText(customer.getLastName());
        myPagemobileLabel.setText(customer.getMobilePhoneNumber());
        myPagephoneLabel.setText(customer.getPhoneNumber());
        myPageortLabel.setText(customer.getPostAddress());
        myPagepostalcodeLabel.setText(customer.getPostCode());
        myPageusernameLabel.setText(user.getUserName());
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        myPagenameLabel = new javax.swing.JLabel();
        myPagelastnameLabel = new javax.swing.JLabel();
        myPageaddressLabel = new javax.swing.JLabel();
        myPagemailLabel = new javax.swing.JLabel();
        myPagemobileLabel = new javax.swing.JLabel();
        myPagephoneLabel = new javax.swing.JLabel();
        myPageusernameLabel = new javax.swing.JLabel();
        myPageortLabel = new javax.swing.JLabel();
        myPagepostalcodeLabel = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(930, 630));
        setMinimumSize(new java.awt.Dimension(930, 630));
        setPreferredSize(new java.awt.Dimension(930, 630));
        setLayout(null);

        jLabel1.setText("Namn:");
        add(jLabel1);
        jLabel1.setBounds(202, 115, 41, 16);

        jLabel2.setText("Efternamn:");
        add(jLabel2);
        jLabel2.setBounds(175, 149, 68, 16);

        jLabel3.setText("Address:");
        add(jLabel3);
        jLabel3.setBounds(188, 183, 55, 16);

        jLabel4.setText("E-post:");
        add(jLabel4);
        jLabel4.setBounds(196, 217, 47, 16);

        jLabel5.setText("Mobil Nummer:");
        add(jLabel5);
        jLabel5.setBounds(146, 251, 97, 16);

        jLabel6.setText("Telefon Nummer:");
        add(jLabel6);
        jLabel6.setBounds(134, 285, 109, 16);

        jLabel7.setText("Post Kod:");
        add(jLabel7);
        jLabel7.setBounds(184, 387, 59, 16);

        jLabel8.setText("Ort:");
        add(jLabel8);
        jLabel8.setBounds(219, 353, 24, 16);

        jLabel9.setText("Användarnamn:");
        add(jLabel9);
        jLabel9.setBounds(145, 319, 98, 16);

        jLabel10.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel10.setText("Mina Uppgifter");
        add(jLabel10);
        jLabel10.setBounds(387, 18, 154, 25);
        add(jSeparator1);
        jSeparator1.setBounds(202, 49, 486, 10);
        add(myPagenameLabel);
        myPagenameLabel.setBounds(378, 115, 180, 20);
        add(myPagelastnameLabel);
        myPagelastnameLabel.setBounds(378, 149, 180, 20);
        add(myPageaddressLabel);
        myPageaddressLabel.setBounds(378, 183, 180, 20);
        add(myPagemailLabel);
        myPagemailLabel.setBounds(378, 217, 190, 20);
        add(myPagemobileLabel);
        myPagemobileLabel.setBounds(378, 251, 190, 20);
        add(myPagephoneLabel);
        myPagephoneLabel.setBounds(378, 285, 190, 20);
        add(myPageusernameLabel);
        myPageusernameLabel.setBounds(378, 319, 190, 20);
        add(myPageortLabel);
        myPageortLabel.setBounds(378, 353, 190, 20);
        add(myPagepostalcodeLabel);
        myPagepostalcodeLabel.setBounds(378, 387, 190, 20);

        logOutBtn.setText("Logga ut");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        add(logOutBtn);
        logOutBtn.setBounds(10, 590, 99, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        handler.shutDown();
        controller.setIfLoggedIn(false);
        controller.toggleLoginOrNameBtn(false);
        controller.showFeatured();
        
        
    }//GEN-LAST:event_logOutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton logOutBtn;
    private javax.swing.JLabel myPageaddressLabel;
    private javax.swing.JLabel myPagelastnameLabel;
    private javax.swing.JLabel myPagemailLabel;
    private javax.swing.JLabel myPagemobileLabel;
    private javax.swing.JLabel myPagenameLabel;
    private javax.swing.JLabel myPageortLabel;
    private javax.swing.JLabel myPagephoneLabel;
    private javax.swing.JLabel myPagepostalcodeLabel;
    private javax.swing.JLabel myPageusernameLabel;
    // End of variables declaration//GEN-END:variables
}
