/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpart1;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class Progpart1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         Scanner register = new Scanner(System.in);
         Scanner login = new Scanner(System.in);
    }
    // Get user registered
    static void register(Scanner register) {
        
        System.out.println("=== REGISTER ===");
        
        System.out.print("Enter a username: ");
        String username = register.nextLine();
        
        // Get username validation
        while(!username.contains("-") || username.length()<= 5) {
            System.out.println("username is correctly formatted");
            System.out.print("username is not correctly formatted ! Try again");
}
        System.out.print("Enter a password: ");
        String password = register.nextLine();
        
        //Get password validatiom
        while(!password.contains("K") || password.contains("@") || password.contains("2") || password.length()<=8 )
            System.out.print("password is correctly formatted: ");
            System.out.println("password is not correctly formatted! Try again");
            
            System.out.print("Enter a cellnumber: ");
            String cellnumber = register.nextLine();
            
           // Get cellnumber validatiion
           while(!cellnumber.startWith("+27") || cellnumber.length()= 10 );
           System.out.print("cellphone is captured");
           System.out.print("cellnumber is not captured");
 }
    static void login(Scanner login) {
        
    System.out.print("=== LOGIN ===");
    
    System.out.print("Enter a username: ");
    String username = login.nextLine();
    
    System.out.print("Enter a password: ");
    String password = login.nextLine();
    
    System.out.print("Enter a cellnumber: ");
    String cellnumber = login.nextLine();
    
    boolean loginSuccess = loginUsername.equals(savedUsername) && loginPassword.equals(savedPassword) && loginCellnumber(savedCellnumber);
    
  if(loginSuccess) {
      System.out.println("Login Succefyl.Welcome!");
  }else{
      System.out.println("Login Failed.Try again!");