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
public class test {
    
    private static IMatDataHandler db;
    
    public static void main(String[] args) {
        
        db = IMatDataHandler.getInstance();
        Product product = db.getProduct(1);
        System.out.print(product.getImageName());
        
    }
    
}
