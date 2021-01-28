/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import objetcts.Meat;
import objetcts.Potato;
import objetcts.Product;
import objetcts.Rice;
import storage.Database;
import views.View;

/**
 *
 * @author F996
 */
public class Register {
    
    private Database database;
    
    public Register() {
        database = new Database();
    }
    
    public void register(){
        View.showHeaderPrincipal();
        View.showMenuPrincipal();
        
        int option;
        
        do {
            View.showGetOption();
            option = View.getOption();
            
            switch(option){
                case 1:
                    View.showBuyHeader();
                    break;
                case 2:
                    View.showSaleHeader();
                    break;
                case 3:
                    View.showStockHeader();
                    break;
                case 4:
                    View.showBuyListHeader();
                    break;
                case 5:
                    View.showSalesListHeader();
                    break;
                case 6:
                    System.out.println("Gracias por utilizar nuestro sistema");
                    break;
                default:
                    View.showInvalidOption();
                    break;
            }
            
        } while (option < 1 || option > 6);
        
    }
    
    private void buy(){
        View.showBuyHeader();
        
        int option;
        
        do {            
            View.showGetOption();
            option = View.getOption();
            
            switch(option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    View.showInvalidOption();
            }
        } while (option < 1 || option > 4);
    }
    
    public void buyProduct(int option){
        Product product = null;
        
        switch(option){
            case 1:
                product = new Potato("Sabanera");
                break;
            case 2:
                product = new Rice("Arroz Blanco");
                break;
            case 3:
                product = new Meat("Lomito");
                break;
            default:
                    View.showInvalidOption();
        }
        
        View.showGetAmount();
        int amount = View.getAmount();
        View.showGetPrice();
        double price = View.getPrice();
        
        product.setAmount(amount);
        product.setPrice(price);
        database.buy(product);
    }
}
