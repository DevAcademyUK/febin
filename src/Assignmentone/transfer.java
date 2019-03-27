package Assignmentone;

import java.util.Scanner;

public class transfer {

    Scanner myScanner = new Scanner(System.in);
    private double cAccountBalance = 9.99;
    private double jAccountBalance = 99.99;
    private double sAccountBalance = 999.99;

    private void transfer(){
        System.out.println("Which account would you like to transfer from?");
        String source = myScanner.nextLine();
        System.out.println("Which account would you like to transfer to?");
        String destination = myScanner.nextLine();
        System.out.println("How much would you like to transfer?");
        double amount = Double.parseDouble(myScanner.nextLine());

        if(source.equalsIgnoreCase("Current")){
            if(cAccountBalance >= amount){
                if(destination.equalsIgnoreCase("Joint")){
                    jAccountBalance += amount;
                    cAccountBalance -= amount;
                }
                else if(destination.equalsIgnoreCase("Savings")){
                    sAccountBalance += amount;
                    cAccountBalance -= amount;
                }
                else {
                    System.out.println("Invalid destination account");
                }
            }
        }
        else if(source.equalsIgnoreCase("Joint")){
            if(jAccountBalance >= amount){
                if(destination.equalsIgnoreCase("Current")){
                    cAccountBalance += amount;
                    jAccountBalance -= amount;
                }
                else if(destination.equalsIgnoreCase("Savings")){
                    sAccountBalance += amount;
                    jAccountBalance -= amount;
                }
                else {
                    System.out.println("Invalid destination account");
                }
            }
        }
        else if(source.equalsIgnoreCase("Savings")){
            if(sAccountBalance >= amount){
                if(destination.equalsIgnoreCase("Current")){
                    cAccountBalance += amount;
                    sAccountBalance -= amount;
                }
                else if(destination.equalsIgnoreCase("Joint")){
                    jAccountBalance += amount;
                    sAccountBalance -= amount;
                }
                else {
                    System.out.println("Invalid destination account");
                }
            }
        }
        else {
            System.out.println("Invalid source account");
        }
        userAction();

    }

    private void userAction() {

    }

    private void logout() {
        System.out.println("Logging Out");
        }

    private void deposit() {
        System.out.println("Which account would you like to make a deposit to?");
        String account = myScanner.nextLine();
        System.out.println("how much would you like to deposit?");
        short depositAmount = Short.parseShort(myScanner.nextLine());

        if(account.equalsIgnoreCase("Current")) {
            cAccountBalance += depositAmount;
        }
        else if(account.equalsIgnoreCase("Joint")) {
            jAccountBalance += depositAmount;
        }
        else if(account.equalsIgnoreCase("Savings")) {
            sAccountBalance += depositAmount;
        }
        else {
            System.out.println("Invalid account option provided");
        }
    }

    private void withdraw() {
        System.out.println("Which account would you like to make a withdrawal from?");
        String account = myScanner.nextLine();
        System.out.println("how much would you like to withdraw?");
        short withdrawAmount = Short.parseShort(myScanner.nextLine());

        if (account.equalsIgnoreCase("Current")) {
            if (withdrawAmount <= cAccountBalance) {
                cAccountBalance -= withdrawAmount;
            } else
                System.out.println("Insufficient Funds");
        } else if (account.equalsIgnoreCase("Joint")) {
            if (withdrawAmount <= jAccountBalance) {
                jAccountBalance -= withdrawAmount;
            } else
                System.out.println("Insufficient Funds");
        } else if (account.equalsIgnoreCase("Savings")) {
            if (withdrawAmount <= sAccountBalance) {
                sAccountBalance -= withdrawAmount;
            } else
                System.out.println("Insufficient Funds");
        } else {
            System.out.println("Invalid account option provided");
        }
        userAction();

    }
    }
