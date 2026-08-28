/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author CONNY P
 */

import java.util.Scanner;

public class Products {
    //this class contains all the methods required in the assisgnment

    static int count = 0;
    /* Arrays remains the length of the size they are declared as
    .length() only checks how many things an array can store,to check how many things
    are stored in an array we use variable count 
    which will increment when we make an object. 
    it decrement when an object is removed*/
    private static ReportData[] PRODUCTS = new ReportData[100];

    static Scanner inputDevice = new Scanner(System.in);

    public static int Menu() {

        System.out.println("Please select one of the following menu options:");
        System.out.println("(1) Capture a new product. ");
        System.out.println("(2) Search for a product. ");
        System.out.println("(3) Update a product. ");
        System.out.println("(4) Delete a product");
        System.out.println("(5) Print a product. ");
        System.out.println("(6) Exit application. ");
        int option = inputDevice.nextInt();
        inputDevice.nextLine();
        while (option < 1 || option > 6) {

            System.out.println("Invalid option, please choose again !!");
            System.out.print("Choose your option: ");
            option = inputDevice.nextInt();
            inputDevice.nextLine();

        }
        return option;
    }

    public static void CaptureProducts() {
        if (count >=PRODUCTS.length) {
            System.out.println("SYSTEM IS AT MAX CAPACITY");
            return;
        }

        System.out.println("*********************************");
        System.out.println("");
        

        System.out.print("Enter the product code: ");
        String ProductCode = inputDevice.nextLine();
        while (ProductCode.isEmpty()) {
            System.out.print("product code cannot be empty. Enter a value: ");
            ProductCode = inputDevice.nextLine();
        }

        System.out.print("Enter the product name: ");
        String ProductName = inputDevice.nextLine();
        while (ProductName.isEmpty()) {
            System.out.print("product name cannot be empty. Enter a value: ");
            ProductName = inputDevice.nextLine();
        }
        
        System.out.println("Select the product Category");
        System.out.println("Desktop Computer -1");
        System.out.println("Laptop -2");
        System.out.println("Tablet -3");
        System.out.println("Printer -4");
        System.out.println("Gaming Console -5");
        System.out.println("");
        System.out.print("product category >> ");
        int ProductCategory = inputDevice.nextInt();
        inputDevice.nextLine();
        while (ProductCategory < 1 || ProductCategory > 5) {
            System.out.println("The category has to between 1 and 5. ");
            System.out.print("product category >> ");
            ProductCategory = inputDevice.nextInt();
            inputDevice.nextLine();
        }

        System.out.println("Indicate the product warranty");
        System.out.print("Enter (1) for 6 months or any other key for 2 years ");
        String value = inputDevice.nextLine();
       
        double warranty = 0;
        if (value.equals("1")) {
            //24 for 2 years
            warranty = 6;
        } else {
            warranty = 24;

        }

        System.out.print("Enter the price for " + ProductName+ ": ");
        double ProductPrice = inputDevice.nextDouble();
        inputDevice.nextLine();
        while (ProductPrice < 0) {
            System.out.println("The price cannot be negative. ");
            System.out.print("Enter the price for " + ProductName + ": ");
            ProductPrice = inputDevice.nextDouble();
            inputDevice.nextLine();
        }

        System.out.print("Enter the stock level for " + ProductName + ": ");
        int StockLevel = inputDevice.nextInt();
        inputDevice.nextLine();
        System.out.print("Enter the supplier for " + ProductName + ":");
        String ProductSupplier = inputDevice.nextLine();
        while (ProductSupplier.isEmpty()) {
            System.out.print("Input cannot be empty. Enter a value: ");
            ProductSupplier = inputDevice.nextLine();
        }
        //creating an object to call the saveproduct method
        ReportData Product1 = new ReportData();
        Product1.setProductCode(ProductCode);
        Product1.setProductName(ProductName);
        Product1.setProductCategory(ProductCategory);
        Product1.setWarranty(warranty);
        Product1.setProductPrice(ProductPrice);
        Product1.setStockLevels(StockLevel);
        Product1.setProductSupplier(ProductSupplier);

        SaveProducts(Product1);
    }

    public static void SaveProducts(ReportData Product1) {

        PRODUCTS[count] = Product1;
        count++;
        System.out.println("Product details has been saved successfully!!!");

    }

    public static String GetCategory(int category) {
        switch (category) {
            case 1:
                return "Desktop Computer";
            case 2:
                return "Laptop";
            case 3:
                return "Tablet";
            case 4:
                return "Printer";
            case 5:
                return "Gaming Console";
            default:
                break;
        }
        return "";
    }

    public static void SearchProduct() {
        //count variable is to track things    
        if (count == 0) {
            System.out.println("No products available.");
            System.out.println("");

            return;
        }
        System.out.print("Enter the product code to search: ");
        String ProductCode = inputDevice.nextLine();
        while (ProductCode.isEmpty()) {
            System.out.print("product code cannot be empty. Enter a value: ");
            ProductCode = inputDevice.nextLine();
        }

        for (int g = 0; g < count; g++) {
            if (PRODUCTS[g] != null && PRODUCTS[g].getProductCode().equals(ProductCode)) {
                System.out.println("******************************************");

                System.out.println("PRODUCT SEARCH RESULTS:");
                System.out.println("**********************************************");

                System.out.println("PRODUCT CODE: " + PRODUCTS[g].getProductCode());
                System.out.println("PRODUCT NAME: " + PRODUCTS[g].getProductName());
                System.out.println("PRODUCT WARRANTY: " + (PRODUCTS[g].getWarranty() / 12) + " years");
                System.out.println("PRODUCT CATEGORY: " + GetCategory(PRODUCTS[g].getProductCategory()));
                System.out.println("PRODUCT PRICE: " + PRODUCTS[g].getProductPrice());
                System.out.println("PRODUCT STOCK LEVELS: " + PRODUCTS[g].getStockLevels());
                System.out.println("PRODUCT SUPPLIER: " + PRODUCTS[g].getProductSupplier());
                return;
            }
        }

        System.out.println("The product cannot be located. Invalid Product");
    }

    public static void DeleteProduct() {
        if (count == 0) {
            System.out.println("No products available.");
            System.out.println("");

            return;
        }
        System.out.print("Please enter the product code to delete: ");
        String ProductCode = inputDevice.nextLine();
        while (ProductCode.isEmpty()) {
            System.out.print("product code cannot be empty. Enter a value: ");
            ProductCode = inputDevice.nextLine();
        }
        boolean located = false;
        for (int g = 0; g < count; g++) {

            if (PRODUCTS[g] != null && PRODUCTS[g].getProductCode().equals(ProductCode)) {
                located = true;//when true execute the line below
                System.out.println("do you want to delete this product?. Enter yes to delete or any other key to cancel");
                String Approve = inputDevice.nextLine();

                if (Approve.equals("yes")) {
                    for (int h = g; h < count - 1; h++) {//we subtract because when it is less than it will stop at the last index and we want to leave it empty
                        PRODUCTS[h] = PRODUCTS[h + 1];//items from the next index are replaced
                    }
                    //deleting the last index to use for another product
                    PRODUCTS[count - 1] = null;

                    count--;

                    System.out.println("You have successfully deleted the product.");

                } else {
                    System.out.println("You have successfully cancelled.");

                }
            }
        }
        if (!located) {//when false then execute the line below
            System.out.println("The product was not found in the system");
        }
    }

    public static void UpdateProduct() {
        if (count == 0) {
            System.out.println("No products available.");
            System.out.println("");

            return;
        }
        System.out.print("Please enter the product code to update: ");
        String ProductCode = inputDevice.nextLine();
        while (ProductCode.isEmpty()) {
            System.out.print("product code cannot be empty. Enter a value: ");
            ProductCode = inputDevice.nextLine();
        }
        boolean productFound = false;

        for (int g = 0; g < count; g++) {

            if (PRODUCTS[g] != null && PRODUCTS[g].getProductCode().equals(ProductCode)) {
                productFound = true;

                System.out.println("Update the warranty? (y) Yes, (n) No ");
                while (true) {
                    String Warranty = inputDevice.nextLine().toLowerCase();
                    if (Warranty.isEmpty()) {
                        System.out.print("Please enter 'y' or 'n': ");
                        continue;
                    }
                    char WarrantyInput = Warranty.charAt(0);
                    if (WarrantyInput == 'y') {
                        System.out.print("Indicate the new product warranty. Enter (1) for 6 months or any other key for 2 years. ");
                        String ProductWarranty = inputDevice.nextLine();

                        if ("1".equals(ProductWarranty)) {
                            PRODUCTS[g].setWarranty(6.0);
                        } else {
                            PRODUCTS[g].setWarranty(24.0);
                        }
                        break;
                    } else if (WarrantyInput == 'n') {
                        System.out.println("The product warranty will remain the same.");
                        break;
                    } else {
                        System.out.print("Invalid character entered! Please try again (y/n): ");
                    }
                }

                System.out.print("Update the product price ?(y) Yes, (n) No ");
                while (true) {
                    String Price = inputDevice.nextLine().toLowerCase();
                    if (Price.isEmpty()) {
                        System.out.print("Please enter 'y' or 'n': ");
                        continue;
                    }

                    char price = Price.charAt(0);

                    if (price == 'y') {
                        while (true) {
                            System.out.print("Enter the new price for >> " + PRODUCTS[g].getProductName() + " ");
                            double ProductPrice = inputDevice.nextDouble();
                            inputDevice.nextLine();

                            if (ProductPrice < 0) {
                                System.out.println("Price cannot be negative");
                                continue;
                            }
                            PRODUCTS[g].setProductPrice(ProductPrice);
                            break;
                        }
                        break;
                    } else if (price == 'n') {
                        System.out.println("The price of the product will remain the same.");
                        break;
                    } else {
                        System.out.print("Invalid character entered! Try again (y/n): ");
                    }
                }

                System.out.print("Update the stock level ? (y) Yes, (n) No ");
                while (true) {
                    String StockInput = inputDevice.nextLine().toLowerCase();

                    if (StockInput.isEmpty()) {
                        System.out.print("Please enter 'y' or 'n': ");
                        continue;
                    }

                    char stock = StockInput.charAt(0);

                    if (stock == 'y') {
                        while (true) {
                            System.out.print("Enter the new stock level for " + PRODUCTS[g].getProductName() + " >> ");
                            int StockLevel = inputDevice.nextInt();
                            inputDevice.nextLine();

                            if (StockLevel >= 0) {
                                PRODUCTS[g].setStockLevels(StockLevel);
                                break;
                            } else {
                                System.out.println("Stock cannot be negative.");
                               
                            }
                        }
                        break; 
                    } else if (stock == 'n') {
                        System.out.println("The product's stock level will remain the same.");
                        break;
                    } else {
                        System.out.print("Invalid character entered! Please (y) for Yes or (n) for No: ");
                    }
                }

                System.out.println("Product details updated successfully.");
                return;
            }
        }

        if (!productFound) {
            System.out.println("Product not found");
        }
    }

    public static void PrintProductReport() {
        System.out.println("PRODUCT REPORT");
        System.out.println("=====================================================================================");

        if (count == 0) {
            System.out.println("No products available.");
            System.out.println("");

            return;
        }
        double total = 0;
        for (int g = 0; g < count; g++) {
            total += PRODUCTS[g].getProductPrice() * PRODUCTS[g].getStockLevels();
            System.out.println("PRODUCT " + (g + 1));
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("PRODUCT CODE >> " + PRODUCTS[g].getProductCode());
            System.out.println("PRODUCT NAME >> " + PRODUCTS[g].getProductName());
            System.out.println("PRODUCT WARRANTY >> " + (PRODUCTS[g].getWarranty() / 12) + " years");
            System.out.println("PRODUCT CATEGORY >> " + GetCategory(PRODUCTS[g].getProductCategory()));
            System.out.println("PRODUCT PRICE >> " + PRODUCTS[g].getProductPrice());
            System.out.println("PRODUCT STOCK LEVELS >> " + PRODUCTS[g].getStockLevels());
            System.out.println("PRODUCT SUPPLIER >> " + PRODUCTS[g].getProductSupplier());
            System.out.println("-------------------------------------------------------------------------------------");
        }
        System.out.println("==================================================================================");
        System.out.println("TOTAL PRODUCT COUNT: " + count);
        System.out.println("TOTAL PRODUCT VALUE: R " + total);
        System.out.println("AVERAGE PRODUCT VALUE: R " + (total / count));
        System.out.println("==================================================================================");

    }

    public static void ExitApplication() {

        System.exit(0);

    }
}