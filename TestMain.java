/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progpart1;

/**
 *
 * @author Student
 */
public class TestMain {
    public static void main(String[] args) {
         Scanner valid = new Scanner();
        
     // Test valid username
     
     public void checkUsename(username)
     valid.checkUsename("joe_ly");
         System.out.println("Username is correctly formatted: ");
         
         invalid.checkUsename("joely");
         System.out.println("Username must contain an underscore and 5 characters long");
     
     //Test valid password
         public void checkPassword(password)
     valid.checkPassword("Joe@2ly");
     System.out.println("Password is correctly formatted: ")
             
        invalidcheckPassword("joely3")
     System.out.println("Password must be 8 characters long and contain a SpecialChar, Number, CapitalLetter");
     
     //Test valid cellnumber
     public void checkCellnumber(cellnumber)
     valid.checkCellnumber("+27 825687869");
     System.out.println("Cellnumbet is captured successfuly: ");
    
     invalid.checkCellnumber("0825687869");
     System.out.println("Cellnumber must have a south african international code: ");
     
     // Test login
     public void checkLogin()
             Login(valid username, valid password, valid cellnumber) {
                 System.out.println("LOGIN SUCCESSFUL")
             
             Login(invalid username, invalid password, invalid cellnumber){
                 System.out.println("LOGIN FAILED Try again!")
}
