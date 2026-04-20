/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    static String username;
    static String password;
    static String cellnumber;
    {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("3.choose option: ");
		
		int option = input.nextInt();
		input.nextLine();
		
		// Check user details
		System.out.println("Enter username: ");
		String username = input.nextLine();
		System.out.println("Enter password: ");
		String password = input.nextLine();
		System.out.println("Enter cellnumber: ");
		String cellnumber = input.nextLine();
		
		//flags
		boolean usernameValid = false;
		boolean passwordValid = false;
		boolean cellnumberValid = false;
		// Check username
		if(username.length() == 5 && username.contains("_")) {
		    
		    // Check password
		    boolean isUpperCase = false;
		    boolean isNumber = false;
		    boolean isSpecialChar = false;
		    
		    for(int i = 0; i < password.length(); i++) {
		        char C= password.charAt(i);
		        if(Character.isUpperCase()) {
		            isUpperCase = true;
		        }else if(Character.isDigit() {
		            isNumber = true;
		        }else if(Character.isLetterOrDigit() {
		            isSpecialChar = true;
		        }
		            
		        }
		        if(isUpperCase && isNumber && isSpecialChar){
		            passwordValid = true;
		        }
		    }
		}
		// Check cellnumber
		if(cellnumber.startsWith("+27") && cellnumber.length == 10){
		    cellnumberValid = true;
		    
		    if(usernameValid && passwordValid && cellnumberValid){
		        System.out.println("Login successfully");
		    }else{
		        System.out.System.out.print("Login failed!");
		    }input close;
		}

    
