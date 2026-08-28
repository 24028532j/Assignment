/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author CONNY P
 */
/* the assignment said 
   we should make a class called reportdata, with getters and setters
   this means we need to have attributes describing every product,the */
public class ReportData {

    static int count = 0;//this is to track the number of products in the 

    //is a keyword Private when dealing with get and set methods.
    private String ProductCode;
    private String ProductName;
    private double Warranty;
    private int ProductCategory;
    private double ProductPrice;
    private int StockLevels;
    private String ProductSupplier;

    //getters to get values stored in private variables.
    public String getProductCode() {

        return ProductCode;
    }

    public String getProductName() {

        return ProductName;
    }

    public double getWarranty() {

        return Warranty;

    }

    public int getProductCategory() {

        return ProductCategory;
    }

    public double getProductPrice() {

        return ProductPrice;

    }

    public int getStockLevels() {

        return StockLevels;

    }

    public String getProductSupplier() {

        return ProductSupplier;
    }

    public void setProductCode(String ProductCode) {

        this.ProductCode = ProductCode;
    }

    public void setProductName(String ProductName) {

        this.ProductName = ProductName;
    }

    public void setWarranty(double Warranty) {

        this.Warranty = Warranty;
    }

    public void setProductCategory(int Category) {

        this.ProductCategory = Category;
    }

    public void setProductPrice(double ProductPrice) {

        this.ProductPrice = ProductPrice;
    }

    public void setStockLevels(int StockLevels) {

        this.StockLevels = StockLevels;
    }

    public void setProductSupplier(String ProductSupplier) {

        this.ProductSupplier = ProductSupplier;
    }
}

