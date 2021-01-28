/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Scanner;

/**
 *
 * @author F996
 */
public class View {
    public static void showHeaderPrincipal(){
        System.out.println("***********************************************************");
        System.out.println("BIENVENIDO A LA CAJA REGISTRADORA");
        System.out.println("***********************************************************");
    }
    
    public static void showMenuPrincipal(){
        System.out.println("\t\t\t 1. Comprar");
        System.out.println("\t\t\t 2. Vender");
        System.out.println("\t\t\t 3. Inventario");
        System.out.println("\t\t\t 4. Compras");
        System.out.println("\t\t\t 5. Ventas");
        System.out.println("\t\t\t 6. Salir");
    }
    
    public static void showGetOption(){
        System.out.println("\t\t Digiet la opción:  ");
    }
    
    public static void showGetAmount(){
        System.out.println("\t\t Digiet la cantidad:  ");
    }
    
    public static void showGetPrice(){
        System.out.println("\t\t Digiet el precio:  ");
    }
    
    public static int getOption(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
    
    public static int getAmount(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
    
    public static double getPrice(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
    
    public static void showBuyHeader(){
        System.out.println("***********************************************************");
        System.out.println("MENU DE COMPRAS");
        System.out.println("***********************************************************");
        showItemsMenu();
    }
    
     public static void showSaleHeader(){
        System.out.println("***********************************************************");
        System.out.println("MENU DE VENTAS");
        System.out.println("***********************************************************");
        showItemsMenu();
    }
     
      public static void showStockHeader(){
        System.out.println("***********************************************************");
        System.out.println("INVENTARIO");
        System.out.println("***********************************************************");
        showItemsHeader();
      }
      
      public static void showItemsHeader(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\tProducto\t|Cantidad\t|Vr Unitario\t|Vr Total\t*");
        System.out.println("-----------------------------------------------------------");
      }
      
      public static void showBuyListHeader(){
        System.out.println("***********************************************************");
        System.out.println("******COMPRAS**********");
        System.out.println("***********************************************************");
        showItemsHeader();
      }
      
      public static void showSalesListHeader(){
        System.out.println("***********************************************************");
        System.out.println("******VENTAS**********");
        System.out.println("***********************************************************");
        showItemsHeader();
      }
      
      public static void showItemsMenu(){
        System.out.println("\t\t\t 1. Papas");
        System.out.println("\t\t\t 2. Arroz");
        System.out.println("\t\t\t 3. Carne");
        System.out.println("\t\t\t 4. Salir");
      }
      
      public static void showInvalidOption(){
          System.out.println("Opcion Invalida");
      }
}
