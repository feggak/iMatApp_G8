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
    
    private static Controller instance = null;
    
    private Controller() {}
    
    public static synchronized Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    
    public void showFeatured() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new FeaturedPanel());
        MainWindow.contentPanel.revalidate();
    }
    
    public void showShopAllProducts() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new ShopPanel("all"));
        MainWindow.contentPanel.revalidate();
    }
    
    public void showShopCategory(ProductCategory category) {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new ShopPanel(category));
        MainWindow.contentPanel.revalidate();
    }
    
}
