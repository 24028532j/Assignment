/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment;

/**
 *
 * @author CONNY P
 */
//             PHAHLAMOHLAKA CONNY RASEIBE 24028532
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
//this is a main method that runs the whole application by calling the methods included in the assignment
//we have 3 files because the assignment said so
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");

        System.out.println("****************************************");

        while (true) {

            System.out.print("Enter (1) to launch menu or any other key to exit.");
            String launch = inputDevice.nextLine();

            if (launch.equals("1")) {
//choice is a value a user is going to select 
                int choice = Products.Menu();

                switch (choice) {
                    case 1:
                        System.out.println("CAPTURE A NEW PRODUCT");
                        Products.CaptureProducts();
                        break;
                    case 2:
                        System.out.println("search your product");
                        Products.SearchProduct();
                        break;
                    case 3:
                        System.out.println("update your product");
                        Products.UpdateProduct();
                        break;
                    case 4:
                        System.out.println("Delete your product");
                       Products.DeleteProduct();
                       break;  
                    case 5:
                        System.out.println("Print a report ");
                        Products.PrintProductReport();
                        break;
                    case 6:
                       Products.ExitApplication();
                       
                        break;
                    default:
                       System.out.println("wrong selection ");
                          
                        
                }

            }else{
            
            break;// exit the main loop 
            }
        }
    }
}

