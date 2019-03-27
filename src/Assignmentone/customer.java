
package Assignmentone;

import java.util.Scanner;

public class customer {
    private String username = "Febin";
    private String password = "Pwd123";

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        customer cust = new customer();
        cust.user();
    }

    public void user(){

        System.out.println("Please enter your username: ");
        String enteredUsername = myScanner.nextLine();
        System.out.println("Please enter your password");
        String enteredPassword = myScanner.nextLine();
        if(validateLoginDetails(enteredUsername, enteredPassword)){
            userAction();
        }
        else {
            System.out.println("Invalid details have been entered. Please try again");
            user();


        }
    }

    public void userAction(){
        System.out.println("What action would you like to perform today?");
        String input = myScanner.nextLine();
        getAction(input);

    }
    private void getAction(String input){
        switch(input){

                case "transfers":
                    transfers();
                    break;

                case "deposit":
                    deposit();
                    break;

                case "balance":
                    checkBalance();
                    break;

                case "withdraw":
                    withdraw();
                    break;

                case "logout":
                    logout();
                    user();
                    break;

                default:
                    System.out.println("Incorrect input received");
                    System.out.println("Please enter any of the following:");
                    System.out.println("Balance - Check Account Balance");
                    System.out.println("Deposit - Make a deposit to an Account");
                    System.out.println("Withdraw - Make a cash withdrawal");
                    System.out.println("Transfer - Make a transfer between accounts");
                    System.out.println("Logout - sign out of your account");
                    userAction();
            }

        }

    private void logout() {

    }

    private void withdraw() {

    }

    private void checkBalance() {

    }

    private void deposit() {

    }

    private void transfers() {
    }




    private boolean validateLoginDetails(String enteredUsername, String enteredPassword){
        if(enteredUsername.equals(username) && enteredPassword.equals(password)){
            return true;
        }
        return false;
    }
}
