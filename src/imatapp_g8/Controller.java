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
public class Controller {
  
    // Variables declaration
    private static Controller instance = null;
    protected static IMatDataHandler db;
    protected static ShoppingCart cart;
    private ProductCategory currentCategory;
    private boolean showAllActive = false;
    private boolean featuredActive = false;
    protected static boolean searchPanelVisible = false;
    
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
    
    public void toggleLoginOrNameBtn(boolean b){//false = login, true = name
        MainWindow.setIfloggedIn(b);
        MainWindow.set_toggleLoginBtn();
    }
    
    public void showForgottenPW(){
        MainWindow.contentPanel.removeAll();
        MainWindow.loginPopup.setVisible(false);
        MainWindow.contentPanel.add(new ForgottenPasswordPanel());
        MainWindow.contentPanel.revalidate();
    }
    
    public void setIfLoggedIn(boolean b){
        MainWindow.setIfloggedIn(b);
    }
    
    public void updateCartHeader() {
        if (cart.getItems().isEmpty()) {
            MainWindow.cartLabel.setText("Inga varor");
            MainWindow.cartTotalLabel.setText("");
        } else {
            MainWindow.cartLabel.setText(cart.getItems().size() + " varor");
            MainWindow.cartTotalLabel.setText((Math.round(cart.getTotal()*100.0)/100.0) + " kr");
        }
    }
    
    public void hideBreadcrumbs() {
        MainWindow.breadcrumbs.setVisible(false);
    }
    
    public void updateBreadcrumbs(String one, String two, String three) {
        MainWindow.breadcrumbs.updateLabels(one, two, three);
        MainWindow.breadcrumbs.repaint();
        MainWindow.breadcrumbs.setVisible(true);
    }
    
    public void showShoppingCartPanel() {
        MainWindow.contentPanel.removeAll();
        MainWindow.cartDropdown.setVisible(false);
        MainWindow.contentPanel.add(new CartPanel());
        MainWindow.contentPanel.repaint();
    }
    
    public void showFeatured() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new FeaturedPanel());
        MainWindow.contentPanel.repaint();
        showAllActive = false;
        featuredActive = true;
        searchPanelVisible = false;
    }
    
    public void showRegister() {
        MainWindow.contentPanel.removeAll();
        MainWindow.loginPopup.setVisible(false);
        MainWindow.contentPanel.add(new Register());
        MainWindow.contentPanel.repaint();
    }
    
    public void showShopAllProducts() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new ShopPanel(0));
        MainWindow.contentPanel.revalidate();
        showAllActive = true;
        featuredActive = false;
        searchPanelVisible = false;
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
    }
    
    public void showShopCategory(ProductCategory category) {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new ShopPanel(category));
        MainWindow.contentPanel.revalidate();
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
    }
    
    public void showDetails(Product product) {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new DetailedPanel(product));
        MainWindow.contentPanel.repaint();
        MainWindow.contentPanel.revalidate();
        searchPanelVisible = false;
    }
    
}
