/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetcts;

public abstract class Product implements Cloneable{
    
    private String name;
    private int amount;
    private double price;

    public Product() {
    }

    public Product(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        
        if(amount < 0){
            System.out.println("No se puede acceder una cantidad negativa...");
            return;
        }
        
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        
        if(price < 0){
            System.out.println("No se puede acceder una cantidad negativa...");
            return;
        }
        
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", amount=" + amount + ", price=" + price + '}';
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        return (Product)super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
