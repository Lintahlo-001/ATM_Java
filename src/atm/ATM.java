/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Miku
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        Scanner sc = new Scanner(System.in);
        
        char choice = ' ', option = ' ';
        String userCreate = " ", userLogin = " ", passCreate = " ", passLogin = " ";
        boolean intro = false, loop = true, deposit = true, withdraw = true;
        float num = 0, balance = 0;
        
        System.out.println("Hello There!! Welcome To My ATM System");
        
        do{ System.out.println("_______________________");
            System.out.println("1. Log In");
            System.out.println("2. Create Account");
            System.out.println("3. Quit");
            System.out.print("Please Enter A Number: ");
            
            try {
                choice = reader.readLine().charAt(0);
            } catch (IOException ex) {
                System.out.println("Please Only Enter A Number");
            }

            switch (choice){
            
                case '1':
                System.out.println("_______");
                System.out.println("Login:");
                System.out.print("Enter your User ID: ");
                userLogin = reader.readLine();
                System.out.print("Enter Your Password: ");
                passLogin = reader.readLine();

                if (userLogin.equals(userCreate) && passLogin.equals(passCreate))
                {
                   intro = true;
                } else 
                {   
                    System.out.println("___________________________________");
                    System.out.println("Invalid User ID or Password");
                    System.out.println("Please Make Sure You Input The Correct User ID Or Password");
                    System.out.println("Also Please Make Sure You Have An Account First Before Logging In");
                    intro = false;               
                }
                break;

                case '2':
                    System.out.println("________________________");
                    System.out.println("Create Account:");
                    System.out.print("Please Enter A User ID: ");
                    userCreate = reader.readLine();
                    System.out.print("Please Enter A Password: ");
                    passCreate = reader.readLine();
                    System.out.println("Congratulations! You Have Successfully Created An Account");
                    intro = false;
                    break;

                case '3':
                    System.exit(0);
                    break;

                default:
                    System.out.println("_____________________________");
                    System.out.println("Invalid Input: Only Enter 1-3");
                    intro = false;
                    break;
            } 
        }while (intro == false);
        
        System.out.println("______________");
        System.out.println("Login Success");
        
        do{ System.out.println("________________________");
            System.out.println("What Do You Want To Do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Quit");
            System.out.print("Please Enter A Number: ");
            
            try {
                option = reader.readLine().charAt(0);
            } catch (IOException ex) {
                System.out.println("Please Only Enter A Number");
            }

            switch (option){
                case '1':
                    do{ System.out.println("_________");
                        System.out.println("Deposit:");
                        System.out.println("Current Balance: " + balance);
                        System.out.println("How Much Would You Like To Deposit?");
                        System.out.print("Please Enter The Amount: ");

                        try {
                            num = Integer.parseInt(reader.readLine());
                        } catch (NumberFormatException | IOException ex){ 
                            System.out.println("Please Enter Only Numbers");
                            deposit = false;
                        }
                    }while (deposit == false);
                    
                    balance = balance + num;
                    System.out.println("Success! Your Current Balance Is: " + balance);
                    num = 0;
                    loop = true;
                    break;

                case '2': 
                    do{ System.out.println("_________");
                        System.out.println("Withdraw:");
                        System.out.println("Current Balance: " + balance);
                        System.out.println("How Much Would You Like To Withdraw?");
                        System.out.print("Please Enter The Amount: ");

                        try {
                            num = Integer.parseInt(reader.readLine());
                        } catch (NumberFormatException | IOException ex){ 
                            System.out.println("Please Enter Only Numbers");
                            withdraw = false;
                        }
                    }while (withdraw == false);
                    
                    balance = balance - num;
                    System.out.println("Success! Your Current Balance Is: " + balance);
                    num = 0;
                    loop = true;
                    break;

                case '3':
                    System.out.println("_______________");
                    System.out.println("Check Balance:");
                    System.out.println("Your Current Balance is: " + balance);
                    loop = true;
                    break;

                case '4':
                    System.exit(0);
                    loop = true;
                    break;

                default:
                    System.out.println("Invalid Input Only Enter 1-4");
                    loop = true;
                    break;
            }
    } while (loop == true);
    }   
    
}
