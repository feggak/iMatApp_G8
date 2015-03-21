/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class BuyPanel extends javax.swing.JPanel {
    
    // Custom variable declaration
    static Controller controller;
    private double totalPrice;
    
    /**
     * Creates new form ShopPanel
     */
    public BuyPanel() {
        controller = Controller.getInstance();
        totalPrice = controller.cart.getTotal();
        initComponents();
        resetErrorLabels();
        shippingFirstNameField.setText(Controller.db.getCustomer().getFirstName());
        shippingLastNameField.setText(Controller.db.getCustomer().getLastName());
        shippingEmailField.setText(Controller.db.getCustomer().getEmail());
        shippingAdressField.setText(Controller.db.getCustomer().getAddress());
        shippingZIPField.setText(Controller.db.getCustomer().getPostCode());
        shippingCityField.setText(Controller.db.getCustomer().getPostAddress());
        MainWindow.categoryPanel.setBuyStage(1);
    }
    
    private void fillOverviewTable() {
        String[] columnNames = {"Produktnamn","Antal","Pris"};
        Object[][] data = new Object[Controller.cart.getItems().size()][3];
        for (int i = 0; i < Controller.cart.getItems().size(); i++) {
            ShoppingItem item = Controller.cart.getItems().get(i);
            data [i][0] = item.getProduct().getName();
            data [i][1] = Double.toString(Math.round((item.getAmount()*100.0)/100.0)) + " " + item.getProduct().getUnitSuffix();
            data [i][2] = item.getTotal() + " kr";
        }
        TableModel model = new DefaultTableModel(data,columnNames);
        overviewTable.setModel(model);
    }
    private void updateOverviewInfo() {
        overviewIDValue.setText(Controller.tempID);
        overviewAdressValue.setText(Controller.tempAdress);
        overviewCityValue.setText(Controller.tempCity);
        overviewCountryValue.setText(Controller.tempCountry);
        overviewEmaiValue.setText(Controller.tempEmail);
        overviewFirstNameValue.setText(Controller.tempFirstName);
        overviewLastNameValue.setText(Controller.tempLastName);
        overviewZIPValue.setText(Controller.tempZIP);
        overviewCCNumberValue.setText(Controller.tempProtectedCCNumber);
    }
    private void resetErrorLabels() {
        shippingIDErrorLabel.setVisible(false);
        shippingEmailErrorLabel.setVisible(false);
        cardNrErrorLabel.setVisible(false);
        cardNameErrorLabel.setVisible(false);
    }
    
    private boolean isIDFieldCorrect() {
        try {
            Integer.parseInt((String)shippingIDField.getText());
        }
        catch (NumberFormatException e) {
            shippingIDErrorLabel.setVisible(true);
            return false;
        }
        return true;
    }
    private boolean isEmailFieldCorrect() {
        if (!shippingEmailField.getText().contains("@")) {
            shippingEmailErrorLabel.setVisible(true);
            return false;
        }
        return true;
    }
    
    private boolean isCCNumberFieldCorrect() {
        String nr = cardNrField1.getText() + cardNrField2.getText() + cardNrField3.getText() + cardNrField4.getText();
        if (nr.length() != 16) {
            cardNrErrorLabel.setVisible(true);
            return false;
        }
        return true;
    }
    
    private boolean isCCNameFieldCorrect() {
        if (cardNameField.getText().equals("")) {
            cardNameErrorLabel.setVisible(true);
            return false;
        }
        return true;
    }
    
    private boolean isAllFieldsCorrect() {
        return isIDFieldCorrect() && isEmailFieldCorrect() && isCCNumberFieldCorrect() && isCCNameFieldCorrect();
    }
    
    private void saveTemporaryCustomerData() {
        Controller.tempID = shippingIDField.getText();
        Controller.tempFirstName = shippingFirstNameField.getText();
        Controller.tempLastName = shippingLastNameField.getText();
        Controller.tempEmail = shippingEmailField.getText();
        Controller.tempAdress = shippingAdressField.getText();
        Controller.tempZIP = shippingZIPField.getText();
        Controller.tempCity = shippingCityField.getText();
        Controller.tempCountry = (String)shippingCountryComboBox.getSelectedItem();
        Controller.tempProtectedCCNumber = "************" + cardNrField4.getText();
    }
    private void saveCustomerData() {
        Controller.tempID = shippingIDField.getText();
        Controller.db.getCustomer().setFirstName(shippingFirstNameField.getText());
        Controller.db.getCustomer().setLastName(shippingLastNameField.getText());
        Controller.db.getCustomer().setEmail(shippingEmailField.getText());
        Controller.db.getCustomer().setAddress(shippingAdressField.getText());
        Controller.db.getCustomer().setPostCode(shippingZIPField.getText());
        Controller.db.getCustomer().setPostAddress(shippingCityField.getText());
        Controller.tempCountry = (String)shippingCountryComboBox.getSelectedItem();
    }
    private void saveCreditCardData() {
        Controller.db.getCreditCard().setCardType((String)cardTypeComboBox.getSelectedItem());
        Controller.db.getCreditCard().setHoldersName(cardNameField.getText());
        Controller.db.getCreditCard().setCardNumber(cardNrField1.getText() + cardNrField2.getText() + cardNrField3.getText() + cardNrField4.getText());
        Controller.db.getCreditCard().setValidMonth(Integer.parseInt((String)monthComboBox.getSelectedItem()));
        Controller.db.getCreditCard().setValidYear(Integer.parseInt((String)yearComboBox.getSelectedItem()));
        Controller.db.getCreditCard().setVerificationCode(Integer.parseInt(cvcField.getText()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shippingAndBillingPanel = new javax.swing.JPanel();
        shippingHeaderLabel = new javax.swing.JLabel();
        shippingAdressPanel = new javax.swing.JPanel();
        shippingIDLabel = new javax.swing.JLabel();
        shippingIDErrorLabel = new javax.swing.JLabel();
        shippingIDField = new javax.swing.JTextField();
        shippingFirstNameLabel = new javax.swing.JLabel();
        shippingFirstNameField = new javax.swing.JTextField();
        shippingLastNameLabel = new javax.swing.JLabel();
        shippingLastNameField = new javax.swing.JTextField();
        shippingEmailLabel = new javax.swing.JLabel();
        shippingEmailField = new javax.swing.JTextField();
        shippingAdresslLabel = new javax.swing.JLabel();
        shippingAdressField = new javax.swing.JTextField();
        shippingZIPLabel = new javax.swing.JLabel();
        shippingZIPField = new javax.swing.JTextField();
        shippingCityLabel = new javax.swing.JLabel();
        shippingCityField = new javax.swing.JTextField();
        shippingCountryLabel = new javax.swing.JLabel();
        shippingCountryComboBox = new javax.swing.JComboBox();
        saveSettingsCheckBox = new javax.swing.JCheckBox();
        shippingEmailErrorLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        billingInfoPanel = new javax.swing.JPanel();
        disclaimerLabel = new javax.swing.JLabel();
        billingMethodLabel = new javax.swing.JLabel();
        billingMethodComboBox = new javax.swing.JComboBox();
        cardTypeLabel = new javax.swing.JLabel();
        cardTypeComboBox = new javax.swing.JComboBox();
        cardNameLabel = new javax.swing.JLabel();
        cardNameField = new javax.swing.JTextField();
        cardNrLabel = new javax.swing.JLabel();
        cardNrField1 = new javax.swing.JTextField();
        separator1Label = new javax.swing.JLabel();
        cardNrField2 = new javax.swing.JTextField();
        separator2Label = new javax.swing.JLabel();
        cardNrField3 = new javax.swing.JTextField();
        separator3Label = new javax.swing.JLabel();
        cardNrField4 = new javax.swing.JTextField();
        monthLabel = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox();
        yearLabel = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox();
        cvcLabel = new javax.swing.JLabel();
        cvcField = new javax.swing.JTextField();
        saveCCCheckBox = new javax.swing.JCheckBox();
        cardNameErrorLabel = new javax.swing.JLabel();
        cardNrErrorLabel = new javax.swing.JLabel();
        back1Btn = new javax.swing.JButton();
        nex1tBtn = new javax.swing.JButton();
        productsPriceLabel = new javax.swing.JLabel();
        productsTaxPriceLabel = new javax.swing.JLabel();
        shippingPriceLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        overviewPanel = new javax.swing.JPanel();
        back2Btn = new javax.swing.JButton();
        next2Btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        overviewTable = new javax.swing.JTable();
        shippingHeaderLabel1 = new javax.swing.JLabel();
        productsPriceLabel1 = new javax.swing.JLabel();
        productsTaxPriceLabel1 = new javax.swing.JLabel();
        shippingPriceLabel1 = new javax.swing.JLabel();
        totalPriceLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        overviewIDValue = new javax.swing.JLabel();
        overviewFirstNameValue = new javax.swing.JLabel();
        overviewLastNameValue = new javax.swing.JLabel();
        overviewEmaiValue = new javax.swing.JLabel();
        overviewAdressValue = new javax.swing.JLabel();
        overviewZIPValue = new javax.swing.JLabel();
        overviewCityValue = new javax.swing.JLabel();
        overviewCountryValue = new javax.swing.JLabel();
        overviewCCNumberValue = new javax.swing.JLabel();
        overviewIDLabel = new javax.swing.JLabel();
        overviewFirstNameLabel = new javax.swing.JLabel();
        overviewLastNameLabel = new javax.swing.JLabel();
        overviewEmailLabel = new javax.swing.JLabel();
        overviewAdressLabel = new javax.swing.JLabel();
        overviewZIPLabel = new javax.swing.JLabel();
        overviewCityLabel = new javax.swing.JLabel();
        overviewCountryLabel = new javax.swing.JLabel();
        overviewCCNumberLabel = new javax.swing.JLabel();
        donePanel = new javax.swing.JPanel();
        next3Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(930, 32767));
        setMinimumSize(new java.awt.Dimension(930, 630));
        setPreferredSize(new java.awt.Dimension(930, 630));
        setLayout(new java.awt.CardLayout());

        shippingAndBillingPanel.setBackground(new java.awt.Color(255, 255, 255));
        shippingAndBillingPanel.setPreferredSize(new java.awt.Dimension(930, 630));
        shippingAndBillingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shippingHeaderLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        shippingHeaderLabel.setText("Leveransadress:");
        shippingAndBillingPanel.add(shippingHeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        shippingAdressPanel.setBackground(new java.awt.Color(255, 255, 255));
        shippingAdressPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        shippingAdressPanel.setAlignmentX(0.0F);
        shippingAdressPanel.setAlignmentY(0.0F);
        shippingAdressPanel.setMaximumSize(new java.awt.Dimension(920, 590));
        shippingAdressPanel.setLayout(null);

        shippingIDLabel.setText("Personnummer:");
        shippingIDLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        shippingAdressPanel.add(shippingIDLabel);
        shippingIDLabel.setBounds(20, 20, 120, 14);

        shippingIDErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        shippingIDErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        shippingIDErrorLabel.setText("Bara siffror tillåtna");
        shippingIDErrorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        shippingAdressPanel.add(shippingIDErrorLabel);
        shippingIDErrorLabel.setBounds(274, 20, 120, 14);
        shippingAdressPanel.add(shippingIDField);
        shippingIDField.setBounds(20, 40, 380, 20);

        shippingFirstNameLabel.setText("Förnamn:");
        shippingFirstNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        shippingAdressPanel.add(shippingFirstNameLabel);
        shippingFirstNameLabel.setBounds(20, 80, 120, 14);
        shippingAdressPanel.add(shippingFirstNameField);
        shippingFirstNameField.setBounds(20, 100, 380, 20);

        shippingLastNameLabel.setText("Efternamn:");
        shippingLastNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        shippingAdressPanel.add(shippingLastNameLabel);
        shippingLastNameLabel.setBounds(20, 140, 120, 14);
        shippingAdressPanel.add(shippingLastNameField);
        shippingLastNameField.setBounds(20, 160, 380, 20);

        shippingEmailLabel.setText("E-mail:");
        shippingEmailLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        shippingAdressPanel.add(shippingEmailLabel);
        shippingEmailLabel.setBounds(20, 200, 120, 14);
        shippingAdressPanel.add(shippingEmailField);
        shippingEmailField.setBounds(20, 220, 380, 20);

        shippingAdresslLabel.setText("Adress:");
        shippingAdresslLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        shippingAdressPanel.add(shippingAdresslLabel);
        shippingAdresslLabel.setBounds(20, 260, 120, 14);
        shippingAdressPanel.add(shippingAdressField);
        shippingAdressField.setBounds(20, 280, 380, 20);

        shippingZIPLabel.setText("Postnummer:");
        shippingZIPLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        shippingAdressPanel.add(shippingZIPLabel);
        shippingZIPLabel.setBounds(20, 320, 90, 14);
        shippingAdressPanel.add(shippingZIPField);
        shippingZIPField.setBounds(20, 340, 90, 20);

        shippingCityLabel.setText("Ort:");
        shippingCityLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        shippingAdressPanel.add(shippingCityLabel);
        shippingCityLabel.setBounds(125, 320, 120, 14);
        shippingAdressPanel.add(shippingCityField);
        shippingCityField.setBounds(120, 340, 280, 20);

        shippingCountryLabel.setText("Land:");
        shippingCountryLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        shippingAdressPanel.add(shippingCountryLabel);
        shippingCountryLabel.setBounds(20, 380, 80, 14);

        shippingCountryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas, The", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia", "Botswana", "Bougainville", "Brazil", "British Indian Ocean", "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde Islands", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China, Hong Kong", "China, Macau", "China, People’s Republic", "China, Taiwan", "Colombia", "Comoros", "Congo, Democratic Republic of", "Congo, Republic of", "Cook Islands", "Costa Rica", "Cote d’Ivoire", "Croatia", "Cuba", "Cyprus\tCzech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Faeroe Islands", "Falkland Islands", "Federated States of Micronesia", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "Gabon", "Gambia, The", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See (Vatican City State)", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People’s Rep", "Korea, Republic of", "Kosovo", "Kuwait\tKyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Puerto Rico", "Qatar", "Réunion", "Romania", "Russia", "Rwanda\tSaint Barthelemy", "Saint Helena", "Saint Kitts & Nevis", "Saint Lucia", "Saint Martin", "Saint Pierre & Miquelon", "Saint Vincent", "Samoa", "San Marino", "Sao Tomé & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Tajikistan", "Tanzania", "Thailand", "Timor Leste", "Togo", "Tokelau Islands", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks & Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom of GB & NI", "United States of America", "Uruguay", "US Virgin Islands", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Wallis & Futuna Islands", "Yemen", "Zambia", "Zimbabwe" }));
        shippingAdressPanel.add(shippingCountryComboBox);
        shippingCountryComboBox.setBounds(20, 400, 380, 20);

        saveSettingsCheckBox.setText("Spara leveransuppgifterna till mitt konto");
        shippingAdressPanel.add(saveSettingsCheckBox);
        saveSettingsCheckBox.setBounds(20, 440, 380, 23);

        shippingEmailErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        shippingEmailErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        shippingEmailErrorLabel.setText("Måste innehålla \"@\"");
        shippingEmailErrorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        shippingAdressPanel.add(shippingEmailErrorLabel);
        shippingEmailErrorLabel.setBounds(234, 200, 160, 14);

        shippingAndBillingPanel.add(shippingAdressPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 44, 420, 490));

        headerLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        headerLabel.setText("Betalningsmetod:");
        shippingAndBillingPanel.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 14, -1, -1));

        billingInfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        billingInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        billingInfoPanel.setLayout(null);

        disclaimerLabel.setForeground(new java.awt.Color(255, 0, 51));
        disclaimerLabel.setText("För närvarande erbjuder vi bara betalning via bankkort, ledsen för eventuella besvär!");
        disclaimerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(disclaimerLabel);
        disclaimerLabel.setBounds(20, 240, 430, 14);

        billingMethodLabel.setText("Betalningsmedel:");
        billingMethodLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(billingMethodLabel);
        billingMethodLabel.setBounds(20, 20, 120, 14);

        billingMethodComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bankkort" }));
        billingInfoPanel.add(billingMethodComboBox);
        billingMethodComboBox.setBounds(20, 40, 205, 20);

        cardTypeLabel.setText("Korttyp:");
        cardTypeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(cardTypeLabel);
        cardTypeLabel.setBounds(245, 20, 120, 14);

        cardTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VISA", "MasterCard" }));
        billingInfoPanel.add(cardTypeComboBox);
        cardTypeComboBox.setBounds(245, 40, 205, 20);

        cardNameLabel.setText("Namn på kortet:");
        cardNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(cardNameLabel);
        cardNameLabel.setBounds(20, 80, 120, 14);
        billingInfoPanel.add(cardNameField);
        cardNameField.setBounds(20, 100, 430, 20);

        cardNrLabel.setText("Kortnummer:");
        cardNrLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(cardNrLabel);
        cardNrLabel.setBounds(20, 140, 120, 14);

        cardNrField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNrField1.setText("1234");
        billingInfoPanel.add(cardNrField1);
        cardNrField1.setBounds(20, 160, 50, 20);

        separator1Label.setText("-");
        separator1Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(separator1Label);
        separator1Label.setBounds(69, 165, 10, 14);

        cardNrField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNrField2.setText("5678");
        billingInfoPanel.add(cardNrField2);
        cardNrField2.setBounds(75, 160, 50, 20);

        separator2Label.setText("-");
        separator2Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(separator2Label);
        separator2Label.setBounds(123, 165, 10, 14);

        cardNrField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNrField3.setText("5678");
        billingInfoPanel.add(cardNrField3);
        cardNrField3.setBounds(129, 160, 50, 20);

        separator3Label.setText("-");
        separator3Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(separator3Label);
        separator3Label.setBounds(177, 165, 10, 14);

        cardNrField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNrField4.setText("5678");
        billingInfoPanel.add(cardNrField4);
        cardNrField4.setBounds(183, 160, 50, 20);

        monthLabel.setText("Månad:");
        monthLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(monthLabel);
        monthLabel.setBounds(245, 140, 50, 14);

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        billingInfoPanel.add(monthComboBox);
        monthComboBox.setBounds(235, 160, 70, 20);

        yearLabel.setText("År:");
        yearLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(yearLabel);
        yearLabel.setBounds(322, 140, 30, 14);

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15", "16", "17", "18", "19", "20", "21" }));
        billingInfoPanel.add(yearComboBox);
        yearComboBox.setBounds(312, 160, 70, 20);

        cvcLabel.setText("CVC:");
        cvcLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(cvcLabel);
        cvcLabel.setBounds(399, 140, 50, 14);

        cvcField.setText("000");
        billingInfoPanel.add(cvcField);
        cvcField.setBounds(399, 160, 50, 20);

        saveCCCheckBox.setText("Spara kortuppgifterna till mitt konto");
        billingInfoPanel.add(saveCCCheckBox);
        saveCCCheckBox.setBounds(20, 200, 430, 23);

        cardNameErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        cardNameErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cardNameErrorLabel.setText("vänligen fyll i namn");
        cardNameErrorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(cardNameErrorLabel);
        cardNameErrorLabel.setBounds(280, 80, 160, 14);

        cardNrErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        cardNrErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cardNrErrorLabel.setText("måste vara 16 siffror");
        cardNrErrorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        billingInfoPanel.add(cardNrErrorLabel);
        cardNrErrorLabel.setBounds(70, 140, 160, 14);

        shippingAndBillingPanel.add(billingInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 44, 470, 280));

        back1Btn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        back1Btn.setForeground(new java.awt.Color(255, 255, 255));
        back1Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        back1Btn.setText("Tillbaka");
        back1Btn.setAlignmentY(0.0F);
        back1Btn.setBorder(null);
        back1Btn.setBorderPainted(false);
        back1Btn.setContentAreaFilled(false);
        back1Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back1Btn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        back1Btn.setDefaultCapable(false);
        back1Btn.setFocusPainted(false);
        back1Btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        back1Btn.setIconTextGap(0);
        back1Btn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        back1Btn.setMaximumSize(new java.awt.Dimension(110, 46));
        back1Btn.setMinimumSize(new java.awt.Dimension(110, 46));
        back1Btn.setPreferredSize(new java.awt.Dimension(110, 46));
        back1Btn.setRequestFocusEnabled(false);
        back1Btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        back1Btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        back1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1BtnActionPerformed(evt);
            }
        });
        shippingAndBillingPanel.add(back1Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 580, 118, 36));

        nex1tBtn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        nex1tBtn.setForeground(new java.awt.Color(255, 255, 255));
        nex1tBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        nex1tBtn.setText("Nästa");
        nex1tBtn.setAlignmentY(0.0F);
        nex1tBtn.setBorder(null);
        nex1tBtn.setBorderPainted(false);
        nex1tBtn.setContentAreaFilled(false);
        nex1tBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nex1tBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        nex1tBtn.setDefaultCapable(false);
        nex1tBtn.setFocusPainted(false);
        nex1tBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nex1tBtn.setIconTextGap(0);
        nex1tBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nex1tBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        nex1tBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        nex1tBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        nex1tBtn.setRequestFocusEnabled(false);
        nex1tBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        nex1tBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        nex1tBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nex1tBtnActionPerformed(evt);
            }
        });
        shippingAndBillingPanel.add(nex1tBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 580, 118, 36));

        productsPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        productsPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productsPriceLabel.setText("Produktkostnad: " + Double.toString((Math.round(controller.cart.getTotal()*100.0)/100.0)) + " kr");
        shippingAndBillingPanel.add(productsPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 457, 200, -1));

        productsTaxPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        productsTaxPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productsTaxPriceLabel.setText("Varav moms: " + Double.toString((Math.round(controller.cart.getTotal()*12.0)/100.0)) + " kr");
        shippingAndBillingPanel.add(productsTaxPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 486, 180, -1));

        shippingPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        shippingPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        shippingPriceLabel.setText("Fraktkostnad: " + Double.toString(controller.getShippingPrice()) + " kr"
        );
        shippingAndBillingPanel.add(shippingPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 515, 180, -1));

        totalPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        totalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalPriceLabel.setText("Totalsumma: " + Double.toString((Math.round(controller.cart.getTotal()*100.0)/100.0) + controller.getShippingPrice()) + " kr");
        shippingAndBillingPanel.add(totalPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 230, -1));

        add(shippingAndBillingPanel, "card1");

        overviewPanel.setBackground(new java.awt.Color(255, 255, 255));
        overviewPanel.setPreferredSize(new java.awt.Dimension(930, 630));
        overviewPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back2Btn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        back2Btn.setForeground(new java.awt.Color(255, 255, 255));
        back2Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        back2Btn.setText("Tillbaka");
        back2Btn.setAlignmentY(0.0F);
        back2Btn.setBorder(null);
        back2Btn.setBorderPainted(false);
        back2Btn.setContentAreaFilled(false);
        back2Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back2Btn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        back2Btn.setDefaultCapable(false);
        back2Btn.setFocusPainted(false);
        back2Btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        back2Btn.setIconTextGap(0);
        back2Btn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        back2Btn.setMaximumSize(new java.awt.Dimension(110, 46));
        back2Btn.setMinimumSize(new java.awt.Dimension(110, 46));
        back2Btn.setPreferredSize(new java.awt.Dimension(110, 46));
        back2Btn.setRequestFocusEnabled(false);
        back2Btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        back2Btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        back2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2BtnActionPerformed(evt);
            }
        });
        overviewPanel.add(back2Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 580, 118, 36));

        next2Btn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        next2Btn.setForeground(new java.awt.Color(255, 255, 255));
        next2Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        next2Btn.setText("Bekräfta");
        next2Btn.setAlignmentY(0.0F);
        next2Btn.setBorder(null);
        next2Btn.setBorderPainted(false);
        next2Btn.setContentAreaFilled(false);
        next2Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next2Btn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        next2Btn.setDefaultCapable(false);
        next2Btn.setFocusPainted(false);
        next2Btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        next2Btn.setIconTextGap(0);
        next2Btn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        next2Btn.setMaximumSize(new java.awt.Dimension(110, 46));
        next2Btn.setMinimumSize(new java.awt.Dimension(110, 46));
        next2Btn.setPreferredSize(new java.awt.Dimension(110, 46));
        next2Btn.setRequestFocusEnabled(false);
        next2Btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        next2Btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        next2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2BtnActionPerformed(evt);
            }
        });
        overviewPanel.add(next2Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 580, 118, 36));

        jScrollPane2.setBorder(null);

        overviewTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewTable.setModel(new javax.swing.table.DefaultTableModel(
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
        overviewTable.setIntercellSpacing(new java.awt.Dimension(1, 3));
        overviewTable.setRowHeight(30);
        overviewTable.setShowVerticalLines(false);
        overviewTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(overviewTable);

        overviewPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 610, 520));

        shippingHeaderLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        shippingHeaderLabel1.setText("Översikt:");
        overviewPanel.add(shippingHeaderLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        productsPriceLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        productsPriceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productsPriceLabel1.setText("Produktkostnad: " + Double.toString((Math.round(controller.cart.getTotal()*100.0)/100.0)) + " kr");
        overviewPanel.add(productsPriceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 457, 200, -1));

        productsTaxPriceLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        productsTaxPriceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productsTaxPriceLabel1.setText("Varav moms: " + Double.toString((Math.round(controller.cart.getTotal()*12.0)/100.0)) + " kr");
        overviewPanel.add(productsTaxPriceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 486, 180, -1));

        shippingPriceLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        shippingPriceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        shippingPriceLabel1.setText("Fraktkostnad: " + Double.toString(controller.getShippingPrice()) + " kr"
        );
        overviewPanel.add(shippingPriceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 515, 180, -1));

        totalPriceLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        totalPriceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalPriceLabel1.setText("Totalsumma: " + Double.toString((Math.round(controller.cart.getTotal()*100.0)/100.0) + controller.getShippingPrice()) + " kr");
        overviewPanel.add(totalPriceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 230, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        overviewIDValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewIDValue.setText("jLabel1");
        jPanel1.add(overviewIDValue);
        overviewIDValue.setBounds(130, 20, 150, 29);

        overviewFirstNameValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewFirstNameValue.setText("jLabel1");
        jPanel1.add(overviewFirstNameValue);
        overviewFirstNameValue.setBounds(130, 50, 150, 29);

        overviewLastNameValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewLastNameValue.setText("jLabel1");
        jPanel1.add(overviewLastNameValue);
        overviewLastNameValue.setBounds(130, 80, 150, 29);

        overviewEmaiValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewEmaiValue.setText("jLabel1");
        jPanel1.add(overviewEmaiValue);
        overviewEmaiValue.setBounds(130, 110, 150, 29);

        overviewAdressValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewAdressValue.setText("jLabel1");
        jPanel1.add(overviewAdressValue);
        overviewAdressValue.setBounds(130, 140, 150, 29);

        overviewZIPValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewZIPValue.setText("jLabel1");
        jPanel1.add(overviewZIPValue);
        overviewZIPValue.setBounds(130, 170, 150, 29);

        overviewCityValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewCityValue.setText("jLabel1");
        jPanel1.add(overviewCityValue);
        overviewCityValue.setBounds(130, 200, 150, 29);

        overviewCountryValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewCountryValue.setText("jLabel1");
        jPanel1.add(overviewCountryValue);
        overviewCountryValue.setBounds(130, 230, 150, 29);

        overviewCCNumberValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewCCNumberValue.setText("jLabel1");
        jPanel1.add(overviewCCNumberValue);
        overviewCCNumberValue.setBounds(130, 260, 150, 29);

        overviewIDLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        overviewIDLabel.setText("Personnummer:");
        overviewIDLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(overviewIDLabel);
        overviewIDLabel.setBounds(10, 20, 110, 29);

        overviewFirstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewFirstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        overviewFirstNameLabel.setText("Förnamn:");
        overviewFirstNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(overviewFirstNameLabel);
        overviewFirstNameLabel.setBounds(10, 50, 110, 29);

        overviewLastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewLastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        overviewLastNameLabel.setText("Efternamn:");
        overviewLastNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(overviewLastNameLabel);
        overviewLastNameLabel.setBounds(10, 80, 110, 29);

        overviewEmailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewEmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        overviewEmailLabel.setText("Email:");
        overviewEmailLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(overviewEmailLabel);
        overviewEmailLabel.setBounds(10, 110, 110, 29);

        overviewAdressLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewAdressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        overviewAdressLabel.setText("Adress:");
        overviewAdressLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(overviewAdressLabel);
        overviewAdressLabel.setBounds(10, 140, 110, 29);

        overviewZIPLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewZIPLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        overviewZIPLabel.setText("Postkod:");
        overviewZIPLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(overviewZIPLabel);
        overviewZIPLabel.setBounds(10, 170, 110, 29);

        overviewCityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewCityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        overviewCityLabel.setText("Ort:");
        overviewCityLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(overviewCityLabel);
        overviewCityLabel.setBounds(10, 200, 110, 29);

        overviewCountryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewCountryLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        overviewCountryLabel.setText("Land:");
        overviewCountryLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(overviewCountryLabel);
        overviewCountryLabel.setBounds(10, 230, 110, 29);

        overviewCCNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overviewCCNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        overviewCCNumberLabel.setText("Bankkort:");
        overviewCCNumberLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(overviewCCNumberLabel);
        overviewCCNumberLabel.setBounds(10, 260, 110, 29);

        overviewPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 44, 286, 380));

        add(overviewPanel, "card2");

        donePanel.setBackground(new java.awt.Color(255, 255, 255));
        donePanel.setPreferredSize(new java.awt.Dimension(930, 630));
        donePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next3Btn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        next3Btn.setForeground(new java.awt.Color(255, 255, 255));
        next3Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        next3Btn.setText("Gå tillbaka");
        next3Btn.setAlignmentY(0.0F);
        next3Btn.setBorder(null);
        next3Btn.setBorderPainted(false);
        next3Btn.setContentAreaFilled(false);
        next3Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next3Btn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        next3Btn.setDefaultCapable(false);
        next3Btn.setFocusPainted(false);
        next3Btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        next3Btn.setIconTextGap(0);
        next3Btn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        next3Btn.setMaximumSize(new java.awt.Dimension(110, 46));
        next3Btn.setMinimumSize(new java.awt.Dimension(110, 46));
        next3Btn.setPreferredSize(new java.awt.Dimension(110, 46));
        next3Btn.setRequestFocusEnabled(false);
        next3Btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        next3Btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        next3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next3BtnActionPerformed(evt);
            }
        });
        donePanel.add(next3Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 580, 118, 36));

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tack för ditt köp!");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        donePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        add(donePanel, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void nex1tBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nex1tBtnActionPerformed
        if (isAllFieldsCorrect()) { 
            saveTemporaryCustomerData();
            updateOverviewInfo();
            fillOverviewTable();
            MainWindow.categoryPanel.setBuyStage(2);
            CardLayout cardLayout = (CardLayout) this.getLayout();
            cardLayout.show(this,"card2");
        }
    }//GEN-LAST:event_nex1tBtnActionPerformed

    private void back1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1BtnActionPerformed
        controller.showShoppingCartPanel();
    }//GEN-LAST:event_back1BtnActionPerformed

    private void back2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2BtnActionPerformed
        MainWindow.categoryPanel.setBuyStage(1);
        resetErrorLabels();
        CardLayout cardLayout = (CardLayout) this.getLayout();
        cardLayout.show(this,"card1");
    }//GEN-LAST:event_back2BtnActionPerformed

    private void next2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next2BtnActionPerformed
        if (saveSettingsCheckBox.isSelected()) {
            saveCustomerData();
            controller.clearTemporaryCustomerData();
        } else {
            controller.clearTemporaryCustomerData();
        }
        if (saveCCCheckBox.isSelected()) {
            saveCreditCardData();
            controller.clearTemporaryCustomerData();
        } else {
            controller.clearTemporaryCustomerData();
        }
        MainWindow.categoryPanel.setBuyStage(3);
        Controller.db.placeOrder(true);
        controller.updateCartHeader();
        CardLayout cardLayout = (CardLayout) this.getLayout();
        cardLayout.show(this,"card3");
    }//GEN-LAST:event_next2BtnActionPerformed

    private void next3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next3BtnActionPerformed
        controller.showFeatured();
    }//GEN-LAST:event_next3BtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1Btn;
    private javax.swing.JButton back2Btn;
    private javax.swing.JPanel billingInfoPanel;
    private javax.swing.JComboBox billingMethodComboBox;
    private javax.swing.JLabel billingMethodLabel;
    private javax.swing.JLabel cardNameErrorLabel;
    private javax.swing.JTextField cardNameField;
    private javax.swing.JLabel cardNameLabel;
    private javax.swing.JLabel cardNrErrorLabel;
    private javax.swing.JTextField cardNrField1;
    private javax.swing.JTextField cardNrField2;
    private javax.swing.JTextField cardNrField3;
    private javax.swing.JTextField cardNrField4;
    private javax.swing.JLabel cardNrLabel;
    private javax.swing.JComboBox cardTypeComboBox;
    private javax.swing.JLabel cardTypeLabel;
    private javax.swing.JTextField cvcField;
    private javax.swing.JLabel cvcLabel;
    private javax.swing.JLabel disclaimerLabel;
    private javax.swing.JPanel donePanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox monthComboBox;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JButton nex1tBtn;
    private javax.swing.JButton next2Btn;
    private javax.swing.JButton next3Btn;
    private javax.swing.JLabel overviewAdressLabel;
    private javax.swing.JLabel overviewAdressValue;
    private javax.swing.JLabel overviewCCNumberLabel;
    private javax.swing.JLabel overviewCCNumberValue;
    private javax.swing.JLabel overviewCityLabel;
    private javax.swing.JLabel overviewCityValue;
    private javax.swing.JLabel overviewCountryLabel;
    private javax.swing.JLabel overviewCountryValue;
    private javax.swing.JLabel overviewEmaiValue;
    private javax.swing.JLabel overviewEmailLabel;
    private javax.swing.JLabel overviewFirstNameLabel;
    private javax.swing.JLabel overviewFirstNameValue;
    private javax.swing.JLabel overviewIDLabel;
    private javax.swing.JLabel overviewIDValue;
    private javax.swing.JLabel overviewLastNameLabel;
    private javax.swing.JLabel overviewLastNameValue;
    private javax.swing.JPanel overviewPanel;
    private javax.swing.JTable overviewTable;
    private javax.swing.JLabel overviewZIPLabel;
    private javax.swing.JLabel overviewZIPValue;
    protected static javax.swing.JLabel productsPriceLabel;
    protected static javax.swing.JLabel productsPriceLabel1;
    protected static javax.swing.JLabel productsTaxPriceLabel;
    protected static javax.swing.JLabel productsTaxPriceLabel1;
    private javax.swing.JCheckBox saveCCCheckBox;
    private javax.swing.JCheckBox saveSettingsCheckBox;
    private javax.swing.JLabel separator1Label;
    private javax.swing.JLabel separator2Label;
    private javax.swing.JLabel separator3Label;
    private javax.swing.JTextField shippingAdressField;
    private static javax.swing.JPanel shippingAdressPanel;
    private javax.swing.JLabel shippingAdresslLabel;
    private javax.swing.JPanel shippingAndBillingPanel;
    private javax.swing.JTextField shippingCityField;
    private javax.swing.JLabel shippingCityLabel;
    private javax.swing.JComboBox shippingCountryComboBox;
    private javax.swing.JLabel shippingCountryLabel;
    private javax.swing.JLabel shippingEmailErrorLabel;
    private javax.swing.JTextField shippingEmailField;
    private javax.swing.JLabel shippingEmailLabel;
    private javax.swing.JTextField shippingFirstNameField;
    private javax.swing.JLabel shippingFirstNameLabel;
    private javax.swing.JLabel shippingHeaderLabel;
    private javax.swing.JLabel shippingHeaderLabel1;
    private javax.swing.JLabel shippingIDErrorLabel;
    private javax.swing.JTextField shippingIDField;
    private javax.swing.JLabel shippingIDLabel;
    private javax.swing.JTextField shippingLastNameField;
    private javax.swing.JLabel shippingLastNameLabel;
    protected static javax.swing.JLabel shippingPriceLabel;
    protected static javax.swing.JLabel shippingPriceLabel1;
    private javax.swing.JTextField shippingZIPField;
    private javax.swing.JLabel shippingZIPLabel;
    protected static javax.swing.JLabel totalPriceLabel;
    protected static javax.swing.JLabel totalPriceLabel1;
    private javax.swing.JComboBox yearComboBox;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
