/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.util.ArrayList;
import java.util.List;
import objetcts.Meat;
import objetcts.Potato;
import objetcts.Product;
import objetcts.Rice;

/**
 *
 * @author F996
 */
public class Database {
    
    private Product[] products;
    private List<Product> purchases;
    private List<Product> sales;
    
    public Database(){
        products = new Product[3];
        
        Product potato = new Potato("Sabanera");
        Product rice = new Rice("Blanco");
        Product meat = new Meat("Carne Vacuna");
        
        products[0] = potato;
        products[1] = rice;
        products[2] = meat;
        
        purchases = new ArrayList<>();
        sales = new ArrayList<>();
        
    }
    
    public Product getByIndex(int i){
        if(i < 0 || i > 2){
            System.out.println("Indice no valido...");
            return null;
        }
        
        Product result = null;
        
        try {
            result = products[i].clone();
        } catch (Exception e) {
            System.out.println(e);
        }
      
        return result;
    }
    
    public Product[] getAll(){
        
        Product[] result = new Product[3];
        
        try {
            result[0] = products[0];
            result[1] = products[1];
            result[2] = products[2];
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return result;
    }
    
    public void buy(Product product){
        Product temp;
        
        switch(product.getClass().getSimpleName()){
            case "Potato":
                temp = products[0];
                break;
            
            case "Meat":
                temp = products[1];
                break;
            
            case "Rice":
                temp = products[2];
                break;
                
            default:
                System.out.println("No valido");
                return;
        }
        
        temp.setAmount(temp.getAmount() + product.getAmount());
        temp.setPrice(product.getPrice());
        purchases.add(product);
    }
    
    public void sales(Product product){
        Product temp;
        
        switch(product.getClass().getSimpleName()){
            case "Potato":
                temp = products[0];
                break;
            
            case "Meat":
                temp = products[1];
                break;
            
            case "Rice":
                temp = products[2];
                break;
                
            default:
                System.out.println("No valido");
                return;
        }
        
        temp.setAmount(temp.getAmount() - product.getAmount());
        temp.setPrice(temp.getPrice() * 1.25);
        sales.add(product);
    }
    
    public List<Product> getPurchases(){
        return purchases;
    }
    
    public List<Product> getSales(){
        return sales;
    }
    
}
