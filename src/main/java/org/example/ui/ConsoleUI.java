package org.example.ui;

import org.example.Exception.ATMException;
import org.example.model.UserCredentials;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ConsoleUI implements UI {

    private String cardNumber;
    private String pinCode;
    private int choice;

    private boolean validInput = false;

    private final UIImages uiImages = new UIImages();
    private Scanner scanner = new Scanner(System.in);
    Pattern cardNumberPattern = Pattern.compile("\\d{16}");
    Pattern pinCodePattern = Pattern.compile("\\d{4}");

    @Override
    public UserCredentials showAuthorizationMenu(UserCredentials credentials) throws ATMException {
        validInput = false;
        switch (choice) {
            case 1 -> {
                while (true) {
                    while (!validInput) {
                        System.out.println("+------------------------------------+");
                        System.out.println("| Please enter your card number:   |");
                        System.out.println("+------------------------------------+");

                        cardNumber = scanner.nextLine();

                        if (cardNumberPattern.matcher(cardNumber).matches()) {
                            validInput = true;
                            credentials.setCardNumber(cardNumber);
                            break;
                        } else {
                            System.out.println("Invalid card number!\n" +
                                    "The card number must be 16 digits.");
                        }
                    }


                    validInput = false;
                    while (!validInput) {
                        System.out.print("| Please enter PIN code (4 digits): |");
                        pinCode = scanner.nextLine();

                        if (pinCodePattern.matcher(pinCode).matches()) {
                            validInput = true;
                            credentials.setPinCode(pinCode);
                            break;
                        } else {
                            System.out.println("+------------------------------------+");
                            System.out.println("|      Invalid PIN.         |");
                            System.out.println("|        Try again     |");
                            System.out.println("+------------------------------------+");
                        }
                    }
                   return credentials;
                }

            }
            case 2 -> {
                System.out.println("+------------------------------------+");
                System.out.println("|     Exit from the program.     |");
                System.out.println("|        Goodbye!           |");
                System.out.println("+------------------------------------+");
            }
            default -> {
                System.out.println("+------------------------------------+");
                System.out.println("|     Wrong choice.             |");
                System.out.println("|  Please choose 1 or 2.   |");
                System.out.println("+------------------------------------+");
            }
        }

        scanner.close();
        return credentials;
    }



    @Override
    public void showWelcomeMenu(){

        System.out.println(uiImages.getCARD());
        System.out.println("+------------------------------------+");
        System.out.println("|        Welcome to        |");
        System.out.println("|         our ATM!          |");
        System.out.println("+------------------------------------+");

        while (!validInput) {
            System.out.println("Choose an action:");
            System.out.println("1. Entrance");
            System.out.println("2. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1 || choice == 2) {
                validInput = true;
            } else System.out.println("Invalid input! Try again");

        }
    }

    @Override
    public void showCollectionMenu() {

    }

    @Override
    public void showBalanceReplenish() {

    }


    @Override
    public UserCredentials getCredentials(UserCredentials credentials) {
        return credentials;
    }
}
