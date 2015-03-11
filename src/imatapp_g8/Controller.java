/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class Controller {
  
    // Variables declaration
    private static Controller instance = null;
    protected static IMatDataHandler db;
    protected static ShoppingCart cart;
    protected static int shippingType = 1;
    protected static boolean searchPanelVisible = false;
    private static List<Product> currentCategory;
    private static boolean showAllActive = false;
    private static boolean featuredActive = false;
    // Temporary user
    protected static String tempID;
    protected static String tempFirstName;
    protected static String tempLastName;
    protected static String tempEmail;
    protected static String tempAdress;
    protected static String tempZIP;
    protected static String tempCity;
    protected static String tempCountry;
    protected static String tempProtectedCCNumber;
    
    // Constructor
    private Controller() {
        db = IMatDataHandler.getInstance();
        cart = db.getShoppingCart();
    }
    public static synchronized Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    
    public void clearTemporaryCustomerData() {
        tempID = "";
        tempFirstName = "";
        tempLastName = "";
        tempEmail = "";
        tempAdress = "";
        tempZIP = "";
        tempCity = "";
        tempCountry = "";
        tempProtectedCCNumber = "";
    }
    
    public void changeCategoryView(String view) {
        CardLayout cardLayout = (CardLayout)MainWindow.categoryPanel.getLayout();
        cardLayout.show(MainWindow.categoryPanel,view);
    }
    
    // Shopping cart
    public void updateCartHeader() {
        if (cart.getItems().isEmpty()) {
            MainWindow.cartLabel.setText("Inga varor");
            MainWindow.cartTotalLabel.setText("");
        } else {
            MainWindow.cartLabel.setText(cart.getItems().size() + " varor");
            MainWindow.cartTotalLabel.setText((Math.round(cart.getTotal()*100.0)/100.0) + " kr");
        }
    }
    public void addToCart(Product product,double amount) {
        boolean different = true;
        List<ShoppingItem> contents = new ArrayList<>();
        contents = cart.getItems();
        for (int i = 0; i < contents.size(); i++) {
            if (contents.get(i).getProduct().equals(product)) {
                contents.get(i).setAmount(contents.get(i).getAmount() + amount);
                different = false;
            }
        }
        if (different) {
            cart.addItem(new ShoppingItem(product,amount));
        }
        CartDropdown.update();
        updateCartHeader();
    }
    public void setShippingType(int type) {
        if (type > 0 && type < 4) {
            shippingType = type;
        } else {}
    }
    public double getShippingPrice() {
        if (shippingType == 1) {
            return 0.0;
        }
        if (shippingType == 2) {
            return 49.0;
        }
        else {
            return 89.0;
        }
    }
    
    // Breadcrumbs
    public void hideBreadcrumbs() {
        MainWindow.breadcrumbs.setVisible(false);
    }
    public void updateBreadcrumbs(String one, String two, String three) {
        MainWindow.breadcrumbs.updateLabels(one, two, three);
        MainWindow.breadcrumbs.repaint();
        MainWindow.breadcrumbs.revalidate();
        MainWindow.breadcrumbs.setVisible(true);
    }
    
    // Store views
    public void showFeatured() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new FeaturedPanel());
        MainWindow.contentPanel.revalidate();
        changeCategoryView("store");
        showAllActive = false;
        featuredActive = true;
        searchPanelVisible = false;
    }
    public void showShopAllProducts() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new ShopPanel(0));
        MainWindow.contentPanel.revalidate();
        changeCategoryView("store");
        showAllActive = true;
        featuredActive = false;
        searchPanelVisible = false;
    }
    public void showShopCategory(List<Product> category) {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new ShopPanel(category));
        MainWindow.contentPanel.revalidate();
        changeCategoryView("store");
        currentCategory = category;
        showAllActive = false;
        featuredActive = false;
        searchPanelVisible = false;
    }
    public void showPreviousShopCategory() {
        if (showAllActive) {
            MainWindow.contentPanel.removeAll();
            MainWindow.contentPanel.add(new ShopPanel(0));
            MainWindow.contentPanel.revalidate();
            showAllActive = true;
            featuredActive = false;
            searchPanelVisible = false;
        }
        if (featuredActive) {
            MainWindow.contentPanel.removeAll();
            MainWindow.contentPanel.add(new FeaturedPanel());
            MainWindow.contentPanel.repaint();
            showAllActive = false;
            featuredActive = true;
            searchPanelVisible = false;
        } else {
            MainWindow.contentPanel.removeAll();
            MainWindow.contentPanel.add(new ShopPanel(currentCategory));
            MainWindow.contentPanel.revalidate();
            showAllActive = false;
            featuredActive = false;
            searchPanelVisible = false;
        }
        changeCategoryView("store");
    }
    public void showDetails(Product product) {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new DetailedPanel(product));
        MainWindow.contentPanel.repaint();
        MainWindow.contentPanel.revalidate();
        searchPanelVisible = false;
        changeCategoryView("store");
    }
    public void showShopSearch(String search) {
        List<Product> result = new ArrayList<>();
        result = Controller.db.findProducts(search);
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new ShopPanel(result));
        MainWindow.contentPanel.revalidate();
        showAllActive = false;
        featuredActive = false;
        searchPanelVisible = true;
        changeCategoryView("search");
    }
    
    // Account views
    public void showAccount() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new AccountPanel());
        MainWindow.contentPanel.revalidate();
        MainWindow.categoryPanel.resetAllAccountFontsExceptSettings();
        changeCategoryView("account");
    }
    public void showFavorites() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new FavoritesPanel());
        MainWindow.contentPanel.revalidate();
        changeCategoryView("account");
    }
    public void toggleLoginBtn(boolean b){//false = login, true = name
        MainWindow.setIsLoggedIn(b);
        MainWindow.setLoginBtnLabel();
    }
    public void showForgottenPW(){
        MainWindow.contentPanel.removeAll();
        MainWindow.loginPopup.setVisible(false);
        MainWindow.contentPanel.add(new ForgottenPasswordPanel());
        MainWindow.contentPanel.revalidate();
    }
    public void setIsLoggedIn(boolean b){
        MainWindow.setIsLoggedIn(b);
    }
    public void showRegister() {
        MainWindow.contentPanel.removeAll();
        MainWindow.loginPopup.setVisible(false);
        MainWindow.contentPanel.add(new Register());
        MainWindow.contentPanel.repaint();
    }
    
    // Cart & Buy views 
    public void showShoppingCartPanel() {
        MainWindow.contentPanel.removeAll();
        MainWindow.cartDropdown.setVisible(false);
        MainWindow.contentPanel.add(new CartPanel());
        MainWindow.contentPanel.repaint();
        MainWindow.contentPanel.revalidate();
        changeCategoryView("store");
    }
    public void showBuyPanel() {
        MainWindow.contentPanel.removeAll();
        MainWindow.cartDropdown.setVisible(false);
        MainWindow.contentPanel.add(new BuyPanel());
        MainWindow.contentPanel.repaint();
        MainWindow.contentPanel.revalidate();
        changeCategoryView("buy");
    }
}
