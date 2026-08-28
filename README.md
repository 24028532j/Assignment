[README.md](https://github.com/user-attachments/files/31558574/README.md)
##PHAHLAMOHLAKA CONNY RAESIBE 24028532





\#.1  Hi, in this project you will understand and learn how each steps, methods, classes , variables and java keywords were used to implement and achieve the USER APPLICATION project.



\##ABOUT THE PROJECT

The project is to create an application that will allow the user to enter their product details, the system  should also be able to save the product details captured, so that the user is able to search for the product using the product code. The user should also be able to update the products , where they will choose weather they want to update the warranty, price or the supplier name and also to be able to delete. this system will run on a black window called a terminal where the user will be able to communicate with.

the instructions stated that the application should have three classes, the main, product and the reportdata class as well as several methods  in the product class.

\##HOW TO CREATE AN APPLICATION THAT WILL TRACK DOWN A USER'S PRODUCT AND PRINT A REPORT.



\#.3 the first thing you need to do when creating a User Application project that will accept any input from the user is to   import Scanner (import java.util.Scanner;)

\#.4Explaining the methods
Method : it is a block of code that has a specific task to perform.All the methods in this project are static , meaning that they do not require an object to be created.This is a sysntax of declaring methods: AccessSpecifier static ReturnType MethodName (){

//Block of code to be executed

}
i, Menu() : this method contains the menu of the application which will guide the user on which option to use should they want to capture ,update or even exit. the user will press a number that is from 1 to 5 to communicate with the application, 6 to exit and should the user enter a number that is <1 and  >6 they will be advised to choose a valid option and allow them to enter again.

ii, CaptureProduct() :this method will allow the user to capture all the attributes of that certain product. should a user mistakenly not put anything for example as a product name or product supplier as well as product code, the system is programmed to let them know that the product name cannot be empty and allow the user to re-enter .On stock level, the user will be bale to enter any other number except negative values because a stock level can only be positive integers. Regarding to the product category and warranty, when the user the correct value, they will be given another choice to correct their input

iii, SaveProduct () : this method enables the product details captured to be saved after entering the last attribute on the capture method.

iv, SearchProduct (): To ensure that the user's product details are successfully saved, the user is able to use this method called search to search their product details using only their product code ,should they enter a wrong product code they will be informed that the product searched was not found and when they did not enter it will then tell the  product is not found

v, UpdateProduct (): when there are no products in the system , the system will display no products found but when there are products to update, there user will be asked as to which part of the product do they want to update such as price ,warranty and stock level. then the new information will be successfully saved in the system.



vi, DeleteProduct() :If the user no longer want to use or continue with a certain product, then they are allowed to use this method to delete the product in the system. this method gives you an option to indicate if you are sure that you want that certain product deleted, but if not then it gives you an option to cancel meaning you will still get to work with the product you have.

vii, PrintReport () : this method prints all the attributes of the product that is in the system, as well as the average value of that price ,the number of products that are in the system.

viii, GetCategory() : this  method will not be called in the main method but it will be called in the Product class within the search products method and the update products method only to display the category choice of the user.



ix, ExitApplication() this method allows the user to exit the application when called



\#.5 In this project there are three classes namely: the Main, the Products and the ReportData



\#.6 Explaining the classes :A class is a blueprint for creating an object.

i, the Main class: it is the fist class of the project and has a main method. Meaning that it is where the entire code will executed within the main method and it is a method that will call all the other methods within the product class.

ii, the Products class: it is the second class of the project and all the methods in the project are declared in the products class .

iii, ReportData class: it is the 3rd class of the project instructed to contain setters and getters methods. Setters are mutator methods that change field values and gettors are accessor methods that retrieves values. These methods are used when you protect data which is a way of implementing encapsulation in OOP.
