/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import java.awt.Color;
import se.chalmers.ait.dat215.project.User;

/**
 *
 * @author rasmusdavidsson
 */
public class LoginPopup extends javax.swing.JPanel {
    
    Controller controller;
    User user;
    char c = 0;

    /**
     * Creates new customizer LoginPopup
     */
    public LoginPopup() {
        initComponents();
        controller = Controller.getInstance();
        passWtxt.setEchoChar(c);
        loginErrorLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passWtxt = new javax.swing.JPasswordField();
        usernameTxt = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        loginErrorLabel = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        forgottenPwdBtn = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(350, 300));
        setMinimumSize(new java.awt.Dimension(350, 300));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(350, 300));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(null);

        passWtxt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        passWtxt.setForeground(new java.awt.Color(153, 153, 153));
        passWtxt.setText("Lösenord..");
        passWtxt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 8)));
        passWtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passWtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passWtxtFocusLost(evt);
            }
        });
        add(passWtxt);
        passWtxt.setBounds(20, 80, 249, 40);

        usernameTxt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        usernameTxt.setForeground(new java.awt.Color(153, 153, 153));
        usernameTxt.setText("Användarnamn..");
        usernameTxt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 8)));
        usernameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTxtFocusLost(evt);
            }
        });
        usernameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTxtMouseClicked(evt);
            }
        });
        add(usernameTxt);
        usernameTxt.setBounds(20, 30, 249, 40);

        loginBtn.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon.png"))); // NOI18N
        loginBtn.setText("Logga in");
        loginBtn.setAlignmentY(0.0F);
        loginBtn.setBorder(null);
        loginBtn.setContentAreaFilled(false);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        loginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginBtn.setIconTextGap(0);
        loginBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        loginBtn.setMaximumSize(new java.awt.Dimension(250, 46));
        loginBtn.setMinimumSize(new java.awt.Dimension(250, 46));
        loginBtn.setPreferredSize(new java.awt.Dimension(250, 46));
        loginBtn.setRequestFocusEnabled(false);
        loginBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon_rollover.png"))); // NOI18N
        loginBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon_selected.png"))); // NOI18N
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        add(loginBtn);
        loginBtn.setBounds(20, 130, 249, 40);

        loginErrorLabel.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        loginErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        loginErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginErrorLabel.setText("Fel lösenord eller användarnamn");
        add(loginErrorLabel);
        loginErrorLabel.setBounds(20, 180, 249, 17);

        registerBtn.setText("Registrera");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        add(registerBtn);
        registerBtn.setBounds(20, 210, 120, 30);

        forgottenPwdBtn.setText("Glömt lösenord");
        forgottenPwdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgottenPwdBtnActionPerformed(evt);
            }
        });
        add(forgottenPwdBtn);
        forgottenPwdBtn.setBounds(150, 210, 120, 30);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popup.png"))); // NOI18N
        add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 310, 260);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTxtMouseClicked
        //trycker på användarnamn txt:t
        if (usernameTxt.getText().equals("Användarnamn..")){
            usernameTxt.setText("");
            usernameTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_usernameTxtMouseClicked

    private void usernameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusLost
        // förlorar focus på användarnamn
        if (usernameTxt.getText().equals("")){
           usernameTxt.setForeground(Color.lightGray);
           usernameTxt.setText("Användarnamn..");
        }
    }//GEN-LAST:event_usernameTxtFocusLost

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        user = Controller.db.getUser();
        // Successfull login
        if (user.getUserName().equals(usernameTxt.getText())&&user.getPassword().equals(String.valueOf(passWtxt.getPassword()))){
            loginErrorLabel.setVisible(false);
            controller.toggleLoginBtn(true);
            MainWindow.accountBtn.setText("Mitt konto");
            usernameTxt.setText("Användarnamn..");
            passWtxt.setText("Lösenord..");
            MainWindow.loginPopup.setVisible(false);
        } 
        // Failed login
        else {
            loginErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        controller.showRegister();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void forgottenPwdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgottenPwdBtnActionPerformed

        controller.showForgottenPW();
    }//GEN-LAST:event_forgottenPwdBtnActionPerformed

    private void passWtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passWtxtFocusLost
        // focus lost password
        if (String.valueOf(passWtxt.getPassword()).equals("")){
            c=0;
            passWtxt.setEchoChar(c);
            passWtxt.setForeground(Color.lightGray);
            passWtxt.setText("Lösenord..");
        }
    }//GEN-LAST:event_passWtxtFocusLost

    private void passWtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passWtxtFocusGained
        // focus gained password
        if (String.valueOf(passWtxt.getPassword()).equals("Lösenord..")){
            c='*';
            passWtxt.setEchoChar(c);
            passWtxt.setText("");
            passWtxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_passWtxtFocusGained

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton forgottenPwdBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginErrorLabel;
    private javax.swing.JPasswordField passWtxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
