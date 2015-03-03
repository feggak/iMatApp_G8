/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class Controller {
  
    // Variables declaration
    private static Controller instance = null;
    protected static IMatDataHandler db;
    private static ShoppingCart shoppingCart;
    private ProductCategory currentCategory;
    private boolean showAllActive = false;
    
    private Controller() {
        db = IMatDataHandler.getInstance();
        shoppingCart = db.getShoppingCart();
    }
    
    public static synchronized Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    
    public void addToShoppingCart(ShoppingItem item) {
        shoppingCart.addItem(item);
    }
    
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
    
    public void hideBreadcrumbs() {
        MainWindow.breadcrumbs.setVisible(false);
    }
    
    public void updateBreadcrumbs(String one, String two, String three) {
        MainWindow.breadcrumbs.updateLabels(one, two, three);
        MainWindow.breadcrumbs.repaint();
        MainWindow.breadcrumbs.setVisible(true);
    }
    
    public void showFeatured() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new FeaturedPanel());
        MainWindow.contentPanel.repaint();
    }
    
    public void showRegister() {
        MainWindow.contentPanel.removeAll();
        MainWindow.loginPopup.setVisible(false);
        MainWindow.contentPanel.add(new Register());
        MainWindow.contentPanel.repaint();
    }
    
    public void showShopAllProducts() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new ShopPanel("all"));
        MainWindow.contentPanel.revalidate();
        showAllActive = true;
    }
    
    public void showShopCategory(ProductCategory category) {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new ShopPanel(category));
        MainWindow.contentPanel.revalidate();
        currentCategory = category;
        showAllActive = false;
    }
    
    public void showPreviousShopCategory() {
        if (showAllActive) {
            MainWindow.contentPanel.removeAll();
            MainWindow.contentPanel.add(new ShopPanel("all"));
            MainWindow.contentPanel.revalidate();
            showAllActive = true;
        } else {
            MainWindow.contentPanel.removeAll();
            MainWindow.contentPanel.add(new ShopPanel(currentCategory));
            MainWindow.contentPanel.revalidate();
            showAllActive = false;
        }
    }
    
    public void showDetails(Product product) {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new DetailedPanel(product));
        MainWindow.contentPanel.repaint();
        MainWindow.contentPanel.revalidate();
    }
    
}
